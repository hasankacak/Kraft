package day_50_CollectionCont;

import java.util.Arrays;
import java.util.Vector;

public class VectorStudy {
    public static void main(String[] args) {
        Vector<String> vec=new Vector<>();
        vec.add("nn");
        System.out.println("vec.size() = " + vec.size()); //vec.size() = 1
        System.out.println("vec = " + vec); //[nn]

        //addAll
        vec.addAll(Arrays.asList("aa","ab","ddd","al","aa","nn"));
        System.out.println("vec = " + vec); //[nn, aa, ab, ddd, al, aa, nn]

        //addElements()
        vec.addElement("tc");
        System.out.println("vec = " + vec); //[nn, aa, ab, ddd, al, aa, nn, tc]

        //capacity()
        System.out.println("vec.size() = " + vec.size());
        System.out.println("vec.capacity() = " + vec.capacity()); //vec.capacity() = 10

        //clear()
//        vec.clear();
//        System.out.println("vec = " + vec); //vec = []

        //clone()
        Object clone = vec.clone();
        System.out.println("clone = " + clone); //clone = [nn, aa, ab, ddd, al, aa, nn, tc]

        //contains()
        System.out.println("vec.contains(\"nn\") = " + vec.contains("nn")); //vec.contains("nn") = true

        //containsAll()
        System.out.println("vec.containsAll(Arrays.asList(\"aa\",\"tc\")) = " + vec.containsAll(Arrays.asList("aa", "tc")));//vec.containsAll(Arrays.asList("aa","tc")) = true

        //copyInto()
        String[] strings = new String[9]; //collection un indexinden düşük olmamalı
        strings[0]="1";
        vec.copyInto(strings);
        System.out.println("Arrays.toString(strings) = " + Arrays.toString(strings)); //Arrays.toString(strings) = [nn, aa, ab, ddd, al, aa, nn, tc, null]

        //ensureCapacity()
        System.out.println("vec.capacity() = " + vec.capacity());
        vec.ensureCapacity(30);
        System.out.println("vec.capacity() = " + vec.capacity());

        //trimToSize()
        vec.trimToSize();
        System.out.println("vec.capacity() = " + vec.capacity());

        //set()
        vec.set(2,"ccc");
        System.out.println("vec = " + vec); //[nn, aa, ccc, ddd, al, aa, nn, tc]

        //setElementAt()
        vec.setElementAt("cccc",2);
        System.out.println("vec = " + vec); //[nn, aa, cccc, ddd, al, aa, nn, tc]
    }
}
