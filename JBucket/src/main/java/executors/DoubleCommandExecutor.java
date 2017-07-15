package executors;

import commands.Command;
import errors.ErrorHandler;

public class DoubleCommandExecutor extends BaseMultiCommandExecutor {
	
	@Override
	public void execute(Command commandToExecute) {
		String action = commandToExecute.getAction();
		
		switch(action) {
		case "create":
			client.createBucket(commandToExecute.getParameters().get(0));
			break;
		case "delete":
			client.deleteBucket(commandToExecute.getParameters().get(0));
			break;
		case "buckets":
			client.displayBuckets();
			break;
		default:
			ErrorHandler.raiseError("invalid-command", action);
			break;
		}
	}

}
