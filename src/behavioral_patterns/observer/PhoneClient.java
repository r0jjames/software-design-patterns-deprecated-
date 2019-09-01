package behavioral_patterns.observer;

public class PhoneClient extends Observer {
	
	public PhoneClient(Subject subject) {
		this.subject = subject;
		this.subject.attached(this);
	}
	
	public void addMessage(String message) {
		subject.setState(message + " - sent from phone");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Phone Stream: " + subject.getState());
	}

}
