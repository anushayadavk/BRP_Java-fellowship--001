package com.bridgelabzday9;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 int num;
		    System.out.println("Enter a number:");
		    num=scanner.nextInt();
		    int num2=0;
		    while(num!=0)
		    {
		        int rem=num%10;
		        num/=10;
		        num2=num2*10+rem;
		    }
		    System.out.println("The reverse of the number is "+num2);
		 scanner.close();
		 }

}
