package sep17;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long ans=fact(n);
		System.out.print(ans);

	}
static long fact(int n) {
	if(n<=1)
		return 1;
	return n *fact(n-1);
}
}
