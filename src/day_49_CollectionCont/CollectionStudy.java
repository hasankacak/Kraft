package day_49_CollectionCont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionStudy {
    public static void main(String[] args) {

//        ArrayList<Integer> lst1=new ArrayList<>();
//        List<Integer> lst2=new ArrayList<>(); //polymorphic way

        Collection<Integer> col =new ArrayList<>();

        //adding element / object / item
        col.add(5);
        col.add(15);
        col.add(25);
        col.add(20);
        col.add(50);
        System.out.println(col);

        //getting size
        System.out.println("size = " + col.size());

        //remove items
        col.remove(15);
        System.out.println("col = " + col); //[5, 25, 20, 50]
        System.out.println("col.remove(100) = " + col.remove(100));//false
        col.add(5);col.add(80);
        System.out.println("col = " + col);//[5, 25, 20, 50, 5, 80]
        col.remove(5);
        System.out.println("col = " + col);//[25, 20, 50, 5, 80]  o.indexteki 5 gitti

        //contains item
        System.out.println("contains(50) = " + col.contains(50));// 50 var mı yok mu kontrol eder, true false döndürür
        System.out.println("contains(1000) = " + col.contains(1000));//false

        //checking empty or not
        System.out.println("isEmpty() = " + col.isEmpty());// boş mu dolu mu,  boşsa true, doluysa false

        //remove all
      //  col.removeAll(col);
      //  col.removeAll(Arrays.asList(50,5)); //verilen değerleri diziden çıkartır.
        System.out.println("col = " + col);// col = [] içindeki değerleri attı, boşalttı.

        //adding all
        col.addAll(Arrays.asList(60,70,90));
        System.out.println("col = " + col);//[25, 20, 50, 5, 80, 60, 70, 90] //verilen değerleri ekleme yapar

        //contains all
        System.out.println("containsAll(Arrays.asList(25,20)) = " + col.containsAll(Arrays.asList(25, 20)));//true //yapılan kontrelde her iki değeride bulmalı
        System.out.println("containsAll(Arrays.asList(25,20)) = " + col.containsAll(Arrays.asList(25, 200)));//false

        //retain all [25, 20, 50, 5, 80, 60, 70, 90]
     //   col.retainAll(Arrays.asList(25,20));
        System.out.println("col = " + col); //col = [25, 20] //verilen değerleri kalır diğerleri atılır.
     //   col.retainAll(Arrays.asList(250,200));
        System.out.println("col = " + col); //col = [] //eğer belirtilen değerler yoksa boş bir collection döndürür.

        //turning to array [25, 20, 50, 5, 80, 60, 70, 90]
        Integer [] toArray=col.toArray(new Integer[0]); //collection sayısından az değer girilirse collection sayısı kadar döndürür, fazla girerse sonu null değer atar
        System.out.println("array : "+Arrays.toString(toArray)); //array : [25, 20, 50, 5, 80, 60, 70, 90]
        Integer [] toArray2=col.toArray(new Integer[9]);
        System.out.println("array2 : "+Arrays.toString(toArray2));//array2 : [25, 20, 50, 5, 80, 60, 70, 90, null]

    }
}
