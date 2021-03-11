package Tests;

public class PhoneNumber02 {

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        for(int i=0; i<phone_book.length-1; i++){
            for(int j=i+1; j<phone_book.length; j++){
                if(phone_book[i].startsWith(phone_book[j])) return false;
                if(phone_book[j].startsWith(phone_book[i])) return false;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] phone_book = {"119", "4123566234", "1192442513"};
        if(!solution(phone_book)){
            System.out.println("Succes!!");
        }else if(solution(phone_book)){
            System.out.println("Fail,,,,");
        }
    }
}
