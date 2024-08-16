//package CodingProblems;
//
//public class Fibonacci_Series {
//
//	public static void main(String[] args)
//	{
//          getSeries(10);
//       
//       
//       // just for testing purpose of one data type used for multiple variables.
//       int mx =10, my=20 , mz=10000;
//       System.out.println(mx+my+mz);
//    
//	}
//
//
//public static void getSeries(int n)
//{
//		int x=0;
//		int y=1;
//		int count=2; // Because starting x=0,y=1 we need to count as 2
//		System.out.print(x+",");
//     	System.out.print(y+",");
//
//     	for(int i=2;i<n;i++)
//     	{
//     	   int z=x+y;
//     	   x=y;
//     	   y=z;
//     	   System.out.print(z+",");
//     	   count++;
//     	 }
//     	 System.out.println();
//         System.out.println( " count is:"+ count);
//     	}
//	}
package CodingProblems;

public class Fibonacci_Series {

    public static void main(String[] args) {
        int n = 10;
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            printFibonacciSeries(n);
        }
    }

    public static void printFibonacciSeries(int n) {
        if (n == 1) {
            System.out.println("0");
            return; // without this statement it will print below lines x and y.
        }

        int x = 0;
        int y = 1;

        System.out.print(x + ", " + y);

        for (int i = 2; i < n; i++) 
        {
            int z = y + x;
            x = y;
            y = z;
            System.out.print(", " + z);
        }
    }
}

