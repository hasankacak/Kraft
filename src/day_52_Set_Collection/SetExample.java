package day_52_Set_Collection;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
//        Set<Integer> set=new HashSet<>();
//        set.add(5);
//        set.add(35);
//        set.add(45);
//        set.add(26);
//        set.add(5);
//        set.add(26);
//        System.out.println(set);// [35,5,26,45] yinelenen verileri kabul etmez

        Set<String> set=new HashSet<>();
        set.add("ahmet");
        set.add("35");
        set.add("ahmet");
        set.add("mehmet");

        System.out.println(set); // [ahmet, 35, mehmet] yinelenen verileri kabul etmez

        String str="bugün eve çok geç geldim, ama kendimi çok mutlu hissediyorum";
        //içerisinde hangi harfler geçmektedir.

        str=str.replaceAll(" ","");
        str=str.replaceAll(",","");
        String[] strArray=str.split("");

        Set<String> newSet=new HashSet<>(Arrays.asList(strArray));
//        for (int i = 0; i < strArray.length; i++) {
//            newSet.add(strArray[i]);
//        }
        System.out.println("Set : "+newSet);

        List<String> newlist=new ArrayList<>(Arrays.asList(strArray));
        System.out.println("List : "+newlist);


        Set<String> hashSet = new HashSet<>(Arrays.asList(strArray));
        Set<String> treeSet = new TreeSet<>(Arrays.asList(strArray));

        System.out.println(hashSet);
        System.out.println(treeSet);

        Integer[] arr={1,2,3,6,8,45,58,63,1,2,3,6,8};

        Set<Integer> hashSet2 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> treeSet2 = new TreeSet<>(Arrays.asList(arr));

        System.out.println(hashSet2);
        System.out.println(treeSet2);
    }
}
