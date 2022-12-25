package com.inheritance;

public class Test {
	public static void main(String[] args) {

		
		 //Scenario-1 
		/*A a=new A(); 
		 System.out.println(a.a); //10
		  System.out.println(a.b); //20 //
		 System.out.println(a.c); //no output 
		 //a.x1();
		  //Class A- x1 method 
		 //a.x2(); //Class A- x2 method //
		// a.x3(); // no output*/
		 
		// Scenario-2
		/*
		  B b=new B();
		   System.out.println(b.a); //10 
		   System.out.println(b.b); //30
		  System.out.println(b.c); //40 
		  b.x1(); //Class A- x1 method 
		  b.x2(); //Class B- x2() method 
		  b.x3(); //Class B- x3() method
		 */
		// Scenario-3
		/*A a = new B(); //compile time it call x2 method of class A
		               //Run time it call the x2 method of class B
		System.out.println(a.a); //10
		System.out.println(a.b); //20
		//System.out.println(a.c); //no output
		a.x1();//Class A- x1 method
		a.x2(); //Class B- x2() method
		// a.x3(); // no output
*/	
		/*//Scenario-4---3rd and 4th both are same scenario
		A a=new A();
		B b=new B();
		a=b;
		System.out.println(a.a); //10
		System.out.println(a.b); //20
		//System.out.println(a.c); //no output
		a.x1(); //Class A- x1 method
		a.x2(); //Class B- x2() method
		//a.x3(); //no output
*/		
		/*//Scenario-5 - 2nd and 5th are same
		A a=new B();
		B b=new B();
		b=(B)a; //Type casting- google
		System.out.println(b.a); //10
		System.out.println(b.b); //30
		System.out.println(b.c); //40
		b.x1(); //Class A- x1 method
		b.x2(); //Class B- x2() method
		b.x3(); //Class B- x3() method
*/		
		//Scenario-6
		//B b=new A(); //this is not allowed in java
	}


}
