public class revision2 {

    public static void main(String[] args) {

        int n = 5;
        int pow = 0;
        int sum = 0;
        while (n > 0) {
            int ld = n % 2;
            sum = sum + ld * (int) (Math.pow(10, pow));
            n = n / 2;
            pow++;
        }
        System.out.println(sum);

        int n1 = sum;
        System.out.println(n1 | 1 << 2);

    }
}
