package client;

import java.util.List;

import commands.Command;

public class ParserHelper {
	public static Command getCommand(List<String> commandTokens, Client client) {
		Command.Builder commandBuilder = new Command.Builder();
		commandBuilder.withAction(commandTokens.get(1))
		.withClient(client);
		
		if(commandTokens.size() > 2) {
			commandBuilder.withParameters(commandTokens.subList(1, commandTokens.size()));
		}
		
		return commandBuilder.build();
	}
}
