public class add_digit {

    static int number(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num /= 10;
        }
        return sum;
    }

    static void add_no(int n) {
        int dup = n;
        while (n > 9) {
            int add_number = number(n);
            n = add_number;
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 10;
        // method 1
        // add_no(n);
    
        // method 2
        if(n==0){
            System.out.println(0);
        }
        else if(n%9==0){
            System.out.println(9);
        }
        else{
            System.out.println(n%9);
        }
    }
}
