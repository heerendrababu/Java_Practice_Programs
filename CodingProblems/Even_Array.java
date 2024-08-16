package CodingProblems;

public class Even_Array 
{
	public static void main(String[] args)
	{
		Test2 t= new Test2();
		t.m2();
	}
}
		/*Test t=new Test();
		t.m();
      int[] arr= {10,3,23,35,33,14};
      if(arr[0]%2==0)
      {
    	  System.out.println(arr[0]);
      }
      if(arr[1]%2==0)
      {
    	  System.out.println(arr[1]);
      }
      if(arr[2]%2==0)
      {
    	  System.out.println(arr[2]);
      }
      if(arr[3]%2==0)
      {
    	  System.out.println(arr[3]);
      }
      if(arr[4]%2==0)
      {
    	  System.out.println(arr[4]);
      }
      if(arr[5]%2==0)
      {  
    	  System.out.println(arr[5]);
      }
	}

}*/
//or
/*class Test
{
	public void m()
	{
		System.out.println("method");
	int[] arr= {10,3,23,35,33,14};
	for(int i=0;i<=arr.length-1;i++)
	{
		
		if(arr[i]%2==0)
	   System.out.println(arr[i]);	
	}
}
}*/
class Test2
{
	public void m2()
	{
		int[] arr= {18,21,31,22,15};
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("palle");
			}
			else if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}