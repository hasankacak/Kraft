package day_51_ListAndSet;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        //bir arrayi list in içerisine alan ve list return eden bir metot yazınız.

        int[] arr0={1,2,3,4,5,5,4,3};
//        System.out.println(addListMethod(arr1));
//        List<Integer> list=new ArrayList<>(addListMethod(arr1));
//        System.out.println(list.get(0));

        Integer[] arr={1,2,3,4,5,5,4,3};
     System.out.println(addListMethod2(arr));
//
//        List<Integer> list1=new ArrayList<>();
//        list1.add(5);
//        list1.add(2);
//        List<String> list2=new LinkedList<>();
//        List<Double> list3=new Vector<>();
//        List<Object> list4=new ArrayList<>();
//        list4.add(list1);
//        list4.add(list2);
//        list4.add(list3);
//        System.out.println(list4.get(0));
//
//        List<Object> list5=new ArrayList<>();
//        list5.add(list4);
//        System.out.println(list5);

        Integer[] arr1={1,2,3,4,5,4,5,4,3,6,5,3};
        List<Integer> list=new ArrayList<>(Arrays.asList(arr1));
        System.out.println(removeListMethod3(list,5));
        System.out.println(removeListMethod3(list,4));
        System.out.println(list);
        // System.out.println(removeListMethod3(list,4));

    }
    public static List <Integer> addListMethod(int[] arr){
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
    public static List<Integer> addListMethod2(Integer [] arr){
        List<Integer> list= new ArrayList<>();
        list= Arrays.asList(arr);
        return list;
    }

    //içerisine bir list ve data kabul eden ve bu datayı tüm listeden silen sonucunda bi Integer list
    // döndüren metodu yazınız. clearAllList(List<Integer>, Integer data

    public static List<Integer> removeListMethod(List<Integer> list,Integer data) {

        List<Integer> list2=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            if(!list.get(i).equals(data)){
                list2.add(list.get(i));
            }
        }
        return list2;
    }

    public static List<Integer> removeListMethod2(List<Integer> list,Integer data) {


        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).equals(data)){
                list.remove(list.get(i));
            }
        }
        return list;
    }
    public static boolean removeListMethod3(List<Integer> list,Integer data) {


        return list.removeAll(Arrays.asList(new Integer[]{data}));
    }





}
