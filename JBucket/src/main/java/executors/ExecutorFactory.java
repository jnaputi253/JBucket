package executors;

public class ExecutorFactory {
	public static Executor getExecutor(int commandLength) {
		switch(commandLength) {
		case 0:
			return new SingleCommandExecutor();
		case 1:
			return new DoubleCommandExecutor();
		default:
			return null;
		}
	}
}
