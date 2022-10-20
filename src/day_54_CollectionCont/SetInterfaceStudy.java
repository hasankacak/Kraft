package day_54_CollectionCont;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterfaceStudy {
    public static void main(String[] args) {
        //unique item / no duplicate

        Set<Long> longSet = new HashSet<>();
        System.out.println(longSet.add(7l)); //true
        System.out.println(longSet.add(7l)); //false
        longSet.add(7l);
        longSet.add(7l);
        System.out.println(longSet.add(70l)); //true
        System.out.println(longSet.add(70l)); //false

        System.out.println("longSet = " + longSet); //longSet = [70, 7]

        for (long each:longSet) {
            System.out.println("-->"+each); //-->70 -->7
        }

        longSet.addAll(Arrays.asList(2l,3l,4l,4l));
        System.out.println("longSet = " + longSet); //longSet = [2, 3, 4, 70, 7]

        System.out.println("longSet.add(null) = " + longSet.add(null)); //longSet.add(null) = true //set içinde null yok o yüzden true döndürdü
        System.out.println("longSet.add(null) = " + longSet.add(null)); //longSet.add(null) = false
        System.out.println("longSet = " + longSet); //longSet = [null, 2, 3, 4, 70, 7]

        if (!longSet.add(70l)){ // 70l içeride var ve yinelenen veri olduğu için set içeri almaz false döndürür, ! ile true döner
            // item varsa false döndürür ! olduğu için true dönüyor ve if çalışır
            longSet.remove(70l);
        }
        System.out.println("longSet = " + longSet); //longSet = [null, 2, 3, 4, 7]
    }
}
