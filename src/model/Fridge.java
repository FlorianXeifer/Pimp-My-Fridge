package model;

import java.util.ArrayList;

import javafx.beans.InvalidationListener;
import javafx.util.Callback;

public class Fridge extends Model{

	private int temperature;
	private float hygrometrie;
	private int temperatureExterieur;
	private boolean ouvert;
	private ArrayList contenu;
	private int consigne;
	private Callback response;

	public int getTemperature() {
		return this.temperature;
	}

	/**
	 * 
	 * @param temperature
	 */
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public float getHygrometrie() {
		return this.hygrometrie;
	}

	/**
	 * 
	 * @param hygrometrie
	 */
	public void setHygrometrie(float hygrometrie) {
		this.hygrometrie = hygrometrie;
	}

	public int getTemperatureExterieur() {
		return this.temperatureExterieur;
	}

	/**
	 * 
	 * @param temperatureExterieur
	 */
	public void setTemperatureExterieur(int temperatureExterieur) {
		this.temperatureExterieur = temperatureExterieur;
	}

	public boolean getOuvert() {
		return this.ouvert;
	}

	/**
	 * 
	 * @param ouvert
	 */
	public void setOuvert(boolean ouvert) {
		this.ouvert = ouvert;
	}

	public void getAttribute() {
		// TODO - implement Frigo.getAttribute
		
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		// TODO - implement Frigo.setAttribute
		
	}

	public int getConsigne() {
		return this.consigne;
	}

	/**
	 * 
	 * @param consigne
	 */
	public void setConsigne(int consigne) {
		this.consigne = consigne;
	}

	public Callback getResponse() {
		return this.response;
	}

	/**
	 * 
	 * @param response
	 */
	public void setResponse(Callback response) {
		this.response = response;
	}

	public result readResult() {
		return null;
		// TODO - implement Frigo.readResult
		
	}

	public void testResult() {
		// TODO - implement Frigo.testResult
		
	}

	/**
	 * 
	 * @param contenu
	 */
	public void setContenu(ArrayList contenu) {
		this.contenu = contenu;
	}

	public ArrayList getContenu() {
		return this.contenu;
	}

	@Override
	public void addListener(InvalidationListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeListener(InvalidationListener listener) {
		// TODO Auto-generated method stub
		
	}

	

	
}
