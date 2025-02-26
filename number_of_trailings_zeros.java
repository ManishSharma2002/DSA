public class number_of_trailings_zeros {
    
    public static void main(String[] args) {
        int n= 100;
        int count = 0;
        int fact = 0;
        for(int i =1 ;i<=n;i++){
            count = count + (int)(n/Math.pow(5,i));
                
            
            
        }
        System.out.println(count);

        
    }
}
