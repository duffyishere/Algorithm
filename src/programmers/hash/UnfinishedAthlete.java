package programmers.hash;

import java.util.Arrays;

public class UnfinishedAthlete {

    public static void main(String[] args) {
//        solution();

    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        System.out.println(Arrays.toString(participant));
        System.out.println(Arrays.toString(completion));

        for (int i = 0; i <= completion.length; i++) {
            if(participant.length == completion.length){
                if (!participant[i].equals(completion[i])) {
                    answer = participant[i];
                    return answer;
                }
            }
            else {
                if (i == completion.length) {
                    if (!participant[i].equals(completion[i - 1])) {
                        answer = participant[i];
                        return answer;
                    } else {
                        if (!participant[i].equals(completion[i])) {
                            answer = participant[i];
                            return answer;
                        }
                    }
                }
            }
        }

        return answer;
    }
}
