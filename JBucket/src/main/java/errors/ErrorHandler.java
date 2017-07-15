package errors;

public class ErrorHandler {
	public static void raiseError(String error, String invalidCommand) {
		switch(error) {
		case "empty-command":
			displayEmptyCommandError();
			break; 
		case "invalid-start-token":
			displayInvalidStartTokenError(invalidCommand);
			break;
		case "invalid-command":
			displayInvalidCommandError(invalidCommand);
			break;
		}
	}
	
	private static void displayEmptyCommandError() {
		System.out.println("Must enter a command");
	}
	
	private static void displayInvalidStartTokenError(String invalidCommand) {
		System.out.printf("'%s' is invalid.  Commands must start with 'jb', unless it is the 'exit' command\n", invalidCommand);
	}
	
	private static void displayInvalidCommandError(String invalidCommand) {
		System.out.printf("'%s' is an invalid command", invalidCommand);
	}
}
