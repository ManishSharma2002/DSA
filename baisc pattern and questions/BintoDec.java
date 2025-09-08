import java.util.Scanner;

public class BintoDec {
    public static int BintoDec(int n){
        int dec =0;
        int pow =0;
        while(n>0){
            int ld= n%10;
            dec = dec + (ld* (int)Math.pow(2,pow));
            pow++;
            n/=10;

        }
        return dec;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the binary number :");
        int num = sc.nextInt();
        System.out.println("convert binary no ("+num + ") to decimal no :"+ BintoDec(num));

    }
}
