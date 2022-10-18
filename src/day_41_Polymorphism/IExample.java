package day_41_Polymorphism;

public interface IExample {

    default void baslat(){
        mesaj();
    }
    private void mesaj(){
        System.out.println("merhaba dünya");
    }
}
class Main implements IExample{
    public static void main(String[] args) {
        Main main = new Main();
        main.baslat();
    }
}