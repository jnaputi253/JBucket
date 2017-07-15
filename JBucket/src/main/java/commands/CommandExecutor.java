package commands;

import executors.Executor;
import executors.ExecutorFactory;

public class CommandExecutor {
	private Executor executor;
	
	public void handleCommand(Command command) {
		executor = ExecutorFactory.getExecutor(command.getParameters().size());
		executor.execute(command);
	}
}
