package behavioral_patterns.observer;

import java.util.ArrayList;
import java.util.List;


public abstract class Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	abstract void setState(String state);
	abstract String getState();
	public void attached(Observer observer) {
		observers.add(observer);
	}
	
	public void dettached(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for (Observer observer: observers) {
			observer.update();
		}
	}

}
