public class gcd_and_lcd{


    static int[] lcmAndGcd(int a, int b) {
        int prod = a*b; 
        int gcd = 1;
        int lcm = 1;
        while(a>0 && b>0){
            if(a>b){
                a= a%b;
            }
            else{
                b= b%a; 
            }
        }
        if(a==0){
             gcd =b;
        }
        else{
             gcd = a;
        }
        lcm = prod /gcd;
        return new int[] {lcm,gcd};
    }

    public static void main(String[] args) {
        int a = 14;
        int b = 8;
        int arr[]  = lcmAndGcd(a, b);
    System.out.println("lcd = " + arr[0] + "\n" + "gcd = " + arr[1]);

    }
}