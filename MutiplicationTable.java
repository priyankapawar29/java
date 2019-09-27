/**
 * @author PriyankaPawar
 * Accept a number and print its multiplication table.
 */
import java.util.Scanner;
public class MutiplicationTable {

	public static void main(String[] args) {
		int n, m= 1, i;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		for(i=1; i<11; i++)
		{
			m = i * n;
			System.out.println(n + "x" + i + " = " + m );
		}

	}

}
