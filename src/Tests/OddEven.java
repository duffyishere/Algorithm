package Tests;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myPeek = 0;
        int count = 1;
        int answer = 0;
        while (true){
            System.out.println("---------------");
            System.out.print("홀(1) 짝(2) : ");
            myPeek = sc.nextInt();
            int dice = (int) (Math.random()*6)+1;
            if(dice%2==0){
                answer = 2;
            }else {
                answer = 1;
            }
            System.out.println("Dice number : "+dice);
            if(myPeek != answer){
                break;
            }else if(myPeek == answer){
                System.out.println(count+"연승중");
            }

            count ++;
        }

    }


}
