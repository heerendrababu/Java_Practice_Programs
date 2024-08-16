package CodingProblems;

public class talengical {

	public static void main(String[] args) {
int x=3;
int y=4;
int temp=0;
System.out.print(x+" ");
System.out.print(y+" ");


for(int i=1;i<=20;i++) 
{
	temp=x+y-2;
	System.out.print(temp+" ");
	x=y;
	y=temp;		
}

	}

}
