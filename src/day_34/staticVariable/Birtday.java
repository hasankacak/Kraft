package day_34.staticVariable;

public class Birtday {

    static int cakeSlice=28;

    public void takeASlice(){
        cakeSlice--;
    }
    public void takeASlice(int count){
        cakeSlice-=count;
    }
}
class main2{
    public static void main(String[] args) {
        Birtday zafer = new Birtday();
        Birtday enes = new Birtday();
        Birtday ilyas = new Birtday();
        Birtday rıdvan = new Birtday();
        Birtday talip = new Birtday();
        Birtday ramazan = new Birtday();
        Birtday talha = new Birtday();


        zafer.takeASlice();
        enes.takeASlice();
        ilyas.takeASlice();
        rıdvan.takeASlice();
        ramazan.takeASlice();
        talha.takeASlice();
        talip.takeASlice();
        ramazan.takeASlice(2);


        System.out.println(Birtday.cakeSlice);
    }
}
