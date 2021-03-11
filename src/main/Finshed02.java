package main;

import java.util.Arrays;

public class Finshed02 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        Finshed02 finshed02 = new Finshed02();

        System.out.println(finshed02.solution(participant, completion));
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        System.out.println(Arrays.toString(participant));
        System.out.println(Arrays.toString(completion));

        int i;
        for(i=0; i<completion.length; i++){
//            System.out.println(completion[2]);
            if(!participant[i].equals(completion[i]))
                System.out.println(i);
                return participant[i];

        }
        return participant[i];
        }
    }
