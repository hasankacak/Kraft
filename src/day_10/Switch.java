package day_10;

import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {

        Scanner sc =new Scanner (System.in);
        //   System.out.println("Kaçıncı ay");
     /*   int numOfMonth = sc.nextInt();

      switch(numOfMonth){
          case 1:
               System.out.println("Ocak");
               break;
           case 2:
               System.out.println("Şubat");5
               break;
           case 3:
               System.out.println("Mart");
               break;
           case 4:
               System.out.println("Nisan");
               break;
           case 5:
               System.out.println("Mayıs");
               break;
           case 6:
               System.out.println("Haziran");
               break;
           case 7:
               System.out.println("Temmuz");
               break;
           case 8:
               System.out.println("Ağustos");
               break;
           case 9:
               System.out.println("Eylül");
               break;
           case 10:
               System.out.println("Ekim");
               break;
           case 11:
               System.out.println("Kasım");
               break;
           case 12:
           System.out.println("Aralık");
               break;

       }

       int num =50;
       switch (num){
           case 38:
               System.out.println("small");
               break;
           case 44:
               System.out.println("medium");
               break;
           case 50:
               System.out.println("large");
               break;
           default:
    System.out.println("girilen numara ile eşleşen bir bedenimiz yoktur");
       }
        System.out.println("Hesap makinesi hazır");
        int num1 =sc.nextInt();
        sc.nextLine();
        String aritmetik =sc.nextLine();
        int num2 =sc.nextInt();

int sonuc = 0;

switch(aritmetik){
    case "+":
        sonuc=num1+num2;
        System.out.println("sonuc : "+sonuc);
        break;
    case "-":
        sonuc=num1-num2;
        System.out.println("sonuc : "+sonuc);
        break;
    case "*":
        sonuc=num1*num2;
        System.out.println("sonuc : "+sonuc);
        break;
    case "/":
        sonuc=num1/num2;
        System.out.println("sonuc : "+sonuc);
        break;
    default:

}*/

        System.out.println("Lütfen motelimizi tanımak için 1-2-3 bir kat numarası girin ve oda adı seçin");
        System.out.println("1. kat : Resepsiyon- Güvenlik-Oda hizmetleri\n2. Kat : Yemekhane- Dinlenme salonu-oda1- oda2\n3. Kat : oda3-oda4-oda5-oda6");
        int kat=sc.nextInt();
        sc.nextLine();
        String secim=sc.nextLine();
        switch(kat){
            case 1:
                switch (secim){
                    case"Resepsiyon":
                        System.out.println("tüm işleriniz için bekleriz");
                        break;
                    case"Güvenlik":
                        System.out.println("profesyonel bir hizmettir");
                        break;
                    case"Oda hizmetleri":
                        System.out.println("temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz");
                        break;
                    default:
                        System.out.println("böyle bir oda yok");
                }
                break;
            case 2:
                switch(secim){
                    case"Yemekhane":
                        System.out.println("kahvaltı 8-11\nöğle yemeği 12-15\nakşam yemeği 18-21");
                        break;
                    case"Dinlenme salonu":
                        System.out.println("24 saat çay servisi hizmetinizdedir");
                        break;
                    case"oda1":
                        System.out.println("ekonomik oda");
                        break;
                    case"oda2":
                        System.out.println("ekonomik oda");
                        break;
                    default:
                        System.out.println("böyle bir oda yok");
                }
                break;

            case 3:
                switch(secim){
                    case"oda3":
                        System.out.println("ekonomik oda");
                        break;
                    case"oda4":
                        System.out.println("ekonomik oda");
                        break;
                    case"oda5":
                        System.out.println("özel oda");
                        break;
                    case"oda6":
                        System.out.println("özel oda");
                        break;
                    default:
                        System.out.println("böyle bir oda yok");
                }
                break;

            default:
                System.out.println("Otelimiz 3 katlıdır");
        }

    }
}