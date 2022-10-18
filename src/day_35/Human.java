package day_35;

public class Human {

    public void name() {
        System.out.println("ismi ahmet olabilir");
    }
}

class Man extends Human {
    public void rol() {
        System.out.println("baba olurlar");
    }
}

class Son extends Man {
    public void activity() {
        System.out.println("oyun oynar");
    }
}
class Test{
    public static void main(String[] args) {
        Son son = new Son();
        son.name();
        son.rol();
        son.activity();

        System.out.println("--------------------");
        Man man = new Man();
        man.rol();
        man.name();
        // man.activity(); erişilemez

        System.out.println("--------------------");
        Human human = new Human();
        human.name();
        // human.activity(); erişilemez
        // human.rol(); erişilemez
    }
}
