public class pair_in_array {
    public static void pairing_array(int arr[]){

        int tp = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                System.out.print("(" + arr[i]+ "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pair of array : "+ tp);
        
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
        pairing_array(arr);


    }
}
