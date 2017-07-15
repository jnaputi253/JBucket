package executors;

import client.Client;

public abstract class BaseMultiCommandExecutor implements Executor {
	protected Client client;
	
	protected BaseMultiCommandExecutor() {
		client = new Client();
	}
}
