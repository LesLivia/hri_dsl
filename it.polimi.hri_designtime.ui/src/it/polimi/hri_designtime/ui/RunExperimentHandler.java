package it.polimi.hri_designtime.ui;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.core.resources.IFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.File;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;



public class RunExperimentHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {		
		IFile file = getFile();
		String framework_path;

		if(isJson(file)){
			MessageConsoleStream output = getConsole().newMessageStream();
			PrintStream printStream = new PrintStream(output);
			System.setErr(printStream);
			boolean isWindows = System.getProperty("os.name").toLowerCase().contains("windows");
			String partial_path = file.getFullPath().toString();
			String file_name = partial_path.substring(partial_path.lastIndexOf("/")+1,partial_path.length());
			String ENV_VAR_NAME = "DTANPATH";
			
			try {
				framework_path = System.getenv(ENV_VAR_NAME); 
				
				if(framework_path != null){
					Path destination = Paths.get(framework_path, "resources", "input_params", file_name);
					
					if(!Files.exists(destination)){
						Files.createFile(destination);
					}
					Files.copy(Paths.get(file.getLocationURI()), destination, StandardCopyOption.REPLACE_EXISTING);
					
					ProcessBuilder processBuilder;
					if(isWindows) {
						 processBuilder = new ProcessBuilder("python" , "\""+Paths.get(framework_path, "src", "main.py").toString()+"\"", file_name.substring(0, file_name.indexOf(".")));
					}else{
						 processBuilder = new ProcessBuilder("python3", Paths.get(framework_path, "src", "main.py").toString(), file_name.substring(0, file_name.indexOf(".")));
					}
					File directory = new File(framework_path); 
					processBuilder.directory(directory);
					processBuilder.redirectErrorStream(true);
					Process process = processBuilder.start();
					 
					BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
					String messageLine = reader.readLine();
					while(messageLine != null) {
						output.println(messageLine);
						messageLine = reader.readLine();
					}
					output.println();
					reader.close();
					
				}else {
					output.println("Error: environment variable " + ENV_VAR_NAME + " is not set correctly");
				}
				
			} catch (RuntimeException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}
	
	private boolean isJson(IFile file){
		boolean result = false;
		
		if(file != null){
			String extension = file.getFileExtension();
			if(extension != null && extension.equals("json")) {
				result = true;
			}
		}

		return result;
	}
	
	private IFile getFile() {
		IFile file = null;
		IWorkbench workbench = PlatformUI.getWorkbench();
		
		if(workbench != null){
			IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
			if(window != null){
				IWorkbenchPage activePage = window.getActivePage();
				if(activePage != null && activePage.getSelection() instanceof TreeSelection){
					StructuredSelection selection = (StructuredSelection) activePage.getSelection();
					if(selection != null && selection.getFirstElement() != null){
						if(selection.getFirstElement().getClass().getInterfaces().length == 1 && selection.getFirstElement().getClass().getInterfaces()[0].toString().contains("org.eclipse.core.resources.IFile")){
							file = (IFile) selection.getFirstElement();
						}
					}
				}
			}
		}
		
		return file;
	}
	
	private MessageConsole getConsole(){
		MessageConsole pluginConsole = null;
		IConsoleManager consoleManager = ConsolePlugin.getDefault().getConsoleManager();
		
		for(IConsole console: consoleManager.getConsoles()){
			if(console.getName().equals("PCForRunExperiment-1")){
				pluginConsole = (MessageConsole)console;
				break;
			}
		}
		if(pluginConsole == null){
			IConsole[] array = {new MessageConsole("PCForRunExperiment-1", null)};
			consoleManager.addConsoles(array);
			pluginConsole = (MessageConsole)array[0];
		}
		consoleManager.showConsoleView(pluginConsole);
		
		return pluginConsole;
	}
	
}



