package behavioral_patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subject messageStream = new MessageStream();
		PhoneClient phoneClient = new PhoneClient(messageStream);
		phoneClient.addMessage("Here is the new message");
		
		TabletClient tabletClient = new TabletClient(messageStream);
		tabletClient.addMessage("Another new message");
	}
	
	public static void everyDayExample() {
		
		TwitterStream messageStream = new TwitterStream();
		Client clientCamille = new Client("Camille");
		Client clientRoj = new Client("Roj");
		messageStream.addObserver(clientCamille);
		messageStream.addObserver(clientRoj);	
		messageStream.someoneTweeted();

	}

}

// Concrete Subject
 class TwitterStream extends Observable {
	
	public void someoneTweeted() {
		setChanged();
		notifyObservers();
	}
}

// Concrete Client
 class Client implements Observer {
	
	private String name;
	public Client(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Update " + name + "'s stream, someone tweeted something");
	}
	
	
}
