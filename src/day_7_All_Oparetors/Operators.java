package day_7_All_Oparetors;
import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
       /* int a=55,b=89;
        int max=(a<=b)?b:a;
        System.out.println(max); */

        // int a=4;
        //System.out.println(a++); //4
        // System.out.println(a); //5

        // System.out.println(++a); //5
        // System.out.println(a++); //5

        // System.out.println(a--); //4 a=3
        // System.out.println(--a); //2 a=2

        //boolean sonuc=a==4;
        //System.out.println(!sonuc);

        // int i=5;
        // int j=i++;
        //System.out.println(j); //5

        //int i=5;
        // i=i++ + --i + ++i - i--;
        // System.out.println(i);

        //  double i=1;
        // double j=i++ + --i / ++i * i--;
        //        1 +  1   /  2  * 2
        //System.out.println(j);


       /* int sayi=20;
        sayi+=5;
        System.out.println(sayi);
        sayi-=10;
        System.out.println(sayi);
sayi*=2;
        System.out.println(sayi);
sayi/=3;
        System.out.println(sayi);
        sayi%=3;
        System.out.println(sayi);
        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz : ");
 int sayi=scan.nextInt();
 sayi*=2;
 sayi+=10;
 sayi/=2;
 sayi-=10;
        System.out.println(sayi);


        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen ilk sayıyı giriniz : ");
        int sayi,sayi2;
        sayi=scan.nextInt();
        System.out.print("lütfen ikinci sayıyı giriniz : ");
        sayi2=scan.nextInt();
        boolean cevap=sayi==sayi2;
        System.out.println(cevap);

        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen ilk sayıyı giriniz : ");
        int a,b;
        a=scan.nextInt();
        System.out.print("lütfen ikinci sayıyı giriniz : ");
        b=scan.nextInt();
        boolean cevap=(a>=b);
        System.out.println(cevap);

        int max=(a>=b)? a:b;
        System.out.println(max);

        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen fizik notunuzu giriniz : ");
        int f,k,m;
        f=scan.nextInt();
        System.out.print("lütfen kimya notunuzu giriniz : ");
       k=scan.nextInt();
        System.out.print("lütfen matematik notunuzu giriniz : ");
       m=scan.nextInt();
       int ort=(f+k+m)/3;
        boolean durum=(ort>=80);
        boolean durum2=(ort>80);
        boolean durum3=(ort==80);
        boolean durum4=!(ort!=80);
        System.out.println("durum : " + durum);
        System.out.println("durum2 : " + durum2);
        System.out.println("durum3 : " + durum3);
        System.out.println("durum4 : " + durum4);*/


        Scanner scan=new Scanner(System.in);
        String a="hasan";
        System.out.println("lütfen adınızı giriniz: ");
        String b=scan.nextLine();
        boolean sonuc=b.equals(a);
        //String lerdde karşılaştırma için == operatoöünü kullanmayın, equals kullanılır.
        System.out.println(sonuc);




    }
}
