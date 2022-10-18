package day_45_OOp_ReviewCont.hidingCont;

import day_45_OOp_ReviewCont.hidingCont.MyCar;

public class YourCar extends MyCar {
    public static boolean haveSunroof(){
        return true;
    }
    public void getYourCarSunroofStatus(){
        System.out.println("Your car have sunroof "+haveSunroof());
    }
}
