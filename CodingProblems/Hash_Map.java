package CodingProblems;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args)
	{
     int[] arr= {20,10,20,0};
     HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
     for(int i=0;i<=arr.length-1;i++)
     {
    	 if(h.containsKey(arr[i])==true)
    	 {
    		 int Result=h.get(arr[i]);
    		 Result=Result+1;
    		 h.put(arr[i],Result);
    	 }
    	 else
    		 h.put(arr[i], 1);
     }
     System.out.println(h);
	}

}
