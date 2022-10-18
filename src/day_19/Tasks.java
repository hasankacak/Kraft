package day_19;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //  System.out.println("lütfen bir mesaj giriniz");
//        String message= scan.nextLine();
//        System.out.println(message.length());
//
//       String name = "Hasan";
//      String surname = "Koçak";
//        System.out.println(name.length()+surname.length());
//
//
//         System.out.println("fullNameLength() = " + fullNameLength());
//
//         System.out.println("upper()= " + upper());
//         System.out.println("lastIndex() = " + lastIndex());
//
//        System.out.println(trimmed("    aliveli   "));
//         System.out.println(dateStamp("18/08/2022 21:32:35"));
//        System.out.println(ilkHarf("talip", "tıras"));

        //       System.out.println(countY("javayı Seviyor muyum?"));

        //   lastThree("Hasan");

        //  System.out.println(middleThree("mustafa"));

        // System.out.println(longName("ha", "koçak"));

        // firstLetter("Talip", "Tıraş");
        System.out.println(firtThreeLetter("Hasan", "koçak"));
    }

    public static int fullNameLength() {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        return s1.length() + s2.length();

    }

    public static int upper() {
        Scanner scan = new Scanner(System.in);
        String ad = scan.nextLine();
        String soyAd = scan.nextLine();
        System.out.println(ad.toUpperCase() + soyAd.toUpperCase());

        return upper();

    }

    public static char lastIndex() {
        Scanner scan = new Scanner(System.in);
        String ad = scan.nextLine();
        return ad.charAt(ad.length() - 1);

    }

    public static void karakter() {
        Scanner scan = new Scanner(System.in);
        String ad = scan.nextLine();
        for (int i = 0; i < ad.length(); i++) ;

        //  System.out.println(ad.charAt(i));
    }

    public static String trimmed(String Str) {
        String str = Str;
        return str.trim();

    }

    public static String dateStamp(String str) {

        String replace = str.replace("/", "");
        String replace1 = replace.replace(" ", "");
        return replace1.replace(":", "");

    }

    public static int ilkHarf(String str1, String str2) {
        return str2.indexOf(str1.charAt(0));

    }

    public static int countY(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y' || str.charAt(i) == 'Y') {
                count++;
            }
        }
        return count;

    }

    public static String sesliHarf(String str) {
        String holder = "";
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                    holder += str.charAt(i);
                    break;
                case 'e':
                    holder += str.charAt(i);
                    break;
                case 'ı':
                    holder += str.charAt(i);
                    break;
                case 'i':
                    holder += str.charAt(i);
                    break;
                default:
            }
        }
        return holder;
    }

    public static String message(String str) {
        str = "sevgili çocuklar bayramınız kutlu olsun";

        str.contains("sev");
        {
            System.out.println(str);

            return str;
        }
    }
    public static void lastThree(String str) {
        String holder = "";
        for (int i = 0; i < 3; i++) {
            holder += str.substring(str.length() - 3);
        }
        System.out.println(holder);
    }

    public static String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);

    }

    public static String longName(String str1, String str2) {

        if (str1.length() > str2.length()) {
            return str1.substring(0, str2.length()).concat(str2);

        } else if (str2.length() > str1.length()) {
            return str1.concat(str2.substring(0,str1.length()));
        } else {
            return str1.concat(str2);
        }
    }

    public static void firstLetter(String str1, String str2){
        String empty ="";
        char birincininIlkHarfi = str1.charAt(0);
        for (int i = 0; i < str1.length(); i++) {
            if(str2.charAt(i)!=birincininIlkHarfi){
                empty+=str2.charAt(i);
            }

        }
        System.out.println(empty);
    }

    public static String firtThreeLetter (String str1, String str2){
        String empty="";
        String nickName =str1.substring(0,3).concat(str2.substring(str2.length()-3));
        return nickName;
    }

}

