package com.codegnan.oopexamples;

import java.util.Scanner;

public class StudentRegistration {
	String name;
	int rollNo;
	int grade;
	public StudentRegistration(String name, int rollNo, int grade) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.grade = grade;
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollNo);
		if(grade>=1&&grade<=12) {
			System.out.println("Grade: "+grade);
		}else {
			System.out.println("Error:Grade level must be between 1 and 12");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		int rollNo=sc.nextInt();
		int grade=sc.nextInt();
		StudentRegistration s1=new StudentRegistration(name,rollNo,grade);
		s1.display();
		sc.close();
		
		
		
	}

	

}
