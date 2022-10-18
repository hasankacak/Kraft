package review;

import java.util.Scanner;

public class MethodsTask {
    public static void main(String[] args) {

        startProcess();
    }

    public static void startProcess(){
        Scanner sc = new Scanner(System.in);
        System.out.println("2 sayı giriniz");
        int sayı1 = sc.nextInt();
        int sayı2 = sc.nextInt();
        if(sayı2%3!=0){
            // buraya metod cağırıp işlem yapacağım
            sum(sayı1,makeMultipleOfThree(sayı2));

        }else{
            // burayada sayıları toplayan metod çağıracğım
            sum(sayı1,sayı2);
        }
    }
    public static int makeMultipleOfThree(int a){
        int multiples3;
        if(a%3>1){
            multiples3=a+1;
        }else{
            multiples3=a-a%3;
        }
        return multiples3;
    }
    public static void sum(int a, int b){
        System.out.println(a+b);

    }

}

