package Tests;

public class Hanoi {
    public static void main(String[] args) {
        hanoi(3, "A", "C", "B");
    }

    public static void hanoi(int N, String start, String to, String via){
        if(N==1){
            move(N, start, to);
        }
        else {
            hanoi(N-1, start, via, to);
            move(N, start, to);
            hanoi(N-1, via, to, start);
        }
    }
    public static void move(int N, String start, String to){
        System.out.printf("%d번 원반을 %s에서 %s로 이동\n", N, start, to);
    }
}
