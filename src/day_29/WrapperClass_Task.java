package day_29;

public class WrapperClass_Task {
    public static void main(String[] args) {
        String str= "^+!j4546*/-a|v-:!a ???()&+";
        String empty="";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))){
                empty+=str.charAt(i);
            }
        }
        System.out.println("empty = " + empty);



        String str2= "^+!j4546*/-a|v-:!a ???()&+";
        String s="";
        for (int i = 0; i < str2.length(); i++) {
            if(Character.isDigit(str2.charAt(i))){
                s+=str2.charAt(i);
            }
        }
        System.out.println("s = " + s);




    }


}

