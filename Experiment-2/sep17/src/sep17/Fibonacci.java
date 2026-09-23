package sep17;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		fib(n,0,1);


	}
static void fib(int n,int a,int b) {
	if (n==0)
		return;
	fib(n-1,b,a+b);
	System.out.print(a+" ");
}
}
