package day_45_OOp_ReviewCont.abstration;

public class D3OprintTest {
    public static void main(String[] args) {
        Mod1 mod1=new Mod1("ToyCar","STL");
        System.out.println("----------------------");
        Mod1 mod2=new Mod1("doll","OBJ");
        System.out.println("----------------------");

        Mod1 mod3=new Mod1("ToyTruck","STL");
        System.out.println("----------------------");

        Mod1 mod4=new Mod1("ToyMonkey","OBJ");
        System.out.println("----------------------");

        Mod1 mod5=new Mod1("ToyCard","OBJ");

      //  mod1.extrude();mod1.polish();
    }
}
