package sep17;
import java.util.Scanner;

public class Hexadecimal {
    static String h = "0123456789ABCDEF";

    static String hex(int n) {
        return n == 0 ? "" : hex(n / 16) + h.charAt(n % 16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String r = hex(n);
        System.out.println(r.isEmpty() ? "0" : r);
    }
}
