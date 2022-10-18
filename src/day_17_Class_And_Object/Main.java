package day_17_Class_And_Object;

public class Main {
    public static void main(String[] args) {

        Person ogrenci_1 = new Person();
        ogrenci_1.isim = "Hasan";
        ogrenci_1.cinsiyet = "Erkek";
        ogrenci_1.yas = 41;
        Person ogrenci_2 = new Person();
        ogrenci_2.isim = "Canan";
        ogrenci_2.cinsiyet = "Kadın";
        ogrenci_2.yas = 41;

//        ogrenci_1.oyunOyna();
//        ogrenci_1.uyu();

        //     System.out.println(ogrenci_1.isim + " ile " + ogrenci_2.isim + " evlidir.");

        Dog animal_1 =new Dog();
        animal_1.isim="Karabaş";
        animal_1.cins="Sivas Kangalı";
        animal_1.renk= "Beyaz";
        animal_1.uyu();
        animal_1.yemekYe();
        animal_1.havla();
        //   System.out.println(animal_1.isim +" "+ animal_1.cins +"dır");

        Car tesla_1=new Car();
        tesla_1.hiz=360;
        tesla_1.renk="sarı";
        tesla_1.marka="tesla";
        tesla_1.model="model 3";
        tesla_1.calistir();
        tesla_1.hizlan();
        tesla_1.dur();
        //  System.out.println(tesla_1.model+" "+tesla_1.renk+"dır");

    }
}

