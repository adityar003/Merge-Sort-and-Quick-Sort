package testing;
import java.text.*;
import java.util.*;
public class QuickSort { 
/*Implementation of QuickSort */
	/*Main Method*/
	public static void main(String args[])
	 {	 
		 Scanner scan = new Scanner(System.in);
		 QuickSort qs = new QuickSort();
		 System.out.println("Enter the size of array:");
		 long starttime = System.currentTimeMillis();
		 int n = scan.nextInt();
	     int a[] = new int[n];
	     System.out.println("Enter the"+ n +" integer elements");
		 for(int i = 0; i < n; i++)
		    a[i] = scan.nextInt();
		 /*To Print unsorted array using Arrays.toString()*/
	     System.out.print("Unsorted array is: ");
	     System.out.println(Arrays.toString(a));
	   
	     qs.sort(a, 0, n-1);
	     /*To Print sorted array*/
	     System.out.print("Sorted array is: ");
	     System.out.println(Arrays.toString(a));  
	     
	     
	     /* This code snippet is used to iterate over 1000,1500,2000 - */
	     /*	 for (int i = 0; i < n; i++)
				a[i] = i+1;
			 System.out.println("Elements before sorting:");
			 for (int i = 0; i < n; i++)
				System.out.print(a[i]+" ");
			 sample qs = new sample();
		     qs.sort(a, 0, n-1);
		     System.out.print("\n Sorted array: ");
		   //print sorted array
		     System.out.println(Arrays.toString(a));
	     */
	     
	     /* Finding the total running time of the merge sort algorithm*/
			long endtime = System.currentTimeMillis();
			NumberFormat format = new DecimalFormat("#0.00000");
			System.out.print("Total Execution time is " + format.format((endtime - starttime) / 1000d) + " mseconds");
	 }
    int A[];
     
    /*Here last element is chosen as pivot and elements smaller than pivot are sorted to left and greater than pivot are sorted to right*/
     
 int quick_partition(int start, int end)
 {
	 int i=start;
     int pivot = A[end]; //Choosing last element as pivot element
     int pindex = start; // Index of first element
     while(i<=end-1){

         /* If current element is smaller or equal to pivot then exchange it with element at pindex and increment the pindex*/
         if (A[i] <= pivot)
         {
             // swap A[pIndex] and A[i]
             
             int temp = A[pindex];
             A[pindex] = A[i];
             A[i] = temp;
             pindex=pindex+1;
         }
         i++;
     }
     
     /*swap A[pindex]with A[end] */
     int temp = A[pindex];
     A[pindex] = A[end];
     A[end] = temp;
     return pindex;
 }
 
 /*a[]-array which is to be sorted,
 start:-index start
 end:-index ending */
 private void sort(int a[], int start, int end)
 {
    A=a;
     if (start < end)
     {
         /* p is partitioning index, A[p] is now in the right place */
         int p = quick_partition(start, end);
 
         /*sort elements left of pivot and right */
         sort(A, start, p-1);
         sort(A, p+1, end);
     } 
 } 
}
