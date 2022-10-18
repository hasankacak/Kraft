package day_4_Review;

public class Data_Types_Review {
    public static void main(String[] args) {

        byte b;
        short s;
        int i;
        long l;

        float f;
        double d;

        char c;
        boolean bl;

        // byte
        b = 127;
        System.out.println(b);
        b = -128;
        System.out.println(b);
        // short
        s = 32767;

        // int
        i = 2147483647;
// long
        l = 2147483647L;
        System.out.println("l = " +l);

        // float ve double
        // genel olarak ornegin banka hesaplari gibi degerleri temsil ederken kullaniyoruz. expressing currency
// float 4 byte | double 8 byte
        f = 1.1234567F;
        d= 1.12345671;
        System.out.println("f=" + f);
        System.out.println("d=" + d);
        d=f;
        // f=d; olmaz



    }
}

