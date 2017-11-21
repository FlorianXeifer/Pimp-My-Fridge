package model;

import java.util.ArrayList;

import javafx.util.Callback;

public class Fridge {

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
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		// TODO - implement Frigo.setAttribute
		throw new UnsupportedOperationException();
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
		// TODO - implement Frigo.readResult
		throw new UnsupportedOperationException();
	}

	public void testResult() {
		// TODO - implement Frigo.testResult
		throw new UnsupportedOperationException();
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
}
