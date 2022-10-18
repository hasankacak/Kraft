package day_32Constructor_Cont;

//Square adında bir class oluşturun, sideLenght adında field tanımlayın, constructors,
//calculateArea ve calculatePerimeter metodları oluşturarak main metodunda bu class dan
//bir obje oluşturun.
public class Square {

    public int sideLengt;

    public Square() {

    }

    public Square(int sideLengt) {
        this.sideLengt = sideLengt;
    }

    public int calculateArea() {  // alan hesplama metodu
        return (int) Math.pow(this.sideLengt, 2);
    }

    public static double calculateArea(int sideLengt) {  // alan hesplama metodu
        return (int) Math.pow(sideLengt, 2);
    }

    public int calculatePerimeter() {  // çevre hesplama metodu
        return 4 * sideLengt;
    }

    public int calculatePerimeter(int sideLengt) { // çevre hesplama metodu
        return 4 * sideLengt;
    }
}

