import java.util.Scanner;
class MaxSubarray {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int a [] = new int [n];
        for (int i = 0 ; i < n ; i++) {
            a [i] = sc.nextInt ();
        }
        int currentsum = a [0];
        int maxsum = a [0];
        for (int i = 1 ; i < n ; i++) {
            if (currentsum + a [i] > a [i]) {
                currentsum = currentsum + a [i];
            }
            else {
                currentsum = a [i];
            }
            if (currentsum > maxsum) {
                maxsum = currentsum;
            }
        }
        System.out.println ("Max subarray =" + maxsum);
    }
}