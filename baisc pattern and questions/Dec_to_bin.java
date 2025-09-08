import java.util.Scanner;

public class Dec_to_bin {
    public static int dectobin(int n){
        int bin = 0;
        int pow = 0;
        while(n>0){
            int ld = n%2;
            bin = bin + ld*(int)Math.pow(10, pow);
            pow++;
            n/=2;
        }
        return  bin;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();
        System.out.println("convert decimal no (" +num + ") to binary no :" +dectobin(num));

    }
}
