package day_14;

import java.util.Scanner;


public class MethodsDay {
    public static void main(String[] args) {
        sum(5,2);
        int sonuc=sum(5,2);
        System.out.println(sonuc);
        int yeniSonuc=sonuc+1;
        islem(yeniSonuc,5,"+");
    }

    public static void message4(int num){
        System.out.println(num + " buradadır");
        System.out.println(num+3);

    }

    public static void message2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 1. sayıyı giriniz: ");
        int a = scan.nextInt();
        System.out.println("lütfen 2. sayıyı giriniz: ");
        int b = scan.nextInt();
        System.out.println("lütfen 3. sayıyı giriniz: ");
        int c = scan.nextInt();
        double ortalama = (a + b + c) / 3;
        System.out.println("ortalama :" + ortalama);
    }

    public static void bigNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 1. sayı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.println("lütfen 2. sayı giriniz: ");
        int sayi2 = scan.nextInt();
        if (sayi1>sayi2){
            System.out.println("1. sayı büyüktür");

        }else{
            System.out.println("2. sayı büyüktür");

        }
    }
    public static void message5(String str, int i){
        System.out.println("Ayın "+i+" i "+str+ " dir");
    }

    public static void yas(int i){
        System.out.println(2022-i);
    }
    public static void sonuc(int i, int k){
        double pow=Math.pow(k,i);
        System.out.println((int)pow);
    }
    public static void cevap(int i, int k){
        int sonuc= i+k;
        System.out.println(sonuc);
    }

    public static void islem(int i, int k, String str){
        if(str.equals("+")){
            System.out.println(i+k);
        }else if(str.equals("-")){
            System.out.println(i-k);

        }else if(str.equals("*")){
            System.out.println(i*k);

        } else if (str.equals("/")) {
            System.out.println(i/k);

        }else{
            System.out.println("matematiksel operatör geçerli değil");
        }

    }
    public static int sum(int a, int b){
        return a+b;
    }
}
