package day_5_TypeCasting;

public class TypeCasting {
    public static void main(String[] args){
        //Type casting
        //Widening
        //implicint casting (kapalı)
        int myAge=8;
        double myDouble=myAge;
        System.out.println(myDouble);

        int version=2;
        double ver=version;
        System.out.println(ver);

        long uzun=3;
        ver=uzun;

        float kayan=uzun;

        System.out.println(ver);
        System.out.println(kayan);


        System.out.println("**************");


        //narrowing casting

        double d=9.78;
        int i = (int)d;
        System.out.println(i);


        //2.3, 4.1 ve 5 sayılarını uygun type lara atayın. sayıların toplamını tam sayı olarak yazdırın.


        double hsn=2.3, cnn=4.1;
        int ysf=5;
        int elf=(int)hsn;
        int mlh=(int)cnn;
        int toplam=(int)hsn+(int)cnn+ysf;
        System.out.println(elf + mlh + ysf);
        System.out.println(toplam);


        //2.3, 4.4, 5.3 , ve 5 sayılarını

        /*double num1=2.3;
        double num2=4.4;
        double num3=5.3;
        int num4=5;
        int num6=(int)num1;
        int num7=(int)num2;
        int num8=(int)num3;

        int toplam2=(int)num1+(int)num2+(int)num3+num4;
        System.out.println(toplam2);*/

        double num4=2.3;
        double num5=4.4;
        double num6=5.3;
        int num7=5;
        //2      +   4     +   5      + 5=16
        int sum=(int)num4+(int)num5+(int)num6+num7;
        //(2.3+4.4+5.3)
        // 12        +       5 =17
        int sum2 =(int)(num4+num5+num6)+num7;

        System.out.println("sum = " + sum);
        System.out.println("sum2 = " + sum2);



        System.out.println(""+5+10+"Ahmet"+20+30);




    }

}