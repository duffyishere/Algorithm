package Tests;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSearch01 {

    public static void main(String[] args) {
        IntStream intStream = IntStream.generate( () -> { return (int)(Math.random() * 100); }).limit(10);
        BubbleSearch01 binarySearch01 = new BubbleSearch01();

        int[] numList = intStream.toArray();
        System.out.println(Arrays.toString(numList));

        numList = binarySearch01.bubbleSort(numList);
        System.out.print(Arrays.toString(numList));
    }

    public int[] bubbleSort(int[] numList){
        for(int i=0; i<numList.length; i++){
            for(int j=0; j<numList.length-i-1; j++){
                if(numList[j]> numList[j+1])
                    swap(numList, j, j+1);
                    System.out.println(i+" "+j+" : "+Arrays.toString(numList));
            }
        }

        return numList;
    }

//    public boolean compareNum(int num1, int num2){
//        if(num1>num2)
//            return true;
//        else
//            return false;
//    }

    public void swap(int[] list, int index1, int index2){
        int temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

}
