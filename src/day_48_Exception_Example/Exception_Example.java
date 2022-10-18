package day_48_Exception_Example;

import java.util.Arrays;

public class Exception_Example {
    public static void main(String[] args) throws Exception {
        int[] array={1,5,44,6,4,5,19};
        System.out.println("max number: "+maxNumberArray(array));
        System.out.println("index: "+maxIndexNumberForArray(array));
    }

//    array içerisinde en büyük sayının index numarasını getiren metodu yazınız
//    eğer en büyük sayıdan 2 veya daha fazla var ise new exception throw edin.

    public static int maxNumberArray(int[] arr){

        int max =arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int maxIndexNumberForArray(int[] arr)throws Exception{
        int index=0;
        int maxNumber=maxNumberArray(arr);
        for (int i=0; i<arr.length; i++){
            if (arr[i]==maxNumber){
                index=i;
            }
        }
        if (arr.length==1){
            return 0;
        }else if(arr.length>1){}
        Arrays.sort(arr);
        if (arr[arr.length-1]==arr[arr.length-2]){
            throw new Exception("1 den fazla en büyük sayı var");
        }
        return index;
    }

}
