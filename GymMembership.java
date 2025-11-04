package com.codegnan.oopexamples;

import java.util.Scanner;

public class GymMembership {
	String name;
	String plan;
	double fee;
	

	public GymMembership(String name, String plan, double fee) {
		super();
		this.name = name;
		this.plan = plan;
		this.fee = fee;
	}
	public void displayMembership() {
		System.out.println("Member: "+name);
		System.out.println("Plan: "+plan);
		if(fee>0.0) {
			System.out.println("Fee: "+fee);
		}else {
			System.out.println("Fee must be positive");
		}
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String plan=sc.next();
		double fee=sc.nextDouble();
		GymMembership g1=new GymMembership(name,plan,fee);
		g1.displayMembership();
		sc.close();

	}

}
