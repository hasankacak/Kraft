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
        List<String> list=new ArrayList<>(Arrays.asList("ey","merhaba", "edip", "adanada", "pide", "ye"));
        System.out.println(allPalindromClearList(list));

    }
    //ödev-1
    // interviev questions List<String>
    // List içerisindeki polindrom kelimeleri list içerinden silen metodu yazınız.
    //ey,  edip, adanada, pide, ye  ey,  edip,pide, ye

    public static List<String> removePalindromList(List<String> list) {
        for (int i = 0; i < list.size();) {
            if (list.get(i).equals(reversePalindrom(list.get(i)))) {
                list.remove(list.get(i));
                continue;
            }
            i++;
        }
        return list;
    }

    public static List<String> removePalindromListWithIterable(List<String> list) {
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {

            String str = iter.next();

            if (str.equals(reversePalindrom(str))) {
                iter.remove();
            }
        }
        return list;
    }

    public static String reversePalindrom(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
    //ödev-2
    // List içerisindeki polindrom kelimeler varsa list içerinden her iki kelimeyi silen metodu yazınız.
    //ey,  edip, adanada, pide, ye      boş

    public static List<String> allPalindromClearList(List<String> list) {

//        List<String> newList=new ArrayList<>();
        for (int i = 0; i < list.size(); ) {
            String str = reversePalindrom(list.get(i));
            if (list.contains(str)) {
                list.removeAll(Arrays.asList(list.get(i), str));
                continue;
            }
            i++;
        }
        return list;

    }
}
