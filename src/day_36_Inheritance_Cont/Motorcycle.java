package day_36_Inheritance_Cont;

public class Motorcycle extends Vehicle{
    int cc;

    public int changeCcHp() {
        return cc / 15;
    }
    public void start(){
        System.out.println("Motor anahtar ile çalıştırıldı");
    }
}

