package day_12_NestedAndWhileLoops;

public class NestedLoops {
    public static void main(String[] args){

        /*for(int i=0; i<6; i++){

            for( int j=0; j<6; j++){
                System.out.print("1");
            }
            System.out.println();
        }

        for(int i=6; i>0; i--){

            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        for(int i=1; i<7; i++){

            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }
}

