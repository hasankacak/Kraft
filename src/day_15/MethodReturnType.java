package day_15;

public class MethodReturnType {
    public static void main(String[] args) {

//        System.out.println(lastDijitCheck(124,444));
//        boolean bl=lastDijitCheck(235,55);
//        System.out.println("bl= "+ bl);
//        System.out.println(lastDijitCheck(23,24));
//        System.out.println(primeNumber(127));
        //      System.out.println(number(-5));
        System.out.println(ortalama(150, 195, 75));

    }

    public static boolean lastDijitCheck(int sayı1, int sayı2) {
        if (sayı1 % 10 == sayı2 % 10) {
            return true;
        }
        return false;
    }

    public static boolean primeNumber(int num) {
        if (num == 0 || num == 1) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int number(int num) {
        // return Math.abs(num);
        return num > 0 ? num : -num;

    }

    public static char ortalama(double not1, double not2, double not3) {
        double notOrtalama=(not1+not2+not3)/3;
        if (notOrtalama >= 76 && notOrtalama <= 100) {
            return 'A';
        } else if (notOrtalama >= 51 && notOrtalama <= 75) {
            return 'B';
        } else if (notOrtalama >= 0 && notOrtalama <= 50) {
            return 'C';
        }
        return 'X';

    }


}
