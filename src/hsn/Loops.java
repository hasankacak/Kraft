package hsn;

public class Loops {
    public static void main(String[] args) {
        String message="Welcome to bootcamp";
        String reverse="";

        for (int i = message.length()-1; i >= 0; i--) {
            if (message.charAt(i)==' ')break;
            if (message.charAt(i)!=' '){
                reverse+=message.charAt(i);
            }
        }
        System.out.println(reverse);

    }
}
