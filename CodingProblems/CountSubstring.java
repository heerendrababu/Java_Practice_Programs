package CodingProblems;

import java.util.Scanner;

public class CountSubstring 
{
		    public static int countCommonSubstrings(String s1, String s2) {
		        int count = 0;
		        for (int i = 0; i < s1.length(); i++)
		        {
		            for (int j = 0; j < s2.length(); j++) 
		            {
		                int k = 0;
		                while (i + k < s1.length() && j + k < s2.length() && s1.charAt(i + k) == s2.charAt(j + k))
		                {
		                    k++;
		                    count++;
		                    if(i+k<s1.length()&&j+k<s2.length()&&s1.charAt(i+k)==s2.charAt(j+k)) {
		                    count--;	
		                    }
		                }
		            }
		        }
		        return count;
		    }

		    public static void main(String[] args)
		    {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter first string: ");
		        String s1 = scanner.nextLine();

		        System.out.print("Enter second string: ");
		        String s2 = scanner.nextLine();

		        scanner.close();

		        System.out.println("Output: " + countCommonSubstrings(s1, s2));
		    }
}

	
