package client;

import java.util.Scanner;

public class CommandLineHandler {
	private Client client;
	private Scanner kb;
	private CommandLineParser parser;
	
	public CommandLineHandler(Client client) {
		this.client = client;
		kb = new Scanner(System.in);
		this.parser = new CommandLineParser();
	}
	
	public void initialize() {
		displayWelcomeMessage();
		startCommandLineListener();
	}
	
	private void displayWelcomeMessage() {
		System.out.println("Welcome to JBucket, the AmazonS3 command-line tool!");
		System.out.println("To display all commands, enter 'jb help'");
		System.out.println("To exit the application, just enter `exit`");
	}
	
	private void startCommandLineListener() {
		String command = "";
		
		while(true) {
			System.out.print("> ");
			command = kb.nextLine();
			
			if(parser.receivedExitCommand(command)) {
				break;
			}
			
			parser.parseCommand(command, client);
		}
		
		System.out.println("Bye!");
	}
}
