/*
 * generated by Xtext 2.25.0
 */
package it.polimi.hri_designtime.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class HriDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("it/polimi/hri_designtime/parser/antlr/internal/InternalHriDsl.tokens");
	}
}
