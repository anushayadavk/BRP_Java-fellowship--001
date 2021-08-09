package com.bridgelabzday4;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		  Scanner cs=new Scanner(System.in);
		  String str1;
		  System.out.println("Enter your String:");
		  str1=cs.nextLine();
		  cs.close();
		  char[] str=str1.toCharArray();
		  int i,count=0;
		     int j=str.length-1;
		  for(i=0;i<str.length;i++)
		      {
		   if(str[i]==str[j])
		             count++;
		         j--;
		      }
		  if(count==str.length)
		     {
		   System.out.println("Input string is palindrome");
		     }
		     else
		      System.out.println("Input string is not palindrome");
	}

}
