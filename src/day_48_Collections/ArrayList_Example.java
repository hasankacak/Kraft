package day_48_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Example {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ahmet");
        arrayList.add("mehmet");
        arrayList.add("ayşe");
        arrayList.add("ahmet");

        System.out.println("ilk durum:" +arrayList.size());
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.remove(3));
        System.out.println("son durum: "+arrayList.size());
        arrayList.set(0,"harun");
        System.out.println(arrayList);
        arrayList.add(0,"hasan");
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);

    }
}
