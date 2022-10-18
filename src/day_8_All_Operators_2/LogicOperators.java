package day_8_All_Operators_2;

public class LogicOperators {
    public static void main(String[] args) {
        // boolean sonuc=(5>=4)&&(4==4);
//                     t        t
        //   boolean sonuc=(5>=6)&&(4==4);
        //                f         f
        //  System.out.println(sonuc);

//int a=5, b=10, c=10;
//boolean sonuc=a>b || b>=c;
        //    System.out.println(sonuc);

        /*int a=5,b=10,c=10;
        boolean sonuc = a>b || b>=c && a<=b;
        System.out.println(sonuc);

        int a=5,b=10,c=10;
        boolean sonuc = a>b || b>=c && !(a>c);
        System.out.println(sonuc);

       int a=5,b=10,c=10;
        boolean sonuc = !(a>b || b>=c && !(a>c));
        System.out.println(sonuc);

        int a=5,b=10,c=10;
        boolean sonuc = !(a>b || b>=c || !(a>c));
        //              !(falce || true || !(false))
        //              !(falce || true|| true)
        //              !(falce || true)
        //              !(true
        //              falce
        System.out.println(sonuc);

        int a=5,b=10,c=10;
        boolean sonuc = !( (a==b | b!=c) ^ !(a>c) );
        System.out.println(sonuc);

        int a=5;
        boolean sonuc = a++==5 && --a == 11%6;
        //              5  ==5 &&   5 ==  5
        //                   6         5
        //                     true
        System.out.println(sonuc);*/


        int a=5;
        boolean b=true;
        boolean sonuc = a++==5 && --a == 11%6 || !b;
        //               5== 5 &&  5  ==  5  || false
        //               true  && true == 5 || false
        //
        System.out.println(sonuc);




    }


}
