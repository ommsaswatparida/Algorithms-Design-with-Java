package sep17;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int key=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		linear(0,arr,key);

	}
	static void linear(int n,int arr[],int key) {
	
	if (arr[n]==key)
		System.out.println("found");
	linear(n+1,arr,key);
	
}
}
