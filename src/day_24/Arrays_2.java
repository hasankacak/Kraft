package day_24;

import java.util.Arrays;

public class Arrays_2 {
    public static void main(String[] args) {

        String str="merhaba java insanları bugün nasılsınız";
        String str2="kayısı, armut, üzüm, çilek, nar";
        String str3="elma, armut, üzüm, çilek, nar";
        String str4="merhaba java insanları bugün nasılsınız";
        int [] sayilar2 ={100,7,9,4,6,2,8,3,5};


        //System.out.println(Arrays.toString(stringToArray(str)));
        //System.out.println(Arrays.toString(stringToArray2(str2)));
        //System.out.println(Arrays.toString(stringToArray3(str3)));
        //System.out.println(Arrays.toString(stringToArray4(str4)));
        //System.out.println(Arrays.toString(nParam(10)));
        //System.out.println(bigSmallAritmetik(sayilar2));
        //System.out.println(Arrays.toString(smallList(sayilar2)));
        //System.out.println(Arrays.toString(bigList(sayilar2)));
        String str5="merhaba java insanları bugün nasılsınız";
        System.out.println(Arrays.deepToString(splitArray(str5)));


//        String str = "merhaba java insanları";
//        String[] arry=str.split(" ");
//
//        arry[1]="yurdum";
//
//        System.out.println(arry[0]);
//        System.out.println(arry[1]);
//
//        System.out.println(Arrays.toString(arry));
//        String[] arry2=str.split("a");
//        System.out.println(Arrays.toString(arry2));
//
//
//        int [] arrys ={1,2,3,4,5,6,7,8,9};
//        int[] ints=Arrays.copyOfRange(arrys,2,6);
//        System.out.println(Arrays.toString(ints));
//        System.out.println(arrys.length);
//
//
//        int [] arrys2 ={1,10,7,9,4,6,2,8,3,5};
//        Arrays.sort(arrys2);
//       System.out.println(Arrays.toString(arrys2));
//
//        Arrays.fill(arrys2,10);
//        System.out.println(Arrays.toString(arrys2));
//
//        Arrays.fill(arrys2,2,5,5);
//        System.out.println(Arrays.toString(arrys2));


    }
    // «merhaba java insanları bugün nasılsınız» gibi bir cümleyi her kelime bir
    // element olacak şekilde bir array a dönüştüren bir method yazın.

    public static String[] stringToArray(String str){
        return str.split(" ");
    }
    //  «kayısı, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
    //    element olacak şekilde bir array a atın. Elementlerden 5 den az harfi olan
    //    varsa onun yerine armut atayın.
    public static String[] stringToArray2(String str) {
        String[] split=str.split(", ");
        for (int i = 0; i < split.length; i++) {
            if(split[i].length()<5){
                split[i]="armut";
            }
        }
        return split;
    }

    //  «elma, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
    //    element olacak şekilde bir array a atın. İlk ve son idexi swaping yapın.

    public static String[] stringToArray3(String str) {
        String[] split=str.split(", ");
        String temp=split[0];
        split[0]=split[split.length-1];
        split[split.length-1]=temp;
        return split;
    }
    //  «merhaba java insanları bugün nasılsınız» gibi bir cümlenin ikinci kelimesinin
    //    harflerinden bir döndüren method yazın.

    public static String[] stringToArray4(String str){
        String[] arr=str.split(" ");
        return arr[1].split("");
    }
    //    Bir method yazın int n parametre olarak alsın. n değeri kadar sayıları sıralı bir
    //    biçimde bir array içine yerleştirsin. n = 5 Exm: [0,1,2,3,4]

    public static int[] nParam(int n){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=i;
        }
        return arr;
    }

    //    Karmaşık bir sayı dizisinin en büyük ve en küçük değerli elementlerinin aritmetik ortalamasını
    //    veren bir method yazın.
    public static int bigSmallAritmetik(int[] arr){
        Arrays.sort(arr);
        return (arr[0]+arr[arr.length-1])/2;
    }

    //    Bir sayı dizisinin en küçük elemanı ne ise sayı dizisini onunla dolduran bir
    //    method yazın.

    public static int[] smallList(int[] arr){
        Arrays.sort(arr);
        Arrays.fill(arr,arr[0]);
        return arr;
    }

    //    Bir sayı dizisinin en küçük harfi ne ise sayı dizisini (en büyük değer hariç)
    //    onunla dolduran bir method yazın.
    public static int[] bigList(int[] arr){
        Arrays.sort(arr);
        Arrays.fill(arr,0,arr.length-1,arr[0]);
        return arr;
    }
    //  «merhaba java insanları bugün nasılsınız» cümlesini [merhaba, java,
    //    insanları] ve [bugün, nasılsınız] şeklinde 2 ayrı array a convert edin.
    public static String[][] splitArray(String str){
        String[] arr=str.split(" ");
        String[] strings=Arrays.copyOfRange(arr,0,3);
        String[] strings1=Arrays.copyOfRange(arr,3,5);
        String[][] forReturn={strings,strings1};
        return forReturn;
    }

}

