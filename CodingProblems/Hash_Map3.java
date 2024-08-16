package CodingProblems;

import java.util.HashMap;
import java.util.*;

public class Hash_Map3 {

	public static void main(String[] args)
	{
   //printing unique occurances of each letter
    String s="malayalam";
    HashMap<Character,Integer>h=new HashMap<Character,Integer>();
    for(int i=0;i<=s.length()-1;i++)
    {
    	if(h.containsKey(s.charAt(i))==true)
    	{
    	 int value=h.get(s.charAt(i));
    	 h.put(s.charAt(i),value+1); 
    	}
    	else
    		h.put(s.charAt(i), 1);
    }
     
    for(Map.Entry<Character,Integer>entry:h.entrySet())
    {
    	//Here we need to print only keys
    	char Key=entry.getKey();
    	int value=entry.getValue();
    	System.out.print(Key);
    	//System.out.println(value);
    }
		
	}

}
