package ImportantPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

// checking which letter occuring how many times.
public class Demo {

	public static void main(String[] args) 
	{
      String s = "malayalam";
      LinkedHashMap<Character,Integer> hm= new LinkedHashMap<Character,Integer>();
      for(int i=0;i<=s.length()-1;i++)
      {
    	  if(hm.containsKey(s.charAt(i))==true)
    	  {
    		int value =  hm.get(s.charAt(i));
    		hm.put(s.charAt(i), value+1);
    	  }
    	  else
    	  {
    		  hm.put(s.charAt(i),1);
    	  }
    	//  System.out.print(hm);// it will print repeated data
      }
     System.out.println(hm);
      
      // Printing unique keys
      for(Map.Entry<Character, Integer>entry :hm.entrySet())
      {
    	System.out.print(entry.getKey());
      }
	}

}
