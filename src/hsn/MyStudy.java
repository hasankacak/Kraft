package hsn;

import java.util.Scanner;

public class MyStudy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      /*  int sayi1,sayi2,sonuc;
        System.out.println("Lütfen bir sayı giriniz: ");
        sayi1=input.nextInt();
        System.out.println("yapmak istediğiniz aritmetik işlemi seçiniz");
        input.nextLine();
        String aritmetik =input.nextLine();

        System.out.println("Lütfen ikinci sayıyı giriniz: ");
        sayi2=input.nextInt();

        switch (aritmetik){
            case "+":
                sonuc=sayi1+sayi2;
                System.out.println("sonuç: "+ sonuc);
                break;
            case "-":
                sonuc=sayi1-sayi2;
                System.out.println("sonuç: "+ sonuc);
                break;
            case "*":
                sonuc=sayi1*sayi2;
                System.out.println("sonuç: "+ sonuc);
                break;
            case "/":
                sonuc=sayi1/sayi2;
                System.out.println("sonuç: "+ sonuc);
                break;
            default:
        }

        //1: danışma-güvenlik-insan kaynakları\n2.kat: proje kabul-proje geliştirme-proje onay\n3.kat: tasarım-test merkezi-üretim\n4.kat: müdür

        System.out.println("şirketimize hoşgeldiniz lütfen gitmek istediğiniz katı seçiniz");
        System.out.print("1.kat: danışma-güvenlik-insan kaynakları\n2.kat: proje kabul-proje geliştirme-proje onay\n3.kat: tasarım-test merkezi-üretim\n4.kat: müdür\n");
        int kat = input.nextInt();
        input.nextLine();
        String tercih = input.nextLine();
        switch (kat) {
            case 1:
                switch (tercih) {
                    case "danışma":
                        System.out.println("nasıl yardımcı olabilirim");
                        break;
                    case "güvenlik":
                        System.out.println("her türlü ekipman ve profesyonel personel ile 7/24 sağlanmaktadır ");
                        break;
                    case "insan kaynakları":
                        System.out.println("iş başvurusunda bulunabilirsiniz");
                        break;
                    default:
                        System.out.println("1. katta böyle bir ofis bulunmamaktadır.");
                }
                break;
            case 2:
                switch (tercih) {
                    case "proje kabul":
                        System.out.println("projeleriniz için buradayız");
                        break;
                    case "proje geliştirme":
                        System.out.println("ihtiyaçlarınıza göre projeleriniz geliştirilir.");
                        break;
                    case "proje onay":
                        System.out.println("projeleriniz için gerekli yazılım yapılır");
                        break;
                    default:
                        System.out.println("2. katta böyle bir ofis bulunmamaktadır.");
                }
                break;
            case 3:
                switch (tercih) {
                    case "tasarım":
                        System.out.println("projeleriniz özenle hazırlanır");
                        break;
                    case "test merkezi":
                        System.out.println("projeleriniz hata vermemesi için test edilir.");
                        break;
                    case"üretim":
                        System.out.println("test edilen projeleriniz üretime geçer");
                        break;
                    default:
                        System.out.println("3. katta böyle bir ofis bulunmamaktadır.");
                }
                break;
            case 4:
                switch (tercih){
                    case"müdür":
                        System.out.println("randevu alınız");
                        break;
                    default:
                        System.out.println("4. katta böyle bir ofis bulunmamaktadır.");
                }
                break;
            default:
                System.out.println("şirketimiz 4 katlıdır");


        }


        System.out.print("1. sayıyı giriniz: ");
        int sayi1=input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        int sayi2=input.nextInt();
        System.out.println("lütfen seçiminizi yapınız: ");
        System.out.println("1. toplama\n2. çıkarma\n3. çarpma\n4. bölme");
        int secim=input.nextInt();
        if(secim==1){
            System.out.println("toplam : "+ (sayi1+sayi2));
        }else if(secim==2){
            System.out.println("çıkarma : "+ (sayi1-sayi2));
        }else if(secim==3){
            System.out.println("çarpım : "+(sayi1*sayi2));
        }else if(secim==4) {
            if (sayi2 == 0) {
                System.out.println(" sonuç bilinmeyen");
            } else {
                System.out.println("bölüm : " + (sayi1 / sayi2));
            }
        }else{
            System.out.println("yanlış seçim yaptınız ");
        }

        System.out.print("kullanıcı adını giriniz: ");
        String k_adi= input.nextLine();
        System.out.print("parola giriniz: ");
        String parola= input.nextLine();
        if(k_adi.equals("java") && parola.equals("123")){
            System.out.println("başrılı bir şekilde giriş yaptınız");
        }else{
            System.out.println("kullanıcı adı ve şifre hatalı");
        }


double ortalama=0;
        System.out.print(" Türkçe notunuzu giriniz : ");
        int turkce= input.nextInt();
        System.out.print(" Matematik notunuzu giriniz : ");
        int matematik= input.nextInt();
        System.out.print(" Fen Bilgisi notunuzu giriniz : ");
        int fenBilgisi= input.nextInt();
        System.out.print(" Sosyal Bifgisi notunuzu giriniz : ");
        int sosyalBilgisi= input.nextInt();
        System.out.print(" Beden Eğitimi notunuzu giriniz : ");
        int bedenEgitimi= input.nextInt();
        ortalama=(turkce + matematik + fenBilgisi + sosyalBilgisi + bedenEgitimi)/5;
        if(ortalama>=50) {
            System.out.println(" Tebrikler sınıfı geçtiniz");
        }else{
            System.out.println("Sınıfta kaldınız");
        }
        System.out.println(" Yıl sonu ortalamanız : "+ ortalama);
    }*/


//        System.out.println("km giriniz : ");
//        int km = input.nextInt();
//        System.out.println("yaş giriniz : ");
//        int yas = input.nextInt();
//        System.out.println("seyahat tipi seçiniz (1. tek gidiş 2. gidiş dönüş) : ");
//        int tip = input.nextInt();
//        double normalFiyat;
//        double yasIndirimi, tipIndirimi;
//        if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
//            normalFiyat = km * 0.10;
//            if (yas < 12) {
//                yasIndirimi = normalFiyat * 0.5;
//            } else if (yas >= 12 && yas <= 24) {
//                yasIndirimi = normalFiyat * 0.10;
//            } else if (yas >= 65) {
//                yasIndirimi = normalFiyat * 0.30;
//            } else {
//                yasIndirimi = 0;
//            }
//            normalFiyat -= yasIndirimi;
//            if (tip == 2) {
//                tipIndirimi = normalFiyat * 0.20;
//                normalFiyat = (normalFiyat - tipIndirimi) * 2;
//            }
//            System.out.println("bilet tutarı : " + normalFiyat +"$");
//        }else {
//            System.out.println("girilen değerler eksik");
//        }

//        int[] sayilar3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int aranacak=11;
//        boolean varMi=sayiBul(sayilar3,11);
//        mesajVer(varMi,aranacak);
//
//    }
//    public static void mesajVer(boolean varMi, int aranacak) {
//        String mesaj = "";
//        if (varMi == true) {
//            mesaj = "Sayı mevcuttur: " + aranacak;
//            System.out.println(mesaj);
//        } else {
//            System.out.println("sayı mevcut değildir: " + aranacak);
//        }
//
//    }
//
//    public static boolean sayiBul(int[] sayilar3, int aranacak) {
//        boolean varMi = false;
//        for (int sayi : sayilar3) {
//            if (sayi == aranacak) {
//                varMi = true;
//                break;
//            }
//        }
//        return varMi;
//
//    }




    }

}
