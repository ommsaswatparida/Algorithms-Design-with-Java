package sep17;

import java.util.Scanner;

public class BinarySearch {
    static boolean bs(int[] a, int lo, int hi, int x) {
        if (lo > hi)
        	return false;
        int m = (lo + hi) / 2;
        if (a[m] == x) 
        	return true;
        boolean asc = a[lo] <= a[hi];
        if (asc) 
        	return x < a[m] ? bs(a, lo, m - 1, x) : bs(a, m + 1, hi, x);
        else 
        	return x > a[m] ? bs(a, lo, m - 1, x) : bs(a, m + 1, hi, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(bs(a, 0, n - 1, x));
    }
}
