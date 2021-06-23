package company;

public class TurnProfits {

    //가장 처음 공장을 건설하기 위한 발생하는 초기 비용과 제품을 만들 때 발생하는 재료바가 주어질 떄 몇 번째의 물건부터 흑자전환이 되는지 구하시오.
    //case1: 건설비용 10만원, 재료비: 1만원, 이윤:3만원 답: 6
    public static void main(String[] args) {
        System.out.println(solution(100000, 10000, 30000));
    }

    public static int solution(int a, int b, int c){
        int count=0;
        int materialCost;
        int benefit;

        while (true){
            count++;
            materialCost = b*count;
            benefit = c*count;

            if(a+materialCost<benefit)
                return count;

        }
    }

}
