package executors;

import commands.Command;
import errors.ErrorHandler;

public class SingleCommandExecutor extends BaseCommandExecutor implements Executor {
	
	
	
	@Override
	public void execute(Command commandToExecute) {
		String action = commandToExecute.getAction();
		
		switch(action) {
		case "help":
			executeHelpCommand();
			break;
		case "author":
			executeAuthorCommand();
			break;
		case "list":
			executeListAllBucketsCommand();
			break;
		default:
			ErrorHandler.raiseError("invalid-command", action);
		}
	}
	
	private void executeHelpCommand() {
		System.out.println("\nList of commands:");
		System.out.println("Help Commands");
		System.out.println("jb help - display the list of commands");
		System.out.println("jb author - display the name of the programmer\n");
		
		System.out.println("Action Commands\n");
		System.out.println("jb create {bucketName} - creates a bucket with the specified bucket name");
		System.out.println("jb delete {bucketName} - delete the specified bucket");
		System.out.println("jb put - initiate a put request.  You will be prompted for the bucket name, key, and data to put");
		System.out.println("jb get - initiate a get request.  You will be prompted for the bucket name, key, and an optional prefix");
		
		System.out.println("List Commands");
		System.out.println("jb list - Display all top-level buckets");
	}
	
	private void executeAuthorCommand() {
		System.out.println("{placeholder}");
	}
	
	private void executeListAllBucketsCommand() {
		this.client.displayBuckets();
	}
}
