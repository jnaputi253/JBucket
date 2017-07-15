package client;

public class Program {
	public static void main(String[] args) {
		CommandLineHandler handler = new CommandLineHandler(new Client());
		handler.initialize();
	}
}
