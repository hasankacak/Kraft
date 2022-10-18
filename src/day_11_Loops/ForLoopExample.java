package day_11_Loops;

import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

       /* for(char abc = 'a'; abc<='z'; abc++){
            System.out.print(abc + " ");
        }

        for(char ABC = 'A'; ABC<='Z'; ABC++){
            System.out.print(ABC + " ");
        }

        for(int x = 1; x<=10; x++){
            System.out.println("9*" + x + "=" +(x*9));
        }*/

        String kelime="hasan";
        for(int i=0; i<3; i++){
            System.out.println("Lütfen bir kelime giriniz");
            String kullaniciKelimesi=scan.nextLine();
            if(kullaniciKelimesi.equals(kelime)){
                System.out.println("tebrikler kelimeyi buldunuz");
                break;
            }else{
                System.out.println("kelimeyi bulamadınız");
            }
        }


    }
}

