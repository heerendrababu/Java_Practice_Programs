package ImportantPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicateString {

	public static void main(String[] args)
	{
      String s ="malayalam";
      LinkedHashMap<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
      for(int i=0;i<=s.length()-1;i++)
      {
    	  if(hm.containsKey(s.charAt(i))==true)
    	  {
    		  int result = hm.get(s.charAt(i));
    		  hm.put(s.charAt(i),result+1);
    	  }
    	  else
    	  {
    		  hm.put(s.charAt(i),1);
    	  }
      }
      for(Map.Entry<Character, Integer> entry: hm.entrySet())
      {
    	  char ch = entry.getKey();
    	  int val = entry.getValue();
    	  System.out.print(ch); // or (ch+",");
    	  
      }
	}

}
