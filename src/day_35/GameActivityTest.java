package day_35;

import java.util.Scanner;

public class GameActivityTest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("kaç hedefle karşılaştınız");
        int düşman=sc.nextInt();
        System.out.println("kaç hedef vurdunuz");
        int isabet=sc.nextInt();

        Challange challange= new Challange(düşman,isabet);
        System.out.println(challange.getScore());
        System.out.println(challange.getRank());



    }
}

