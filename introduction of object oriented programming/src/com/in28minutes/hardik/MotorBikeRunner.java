package com.in28minutes.hardik;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		
		ducati.start();
		honda.start();
		
		ducati.setspeed(100);
		ducati.incresespeed(100);
		honda.incresespeed(100);
		//int ducatispeed = ducati.getspeed();// get ducati speed
		//ducatispeed = ducatispeed + 100;// increase it by 100
		//ducati.setspeed(ducatispeed);// set it to ducati
		
		//int hondaspeed = honda.getspeed();// get honda speed
		//hondaspeed = hondaspeed + 100;// increase it by 100
		//honda.setspeed(hondaspeed);// set it to honda
		
		
		
		
		
		System.out.println(ducati.getspeed());
		
		//honda.setspeed(20);
		System.out.println(ducati.getspeed());
	}

}
