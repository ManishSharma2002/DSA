package String;

public class StringCompression {


    // method -1 => using String   TC - O(n)
    // public static void getstrCompression(String str){
    //     String newstr = "";
    //     for(int i = 0 ;i<str.length();i++){
    //         Integer count = 1;
    //         while(i<str.length()-1  && str.charAt(i)== str.charAt(i+1) ){    // last index case = (8==9(true) && 8< length(10)-1 = 9)
    //             count++;
    //             i++;
    //         }
    //         newstr += str.charAt(i);
    //         if(count >1){
    //             newstr += count.toString();
    //         }
    //     } 
    //  System.out.println(newstr);
    // }


    // method-2 => using string bulider 
    public static void getstrCompression(String str){    // TC - O(n)
        StringBuilder sb = new  StringBuilder("");
        for(int i= 0;i<str.length();i++){
            sb.append(str.charAt(i));   
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1) ) {
                count++;
                i++;
            }
             if(count >1){
                sb.append(count);
        }

        }
        System.out.println(sb);
    }


    public static void main(String[] args) {
        String str= "aaabbbcddd";
        // String str= "acbd";
        getstrCompression(str);
    }
}
