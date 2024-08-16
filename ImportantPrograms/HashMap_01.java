package ImportantPrograms;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


// code for checking how many no.of times an element occuring in the array
public class HashMap_01 {

	public static void main(String[] args)
	{
       int[] arr= {10,20,10,20,30};
      LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<Integer,Integer>();
       for(int i=0;i<=arr.length-1;i++)
       {
    	   if(hm.containsKey(arr[i])==true)
    	   {
    		   int result = hm.get(arr[i]);
    		   hm.put(arr[i],result+1);
    	   }
    	   else 
    	   {
    		   hm.put(arr[i],1);
    	   }
       }
      System.out.println(hm);
        
       // Read the data of each pair in map and return each pair . So we are using for each loop. 
       for(Map.Entry<Integer, Integer> entry : hm.entrySet())
       {
    	   int key =entry.getKey();
    	   int value =entry.getValue();
    	   System.out.println(key+" :is occuring " +value+" times");
       }
	}

}
