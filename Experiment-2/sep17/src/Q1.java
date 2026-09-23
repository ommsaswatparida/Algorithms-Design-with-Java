import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base and power: ");
		int a = sc.nextInt();
		int n = sc.nextInt();
		int ans=power(a,n);
		System.out.println(ans);

	}
static int power(int a,int n) {
	if(n==0)
		return 1;
	return a*power(a,n-1);
}
}
