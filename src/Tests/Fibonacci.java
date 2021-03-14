package Tests;

import java.util.Scanner;

public class Fibonacci {
    public static int setRepeat(){
        Scanner sc = new Scanner(System.in);
        System.out.print("반복할 횟수를 입력하세요 : ");
        return sc.nextInt();
    }

    public static int getFibonacci(int repeat){
        if(repeat<=1)
            return repeat;
        else
            return getFibonacci(repeat-2) + getFibonacci(repeat-1);
    }

    public static void main(String[] args) {
       int repeat = setRepeat();
       int sum = 0;
        for (int i = 1; i <= repeat; i++) {
            System.out.println(getFibonacci(i));
            sum+=getFibonacci(i);
        }
        System.out.println("Sum : " + sum);
    }


}
