package com.codegnan.oopexamples;

import java.util.Scanner;

public class Product {
	String name;
	double price;
	int quantity;
	

	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void display() {
		System.out.println("Product: "+name);
		if(price>0.0) {
			System.out.println("Price: "+price);
		}else {
			System.out.println("price must be positive");
		}
		if(quantity>0.0) {
			System.out.println("Quantity: "+quantity);
		}else {
			System.out.println("Quantity must be non-negative");
		}
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		double price=sc.nextDouble();
		int quantity=sc.nextInt();
		Product p1=new Product(name,price,quantity);
		p1.display();
		sc.close();

	}

}
