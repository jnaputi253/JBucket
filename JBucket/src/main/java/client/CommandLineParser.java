package client;

import commands.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import commands.CommandExecutor;
import errors.ErrorHandler;

public class CommandLineParser {
	private CommandExecutor commandExecutor;
	
	public CommandLineParser() {
		this.commandExecutor = new CommandExecutor();
	}
	
	public boolean receivedExitCommand(String command) {
		return command.equalsIgnoreCase("exit");
	}
	
	public void parseCommand(String command, Client user) {
		if(isEmptyCommand(command)) {
			ErrorHandler.raiseError("empty-command", "");
		}
		
		List<String> commandTokens = tokenizeCommand(command);
		parseCommand(commandTokens, user);
	}
	
	private void parseCommand(List<String> commandTokens, Client user) {
		if(!commandTokens.get(0).equals("jb")) {
			ErrorHandler.raiseError("invalid-start-token", commandTokens.get(0));
			return;
		}
		
		Command commandObject = ParserHelper.getCommand(commandTokens, user);
		commandExecutor.handleCommand(commandObject);
	}
	
	private boolean isEmptyCommand(String command) {
		return command.trim().length() == 0;
	}
	
	private List<String> tokenizeCommand(String commandLineInput) {
		return new ArrayList<String>(Arrays.asList(commandLineInput.split(" ")));
	}
}
