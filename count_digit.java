
import java.math.*;
public class count_digit{
    static void cout_no(int n){
        int temp = 0;
        int count = 0;
        while(n!= 0){
            temp = n%10;
            count+=1;
            n/=10;
        }
        System.out.println(count);
    }

    public static void main (String args[]){
        //  methd 1
        //    cout_no(20);


        //  method 2
        int n= (int)(Math.log10(54650)) +1 ;
         System.out.println(n);

    }


}