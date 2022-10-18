package day_32Constructor_Cont;

public class Main_Day_32 {
    public static void main(String[] args) {

//        Square square_1=new Square();
//
//        square_1.sideLengt=5;
//        System.out.println(square_1.calculateArea());
//        System.out.println(square_1.calculatePerimeter());
//
//        Square square_2=new Square(8);
//        System.out.println(square_2.calculatePerimeter());
//        System.out.println(square_2.calculateArea());
//
//        System.out.println(Square.calculateArea(8));
//
//        System.out.println("-------------------");
//
//        Pencil benimKalemim = new Pencil("sari",7,true);
//        System.out.println(benimKalemim.lenght);
//        System.out.println(benimKalemim.haveEraser);
//        System.out.println(benimKalemim.color);
//        benimKalemim.write();
//        benimKalemim.delete();
//
//        System.out.println("-------------------");
//
//        Cat efe=new Cat("yeşil","sokak kedisi", true,false);
//        System.out.println(efe.eyeColor);
//        System.out.println(efe.breed);
//        System.out.println(efe.isFat);
//        System.out.println(efe.isPet);
//
//        Cat minnos=new Cat("yeşil","sokak kedisi", false,true);
//        Cat pamuk= new Cat("mavi", "van kedisi", false, true);
//
//        System.out.println(pamuk.eyeColor);
//
//        System.out.println(minnos.food());
//        efe.sleep();
//        System.out.println(pamuk.food());
//
//        System.out.println("-------------------");

        KraftBankCustomer hasan = new KraftBankCustomer(1525,"hasan koçak",true);
        System.out.println(hasan.customerToken);
        System.out.println(hasan.customerAccount);
        hasan.addMoney(2000);
        System.out.println(hasan.customerAccount);
        hasan.addMoney(1000);
        System.out.println(hasan.customerAccount);

    }


}





