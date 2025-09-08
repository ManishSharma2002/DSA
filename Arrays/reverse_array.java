public class reverse_array {
    public static void reverse_arr(int arr[]){
        int start = 0 , end = arr.length-1;
        while(start< end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        System.out.print("reverse array : " );
        print(arr);
 
    }


    public static void print(int arr[]){
        for(int  i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    
    

    public static void main(String[] args) {
        int arr[] = {1,5,6,3,9};
        System.out.print("original array : " );
        print(arr);
        reverse_arr(arr);
    }
    
    
}