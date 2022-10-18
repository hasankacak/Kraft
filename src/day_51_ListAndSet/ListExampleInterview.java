package day_51_ListAndSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExampleInterview {
    public static void main(String[] args) {

        Integer[] arr={0,2,0,4,5};
        List<Integer>list =new ArrayList<>(Arrays.asList(arr));
//        System.out.println(moveAllZeroAddListEnd(list));
          System.out.println(moveAllZeroAddListEnd2(list));


          String[] arr1={"Mehmet", "Harun", "enes", "Mehmet"};
          List<String> list2 =new ArrayList<>(Arrays.asList(arr1));
        System.out.println(removeNameListMethod(list2,"mehmet"));

    }
    //interview question
    //list içerisindeki tüm sıfırları list in sonuna yazan metodu yazınız.
    //giriş: 0,2,3,5,0,4,5     çıkış: 2,3,5,4,0,0

    public static List<Integer> moveAllZeroAddListEnd(List<Integer> list){
        int originalSize=list.size();
        list.removeAll(Arrays.asList(0));
        int newSize= list.size();
        for (int i= 0; i <(originalSize-newSize) ; i++) {
            list.add(0);
        }
        return list;
    }
    public static List<Integer> moveAllZeroAddListEnd2(List<Integer> list){
        List<Integer> list1 =new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(0)){
                list1.add(list.get(i));
            }
        }
        int totalSize=list.size()-list1.size();
        for (int i = 0; i < totalSize; i++) {
            list1.add(0);
        }
        return list1;
    }

    //list içerisinde Mehmet olan tüm isimleri silin. (iterator)

    public static List<String> removeNameListMethod (List<String> list, String data){
        Iterator<String> iter=list.iterator();
        while(iter.hasNext()){
            if(iter.next().equalsIgnoreCase(data)){
                iter.remove();
            }
        }
        return list;
    }

    //ödev-1
    // interviev questions List<String>
    // List içerisindeki polindrom kelimeleri list içerinden silen metodu yazınız.
    //ey,  edip, adanada, pide, ye  ey,  edip,pide, ye

    //ödev-2
    // List içerisindeki polindrom kelimeler varsa list içerinden her iki kelimeyi silen metodu yazınız.
    //ey,  edip, adanada, pide, ye      boş

}
