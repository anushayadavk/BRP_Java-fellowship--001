package com.bridgelabzday8;

import java.util.Scanner;
public class InsertionSort {

 public static void main(String[] args) {
  Scanner cs=new Scanner(System.in);
  int size;
     System.out.print("Enter the size of the array:");
     size=cs.nextInt();
     cs.close();
     int arr[]=new int[size],i;
     System.out.print("Enter the element of the array:");
     for(i=0;i<size;i++)
         arr[i]=cs.nextInt();

     System.out.print("Before Sorting Array Element are: ");
     for(i=0;i<size;i++)
         System.out.print(arr[i]+" ");

     int in, out;
     for(out=1; out<size; out++)
         {
             int temp = arr[out];
             in = out;
             while(in>0 && arr[in-1] >= temp)
                 {
                     arr[in] = arr[in-1];
                     --in;
                     }
                     arr[in] = temp;
                     }

         System.out.print("\nAfter Sorting Array Element are: ");
         for(i=0;i<size;i++)
         System.out.print(arr[i]+" ");
 }
}


