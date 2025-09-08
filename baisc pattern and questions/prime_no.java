import java.util.Scanner;

public class prime_no {

    public static boolean isprime(int n){
    
        if(n== 2){
            return true;
        }
        else{
            for(int i = 2 ;i<=Math.sqrt(n);i++){  // methoed 1 = optimized 
            // for(int i = 2; i<=n-1 ; i++){      // method 2 = brute force approach
                if(n%i==0){
                    return false;
                }
            }
        }
         return true;   

    } 
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num  =  sc.nextInt();
        if(isprime(num)){
            System.out.println("this " + num + " is prime" );
        }
        else{
            System.out.println("this " + num + " is not prime" );

         }   
        
     }
}