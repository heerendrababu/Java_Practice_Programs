package ImportantPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostOccuringLetter
{
	public static void main(String[] args) 
	{
      String s="palle";
      LinkedHashMap<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
      for(int i=0;i<=s.length()-1;i++)
      {
    	 char ch= s.charAt(i);
    	if(hm.containsKey(ch)==true)  
    	{
    		int result = hm.get(ch);
    		hm.put(ch,result+1);
    	}
    	else
    	{
    		hm.put(ch, 1);
    	}
      }
      
      // To find which letter occuring most
      int big=0;
      char ch='a';
      for(Map.Entry<Character,Integer> entry :hm.entrySet())
      {
    	  char key = entry .getKey();
    	 int val= entry .getValue();
    	 if(val>big)
    	 {
    		 big = val;
    		 ch = key;
    	 }
    	//  System.out.println(key+" is occuring "+val+" no.of times");
      }
       System.out.println(ch+" :is occuring most");
      
	}

}
