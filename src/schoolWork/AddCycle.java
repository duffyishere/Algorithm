package schoolWork;

import java.util.Scanner;

public class AddCycle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); //받은 값
        String number = input; //가공할 데이터
        int sum;
        String first, last;

        int count = 0;


        if(Integer.valueOf(number)<=9){
            input = "0"+input; //01
        }

        while(true){
            count++; // 1 2

            if(Integer.valueOf(number)<=9){
                number = "0"+number; //01
            }


            first = String.valueOf(number.charAt(0)); //0 1
            last = String.valueOf(number.charAt(number.length()-1)); //1 1

            sum = Integer.valueOf(first)+ Integer.valueOf(last); //1 2
            number = last + String.valueOf(sum).charAt(String.valueOf(sum).length()-1); //11 12


            if(number.equals(input)){
                System.out.println(count);
                break;
            }
        }

    }
}
