package day_49_CollectionCont;

import java.util.*;

public class ListStudy {
    public static void main(String[] args) {
        List<Integer> lst=new LinkedList<>(Arrays.asList(10,70,50,40,100));
        System.out.println(lst);

        //accessing items
        System.out.println("get(0) :"+lst.get(0));

        //adding items with index
        lst.add(0,11);
        System.out.println(lst); //[11, 10, 70, 50, 40, 100]
        System.out.println("lst.get(0) = " + lst.get(0));

        //updating item
        lst.set(0,10);
        System.out.println(lst);//[10, 10, 70, 50, 40, 100]

        //getting index of item
        System.out.println("lst.indexOf(10) = " + lst.indexOf(10));
        System.out.println("lst.indexOf(40) = " + lst.indexOf(40));
        System.out.println("lst.indexOf(100) = " + lst.indexOf(1000)); //-1

        //remove with index
        lst.remove(0);
        System.out.println("lst = " + lst); //[10, 70, 50, 40, 100]

        // add all
        lst.addAll(Arrays.asList(60,80));
        System.out.println("lst = " + lst); // [10, 70, 50, 40, 100, 60, 80]
        lst.addAll(2,Arrays.asList(30,90)); //verilen index numarasından başlayarak verilen değerleri yazdırır.
        System.out.println("lst = " + lst);// [10, 70, 30, 90, 50, 40, 100, 60, 80]

        //sort
        lst.sort(null);
        System.out.println("lst = " + lst); //[10, 30, 40, 50, 60, 70, 80, 90, 100] değerleri sıralar
        lst.sort(Comparator.naturalOrder());
        System.out.println("lst = " + lst);//[10, 30, 40, 50, 60, 70, 80, 90, 100] artan
        lst.sort(Comparator.reverseOrder());
        System.out.println("lst = " + lst); //[100, 90, 80, 70, 60, 50, 40, 30, 10] azalan

        //sublist (from,to) [100, 90, 80, 70, 60, 50, 40, 30, 10]
        System.out.println("lst.subList(2,6) = " + lst.subList(2, 6)); //[80, 70, 60, 50]
        List<Integer>subList3_8=lst.subList(3,8);
        System.out.println("subList3_8 = " + subList3_8); //[70, 60, 50, 40, 30]
        System.out.println("lst = " + lst);
        subList3_8.set(1,155); //[100, 90, 80, 70, 155, 50, 40, 30, 10]
        System.out.println("subList3_8 = " + subList3_8);
        System.out.println("lst = " + lst);
        lst.set(5,556);
        System.out.println("lst = " + lst); //[100, 90, 80, 70, 155, 556, 40, 30, 10]
        System.out.println("subList3_8 = " + subList3_8);

        System.out.println("--------------------");
        //list iterator
        //[100, 90, 80, 70, 155, 556, 40, 30, 10]
        ListIterator<Integer> listIterator = lst.listIterator();
        System.out.println("listIterator.hasNext() = " + listIterator.hasNext());
        //System.out.println(listIterator.next());

        while (listIterator.hasNext()){
            Integer next =listIterator.next();
            System.out.println(next);
            if (next>40){
                listIterator.remove();
            }
        }
        System.out.println(lst); //[40, 30, 10]
        System.out.println("listIterator.hasNext() = " + listIterator.hasNext());
        System.out.println("listIterator.hasPrevious() = " + listIterator.hasPrevious());
      //  System.out.println("listIterator.previous() = " + listIterator.previous());

        while (listIterator.hasPrevious()){
            Integer previous = listIterator.previous();
            if (previous<40){
                //   listIterator.remove(); //40
              //  listIterator.set(2022); //[40, 2022, 2022]
                listIterator.add(333); //[40, 333, 30, 333, 10]
            }
        }
        System.out.println(lst);
    }
}
