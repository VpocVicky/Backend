package com.praticeSpringboot;

public class Car {
	
	private IEngine eng;
	/*
	 * //Tightly coupling.. public void drive() { //int start = super.start();
	 * //Is-A approach Engine eng = new Engine(); //Has-A approach int start =
	 * eng.start(); if(start>=1) { System.out.println("journey Started....."); } }
	 */
	
	public Car(IEngine eng) {
		this.eng = eng;
	}
	
	public void dstart() {
		int start = eng.start();
		if(start >=1) {
			System.out.println("Engine Started...");
		}
	}
	
	
}
