import java.util.Scanner;
class LinearSearch {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a [] = new int [n];
        for (int i = 0 ; i < n ; i++) {
            a [i] = sc.nextInt();
        }
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                System.out.print ("found");
                return;
            }
        }
        System.out.println ("not found");
    }
}