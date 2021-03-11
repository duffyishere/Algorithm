package Tests;

public class PhoneNumber01 {

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        for(int i=0; i<phone_book.length; i++){
            for(int j=0; j<phone_book.length; j++){
                if(phone_book[i].equals(phone_book[j])){
                    j++;
                }
                else{
//                    System.out.println(i + "번째 "+j);
                    int numLen = phone_book[i].length();
                    if(numLen>phone_book[j].length()) {
//                        System.out.println(i + "번째 "+j);
                        break;
                    }
                    if(phone_book[i].equals(phone_book[j].substring(0, numLen))){
                        return false;
                    }
                    else {
//                        System.out.println(i + "번째 "+j);
                        answer = true;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] phone_book = {"119", "4123566234", "1192442513"};
        if(!solution(phone_book)){
            System.out.println("succes!!");
        }else if(solution(phone_book)){
            System.out.println("fail,,,,");
        }
    }
}
