package day_48_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedList_Example {
    public static void main(String[] args) {

//        ArrayList<String> arrayList=new ArrayList<>();
//        LinkedList<String> linkedList=new LinkedList<>();
//
//        linkedList.add("ahmet");
//        linkedList.add("mehmet");
//        linkedList.add("ayşe");
//        linkedList.add("alpaslan");
//
//        System.out.println(linkedList.size());
//        System.out.println(linkedList.pop());
//        System.out.println(linkedList.size());
//        System.out.println(linkedList.getFirst());

        Vector<String> vector=new Vector<>();
        System.out.println(vector.capacity());
        System.out.println(vector.size());
        vector.add("ahmet");
        vector.add("mehmet");
        vector.add("ayşe");
        vector.add("alpaslan");
        vector.add("ahmet");
        vector.add("mehmet");
        vector.add("ayşe");
        vector.add("alpaslan");
        vector.add("ahmet");
        vector.add("mehmet");
        vector.add("ayşe");
        vector.add("alpaslan");
        System.out.println(vector.size());

    }
}
