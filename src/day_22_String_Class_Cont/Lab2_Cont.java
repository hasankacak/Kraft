package day_22_String_Class_Cont;

public class Lab2_Cont {
    public static void main(String[] args) {

        //  System.out.println(shortLongShort("mehmet", "ali"));
        //  System.out.println(nokta("İs"));
        //  System.out.println(twoLetterEnd("kafkas"));
        //  System.out.println(surname("ahmet mehmet yılmaz"));
        //  System.out.println(yinelenenKarakterAt("Merhaba"));
        //  System.out.println(yinelenenKarakter(" javva  "));
        System.out.println(rakamBul("2 ja  v v1125   a   "));

    }
    //    Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa uzun kelimeyi ortada 30 defa kısa kelimeyi
    //    tekrar sonda 2 defa yazdıran metodu yazınız.

    public static String shortLongShort(String str1, String str2){
        String result="";
        if (str1.length()<=str2.length()){
            for (int i = 0; i < 2; i++) {
                result+=str1+str1;
                for (int j = 0; j < 30; j++) {
                    if (i>0){
                        return result;
                    }
                    result+=str2;
                }
            }

        }else{
            for (int i = 0; i < 2; i++) {
                result+=str1+str1;
                for (int j = 0; j < 30; j++) {
                    if (i>0){
                        return result;
                    }
                    result+=str1;
                }
            }

        }

        return result;

//        result+=str1+str1;
//
//    for (int i = 0; i < 30; i++) {
//        result+=str2;
//    }
//        result+=str1+str1;
//     return result;

    }

//    Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin altında
//    bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.

    public static String nokta(String str){
        if ( str.length()>=5){
            return str.substring(0,5);
        }
        else{
            String result="";
            for (int i = 0; i < 5-str.length(); i++) {
                result+=".";
            }
            return str+result;
        }

    }
//    Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true almıyorsa false yazdırın.

    public static boolean twoLetterEnd(String str){
        String str1=str.toLowerCase();
        return str1.substring(0,2).equals(str1.substring(str1.length()-2));

    }

//    Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın Ekrana "Soy isminiz ..(soyad).. dır."
//    Yazan metodu yazınız.

    public static String surname(String str) {
        String str1 = str.trim();
        return str1.substring(str1.lastIndexOf(" ")+1);
    }

//    Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden çıkartarak sonuç döndüren
//    metodu yazınız. (Büyük küçük duyarlı)

    public static String yinelenenKarakterAt(String str){
        String result="";
        while(!str.isEmpty()){
            result+=str.charAt(0);
            str=str.replace(str.substring(0,1),"");
        }

        return result;
    }

//    Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string olarak return eden methot yazınız

    public static String yinelenenKarakter (String str){
        str=str.replace(" ", "");
        String result="";
        while (!str.isEmpty()){
            if(str.substring(1).contains(str.substring(0,1))){
                result +=str.substring(0,1);
            }

            str=str.replace(str.substring(0,1), "");

        }
        return result;
    }
// yazılan kelimenin içerisinde sayıları yazdıran metodu yazınız.
// merha123ba   123
// 123123ff34   1232334
// ASCII

    public static String rakamBul(String str){
        String result= "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>47&&str.charAt(i)<58){
                result+=str.charAt(i);
            }
        }
        return result;
    }




}

