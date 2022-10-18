package day_13_DoWhile_Bracking_Labels;

import java.util.Scanner;

public class Branching_Statements {
    public static void main(String[] args) {
       /* for(int i=0;  i<5; i++) {
            System.out.println("ilk döngü");
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    break;
                }
                System.out.println(j + " ikinci döngü");
            }
        }

        while (true){
            Scanner scan= new Scanner(System.in);
            System.out.println("1. sayıyı giriniz");
            int sayi=scan.nextInt();
            System.out.println("2. sayıyı giriniz");
            int sayi2=scan.nextInt();
            int toplam=sayi+sayi2;
            System.out.println(toplam);
            if(toplam==50){
                break;
            }


        }*/

        Scanner scan= new Scanner(System.in);
        while(true){
            System.out.println("ne yapmak istiyorsunuz");
            System.out.println("1- toplama \n 2- çıkarma \n 3- çarpma \n 4- bölme \n 5- çıkış");
            System.out.println("seçiminiz: ");
            int i=scan.nextInt();

            if(i==1){
                while(true){
                    System.out.println("toplama işlemi");
                    System.out.println("1. sayı: ");
                    int a=scan.nextInt();
                    System.out.println("2. sayı: ");
                    int b=scan.nextInt();
                    System.out.println("tolam= "+(a+b));
                    if ((a+b)==0){
                        break;
                    }

                }
            }
            if(i==5){
                break;
            }
        }

    }
}

