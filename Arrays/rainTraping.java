public class rainTraping {
    public static void TrapWaterProb(int [] height){
        int n=  height.length;
        // calculate the left max boundary - arrray 
        int leftmax [ ] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1 ; i<n ;i++){
            leftmax[i] = Math.max(leftmax[i-1] , height[i]);
        }

        // calculate the right max boundary - arrray
        int rightmax [] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2 ;i>=0 ;i--){
            rightmax[i] = Math.max(height[i] , rightmax[i+1]);
        } 

        // loop (i= 0 to n)  =>  
        // waterelevel  = min (left max boundary , rigght max boundary)
        // trapedwater =  waterelevel - height[i]
        
        
        int trapedwater = 0;
        for(int i = 0;i<n ;i++){
            int waterelevel = Math.min(leftmax[i],rightmax[i]);
            trapedwater = trapedwater + (waterelevel - height[i]);
        }



        System.out.println("max trapwater in rain : " + trapedwater);
    }


   

    public static void main(String[] args) {
        int [] height = {4,2,0,6,3,2,5};
        TrapWaterProb(height);

    }
    
}
