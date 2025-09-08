import java.security.PublicKey;
import java.util.Scanner;

public class advanced_pattern {
    public static void hollow_rect(int row,int col){
        for( int i = 1;i<=row;i++){         // outer loop = for  control rows
            for(int j = 1;j<=col ;j++){    //  inner loop = for control cols 
                if(i==1 || i== row || j==1 || j== col){      // boundary condition
                    System.out.print("*");
                }
             else{
                System.out.print(" ");
             }
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void inverted_rotated_half_pyramid(int n){
        for(int i = 1; i<=n ;i++){            // for row 
            for(int j= 1; j<=(n-i) ;j++){    //  for spaces
                System.out.print(" ");
            }
            for(int j = 1; j<=i ;j++){        // for star print 
                System.out.print("*");
            }
            System.out.println();   
        }
        System.out.println();
    }

    public static void inverted_half_pyramid_withnumber(int n){
        for(int i = 1; i<=n ;i++){
            for(int j= 1 ;j<=(n-i+1) ;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void floyd_triangle(int n ){
        int count = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i;j++){
                System.out.print(count+ " " );
                count++;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void zero_onetriangle_pattern(int n){
        for(int i= 1; i<=n ;i++ ){
            for(int j =1; j<=i ;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
        System.out.println();
    }


    

    public static void  butterfly_pattern(int n){
        
        // first half 
        for(int i = 1; i<=n; i++ ){             // no of rows
            for(int j= 1; j<=i; j++ ){          // print star 1 to i
                System.out.print("*");
            }
            for(int k = 1; k<=2*(n-i) ;k++){    // print spaces 1 to 2*(n-i)
                System.out.print(" ");
            }
            for(int j= 1 ;j<=i;j++){            // print star 1 to i
                System.out.print("*");
            }
            System.out.println();
        }
        
        //second half 
        for(int i = n ;i>=1;i--){
             for(int j= 1; j<=i; j++ ){
                System.out.print("*");
            }
            for(int k = 1; k<=2*(n-i) ;k++){
                System.out.print(" ");
            }
            for(int j= 1 ;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void solid_rhombus(int n){
        for(int i = 1 ;i<=n ;i++){
            for(int j = 1 ; j<=(n-i) ;j++){
                System.out.print(" ");
            }
            for(int j= 1 ;j<=n ;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void hollow_rhombus(int n){
        for(int i = 1 ; i<=n; i++){
            for(int j= 1 ;j<=(n-i);j++){         // print spaces 
                System.out.print(" ");
            }
            for(int j= 1 ;j<=n ;j++){
              if(i==1 || i==n || j==1 || j==n){   //boundary condition
                  System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();
    }

    public static void diamond_pattern(int n){
        for(int i = 1;i<=n; i++){               // for rows
            for(int j= 1 ;j<=(n-i) ;j++){       //print spaces 1 to n-i
                System.out.print(" ");
            }
            for(int j = 1;j<=(2*i)-1 ;j++){     // print star 1 to odd no (1,3,5...)
                System.out.print("*");
            }
            System.out.println();
        }

        // second half 
        for(int i = n;  i>=1; i--){
             for(int j= 1 ;j<=(n-i) ;j++){       //print spaces 1 to n-i
                System.out.print(" ");
            }
            for(int j = 1;j<=(2*i)-1 ;j++){     // print star 1 to odd no (1,3,5...)
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void number_pyramiod(int n){
         
        // outer loop
        for(int i= 1 ;i<=n ;i++){

            //spaces
            for(int j= 1 ; j<=(n-i); j++){
                System.out.print(" ");
            }

            // number + spaces
            for(int j= 1 ; j<=i ;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void palindrome_pattern_withnumber(int n){
        
        // outer loop 
        for(int i = 1 ;i<=n ;i++){
           
            // spaces 
            for(int j= 1 ;j<=(n-i) ;j++){
                System.out.print(" ");
            }

            // ascending order (i to 2)
            for(int j= i;j>=2;j--){
                System.out.print(j);
            }

            // descending order (1 to i)
            for(int j =1 ;j<=i ;j++){
                System.out.print(j);
            }
            System.out.println();;
        }
    }

    public static void main(String[] args) {
        
        hollow_rect(4, 5);
        inverted_rotated_half_pyramid(5);
        inverted_half_pyramid_withnumber(5);
        floyd_triangle(5);
        zero_onetriangle_pattern(5);
        butterfly_pattern(4);
        solid_rhombus(5);
        hollow_rhombus(5);
        diamond_pattern(4);
        number_pyramiod(5);
        palindrome_pattern_withnumber(5);


    }
}
