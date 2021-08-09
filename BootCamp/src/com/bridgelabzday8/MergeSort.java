package com.bridgelabzday8;

import java.util.Scanner;
public class MergeSort {
 static void merge(int arr[],int first,int mid,int last)
 {
  int n1,n2;
  n1=(mid-first+1);
  n2=(last-mid);
  int Left[]= new int[n1],Right[]=new int[n2],i,j,k;

  for(i=0;i<n1;i++)
  Left[i]=arr[i+first];
  for(j=0;j<n2;j++)
  Right[j]=arr[mid+j+1];
  
  k=first;
  i=0;
  j=0;
  
  while(i<n1 && j<n2){
  if(Left[i]<=Right[j])
  {
   arr[k]=Left[i];
   i++;
  }
  else
  {
   arr[k]=Right[j];
   j++;
  }
  k++;}
  while(i<n1)
     {
         arr[k]=Left[i];
         i++;
         k++;
     }
     while(j<n2)
     {
         arr[k]=Right[j];
         j++;
         k++;
     }
 }

 static void mergesort(int arr[],int first,int last)
 {
  if(first<last)
  {
   int mid=first+(last-first)/2;
   mergesort(arr,first,mid);
   mergesort(arr,mid+1,last);
   merge(arr,first,mid,last);
  }
 }
 
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

     mergesort(arr,0,size-1);

         System.out.print("\nAfter Sorting Array Element are: ");
         for(i=0;i<size;i++)
         System.out.print(arr[i]+" ");

 }

}