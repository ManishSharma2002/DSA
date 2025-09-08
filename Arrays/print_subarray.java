public class print_subarray {
    
    public static void subarray(char arr[]){
        int tp = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                for(int k= i;k<=j;k++){
                    System.out.print(arr[k]);
                    tp++;
                }
                System.out.println();
                
            }
            System.out.println();
            
        }
        System.out.print("total pair in  subarray "+ tp);
    }


    public static void main(String[] args) {
            // int arr[] = {1,2,3,4,5};
            char arr[] = {'a','b','c','d','e'};
            subarray(arr);


    }
}
