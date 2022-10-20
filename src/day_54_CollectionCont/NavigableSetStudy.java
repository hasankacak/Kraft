package day_54_CollectionCont;

import java.util.*;

public class NavigableSetStudy {
    public static void main(String[] args) {
        //  SortedSet<Integer> intSortedSet = new TreeSet<>();
        //   Set<Integer> intSortedSet = new TreeSet<>();
          NavigableSet<Integer> intSortedSet =new TreeSet<>();

        intSortedSet.add(35);
        intSortedSet.add(2);
        intSortedSet.add(2);
        intSortedSet.add(10);
        intSortedSet.add(40);
        intSortedSet.add(20);
        intSortedSet.add(50);
        intSortedSet.add(30);

        System.out.println("intSortedSet = " + intSortedSet); //intSortedSet = [2, 10, 20, 30, 35, 40, 50]
        System.out.println("intSortedSet.lower(35) = " + intSortedSet.lower(35)); //intSortedSet.lower(35) = 30 //bir küçük veriyi verir
        System.out.println("intSortedSet.higher(35) = " + intSortedSet.higher(35)); //intSortedSet.higher(35) = 40 //bir büyük veriyi verir

        System.out.println("intSortedSet.floor(35) = " + intSortedSet.floor(35)); //intSortedSet.floor(35) = 35 // kendisini veya en yakın alt değeri verir
        System.out.println("intSortedSet.ceiling(34) = " + intSortedSet.ceiling(35)); //intSortedSet.ceiling(34) = 35 //  kendisini veya en yakın üst değeri verir

//        intSortedSet.clear();
//        System.out.println("intSortedSet = " + intSortedSet); //intSortedSet = []
        System.out.println("intSortedSet.pollFirst() = " + intSortedSet.pollFirst()); //intSortedSet.pollFirst() = 2 //ilk veriyi verir ve listeden atar
        System.out.println("intSortedSet = " + intSortedSet); //intSortedSet = [10, 20, 30, 35, 40, 50]
        System.out.println("intSortedSet.pollLast() = " + intSortedSet.pollLast()); // intSortedSet.pollLast() = 50 //son veriyi verir ve listeden atar
        System.out.println("intSortedSet = " + intSortedSet); //intSortedSet = [10, 20, 30, 35, 40]

        intSortedSet.addAll(Arrays.asList(30,60,70,80));
        System.out.println("intSortedSet = " + intSortedSet); //intSortedSet = [10, 20, 30, 35, 40, 60, 70, 80]

        System.out.println("intSortedSet.descendingSet() = " + intSortedSet.descendingSet()); // [80, 70, 60, 40, 35, 30, 20, 10] // azalan şekilde sıralar, sonrasında listeyi değiştirmez
        System.out.println("intSortedSet = " + intSortedSet); //intSortedSet = [10, 20, 30, 35, 40][10, 20, 30, 35, 40, 60, 70, 80]

        System.out.println("intSortedSet.subSet(30,true,70,false) = " + intSortedSet.subSet(30, true, 70, false));
        //[10, 20, 30, 35, 40, 60, 70, 80]

        System.out.println("intSortedSet.headSet(40,false) = " + intSortedSet.headSet(40, false));
        //intSortedSet.headSet(40,false) = [10, 20, 30, 35]

        System.out.println("intSortedSet.tailSet(40,false) = " + intSortedSet.tailSet(40, false));
        //intSortedSet.tailSet(40,false) = [60, 70, 80]

        System.out.println("intSortedSet = " + intSortedSet); //intSortedSet = [10, 20, 30, 35, 40, 60, 70, 80]

        Iterator<Integer> iterator = intSortedSet.iterator(); // 40,60,70,80 atılacak
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if(next>39){
                iterator.remove();
            }

            }
        System.out.println("intSortedSet = " + intSortedSet); //intSortedSet = [10, 20, 30, 35]
    }

    }

