import java.util.Scanner;
class Fibo {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("enter the value of n");
        int n = sc.nextInt ();
        int a = 0;
        int b = 1;
        if (n == 0) {
            System.out.println (0);
        }
        else {
            for (int i = 1 ; i < n ; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println (a);
        }
    }
}