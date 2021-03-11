package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Finshed {
    public static void main(String[] args) {
        Finshed finshed = new Finshed();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "leo"};

        String uncompletion = finshed.solution(participant, completion);

        System.out.println(uncompletion);
    }

    public String solution(String[] participant, String[] completion) {
        String answer ="";
        ArrayList<String> arrayParticipant =  new ArrayList<String>(Arrays.asList(participant));

        for(int i=0; i<participant.length; i++){
            for(int j=0; j<arrayParticipant.size(); j++){
                System.out.println("arrayParticipant size : "+arrayParticipant.size());
                for(int k=0; k<completion.length; k++){
                    if(arrayParticipant.size() == 1){
                        break;
                    }
                    else if(arrayParticipant.get(j).equals(completion[k])){
                        arrayParticipant.remove(completion[k]);
                        System.out.println("remove : "+arrayParticipant.remove(completion[k]));
                    }
                }
            }
        }
        answer = arrayParticipant.toString();
        return answer.toString();
    }

}
