import java.util.Scanner;
public class Q3{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number: ");
		int n=sc.nextInt();
		
		int ans=BintoDec(n,0);
		System.out.println(ans);


	}
static int BintoDec(int n,int i) {
	if (n==0)
		return 0;
	int rem=n%2;
	
	return rem*(int)Math.pow(2,i)+BintoDec(n/2,i++);
	
	//BintoDec(n/2);
	
	}
}

