package mediator_pattern;

public abstract class Colleague {
	private String name;
	private Mediator mediator;
	public Colleague(Mediator mediator, String name) {
		this.name = name;
		this.mediator = mediator;
	}
	
	 public void send(String message) {
		 getMediator().send(message, this);
	 }
	
	 public abstract void receive(String message);
	public String getName() {
		return name;
	}
	public Mediator getMediator() {
		return mediator;
	}
}
