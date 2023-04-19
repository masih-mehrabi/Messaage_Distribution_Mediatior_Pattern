package mediator_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ConcreteMediator implements Mediator {
	
	
	private List<Colleague> colleagues = new ArrayList<>();
	
	public void addColleague(Colleague colleague) {
		colleagues.add(colleague);
		
	}
	@Override
	public void send(String message, Colleague colleague) {
		for (Colleague value : colleagues) {
			if (!Objects.equals(value.getName(), colleague.getName())) {
				value.receive(message);
			}
		}
 	}
	
	public List<Colleague> getColleagues() {
		return colleagues;
	}
}
