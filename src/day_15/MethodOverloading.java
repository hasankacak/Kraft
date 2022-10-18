package day_15;

public class MethodOverloading {
    public static void main(String[] args) {
        //  alan(3.14,3);
        ucParametreli(5 , "hasan", false);


    }
    public static void alan(double num1, double num2){
        double sonuc= num1*num2;
        System.out.println(sonuc);

    }
    public static void alan(double PI, int num3){
        double sonuc2= PI*num3*num3;
        System.out.println(sonuc2);
    }

    public static void ucParametreli (int sayı, String str, boolean bl){
        if (bl==true){
            System.out.println(sayı+str);
        }else{
            ucParametreli(str, sayı);
        }
    }
    public static void ucParametreli(String kelime, int i){
        for(int t =0; t<i ; t++){
            System.out.println(kelime);
        }
    }


}

