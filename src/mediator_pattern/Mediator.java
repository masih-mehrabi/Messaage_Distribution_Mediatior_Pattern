package mediator_pattern;

public interface Mediator {
	
	 void send(String message, Colleague sender);
}
