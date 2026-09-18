import java.util.Scanner;
class starPatterns {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int row = 1;
        int star = 1;
        for (int i = 1 ; i <= (n * (n + 1)) / 2; i++) {
            System.out.print ("*");
            if (row == star) {
                System.out.println ();
                row++;
                star = 1;
            }
            else {
                star++;
            }
        }
    }
}