package executors;

public class ExecutorFactory {
	public static Executor getExecutor(int commandLength) {
		switch(commandLength) {
		case 0:
			return new SingleCommandExecutor();
		default:
			return null;
		}
	}
}
