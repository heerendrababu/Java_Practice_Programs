package CodingProblems;

import java.util.HashMap;
import java.util.*;

public class Hash_Map2 {

	public static void main(String[] args) {
     String s="palle";
     HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
     for(int i=0;i<=s.length()-1;i++)
     {
    	 if(hm.containsKey(s.charAt(i))==true)
    	 {
    		 int c=hm.get(s.charAt(i));
    		 hm.put(s.charAt(i), c+1);
    	 }
    	 else
    		 hm.put(s.charAt(i),1);
     }
     System.out.println(hm);
     for(Map.Entry<Character,Integer> entry:hm.entrySet())
     {
    	 char key=entry.getKey();
         int value=entry.getValue();
         System.out.print(key +" is occuring ");
         System.out.print(value+" times");
         System.out.println();
	}
	}

}
