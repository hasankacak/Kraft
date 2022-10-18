package day_36_Inheritance_Cont;

public class Main_Class {
    public static void main(String[] args) {
        Automobile automobile1=new Automobile();
        automobile1.color="blue";
        automobile1.hb=110;
        automobile1.model=1991;
        automobile1.radioBrand="pioneer";
        automobile1.start();
        automobile1.stop();

        Automobile automobile2=new Automobile();
        automobile2.color="red";
        automobile2.hb=115;
        automobile2.model=2008;
        automobile2.radioBrand="sony";
        automobile2.start();
        automobile2.stop();


        Motorcycle motorcycle1 =new Motorcycle();
        motorcycle1.cc=250;
        motorcycle1.model=2012;
        motorcycle1.color="black";
        System.out.println(motorcycle1.changeCcHp());

        System.out.println(automobile2.color);

        Automobile automobile= new Automobile();
        automobile.start();

        Motorcycle motorcycle=new Motorcycle();
        motorcycle.start();





    }






}

