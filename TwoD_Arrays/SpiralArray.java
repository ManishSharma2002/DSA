package TwoD_Arrays;

public class SpiralArray {
    public static void spiralprint(int arr[][]){
        int n= arr.length;
        int m = arr[0].length;
        int sr = 0;
        int sc = 0;
        int er = n-1;
        int ec=  m-1;
        
        while(sr<= er && sc <=ec){
             // sc  = toward down
             for(int i = sr ;i<=er;i++ ){
                System.out.print(arr[i][sc] + " ");
             }
             sc++;

             // er = toward right
             for(int i = sc ;i<=ec;i++){
                System.out.print(arr[er][i] + " ");
             }
             er--;

             // ec = toward upwards
             for(int i = er ;i>=sr;i--){
                System.out.print(arr[i][ec]+ " " );
             }
             ec--;

             // sr  = toward left
             for(int i = ec;i>=sc;i--){
                System.out.print(arr[sr][i] +" ");
            }
            sr++;
            


        }
    }

    public static void main(String[] args) {
        
                        
        int arr [][] = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        spiralprint(arr);
    }
}
