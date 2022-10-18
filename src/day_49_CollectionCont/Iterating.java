package day_49_CollectionCont;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Iterating {
    public static void main(String[] args) {
        Collection<Integer> cll=new ArrayList<>(Arrays.asList(3,5,7,10,20));
        System.out.println("cll = " + cll);
//        for (Integer each:cll){
//            System.out.println(each);
//            if (each>5){
//                cll.remove(each);
//
//            }
//        } we can not use remove or update item

        Iterator<Integer>myIter =cll.iterator();

        /*

        //next()
        System.out.println("myIter.next() = " + myIter.next()); //myIter.next() = 3
        //System.out.println("myIter.next() = " + myIter.next());

        //remove // [3,5,7,10,20]
        myIter.remove();
        System.out.println("cll = " + cll); //[5, 7, 10, 20] 1. indexteki değeri atar
        //myIter.remove(); //burası hata verir remove den önce next yapılmalı
        System.out.println("myIter.next() = " + myIter.next()); //myIter.next() = 5
        myIter.remove(); // 1. indexte bulunan 5 değeri atılır
        System.out.println("cll = " + cll); //[7, 10, 20]

         */

        //[3, 5, 7, 10, 20]
        while (myIter.hasNext()){
            Integer next = myIter.next();
            System.out.println(next);
            if (next>5){
                myIter.remove();
            }
        }

        System.out.println("cll = " + cll);
        System.out.println("myIter.hasNext() = " + myIter.hasNext());


    }
}

