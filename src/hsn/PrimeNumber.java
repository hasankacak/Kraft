package hsn;

public class PrimeNumber {
    public static void main(String[] args) {

        // 1 hariç kendinden başka böleni olmayan sayılara Asal Sayı denir.
        // Asal sayıları bulmak için kod
        //7 8 9 10 11 12 13 14
        label:for (int i = 7; i <=14 ; i++) {

            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    continue label;
                }
            }
            System.out.println(i+" ");
        }
    }
}
