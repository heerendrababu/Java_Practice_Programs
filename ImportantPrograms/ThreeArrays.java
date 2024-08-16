package ImportantPrograms;

import java.util.Scanner;

public class ThreeArrays {

	public static void main(String[] args) 
	{
         int[] arr1 = new int[5];
         int[] arr2 = new int[6];
         
// So, arr3 will be initialized with a length of 5 + 6 = 11, ensuring that it has enough space to store all the elements from both arr1 and arr2.
         int[] arr3 = new int[arr1.length+arr2.length]; 
         Scanner sc = new Scanner(System.in);
         System.out.println("enter arr1 elements");
         for(int i=0;i<=arr1.length-1;i++)
         {
        	 arr1[i]= sc.nextInt();
         }
         System.out.println("enter arr2 elements");
         for(int i=0;i<=arr2.length-1;i++)
         {
        	 arr2[i]= sc.nextInt();
         }
         for(int i=0;i<=arr1.length-1;i++)
         {
        	 arr3[i]=arr1[i];
            // System.out.print(arr3[i]+",");

         }
         for(int i=0;i<=arr2.length-1;i++)
         {
        	 arr3[arr1.length+i]= arr2[i];
        	// System.out.print(arr3[i]+",");
         }
         
         // 1st way to print arr3 elements
         System.out.println("Elements in arr3:");
         for (int i = 0; i < arr3.length; i++) {
             System.out.print(arr3[i]);
             if (i < arr3.length - 1) {
                 System.out.print(",");  // Print comma if it's not the last element
             }
         }


         
         // 2nd way using Ternary operator.
         
//         System.out.println("Elements in arr3:");
//         for (int i = 0; i < arr3.length; i++)
//         {
//             System.out.print(arr3[i] + (i < arr3.length - 1 ? "," : ""));
//         }
         
	}

}
