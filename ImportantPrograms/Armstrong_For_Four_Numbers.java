package ImportantPrograms;

public class Armstrong_For_Four_Numbers {

	public static void main(String[] args) 
	{
		int num = 9474;   // inital value of num
	       int temp = num;  // temp stores initial value of num
	       double result = 0;   // initial value of result
	       
	       while (num>0)  // first loop
	       {
	    	   int last = num%10; // Extract the last digit of num
	    	 //  result = result +(last*last*last*last); // Adds the cube of last digit to result
	    	           //[or]
	    	   result = result + Math.pow(last, 4);
	    	    num = num/10;  // Remove the last digit from num
	       }
	    	
	       // Checking if the number is Armstrong
	       if(temp == result)  // if the original number is equal to the caluculate result
	    	    {
	    	    	System.out.println(temp +": is an armstrong number");
	    	    }
	    	    else
	    	    {
	    	    	System.out.println(temp +": is not an armstrong number");
	    	    }
	}

}
