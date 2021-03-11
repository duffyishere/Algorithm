package Tests;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        ArrayList<String> answer = new ArrayList<>();
        int[] numList = new int[100];
        int count = 0;

        for (int i = 0; i < 100; i++) {
            numList[i] = i+1;
        }
        System.out.println(Arrays.toString(numList));

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j <= i; j++) {
                if(numList[i]%numList[j]==0){
                    count++;
                }
            }
            if(count==2) answer.add(numList[i]+"");
            count = 0;
        }
        System.out.println(answer);
    }
}
