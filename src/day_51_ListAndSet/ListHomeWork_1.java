package day_51_ListAndSet;

import java.util.*;

public class ListHomeWork_1 {
    public static void main(String[] args) {
//        String a="harun";
//        System.out.println(reversePalindrom(a));

//        List<String> list =new ArrayList<>(Arrays.asList("adanada","ankarada","efe","metin"));
//        System.out.println(removePalindromList(list));
//        System.out.println(removePalindromListWithIterable(list));
//        List<String> list =new ArrayList<>(Arrays.asList("ey","edip","adanada","pide","ye"));
//        System.out.println(allPalindromClearList(list));

    }
    //ödev-1
    // interviev questions List<String>
    // List içerisindeki polindrom kelimeleri list içerinden silen metodu yazınız.
    //ey,  edip, adanada, pide, ye  ey,  edip,pide, ye

    //ödev-2
    // List içerisindeki polindrom kelimeler varsa list içerinden her iki kelimeyi silen metodu yazınız.
    //ey,  edip, adanada, pide, ye      boş

    public static List<String> removePalindromList(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(reversePalindrom(list.get(i)))){
            list.remove(list.get(i));
        }
    }
        return list;
    }
    public static List<String> removePalindromListWithIterable(List<String> list){
        Iterator<String> iter=list.iterator();
        while(iter.hasNext()){

            String str=iter.next();

            if (str.equals(reversePalindrom(str))){
                iter.remove();
            }
        }
        return list;
    }

    public static String reversePalindrom(String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }

//    public static List<String> allPalindromClearList (List<String> list){
//        int count=0;
////        List<String> newList=new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            String reverStr=reversePalindrom(list.get(i));
//            for (int j = 0; j <list.size() ; j++) {
//                if (list.get(j).equals(reverStr)){
//                    count++;
//                }
//            }
//            if(count>1){
//                list.remove(list.get(i));
//                list.remove(list.get(j));
//            }
//        }
//        return list;
//    }
}
