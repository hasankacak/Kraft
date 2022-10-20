package day_53_Map;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(8);

//        Map<Integer, String> map = new HashMap<>();
        //put ekleme yapar
//        map.put(671,"Harun");
//        map.put(995,"Mehmet");
//        map.put(895,"ahmet");
//
//        map.forEach((k,v)-> System.out.println(k+"--> "+v));
//
//        map.put(null,"ahmet");
//        map.put(null,"ayşe");
//        System.out.println(map.get(671));
//        System.out.println(map.get(null));

        Map<Double, String> newMap= new HashMap<>();
        newMap.put(19.4, "benzin");
        newMap.put(25.6, "mazot");
        newMap.put(12.9, "lpg");
        System.out.println(newMap.get(25.6)); //mazot
        System.out.println(newMap.size()); //3
        System.out.println(newMap.toString().toUpperCase()); //{25.6=MAZOT, 12.9=LPG, 19.4=BENZİN}
        newMap.remove(12.9); //silme
        System.out.println(newMap); //{25.6=mazot, 19.4=benzin}
        System.out.println(newMap.containsKey(19.4)); //true //değer var mı kontrol eder true-false döndürür
        System.out.println(newMap.containsValue("mazot")); //true //değer var mı kontrol eder true-false döndürür
        newMap.replace(19.4,"fuel oil"); //veri değiştirme
        System.out.println(newMap); //{25.6=mazot, 19.4=fuel oil}
        System.out.println(newMap.keySet()); //[25.6, 19.4] sadece key leri alır
        System.out.println(newMap.values()); //[mazot, fuel oil] sadece values ları alır


//        Map<Integer, String> map = new LinkedHashMap<>();
//
//        map.put(671,"Harun");
//        map.put(995,"mehmet");
//        map.put(895,"ahmet");
//        map.put(423,"ayşe");
//
//        Map<Integer, String> map2= new LinkedHashMap<>();
//
//        map2.put(888,"enes");
//        map2.put(9225,"beytullah");
//        map2.put(8295,"bahar");
//        map2.put(4223,"umut");

//        for(Integer num:map.keySet()){
//            System.out.println(map.get(num));
//        }
//        List<Map<Integer,String>> list=new ArrayList<>();
//        list.add(map);
//        list.add(map2);
//        System.out.println(list.size()); // 2  (map ve map2 objeleri vardır)
//        System.out.println(list);//[{671=Harun, 995=mehmet, 895=ahmet, 423=ayşe, 888=enes, 9225=beytullah, 8295=bahar, 4223=umut}, {}]
//        System.out.println(list.toString());

        Map<Integer, String> fenA = new LinkedHashMap<>();

        fenA.put(671,"Harun");
        fenA.put(995,"mehmet");
        fenA.put(895,"ahmet");
        fenA.put(423,"ayşe");

        Map<Integer, String> fenB= new LinkedHashMap<>();

        fenB.put(888,"enes");
        fenB.put(9225,"beytullah");
        fenB.put(8295,"bahar");
        fenB.put(4223,"umut");

        List <Map<Integer, String>> okul=new ArrayList<>();
        okul.add(fenA);
        okul.add(fenB);

        for (Map<Integer,String> sinif: okul) {
            for (Integer key:sinif.keySet()) {
                System.out.println(sinif.get(key));
            }
        }
        for (int i = 0; i < okul.size() ; i++) {
            for (Integer key: okul.get(i).keySet()) {
                System.out.println(okul.get(i).get(key));
            }


        }


    }
}
