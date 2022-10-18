package day_52_Set_Collection;

import java.util.*;

public class SetExample2 {
    public static void main(String[] args) {

        Set<Integer> set1= new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2= new HashSet<>(Arrays.asList(4,5,6,7,8));

        //union (birleşim)
//        set1.addAll(set2);
//        set1.forEach(p-> System.out.print(p+" ")); //1 2 3 4 5 6 7 8

        //Intersection (kesişim)
//        set1.retainAll(set2);
//        set1.forEach(p-> System.out.print(p+" ")); //4 5

        //difference item (fark)
//        set1.removeAll(set2);
//        set1.forEach(p-> System.out.print(p+" ")); //1 2 3

        set2.removeAll(set1);
        set2.forEach(p-> System.out.print(p+" ")); //6 7 8
    }
}
