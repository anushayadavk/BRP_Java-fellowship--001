package com.bridgelabzday8;

import java.util.Scanner;
public class BinarySearch {

 public static void main(String[] args) {
  Scanner cs=new Scanner(System.in);
  int size;
     System.out.println("Enter size of the array:");
     size=cs.nextInt();
     cs.close();
     int arr[]=new int[size],i;
     System.out.println("Enter the element of the array:");
     for(i=0;i<size;i++)
         arr[i]=cs.nextInt();
     System.out.println("Enter the search element:");
     int search_elm;
     search_elm=cs.nextInt();
     int found=0;
     int lowerBound = 0;
     int upperBound = size-1;
     int mid;
    do{
    mid = (lowerBound + upperBound ) / 2;
    if(arr[mid]==search_elm)
    found=1;
    else if(lowerBound > upperBound)
    found=1;
    else
    {
    if(arr[mid] < search_elm)
    lowerBound = mid + 1;
    else
    upperBound = mid - 1;
    }
    }while(search_elm!=arr[mid] && lowerBound<=upperBound);
          
    if(found==1)
      System.out.println("Search element is found.");
     else
      System.out.println("Search element is not found.");

 }
}
