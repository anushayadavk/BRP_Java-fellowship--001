package com.bridgelabzday5;

import java.util.Scanner;
import java.lang.Math; 
public class SquareRoot {
	public static void main(String args[]) {
        
        Double num;
        Scanner sc= new Scanner(System.in);
 
        System.out.print("Enter a number: ");
        num = sc.nextDouble();
         sc.close();
        Double square = Math.pow(num, 2);
        System.out.println("Square of "+ num + " is: "+ square);
}

}
