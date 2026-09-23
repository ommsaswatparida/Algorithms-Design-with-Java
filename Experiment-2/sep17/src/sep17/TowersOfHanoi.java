package sep17;

import java.util.Scanner;

public class TowersOfHanoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		toh(n,'a','b','c');

	}
static void toh(int n,char  from,char aux,char to) {
	if(n==0)
		return;
	toh(n-1,from,to,aux);
	System.out.println("Move "+n+" from "+from+" to "+to);
	toh(n-1,aux,from,to);
}
}
