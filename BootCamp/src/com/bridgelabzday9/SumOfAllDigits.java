package com.bridgelabzday9;

import java.util.Scanner;

public class SumOfAllDigits {
	
	public static void main(String[] args) {
	      Scanner scanner=new Scanner(System.in);
	      int number;
	      int sum=0;
	      int remainder;
	      System.out.println("Enter a number:");
	      number=scanner.nextInt();
	      
	      while(number>0)
	      {
	          remainder=number%10;
	          sum=sum+remainder;
	          number=number/10;
	      }
	        System.out.println("Sum of digits is "+sum);
	      scanner.close();
	 }

}
