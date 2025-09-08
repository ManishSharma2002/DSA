package String;

public class substring {
    public static String substr(String str,int si,int ei){
        
        String substr = "";
        for(int i = si;i<ei;i++){
            substr = substr + str.charAt(i);
        }
        return substr;

    }
    public static void main(String[] args) {
        
        String str = "helloworld";
        System.out.println(substr(str,0,5));
        System.out.println(str.substring(0,5));   // inbuild function

    }
}
