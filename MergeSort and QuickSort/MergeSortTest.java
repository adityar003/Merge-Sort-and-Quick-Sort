package testing;
import java.text.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSortTest
{
	//Merge sort function 
	public static void sort(int[] a, int l, int h)
	{
		int N = h - l;         
		if (N <= 1) 
			return; 
		int m = l + N/2; 
		//Recursively sort 
		sort(a, l, m); 
		sort(a, m, h); 
		//Merging two sorted sub array 
		int[] temp = new int[N];
		int i = l, j = m;
		int k = 0;
		while(k < N)
		{
			if (i == m)  
				temp[k] = a[j++];
			else if (j == h) 
				temp[k] = a[i++];
			else if (a[j]<a[i]) 
				temp[k] = a[j++];
			else 
				temp[k] = a[i++];
			k++;
		}    	
		for (int b = 0; b < N; b++)
		{
			a[l + b] = temp[b];         
		}
	}

		//Generating random numbers 
		private int[] generateRandomNumbers(int n)
		{	
			int[] result = new int[n];
			Random random = new Random();	
			for (int i = 0; i < result.length; i++)
			{
				result[i] = random.nextInt(n * 10);
			}
			return result;
		}

		//Main method 
		public static void main(String[] args)
		{
			Nested_Interfaces app= new Nested_Interfaces();
			long start = System.currentTimeMillis();	
			Scanner scan = new Scanner(System.in);        
			System.out.println("Implementation of Merge Sort");
			int n, i;
			//Accept number of elements from input
			System.out.println("Enter length of the array:");
			n = scan.nextInt();
		    //Create array of n elements
		    int arr[] = new int[ n ];
		    //Accept elements 
		    System.out.println("\nEnter "+ n +" integer elements");
		    for (i = 0; i < n; i++)
		        arr[i] = scan.nextInt();
		    //Call method sort 
		    sort(arr, 0, n);
		    //Print sorted Array
		    System.out.println("\nElements after sorting ");        
		    for (i = 0; i < n; i++)
		        System.out.print(arr[i]+" ");            
		    System.out.println();
			
			//This code snippet is used to iterate over 1000,1500,2000.
			/*
			 System.out.println("Enter the size of the array :");
			 int r = scan.nextInt();
			 int[] arr = new int[r]; //= app.generateRandomNumbers(r);
			 for (i = 0; i < r; i++)
				arr[i] = i+1;
			 System.out.println("Elements before sorting:");
			 for (i = 0; i < r; i++)
				System.out.print(arr[i]+" ");
			 //Call method sort
			 sort(a, 0, r);
			 //Print sorted Array
			 System.out.println("\nElements after sorting ");        
			 for (i = 0; i < r; i++)
				System.out.print(arr[i]+" ");            
			*/
			
			//Finding the running time of the merge sort algorithm
			long end = System.currentTimeMillis();
			NumberFormat formatter = new DecimalFormat("#0.00000");
			System.out.print("Total Execution time is " + formatter.format((end - start) / 1000d) + " mseconds");
		}    
}