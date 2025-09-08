import java.util.Scanner;

public class basic_pattern {
    public static void starpattern(int n){
        for(int i = 1 ;i<=n;i++){
            for(int j =1 ;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void revstar_pattern(int n){
        for(int i = 1;i<=n;i++){
            for(int j= 1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void number_pattern(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void char_pyramid_pattern_1(int n){
        char ch = 'A';
        for (int i = 1;i<=n;i++){
            for(int j= 1 ;j<=i;j++){
                System.out.print(ch+ " ");
                ch++;

            }
            System.out.println();
        }
        System.out.println();
    }

    
    public static void char_pyramid_pattern_2(int n){
    for(int i = 1;i<=n;i++){
        char ch  = 'A';
            for(int j = 1;j<=i;j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int num = sc.nextInt();
        starpattern(num);
        revstar_pattern(num);
        number_pattern(num);
        char_pyramid_pattern_1(num);
        char_pyramid_pattern_2(num);
    
   
    
    }
}
