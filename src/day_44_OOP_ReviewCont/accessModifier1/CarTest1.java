package day_44_OOP_ReviewCont.accessModifier1;

public class CarTest1 {

//    private CarTest1() {} // başka class dan nesne üretmeyi engeller


    public static void main(String[] args) {
        Car1 car1=new Car1();
        car1.model= "Mazda";
        car1.engine=1.6;
        car1.year=2019;
       // car1.door=4; ***erişilemez***


        System.out.println(car1.toString());
        System.out.println(car1);

    }
}
