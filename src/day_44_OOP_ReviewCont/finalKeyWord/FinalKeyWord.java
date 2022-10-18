package day_44_OOP_ReviewCont.finalKeyWord;

public class FinalKeyWord {

    static final int f=10;
    final int n;
    final int l;
    static final int sl;


    public FinalKeyWord() {
        n=20;
        System.out.println("from constructor "+ n);
      //  sl=40;  // hata verir varable static olarak tanımlandığı için static method içinde kullanılmalı
    }

    {
        l=30;
        System.out.println("from init block "+ l);

    }

    static {
        sl=40;
        System.out.println("from static block "+ sl);

    }
}
class run{
    public static void main(String[] args) {

        FinalKeyWord finalKeyWord = new FinalKeyWord();


    }
}