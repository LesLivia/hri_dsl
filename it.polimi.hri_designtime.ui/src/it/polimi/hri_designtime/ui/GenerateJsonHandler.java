package it.polimi.hri_designtime.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

public class GenerateJsonHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbench workbench = PlatformUI.getWorkbench();
		
		if(workbench != null){
			IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
			if(window != null){
				IWorkbenchPage activePage = window.getActivePage();
				if(activePage != null){
					IEditorPart activeEditor = activePage.getActiveEditor();
					if(activeEditor != null){
						IEditorInput input = activeEditor.getEditorInput();
						if(input instanceof FileEditorInput){
							IPath path = ((FileEditorInput)input).getPath();
							if (path != null && path.getFileExtension().equals("dsl")){
								activeEditor.doSave(null);
							}
						}
					}
				}
			}
		}

		return null;
	}

}
