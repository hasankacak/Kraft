package hsn;

import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("kitap1 in ismini ve fiyatını girin:");
        String kitap1 = sc.nextLine();
        double fiyat1 = sc.nextDouble();
        System.out.println("kitap2 in ismini ve fiyatını girin:");
        String kitap2 = sc.nextLine();
        double fiyat2 = sc.nextDouble();
        System.out.println("kitap3 in ismini ve fiyatını girin:");
        String kitap3 = sc.nextLine();
        double fiyat3 = sc.nextDouble();
        double toplamFiyat = (fiyat1+fiyat2+fiyat3);
        System.out.print("Kitap1 fiyatı:"+ fiyat1 +",Kitap2 fiyatı:"+ fiyat2 +"Kitap3 fiyatı:"+fiyat3+"\nToplam Fiyat:"+ toplamFiyat+"TL");

    }
}
