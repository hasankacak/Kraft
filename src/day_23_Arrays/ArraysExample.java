package day_23_Arrays;

import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {


//        String[] str1=new String[5];
//
//        String str2[]= new String[5];
//
//        String[] str3;
//        str3=new String[10];
//
//        String str4[];
//        str4=new String[20];
//
//        int[] sayi1= new int[5];
//
//        long[] sayi2=new long[9];

        String[] str=new String[5];
        str[0]="mehmet";
        str[1]="";
        str[2]="";
        str[3]="";
        str[4]="";
        System.out.println(str[1]);



        int[] sayi=new int[4];
        sayi[0]=15;
        sayi[1]=99;
        sayi[2]=157;
        sayi[3]=1089;
//        System.out.println(sayi[0]);
//        System.out.println(sayi[1]);
//        System.out.println(sayi[2]);
//        System.out.println(sayi[3]);

        for (int j = 0; j < 4; j++) {
            //      System.out.println(sayi[j]);
        }

        for (int k = 0; k < 4; k++) {
            //     System.out.println(Math.pow(sayi[k],2));
        }
        String[] week= new String[7];
        week[0]="pazartesi";
        week[1]="salı";
        week[2]="çarşamba";
        week[3]="perşembe";
        week[4]="cuma";
        week[5]="cumartesi";
        week[6]="pazar";

//        System.out.println("Bugün günlerden " + week[2]);
//
//
//
//            if (week[2].equals("çarşamba")){
//                System.out.println("haftanın üçüncü günü çarşambadır");
//            }
//                else{
//                   System.out.println("haftanın üçüncü günü çarşamba değildir");
//                }

//        for (int i = 0; i < 7; i++) {
//            if (week[i].equalsIgnoreCase("cuma")){
//                System.out.println("true");
//                break;
//            }
//            else{
//                if (i==6){
//                    System.out.println("false");
//                }
//
//            }
//        }

        String[] array = {"ahmet", "mehmet", "fikret", "saffet", "hasan"};
        String isim="hasan";
        int count=0;
        for (int i = 0; i < 5; i++) {
            if (array[i].equalsIgnoreCase(isim)){
                count++;
            }
        }
        if (count>0){
            System.out.println("isminiz grup içerisinde vardır");
        }
        else{
            System.out.println("isminiz grup içerisinde yoktur");
        }

//Random random=new Random();
//        int x= random.nextInt(100);
//        System.out.println(x);


        int[] sayiDizisi=new int[20];
        Random random=new Random();
        for (int i = 0; i < 20; i++) {
            sayiDizisi[i]=random.nextInt(100);
            System.out.println((i) + " sayi: " + sayiDizisi[i]);

        }
        System.out.println("17. indeksteki sayımız " + sayiDizisi[17]);

        int tek=0, cift=0;

        for (int i = 0; i < 20; i++) {
            if (sayiDizisi[i]%2==0){
                cift++;
            }
            else{
                tek++;
            }
        }
        System.out.println("tek sayı adedi : " + tek);
        System.out.println("çift sayı adedi : " + cift);


    }

}

