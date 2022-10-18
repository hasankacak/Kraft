package hsn;

public class Deneme {
    public static void main(String[] args) {
        int sayi1=800;
        int sayi2=925;
        int sayi3=755;
        int enBuyuk=sayi1;

        if (enBuyuk<sayi2){
            enBuyuk=sayi2;
        }if (enBuyuk<sayi3){
            enBuyuk=sayi3;
        }
        System.out.println("En büyük : "+ enBuyuk);

        System.out.println(sum(2, 5, 3));

    }

    public static int sum(int...sayilar){
        int sum=0;
        for(int sayi : sayilar){
            sum+=sayi;
        }
        return sum;
    }


}
