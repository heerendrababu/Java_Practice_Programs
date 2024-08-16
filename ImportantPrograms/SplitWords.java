package ImportantPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class SplitWords {

	public static void main(String[] args) 
	{
     String s ="good bad good bad good";
     String[] arr=s.split(" ");
     
     LinkedHashMap<String,Integer> hm=new LinkedHashMap<String,Integer>();
     
     for(int i=0;i<=arr.length-1;i++)
     {
    	 // arr[i] have string type of data so we are catching with string variable.
    	 String s1= arr[i];// we are simply shifting 'arr[i]' String data to s1 , So we can simply write 's1' variable in next code instead of 'arr[i]'
    	 if(hm.containsKey(s1)==true)
    	 {
    		int val = hm.get(s1);
    	       hm.put(s1, val+1);
    	 }
    	 else
    	 {
    		 hm.put(s1,1);
    	 }
     }
     
     for(Map.Entry<String, Integer> entry:hm.entrySet())
     {
    	 String key=entry.getKey();
    	int value= entry.getValue();
    	System.out.println(key+" is occuring "+value+" times");
     }
	}

}
