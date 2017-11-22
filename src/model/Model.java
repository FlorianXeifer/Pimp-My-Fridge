package model;

import java.util.ArrayList;

import javafx.beans.Observable;
import observer.Observer;

public abstract class Model implements Observable {
	
	
	private ArrayList<Observer> frigo = new ArrayList<Observer>(); 

	
	public void New() {
		// TODO - implement Model.New
		
	}

	public void AddFrigo(Observer obs) {
		this.frigo.add(obs);
		// TODO - implement Model.AddFrigo
		
	}
	
	public void notifyObserver(String str) {
	    for(Observer obs : frigo)
	      obs.update(str);
	  }

	public void RemoveFrigo() {
		// TODO - implement Model.RemoveFrigo
		frigo = new ArrayList<Observer>();
	}


}
