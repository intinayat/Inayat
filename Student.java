package mphasis;

import java.util.Scanner;

public class Student {
	int rollno;
	String name,address;
	Student(int rollno, String name, String address){
		this.rollno=rollno;
		this.address=address;
		this.name=name;
	}
	void display() {
		System.out.println("rollno :"+rollno+"Name is: "+name+"Address :"+address);
	}
}
