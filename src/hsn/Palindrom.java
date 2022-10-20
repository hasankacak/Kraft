package hsn;

public class Palindrom {
    public static void main(String[] args) {

        //Palindrom kelime bulma

        String str = "kabak";
        String palind = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            palind += str.charAt(i);
        }
        if (palind.equals(str)) {
            System.out.println("Palindrom kelimedir.");
        } else {
            System.out.println("Palindrom kelime değildir.");
        }




        System.out.println("-----------------------------");

        //Palindrom sayı bulma

        System.out.println(isPalindrom(4004));

    }

    static boolean isPalindrom(int number) {
        int num;
        int tersSayi = 0;
        int kalan;
        num=number;
        while (num != 0) {
            kalan = num % 10;
            tersSayi=(tersSayi*10)+kalan;
            num/=10;
        }
        if (number==tersSayi){
            return true;
        }
        return false;
    }
}