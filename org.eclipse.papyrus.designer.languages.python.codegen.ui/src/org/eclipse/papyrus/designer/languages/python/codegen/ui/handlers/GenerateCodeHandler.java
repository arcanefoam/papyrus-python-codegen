package org.eclipse.papyrus.designer.languages.python.codegen.ui.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.papyrus.uml.diagram.common.handlers.CmdHandler;

/**
 * Handler for Python code generation
 * @author Horacio Hoyos
 *
 */
public class GenerateCodeHandler extends CmdHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("Python code generation execution!");
		return null;
	}

}
