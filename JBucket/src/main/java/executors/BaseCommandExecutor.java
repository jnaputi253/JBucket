package executors;

import client.Client;

public abstract class BaseCommandExecutor implements Executor {
	protected Client client;
	
	protected BaseCommandExecutor() {
		this.client = new Client();
	}
}
