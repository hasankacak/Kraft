package review;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsTask2 {
    public static void main(String[] args) {
        startProcess("Düğün kartınız için gelin ve damadın ismini giriniz");

    }
    public static void startProcess(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String isim1= sc.nextLine();
        String isim2= sc.nextLine();
        if(isim1.equals(isim2)){
            //metod çağıracağım
            goıngProcess();
        }else{
            //kartı susleyıp bastıracagım
            goıngProcess(isim1,isim2);
        }
    }
    public static void goıngProcess(){
        String message ="Girmiş olduğunuz isimler aynı lütfen farklı isimler giriniz";
        startProcess(message);
    }
    public static void goıngProcess(String str1, String str2){
        System.out.println("----------------------------");
        System.out.println("***" + str1 +" & " + str2 + "***");
        System.out.println("Eylülde güzel bir günde");
        System.out.println("mutluluğumuza davetlisiniz");
        System.out.println("            *********");
        System.out.println("----------------------------");
    }
}

