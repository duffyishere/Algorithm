package SchoolWork;

import java.util.*;

public class Ex01 {

    public static void main(String[] args) {
        Ex01 e = new Ex01();

    }

    public int getMaximum(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();


        System.out.print("a의 값 ");
        numList.add(sc.nextInt());

        System.out.print("b의 값 ");
        numList.add(sc.nextInt());

        System.out.print("c의 값 ");
        numList.add(sc.nextInt());

        return Collections.max(numList);
    }

    public int getMinimum(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        System.out.print("a의 값 ");
        numList.add(sc.nextInt());

        System.out.print("b의 값 ");
        numList.add(sc.nextInt());

        System.out.print("c의 값 ");
        numList.add(sc.nextInt());

        System.out.print("d의 값 ");
        numList.add(sc.nextInt());

        return Collections.min(numList);
    }

    public int getMiddle(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        System.out.print("a의 값 ");
        numList.add(sc.nextInt());

        System.out.print("b의 값 ");
        numList.add(sc.nextInt());

        System.out.print("c의 값 ");
        numList.add(sc.nextInt());

        Collections.sort(numList);

//        System.out.println(numList.get(numList.size()/2));

        return numList.get(numList.size()/2);
    }

    public void adding(){
        Scanner sc = new Scanner(System.in);
        String expression = "";
        int sum = 0;

        System.out.println("1부터 n까지의 합을 구합니다. ");
        System.out.print("n값을 입력하세요 ");
        int maxNum = sc.nextInt();

        for(int i=1; i<=maxNum; i++){
            if(i!=maxNum){
                expression += i+"+";
                sum += i;
            }
            else{
                expression += i+"=";
                sum += i;
            }
        }
        expression+= sum;
        System.out.println(expression);
    }

    public void Gauss(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다. ");
        System.out.print("n값을 입력하세요 ");
        int n = sc.nextInt();
        int sum = (1+n)*10;

        System.out.printf("1부터 %d사이의 값은 %d입니다. ", n, sum);
    }

    public void addingTarget(){
        Scanner sc = new Scanner(System.in);
        String expression = "";
        int sum = 0;

        System.out.println("a부터 b까지의 합을 구합니다. ");
        System.out.print("a값을 입력하세요 ");
        int a = sc.nextInt();
        System.out.print("b값을 입력하세요 ");
        int b = sc.nextInt();

        for(int i=a; i<=b; i++)
            sum += i;

        System.out.println(sum);
    }

    public void reverseArray(){
        Scanner sc = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();

        System.out.print("갯수을 입력하세요 ");
        int a = sc.nextInt();

        for(int i=1; i<=a; i++){
            System.out.printf("x[%d] ", i);
            numList.add(sc.nextInt());
        }

        Collections.reverse(numList);
        System.out.println(numList);

    }

}

