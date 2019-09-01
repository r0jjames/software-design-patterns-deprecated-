package behavioral_patterns.observer;

public class TabletClient extends Observer {
	
	 public TabletClient(Subject subject) {
		// TODO Auto-generated constructor stub
		 this.subject = subject;
		 this.subject.attached(this);
	}
	 
	 public void addMessage(String message) {
		 this.subject.setState(message + " - sent from tablet");
		 this.subject.notifyObservers();
	 }

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Tablet Stream: " + subject.getState());
	}

}
