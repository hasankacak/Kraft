package day_35;

public class Truck extends Vehicle {
    // Truck is a Vehicle
    int carringCapasity;

    public void carrying(){
        System.out.println(color+" "+type+" "+carringCapasity+ " yük taşır");
    }


    public String toString() {
        return "Truck{" +
                "carringCapasity=" + carringCapasity +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

