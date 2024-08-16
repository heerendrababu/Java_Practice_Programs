package ImportantPrograms;
import java.util.*;
import java.util.Scanner;
public class Alphabets_Sorting {

	public static void main(String[] args)
	{
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter characters");
         String s=sc.next();
       //Convert the string to uppercase to handle both upper & lower case
       s=s.toUpperCase();
       //Convert the string to a character array
       char[] arr=s.toCharArray();
       //sort the array
       Arrays.sort(arr);
       System.out.println("sorted char array: " );
       for(char c:arr)
       {
    	   System.out.print(c);
       }
       sc.close();
	}

}
