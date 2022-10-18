package day_44_OOP_ReviewCont.finalKeyWord;

import java.util.ArrayList;
import java.util.Arrays;

public class FinalArrayAndArrayList {

    public static void main(String[] args) {

        final String[] BATCH2 ={"Talip", "Alparslan"};
        BATCH2[0]="İbrahim";

        System.out.println(Arrays.toString(BATCH2));

      //  batch2=new String[]{"Ali","Mehmet"};   // batch2 final oldoğu için referansı değiştirilemez
        System.out.println(Arrays.toString(BATCH2));

        System.out.println("---------------------------------");

        final ArrayList<String> NAME =new ArrayList<>();

        NAME.add("İhsan");
        NAME.add("Enes");

      //  NAME = new ArrayList<>(); // final olduğu için referansı değiştirilemez
    }

}
