package com.bridgelabzday2;

import java.util.Scanner;

public class TemperaturConversion {
	
	public static void main(String[] args) {
		  Scanner cs=new Scanner(System.in);
		  
		  double fahrenheit,celsius;

		      System.out.println("Enter degree in Celsius:");
		      celsius=cs.nextDouble();

		      fahrenheit=(celsius*(9/5))+32;
		      System.out.println("Degree in Fahrenheit is "+fahrenheit);
		      
		      celsius= (fahrenheit-32)*5/9;
		      System.out.println("Degree in Celsius is "+celsius);
		      
		  cs.close();
		 }

}
