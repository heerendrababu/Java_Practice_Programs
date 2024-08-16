package ImportantPrograms;

public class PowerOfnValuesIndex {

	public static void main(String[] args) 
	{
      // Print power of n values indexes
	
		        int n = 5; // Change this value to the desired number of powers

		        System.out.println("Powers of 3:");

		        long powerOfThree = 1; // Initialize the power of 3 to 1

		        for (int i = 0; i < n; i++) {
		            System.out.println("Index: " + i + ", 3^" + i + " = " + powerOfThree);
		            powerOfThree *= 3; // Multiply the current power by 3 to get the next power of 3
		        }
		        System.out.println(powerOfThree);
		    }
	
}
