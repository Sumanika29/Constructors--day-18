package com.codegnan.oopexamples;

import java.util.Scanner;

public class Attendance {
		int id;
		String name;
		String attendance;

	public Attendance(int id, String name, String attendance) {
			super();
			this.id = id;
			this.name = name;
			this.attendance = attendance;
		}

		public void display() {
			if(id>0) {
			System.out.println("ID: "+id);
			}else {
			System.out.println("ID must be positive");
			}
			System.out.println("Name: "+name);
			if(attendance.equalsIgnoreCase("present")||attendance.equalsIgnoreCase("absent")) {
				System.out.println("Status: "+attendance);
			}else {
				System.out.println("status must be present or absent");
			}
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.next();
		String attendance=sc.next();
		Attendance s1=new Attendance(id,name,attendance);
		s1.display();
		sc.close();



	}

}
