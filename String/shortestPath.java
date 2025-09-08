package String;

public class shortestPath {
    public static float getShortestPath(String str){
        int n = str.length();
        int y= 0;
        int x = 0;
        for(int i  = 0;i<n;i++){
            char dir = str.charAt(i);
            // north
            if(dir== 'N'){
                y++;
            }
            // south
            else if(dir=='S'){
                y--;
            }
            // east
            else if(dir=='E'){
                x--;
            }
            //west
            else{
                x++;
            }
        }
        int  x2 = x*x;
        int  y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }


    public static void main(String[] args) {
        String str = "NEENSSWW";
        System.out.println(getShortestPath(str));
    }
}
