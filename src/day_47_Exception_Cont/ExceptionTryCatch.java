package day_47_Exception_Cont;

import java.util.Arrays;

public class ExceptionTryCatch {
    public static void main(String[] args) {
        // int değişken kabul eden bir metot yazın
        // kullanıcıdan tek giriş sağlayın
        // kullanıcı int dışında bir değer girerse "Lütfen tekrar deneyiniz" hata mesajı verin
        // kullanıcı doğru girişi yapana kadar kullanıcıdan veri almaya devam edin

//        boolean devam = true;
//        while (devam) {
//            try {
//                Scanner scan = new Scanner(System.in);
//                System.out.println("Sayı : ");
//                int x = scan.nextInt();
//            } catch (Exception e) {
//                System.out.println("Lütfen tekrar deneyiniz");
//                continue;
//            }
//            System.out.println("Programdan çıkış yapılıyor");
//            devam = false;
//        }

        // kullanıcıdan 2 sayı alın 1. sayıyı 2. sayıya bölün kalanı ekrana yazdırın
        // 2 adet catch bloğu kullanın


//        int x = 45;
//        int y = 0;
//        boolean devam2=true;
//        while (devam2) {
//            Scanner scan = new Scanner(System.in);
//            try {
//                System.out.println("Sayı :"); int x= scan.nextInt();
//                System.out.println("Bölüm :"); int y= scan.nextInt();
//                System.out.println("sonuç : " +(x / y));
//            } catch (ArithmeticException e) {
//                System.out.println("Aritmetik bir hata mevcut");
//                continue;
//            } catch (Exception e) {
//                System.out.println("Hata alındı,tekrar deneyiniz");
//                continue;
//            }
//            devam2 = false;
//        }

        // kullanıcıdan 2 sayı alın 1. sayıyı 2. sayıya bölün kalanı ekrana yazdırın
        // 2 adet catch bloğu kullanın sonuna finally bloğu ekleyin
//        boolean devam3=true;
//        while (devam3) {
//            Scanner scan = new Scanner(System.in);
//            try {
//                System.out.println("Sayı :"); int x= scan.nextInt();
//                System.out.println("Bölüm :"); int y= scan.nextInt();
//                System.out.println("sonuç : " +(x / y));
//            } catch (ArithmeticException e) {
//                System.out.println("Aritmetik bir hata mevcut");
//                continue;
//            } catch (Exception e) {
//                System.out.println("Hata alındı,tekrar deneyiniz");
//                continue;
//            }finally {
//                System.out.println("finally blok çalıştı");
//            }
//            devam3 = false;
//        }
//personel işlerini tutan bir array tanımlayın ve içerisine 5 adet int türünde id
//        gönderin (arr[]={}) bu id lern içerisinde 0 varsa IllegalArgumentException
//        hatası döndürün bunu bir checkArrayId metodu içerisinde yapın.

        int arr[]={111,126,16,36};

       System.out.println(checkArrayId(arr));

    }

    public static boolean checkArrayId(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                throw new IllegalArgumentException("Personel Id sıfır olamaz");
            }

        }
        return true;
    }

//    array içerinde en büyük sayının index numarasını getiren metodu yazınız
//    eğer en büyük sayıdan 2 veya daha fazla var ise new exception throw edin

    public static int checkMaxNum(int[] arr2)throws Exception{
        int [] arr=arr2;
        int indexNumber=0;
        Arrays.sort(arr);
        int x=arr[arr.length-1];
        if(arr[arr.length-2]==x){
            throw new Exception("en büyük sayıdan 2 adet vardır");
        }
        for (int i=0; i<arr.length; i++){
            if(arr2[i]==x){
                indexNumber=i;
            }

        }
        return indexNumber;
    }

}




