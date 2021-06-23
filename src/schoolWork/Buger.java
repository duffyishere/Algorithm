package schoolWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Buger {
    public static void main(String[] args) {

        Solution();
    }

    public static void Solution(){
        ArrayList<Integer> bugerList = new ArrayList<>();
        ArrayList<Integer> sideList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        bugerList.add(sc.nextInt());
        bugerList.add(sc.nextInt());
        bugerList.add(sc.nextInt());
        sideList.add(sc.nextInt());
        sideList.add(sc.nextInt());

        int minBuger = Collections.min(bugerList);
        int minSide = Collections.min(sideList);

        System.out.println(minBuger+minSide-50);
    }
}
