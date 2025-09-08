package String;

public class revision {

    public static char tolowercase(char ch) {
        if (ch > 'a' && ch < 'z') {
            return ch;
        } else {
            return (char) (ch - 'A' + 'a');
        }
    }

    public static void main(String[] args) {
        String name = "manish";
        char[] ch = name.toCharArray();
        int cnt = 0;
        for (int i = 0; i < name.length(); i++) {
            System.out.print(ch[i] + " ");
            cnt++;

        }
        System.out.println(name.length());
        System.out.println(tolowercase('d'));
    }
}
