package com.praticeSpringboot;

import java.lang.reflect.Field;

public class MainClass {

	public static void main(String[] args) throws Exception {
		Car c = new Car(new PetrolEngine());
		c.setEng(new DieselEngine());
		c.dstart();
		
		//Field Injection
		
		Class<?> forName = Class.forName("com.praticeSpringboot.Car");
		Object obj = forName.newInstance();
		
		Car objCar = (Car) obj;
		Field fields = forName.getDeclaredField("eng");
		System.out.println("--------------------Field Injection(Reflexion Api)-----------------");
		fields.setAccessible(true);
		
		fields.set(objCar, new DieselEngine());
		objCar.dstart();
		
	}

}
