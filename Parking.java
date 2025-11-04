package com.codegnan.oopexamples;

import java.util.Scanner;

public class Parking {
	String type;
	String license;
	int hours;
	

	public Parking(String type, String license, int hours) {
		super();
		this.type = type;
		this.license = license;
		this.hours = hours;
	}
	public void displayVehicle() {
		System.out.println("Type: "+type);
		System.out.println("License: "+license);
		if(hours>0) {
			System.out.println("Hours Parked: "+hours);
		}else {
			System.out.println("Hours Parked must be non-negative");
		}
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String type=sc.next();
		String license=sc.next();
		int hours=sc.nextInt();
		Parking p1=new Parking(type,license,hours);
		p1.displayVehicle();
		sc.close();

	}

}
