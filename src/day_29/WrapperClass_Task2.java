package day_29;

public class WrapperClass_Task2 {
    public static void main(String[] args) {
        String str2 ="|''11'*>>///M++>,,_//*e%%&/'-~~&&r//%<>/)h*>%//'9a+%^^^((b*><###a678* +%&&/))<+J>>>" +
                ">**56a##v**||;;;~~a~>>> 4500001||<<İ**##n**--//+%^^s>><<|*478a12%%n*" +
                "*-<<|||>>0123456l79--a**//##++34r``~~((ı[234]+||";

        String empty="";
        for (int i = 0; i < str2.length(); i++) {
            if(Character.isAlphabetic(str2.charAt(i)) || str2.charAt(i)==' '){
                empty+=str2.charAt(i);
            }
        }
        System.out.println("empty = "+empty);
    }
}

