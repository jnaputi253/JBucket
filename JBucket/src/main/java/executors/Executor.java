package executors;

import commands.Command;

public interface Executor {
	void execute(Command commandToExecute);
}
