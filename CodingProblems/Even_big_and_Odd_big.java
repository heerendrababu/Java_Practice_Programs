package CodingProblems;

public class Even_big_and_Odd_big
{
   public static void main(String[] args)
   {
	   
  // Calculating Reverse of a number
//	   int[] arr= {1,4,5,6,};
//	   for(int i=arr.length-1;i>=0;i--)
//	   {
//		   System.out.print(arr[i]);
//	   }
	   
	   // [OR]
	   int num=2614 ;
	   int reverse=0;
	   while(num!=0)
	   {
		   int remainder=num%10;
		   reverse=reverse*10+remainder;
		   num=num/10;
		   //System.out.println(reverse +" ");
		   
	   }
	   System.out.println(reverse);
	   
	   
	   // Calculating EvneBig and OddBig
//	   int[] arr= {51,7,12,4,81,60,55,67};
//	   int evenbig=arr[0];
//	   int oddbig=arr[0];
//	   for(int i=0;i<=arr.length-1;i++)
//	   {
//	
//		   if(arr[i]%2==0 && arr[i]>evenbig)
//		   {
//			   evenbig=arr[i];
//		   }   
//		   else if(arr[i]%2!=0 && arr[i]>oddbig)
//		   {
//			   oddbig=arr[i];
//		   }
//			   
//	   }
//	   System.out.println(evenbig);
// 
//	   System.out.println(oddbig);
//	   System.out.println(evenbig-oddbig);
	   
	   
   }
}
