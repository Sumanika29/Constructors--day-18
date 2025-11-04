package com.codegnan.oopexamples;

import java.util.Scanner;

public class StudentMarks {
	int rollNo;
	String name;
	int[] marks = new int[3];

	public StudentMarks() {
		rollNo = 0;
		name = "unknown";
		marks[0] = 0;
		marks[1] = 0;
		marks[2] = 0;

	}

	public StudentMarks(int rollNo, String name, int[] marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNo);
		System.out.println("marks: ");
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
		System.out.println();
	}

	int calculateTotal() {
		int total = 0;
		for (int mark : marks) {
			total += mark;
		}
		return total;

	}

	int calculateAverage() {
		return calculateTotal() / 3;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rollNo=sc.nextInt();
		String name=sc.next();
		int[] marks= {20,30,30};
		StudentMarks s1=new StudentMarks(rollNo,name,marks);
		s1.displayDetails();
		System.out.println("Total Marks: "+s1.calculateTotal());
		System.out.println("Average: "+s1.calculateAverage());
		
		sc.close();
		

	}

}
