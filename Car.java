package com.codegnan.oopexamples;

import java.util.Scanner;

public class Car {
	String brand;
	String model;
	double rent;

	public Car(String brand, String model, double rent) {
		super();
		this.brand = brand;
		this.model = model;
		this.rent = rent;
	}
	public void displayCarInfo() {
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		if(rent>0.0) {
			System.out.println("Rent: "+rent);
		}else {
			System.out.println("Error:Rental price must be positive");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String brand=sc.next();
		String model=sc.next();
		double rent=sc.nextDouble();
		Car c1=new Car(brand,model,rent);
		c1.displayCarInfo();
		sc.close();

	}

}
