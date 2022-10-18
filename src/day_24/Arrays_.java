package day_24;

public class Arrays_ {
    public static void main(String[] args) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        int[] iArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //System.out.println(checkLength(iArr));
        //System.out.println(control5(iArr));
        //System.out.println(firstEleman(iArr, iArr2));

        //System.out.println(Arrays.toString(firstElemanLoops(iArr, iArr2)));
        //System.out.println(sumArryPlus(iArr));
        //System.out.println(Arrays.toString(newArryConcat(iArr, iArr2)));
        //System.out.println(maxEleman(iArr2));
        //System.out.println(Arrays.toString(firstLastChange(iArr)));
        //System.out.println(Arrays.toString(oppositLoops(iArr)));
        //System.out.println(tekSayiToplam(iArr2));

//        int[] iArry = new int[5];
//
//        iArry[0]=10;
//        iArry[1]=20;
//        iArry[2]=30;
//        iArry[3]=40;
//        iArry[4]=50;
//       for (int i: iArry){
//            System.out.println(i);
//        }
//        for (int i = 0; i < iArry.length; i++) {
//            System.out.println(iArry[i]);
//        }
//        String[] sArry = new String[3];
//
//        sArry[0]="muhammed";
//        sArry[1]="alparslan";
//        sArry[2]="beytullah";
//
//        System.out.println(sArry[2].length());
//
//        System.out.println(Arrays.toString(sArry));


    }
    // Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.

    public static boolean checkLength(int[] iArr) {
        return iArr.length > 5;
    }
    // Bir method yazın int array kabul etsin array in içinde 5 olup olmadığını kontrol etsin.

    public static boolean control5(int[] iArr) {
        int param = 5;
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == param) {
                return true;
            }
        }
        return false;
    }

    // Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün.

    public static boolean firstEleman(int[] arr1, int[] arr2) {

        return arr1[0] == arr2[0];
    }
    // 2 array kabul eden bir method yazın ve arraylerin llk elemanları ile yeni bir array döndürsün.

    public static int[] firstElemanLoops(int[] arr1, int[] arr2) {
        int[] newArr = new int[2];
        newArr[0] = arr1[0];
        newArr[1] = arr2[0];
        return newArr;
    }
    // Int array in elemanlarının toplamını veren bir method yazın


    public static int sumArryPlus(int[] iArr) {
        int sum = 0;
        for (int i = 0; i < iArr.length; i++) {
            sum += iArr[i];

        }
        return sum;
    }

    // Verilen 2 arrayi birleştirip array döndüren bir method yazın.

    public static int[] newArryConcat(int[] iArr, int[] iArr2) {
        int[] newArry2 = new int[iArr.length + iArr2.length];
        for (int i = 0; i < newArry2.length; i++) {
            if (i < iArr.length) {
                newArry2[i] = iArr[i];
            } else {
                newArry2[i] = iArr2[i - iArr.length];
            }
        }
        return newArry2;
    }
    // İnt arry in en büyük elemanının döndüren bir method yazın

    public static int maxEleman(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) ;
            max = arr[i];
        }
        return max;

    }
    // Bir array oluşturun ve ilk ve son elementleri swap (yer değiştirme) yapın.

    public static int[] firstLastChange(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return arr;
    }

    //  Bir method yazın ve verilen arry in elemanlarını tersden sıralayıp yeni bir array döndürsün

    public static int[] oppositLoops(int[] arr) {
        int[] newArry = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArry[i] = arr[(arr.length - 1) - i];
        }
        return newArry;
    }
    // Bir methodla verilen array ın tek sayı indexinde bulunan elemanların toplamını alın.

    public static int tekSayiToplam(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i+=2) {
            sum += arr[i];
        }
        return sum;

    }




}
