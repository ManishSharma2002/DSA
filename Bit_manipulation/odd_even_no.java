package Bit_manipulation;

public class odd_even_no {
    public static void oddOreven(int n){
        int bitmask = 1 ;     
        if((n & bitmask) ==0){        // 4= 100 => LSB = 0 & 1=> 0==0  (condition true)
            System.out.println("even");
        }
        else{
                // 3 = 011 => LSB= 1 & 1 => 1==0  
            System.out.println("even");
        }

}
    public static void main(String[] args) {
        oddOreven(10);
        oddOreven(13);
        oddOreven(11);
    }
}
