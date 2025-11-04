package com.codegnan.oopexamples;

import java.util.Scanner;

public class GymTracker {
	String userName;
	int steps;
	double calories;
	

	public GymTracker(String userName, int steps, double calories) {
		super();
		this.userName = userName;
		this.steps = steps;
		this.calories = calories;
	}
	public void display() {
		System.out.println("User: "+userName);
		if(steps>0) {
			System.out.println("Steps: "+steps);
		}else {
			System.out.println("Steps must be non-negative");
		}
		if(calories>0.0) {
			System.out.println("Calories: "+calories);
		}else {
			System.out.println("calories burned must be non-negative");
		}
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String userName=sc.next();
		int steps=sc.nextInt();
		double calories=sc.nextDouble();
		GymTracker g1=new GymTracker(userName,steps,calories);
		g1.display();
		sc.close();

	}

}
