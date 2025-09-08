public class power_of_2 {

    public static void main(String[] args) {
        int n = 1024;
        int x = 0;
        for (int i = 0; i <= 32; i++) {
            x = (int) Math.pow(2, i);
            if (x == n) {
                System.out.println(i);
                break;
            }
        }

    }
}
