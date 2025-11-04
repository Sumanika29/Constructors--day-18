package com.codegnan.oopexamples;

import java.util.Scanner;

public class Flight {
	String number;
	String destination;
	double fare;
	

	public Flight(String number, String destination, double fare) {
		super();
		this.number = number;
		this.destination = destination;
		this.fare = fare;
	}
	public void displayFlight() {
		System.out.println("Flight: "+number);
		System.out.println("Destination: "+destination);
		if(fare>0.0) {
			System.out.println("Fare: "+fare);
		}else {
			System.out.println("Fare must be positive");
		}
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String number=sc.next();
		String destination=sc.next();
		double fare=sc.nextDouble();
		Flight f1=new Flight(number,destination,fare);
		f1.displayFlight();
		sc.close();

	}

}
