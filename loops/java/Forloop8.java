package com.loops.java;

public class Forloop8 {

	public static void main(String[] args) {
       for(int i=1;i<=99;i++)
       {
    	   System.out.print(i+",");
       }
       System.out.println(100);
       m();
	}
	public static void m()//We need to call this method from main 
	//method otherwise it won't execute jvm prioritizes only main method
	{
		System.out.println(22);
	}

}

