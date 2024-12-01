package com.jbk;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	private int aid;
	private String city;
	private String state;
	private String dist;
	private int pin;

	public Address() {
		super();
	}

	public Address(int aid, String city, String state, String dist, int pin) {
		super();
		this.aid = aid;
		this.city = city;
		this.state = state;
		this.dist = dist;
		this.pin = pin;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", state=" + state + ", dist=" + dist + ", pin=" + pin + "]";
	}

}
