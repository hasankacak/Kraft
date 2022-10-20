package day_54_CollectionCont;

import java.util.*;

public class SortedSetStudy {
    public static void main(String[] args) {
        SortedSet<Integer> intSortedSet = new TreeSet<>();
     //   Set<Integer> intSortedSet = new TreeSet<>();
     //   NavigableSet<Integer> intSortedSet =new TreeSet<>();

        intSortedSet.add(2);
        intSortedSet.add(2);
        intSortedSet.add(10);
        intSortedSet.add(10);
        intSortedSet.add(10);
        System.out.println("intSortedSet = " + intSortedSet); //intSortedSet = [2, 10]

        System.out.println("intSortedSet.first() = " + intSortedSet.first()); //intSortedSet.first() = 2 //ilk değer
        System.out.println("intSortedSet.last() = " + intSortedSet.last()); //intSortedSet.last() = 10 //son değer

        intSortedSet.addAll(Arrays.asList(25,35,45));
        System.out.println("intSortedSet = " + intSortedSet); //intSortedSet = [2, 10, 25, 35, 45]
       // System.out.println("intSortedSet.add(null) = " + intSortedSet.add(null)); // TreeSet null değer almaz

        System.out.println("intSortedSet.subSet(25,45) = " + intSortedSet.subSet(25, 45)); //intSortedSet.subSet(25,45) = [25, 35] //25,45 aralığındaki değerleri verir
        System.out.println("intSortedSet.subSet(25,46) = " + intSortedSet.subSet(25, 46)); //intSortedSet.subSet(25,46) = [25, 35, 45] //25,46 aralığındaki değerleri verir

        System.out.println("intSortedSet.headSet(35) = " + intSortedSet.headSet(35)); //intSortedSet.headSet(35) = [2, 10, 25] // 35 e kadar olan değerleri verir
        System.out.println("intSortedSet.headSet(35) = " + intSortedSet.headSet(36)); //intSortedSet.headSet(36) = [2, 10, 25, 35] // 36 ya kadar olan değerleri verir

        System.out.println("intSortedSet.tailSet(35) = " + intSortedSet.tailSet(35)); //intSortedSet.tailSet(35) = [35, 45] //35 sonrası değerleri verir.


        SortedSet<Integer> myTailSet =intSortedSet.tailSet(25);
        System.out.println("myTailSet = " + myTailSet); //myTailSet = [25, 35, 45]
        System.out.println("myTailSet.remove(10) = " + myTailSet.remove(10)); //myTailSet.remove(10) = false
        System.out.println("myTailSet.remove(35) = " + myTailSet.remove(35)); //myTailSet.remove(35) = true

        System.out.println("myTailSet = " + myTailSet); //myTailSet = [25, 45]


    }
}
