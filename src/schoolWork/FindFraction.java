package schoolWork;

import java.util.Scanner;

public class FindFraction {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int count=0;
        int increase=0;
        int index;

        while (true){
            increase++; //1 2 3 4 5
            count = count + increase; //1 3 6 10 15

            if(count >= x){ //대각선 줄 중에 있을 경우
                System.out.println(count);
                break;
            }
        }

        //몇 번째 줄에 속해있느지
        index = x - (count-increase); // 4

        System.out.println(increase+1 - index +"/"+index);
    }

}
