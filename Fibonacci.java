/**
 * @author PriyankaPawar
 * Accept number and create Fibonacci series for it.
 */
import java.util.Scanner;
public class Fibonacci {
	 static int n1=0, n2=1, n3;
	 static void fiboprint(int x)
		{
			if(x>0) 
			{
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3; 
				System.out.print(" , " + n3);
				fiboprint(x-1);
			}
		}		
	//}
	
	public static void main(String[] args)
	{
		int n0;
		System.out.println("Enter the numbers in your fibonacci series");
		Scanner sc = new Scanner(System.in);
		n0 = sc.nextInt();
		sc.close();
		System.out.print(n1 + " , " + n2 );
		fiboprint(n0-2);
	}

}



