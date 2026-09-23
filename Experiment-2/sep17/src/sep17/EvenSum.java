package sep17;
import java.util.Scanner;
public class EvenSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=EvenSumn(n);
		System.out.println(ans);

	}


static int EvenSumn(int n) {
	if(n==0)
		return 0;
	int sum=0;
	int digit=n%10;
 
	//return digit%2==0? sum+digit:EvenSumn(n/10);
	if(digit%2==0) {
		return EvenSumn(n/10)+digit;
	}
	return EvenSumn(n/10);
	
}	
	
}