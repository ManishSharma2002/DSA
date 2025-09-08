public class minimumJump{
    public static void minjump(int arr []){
        int j =arr[0];
        int jump  = 0;
       
        for(int i = 0;i<arr[j] ;i++){
            
            if(arr[j]< arr.length){
                if(arr[j]== 0){
                    j++;
                    break;
                }
                else{
                    j = arr[i];
                    jump++;

                }
            }
        }
        System.out.println(jump);
    }



    public static void main(String[] args) {
        int [] arr  = { 1, 4, 3, 2, 6, 7};
        // int [] arr  = { 9,10,1,2,3,4,8,0,0,0,0,0,0,0,1};
        minjump(arr);
    }
}