package review.class_oject;

public class Customer {
    public static void main(String[] args) throws InterruptedException {

        Vehicle vehicle1 = new Vehicle();
        vehicle1.type = "otobüs";
        vehicle1.color = "mavi";
        vehicle1.tires = 10;
        vehicle1.price = 2000;

        vehicle1.getInfo();
        vehicle1.setWinter();
        vehicle1.forRent();
        //  vehicle1.forRentOption(3);
        int i= 1;
        while (i<11){
            vehicle1.forRentOption(i);
            i++;
            Thread.sleep(3000);
            if (i==5){
                vehicle1.price = 1800;
            }
        }

    }

}

