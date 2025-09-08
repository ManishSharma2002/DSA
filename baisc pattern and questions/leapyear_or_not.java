import java.util.Scanner;

public class leapyear_or_not {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the year :");
        int n = sc.nextInt();


        //  approach 1  = using nested if - else
        if (n % 4 == 0) {
            if (n % 100 == 0) {
                if (n % 400 == 0) {
                    System.out.println("not a leap year");
                }

            } else {
                System.out.println("it is a leap year");
            }
        } else {
            System.out.println("not a leap year");
        }
    
    //  approach 2 = using ternery operator
    boolean z=  (n%4==0)? (n%100==0)? (n%400==0)? false: true:true :false;
    System.out.println(z);
    
    }
}