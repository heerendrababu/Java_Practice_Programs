package ImportantPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kmss {

	public static void main(String[] args) 
	{

//		        int[] arr1 = {1, 2, 3, 4, 5, 6};
//		        int[] arr2 = {4, 5, 6, 8, 9, 0};
//
//		        List<Integer> commonElements = new ArrayList<>();
//
//		        // Convert arr2 to a list for easier checking
//		        List<Integer> arr2List = new ArrayList<>();
//		        for (int element : arr2) {
//		            arr2List.add(element);
//		        }
        List<Integer> arr1List = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> arr2List = Arrays.asList(4, 5, 6, 8, 9, 0);
        List<Integer> commonElements = new ArrayList<>();

		        // Find common elements
		        for (int element : arr1List)
		        {
		            if (arr2List.contains(element))
		            {
		                commonElements.add(element);
		            }
		        }

		        // Print the common elements
		        System.out.println("Common elements: " + commonElements);
		    }
		

       
	}

