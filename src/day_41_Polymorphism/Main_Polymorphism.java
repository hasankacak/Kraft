package day_41_Polymorphism;

public class Main_Polymorphism {
    public static void main(String[] args) {
//        Dog karabas=new Dog();
//        Animal akbas=new Dog();
//
//        akbas.voice();
//        akbas.sleep();

//        SporCar kırmızıMelek=new SporCar();
//        kırmızıMelek.start();
//        kırmızıMelek.speed();
//        kırmızıMelek.stop();
//
//        Car beyazMelek=new Car();
//        beyazMelek.start();
//        beyazMelek.stop();
//        System.out.println(beyazMelek.durmaMesafesi());
//
//        IVehicle sariMelek = new SporCar();
//        sariMelek.start();
//        sariMelek.stop();
//        System.out.println(sariMelek.tekerSayisi());
//
//        System.out.println(sariMelek.getClass().getSimpleName());

        Kus limon = new Kanarya();
        Kus mavis = new Muhabbet();

        System.out.println(limon instanceof Kus);
        System.out.println(mavis instanceof Kus);
        System.out.println(mavis instanceof Muhabbet);
        System.out.println(mavis instanceof Kanarya);

        if (limon instanceof Kanarya) {
            System.out.println("limon kanaryanın örneği");
        }
        if (limon instanceof Muhabbet) {
            System.out.println("limon kanaryanın örneği"); // false olduğu için konsolda yazmaz
        }
        // Type Casting
        //parent class child class gibi davranması gerekiyor(polymorhism)

//        String a="Harun";
//        int b=(int)a;
//
//        Animal animal=new Animal();
//        Dog dog=(Dog) animal;
//        dog.eat();  HATALI

        Animal animal=new Dog();
        Dog dog=(Dog) animal;
        dog.eat();
        System.out.println(dog.ayakSayisi);
        System.out.println(dog.disSayisi);
        dog.voice();
        dog.speed();
        dog.sleep();
        dog.eat();

    }
}
