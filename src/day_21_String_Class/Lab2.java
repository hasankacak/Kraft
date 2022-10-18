package day_21_String_Class;

public class Lab2 {
    public static void main(String[] args) {

        // System.out.println(firstThree("abdcşşgfjş"));
        // System.out.println(boslukKaldir("merhaba nasılsın bugün hava nasıl   "));
        // System.out.println(ikinciYari("harmer"));
        // System.out.println(changeWord("merhaba", "a", "i"));
        // System.out.println(repeatThree("abow"));
        // System.out.println(harfSayisi("Ankara", "A"));
        // System.out.println(harfKaldir("merhaba", "a"));
        // System.out.println(harfKaldir("ankara", "a"));
        System.out.println(controlSentence("merhaba dünya", "erh"));

    }

    //    Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan ,
    //    3 harften az ise inputu döndüren bir metot yazınız.

    public static String firstThree(String str){
        if (str.length()<3){
            return str;
        }
        return str.substring(0,3);
    }

    // Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.

    public static String boslukKaldir(String str){

        return str.replace(" ", "%");
    }

    // Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program yazdırın.

    public static String ikinciYari(String str){
        return str.substring (str.length()/2);

    }
    //  Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri alan ve buna
    //  göre kelimede/dizede sadece ilk bulduğu yeri değiştiren metodu yazınız.

    public static String changeWord(String str, String old, String new1){

        return str.replaceFirst(old,new1);
    }
    // Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.

    public static String repeatThree(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                result=result + str.charAt(i);
            }
        }
        return result;

    }

    //    Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimenin istenen karakterin kaç
    //    adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı edilecek)

    public static int harfSayisi(String str, String target){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+1).equalsIgnoreCase(target)){
                count++;
            }
        }
        return count;
    }

    //    Kullanıcıdan bir kelime ve bir harf alın kelimenizin içinde bu harfin hepsi kaldırılmış şekilde
    //    string döndüren programı yazınız.

    public static String harfKaldir(String kelime, String harf){

        return kelime.replace(harf, "");
    }

//    Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra gelip gelmediğini
//    kontrol edin geliyorsa true gelmiyorsa false döndürün;

    public static boolean controlSentence(String kelime, String control){
        if (kelime.substring(0,control.length()).equalsIgnoreCase(control) ||
                kelime.substring(1,1+control.length()).equalsIgnoreCase(control)) {
            return true;
        }
        return false;
    }


}

