package commands;

import java.util.ArrayList;
import java.util.List;

import client.Client;

public class Command {
	private String action;
	private List<String> parameterList;
	private Client client;
	
	public Command(String action, List<String> parameters, Client client) {
		this.action = action;
		
		if(parameters == null) {
			this.parameterList = new ArrayList<>();
		} else {
			this.parameterList = parameters;
		}
		
		this.client = client;
	}
	
	public static class Builder {
		private String action;
		private List<String> parameters;
		private Client client;
		
		public Builder withAction(String action) {
			this.action = action;
			return this;
		}
		
		public Builder withParameters(List<String> parameters) {
			this.parameters = parameters;
			return this;
		}
		
		public Builder withClient(Client client) {
			this.client = client;
			return this;
		}
		
		public Command build() {
			return new Command(action, parameters, client);
		}
	}
	
	public String getAction() {
		return action;
	}
	
	public List<String> getParameters() {
		return parameterList;
	}
	
	public Client getExecutor() {
		return client;
	}
}
