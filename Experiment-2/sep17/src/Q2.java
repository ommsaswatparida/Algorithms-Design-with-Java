import java.util.Scanner;
public class Q2{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int n=sc.nextInt();
		
		DectoBin(n);


	}
static void DectoBin(int n) {
	if (n==0)
		return;
	int rem=n%2;
	System.out.print(rem);
	DectoBin(n/2);
	
	}
}

