package com.codegnan.oopexamples;

import java.util.Scanner;

public class Restaurant {
	String item;
	double price;
	String category;
	

	public Restaurant(String item, double price, String catogory) {
		super();
		this.item = item;
		this.price = price;
		this.category = catogory;
	}
	public void display() {
		System.out.println("Item: "+item);
		if(price>0.0) {
		System.out.println("Price: "+price);
		}else {
		System.out.println("Price must be positive");
		}
		System.out.println("Category: "+category);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String item=sc.next();
		double price=sc.nextDouble();
		String category=sc.next();
		Restaurant r1=new Restaurant(item,price,category);
		r1.display();
		sc.close();

	}

}
