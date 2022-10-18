package day_17_Class_And_Object;

public class Car {
    String marka;
    String model;
    String renk;
    int hiz;

    public void calistir() {
        System.out.println("çalışıyor");
    }

    public int hizlan() {
        System.out.println("hızlanıyor");
        return 90;
    }

    public void dur() {
        System.out.println("duruyor");
    }

}
