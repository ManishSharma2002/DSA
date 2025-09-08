  public class reverse_no {
    static int  rev_dig(int n ){
        int rev =0;
        while(n!=0){
            rev = (rev *10) + n%10;
            n/=10;
        }
        return rev;
    }
     public static void main(String[] args) {
        int reverse_no = rev_dig(4560);
        System.out.println("reverse number: " + reverse_no);
    }
  }  
