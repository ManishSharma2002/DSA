import java.util.Scanner;

public class reverse_no {
    public static int reverse_no(int n) {
        int rev = 0;
        while (n > 0) {
            int ld = n % 10;
            rev = (rev * 10) + ld;
            if ((rev > Integer.MAX_VALUE / 10) || (rev < Integer.MIN_VALUE)) {
                return 0;
            }
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();
        System.out.println("reverse of given number is :" + reverse_no(num));
    }
}