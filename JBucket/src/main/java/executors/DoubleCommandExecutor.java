package executors;

import commands.Command;
import errors.ErrorHandler;

public class DoubleCommandExecutor extends BaseMultiCommandExecutor {
	@Override
	public void execute(Command commandToExecute) {
		String action = commandToExecute.getAction();
		
		switch(action) {
		case "create":
			System.out.println(String.format("Creation request: %s", commandToExecute.getParameters().get(0)));
			break;
		case "delete":
			System.out.println(String.format("Deletion request: %s", commandToExecute.getParameters().get(0)));
			break;
		default:
			ErrorHandler.raiseError("invalid-command", action);
			break;
		}
	}

}
