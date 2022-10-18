package day_31_Constructor;

public class Constructor_Main {
    public static void main(String[] args) {
        Flower flower = new Flower();
        System.out.println(flower.renk);

        flower.renk = "kırmızı";
        System.out.println(flower.renk);

        flower.setRenk("sarı");
        System.out.println(flower.renk);



        Okul incirliLisesi = new Okul();
        Okul keciörenLisesi= new Okul("beyaz",450);
        Okul ankaraLisesi= new Okul(20);
        Okul yenimahalleLisesi= new Okul("mavi",550,25);


        System.out.println(yenimahalleLisesi.kapasite);
        yenimahalleLisesi.kontrolKapasite();
        System.out.println(keciörenLisesi.kapasite);
        keciörenLisesi.kontrolKapasite();


    }


}
