package mediator_pattern;

public class InOfficeColleague extends Colleague {
	
	
	
	public InOfficeColleague(Mediator mediator, String name) {
		super(mediator, name);
	}
	@Override
	public void receive(String message) {
		System.out.println(getName() + ": " + message);
	}
}
