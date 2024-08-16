package CodingProblems;
import java.util.*;

public class Split_String {

	public static void main(String[] args)
	{
      String s="palle tech pvt ltd bangalore";
      String[] arr=s.split(" ");
      for(int i=0;i<=arr.length-1;i++)
      {
    	  System.out.print(reverseWord(arr[i])+" ");
	}

}
	public static String reverseWord(String arr)
	{
		StringBuilder r=new StringBuilder(arr);
		return r.reverse().toString();
	}
}