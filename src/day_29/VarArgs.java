package day_29;

public class VarArgs {
    public static void main(String[] args) {

        sum(5,10,15,20,25);
        sum(5,10,15);
        sum(5,10);

        concat("ja","va");
        concat("ja","va"," ","insanları");
        System.out.println(concat1("JAVA", "PYTHON", "BHP"));


    }
    public static void sum(int... sayılar){
        int sum=0;
        for (int i: sayılar){
            sum+=i;
        }
        System.out.println("Girilen " + sayılar.length+ " sayının toplamı :" +sum);
    }
    public static void concat(String...strs){
        String empty="";
        for(String s: strs){
            empty+=s;

        }

        System.out.println(empty);
    }

    public static String concat1(String... strs){
        String empty="";
        for (int i = 0; i < strs.length; i++) {
            empty+=strs[i].charAt(0);
        }
        return empty;
    }

}


