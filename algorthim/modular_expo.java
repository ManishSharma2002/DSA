package algorthim;

public class modular_expo {

    public static void main(String[] args) {
        // i/p = a,b and find the power a^b

        int n = 5;
        int b = 10;
        int res = 1;
        while (n > 0) {
            if ((b & 1) == 1) {
                res = (res * b);

            }
            n = n * n;
            n = n >> 1;

        }
        System.out.println(res);
    }
}
