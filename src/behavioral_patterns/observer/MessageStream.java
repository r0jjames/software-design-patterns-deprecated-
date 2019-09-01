package behavioral_patterns.observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject {

	Deque<String> messageHistory = new ArrayDeque<String>();
	@Override
	void setState(String state) {
		// TODO Auto-generated method stub
		messageHistory.add(state);
		this.notifyObservers();
	}

	@Override
	String getState() {
		// TODO Auto-generated method stub
		return messageHistory.getLast();
	}

}
