package day_55_MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceStudy {
    public static void main(String[] args) {
        Map<String,Integer> ageMap = new HashMap<>();
        // <  K   ,  V  >

        //put()
        ageMap.put("Mehmet",25);
        ageMap.put("Ahmet",24);
        ageMap.put("Ayşe",22);

        System.out.println("ageMap = " + ageMap); //ageMap = {Ahmet=24, Ayşe=22, Mehmet=25}

        //size()
        System.out.println("ageMap.size() = " + ageMap.size()); //ageMap.size() = 3

        //get()
        System.out.println("ageMap.get(Mehmet) = " + ageMap.get("Mehmet")); //ageMap.get("Mehmet") = 25
        // (K) verisi girildi "mehmet" bize (V) verisini  '25' döndürdü
        int ageOfMehmet = ageMap.get("Mehmet"); //unboxed

        //containsKey()
        System.out.println("ageMap.containsKey(Mehmet) = " + ageMap.containsKey("Mehmet")); // ageMap.containsKey("Mehmet") = true
        // "Mehmet" verisi listede olduğu için true dönüyor.

        //remove()
        System.out.println("ageMap.remove(Mehmet) = " + ageMap.remove("Mehmet")); //"Mehmet" i listeden atar
        System.out.println("ageMap = " + ageMap); //ageMap = {Ahmet=24, Ayşe=22}

        //putAll()
        Map<String,Integer> ageMap2 = new HashMap<>();
        ageMap2.put("Metin",null);
        ageMap2.put("Osman",37);
        ageMap2.put("hakan",24);
        ageMap2.put("Ahmet",24);

        System.out.println("ageMap2 = " + ageMap2); //ageMap2 = {Ahmet=24, hakan=24, Osman=37, Metin=null}

        ageMap.putAll(ageMap2);
        System.out.println("ageMap = " + ageMap); //ageMap = {Ahmet=24, Ayşe=22, hakan=24, Osman=37, Metin=null}

        //clear()
        ageMap2.clear();
        System.out.println("ageMap2 = " + ageMap2); //ageMap2 = {}

        System.out.println("ageMap = " + ageMap); //ageMap = {Ahmet=24, Ayşe=22, hakan=24, Osman=37, Metin=null}

        //putIfAbsent()
        System.out.println("ageMap.putIfAbsent(Osman,38) = " + ageMap.putIfAbsent("Osman", 38));
        //ageMap.putIfAbsent("Osman",38) = 37
        Integer ageOfOsman =ageMap.putIfAbsent("Osman", 37); //unboxed
        System.out.println("ageMap.putIfAbsent(Metin,23) = " + ageMap.putIfAbsent("Metin", 23));
        //ageMap.putIfAbsent("Metin",23) = null //değer null ise yeni değeri 23 döndürür

        System.out.println("ageMap = " + ageMap); //ageMap = {Ahmet=24, Ayşe=22, hakan=24, Osman=37, Metin=23}

        //getOrDefault
        System.out.println("ageMap.getOrDefault(Ayşe,23) = " + ageMap.getOrDefault("Ayşe", 23));
        //ageMap.getOrDefault("Ayşe",23) = 22 //listedeki doğru veriyi döndürür

        //replace()
        System.out.println("ageMap.replace(Ayşe,24) = " + ageMap.replace("Ayşe", 24));
        //ageMap.replace("Ayşe",24) = 22 eski değeri döndürür yeni değeri listeye ekler
        System.out.println("ageMap = " + ageMap); //ageMap = {Ahmet=24, Ayşe=24, hakan=24, Osman=37, Metin=23}

        System.out.println("ageMap.replace(Ayşe,24,25) = " + ageMap.replace("Ayşe", 24, 25));
        //ageMap.replace("Ayşe",24,25) = true // ayşenin yaşını yeni değe ile değiştirir

        System.out.println("ageMap = " + ageMap); //ageMap = {Ahmet=24, Ayşe=25, hakan=24, Osman=37, Metin=23}

        System.out.println("ageMap.replace(Ayşe,24,25) = " + ageMap.replace("Ayşe", 24, 25));
        //ageMap.replace("Ayşe",24,25) = false

        System.out.println("ageMap = " + ageMap); //ageMap = {Ahmet=24, Ayşe=25, hakan=24, Osman=37, Metin=23}


    }
}
