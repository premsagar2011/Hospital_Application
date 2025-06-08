package com.hospital;
import java.util.Scanner;
public class HospitalApp 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to St john's Hospital");
		System.out.println("Enter Doctor Name and Age");
		String fname=s.next();
		String lname=s.next();
		int age=s.nextInt();
		System.out.println("Enter Patient Name and Patient disease");
		String pfname=s.next();
		String plname=s.next();
		String disease=s.next();
		System.out.println("Doctor and patient details");
		while(true)
		{
			Doctor d=new Doctor(fname,lname,age);
			Patient p=new Patient(pfname,plname, disease);
			break;
		}
		System.out.println("press 0 to close the application or 1 to remain same");
		int hospitalstatus=s.nextInt();
		switch(hospitalstatus)
		{
		case 0:
				System.out.println("hospital Application closed "+"\n"+" visit again ");
			break;
		case 1:
			System.out.println("safe browsing");
		break;
		}
	}
}
class Doctor
{
	String fname;
	String lname;
	int age;
	public Doctor(String fname,String lname,int age)
	{
		this.fname=fname;
		this.age=age;
		this.lname=lname;
		display();
	}
	public void display()
	{
		System.out.println("Doctor name is:- "+fname+" "+lname);
		System.out.println("Age of Doctor:- "+age);
	}
}
class Patient
{
	String fname;
	String lname;
	String disease;
	public Patient(String fname,String lname,String disease) 
	{
		this.fname=fname;
		this.disease=disease;
		this.lname=lname;
		displayPatient();
	}
	public void displayPatient()
	{
		System.out.println("Patient name:- "+fname+" "+lname);
		System.out.println("Patient disease:- "+disease);
	}
}
