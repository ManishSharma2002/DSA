import java.util.Scanner;

public class prime_no_in_range {
    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();
        for (int i = 2; i <= num; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
    }

}
