package ImportantPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintDuplicateKeys {

	public static void main(String[] args) 
	{
      String s="palletech";
      LinkedHashMap<Character,Integer> hm= new LinkedHashMap<Character,Integer>();
      for(int i=0;i<=s.length()-1;i++)
      {
    	Character ch = s.charAt(i);
      
         if(hm.containsKey(ch)==true)
         {
    	  int val=hm.get(ch);
    	  hm.put(ch, val+1);
          }
         else
         {
        	 hm.put(ch, 1);
         }  
      }
       
      // Finding Duplicate keys by comparing values and printing it.
      for(Map.Entry<Character, Integer>entry:hm.entrySet())
      {
    	 Character key=entry.getKey();
    	 int val = entry.getValue();
    	 if(val>1)
    	 {
    		 System.out.print(key+",");
    	 }
      }
      
      
	}

}
