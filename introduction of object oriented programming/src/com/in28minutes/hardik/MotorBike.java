package com.in28minutes.hardik;

public class MotorBike {
	
	private int speed;
	  public void setspeed(int speed) {
		System.out.println(speed);
		System.out.println(this.speed);
		this.speed = speed;
	}
	
	    public int getspeed() {
		return speed;
	}
	    public void incresespeed(int howmuch) {
	    this.speed = this.speed+ howmuch;
	}
	    void start() {
		System.out.println("Bike started");
	}

}
