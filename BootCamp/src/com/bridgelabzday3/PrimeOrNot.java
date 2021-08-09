package com.bridgelabzday3;

import java.util.Scanner;
public class PrimeOrNot {

 public static void main(String[] args) {
  Scanner cs=new Scanner(System.in);
  int num,i;
     System.out.println("Enter a number:");
     num=cs.nextInt();
     cs.close();
     int count=0;
     for(i=2;i<=Math.sqrt(num);i++)
     {
        if(num%i==0)
         count++;
     }
    if(count==0)
      System.out.println("It is Prime ");
    else
         System.out.println("It is not Prime ");
 }
}
