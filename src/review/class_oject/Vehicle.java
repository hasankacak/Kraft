package review.class_oject;

public class Vehicle {
    // attributes veya fields

    String type;
    String color;
    int tires;
    int price;

    // methods

    public void getInfo(){
        System.out.println("Vehicle { type: " + type+ " color: "+ color+ " tires: "+ tires+ " price: "+ price +"}" );
    }
    public void setWinter(){
        System.out.println(color+" "+type+" için "+tires+ " adet kışlık lastik lazım");
    }
    public void forRent(){
        System.out.println(color+ " "+type+" için 1 günlük kiralama bedeli "+price+ " TL dir");
    }
    public void forRentOption(int daycount){
        System.out.print("***\r***"+color+ " "+ type + " için "+ daycount+ " günlük kiralama bedeli "+ price*daycount+ " TL dir"+ "***");
    }

}
