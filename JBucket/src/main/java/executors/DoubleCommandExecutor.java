package executors;

import commands.Command;
import errors.ErrorHandler;

public class DoubleCommandExecutor extends BaseMultiCommandExecutor {
	@Override
	public void execute(Command commandToExecute) {
		String action = commandToExecute.getAction();
		
		switch(action) {
		case "create":
			System.out.println("Bucket creation request initiated");
			break;
		case "delete":
			System.out.println("Bucket cdeletion request initiated");
			break;
		default:
			ErrorHandler.raiseError("invalid-command", action);
			break;
		}
	}

}
