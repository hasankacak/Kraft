package day_12_NestedAndWhileLoops;

public class Day_12_Exa {
    public static void main(String[] arg) {

       /* int k=0;
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
               k++;
                System.out.print(k);
            }
            System.out.println();
        }

        for(int i=1; i<7; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }*/
        for (int i = 0; i < 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }
}
