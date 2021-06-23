package schoolWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VacaitionHomework {

    public static void main(String[] args) throws Exception{
        Solution();

    }

    public static void Solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        double A = Integer.parseInt(br.readLine());
        double B = Integer.parseInt(br.readLine());
        double C = Integer.parseInt(br.readLine());
        double D = Integer.parseInt(br.readLine());
        br.close();

        double day = A/C>=B/D? Math.ceil(A / C) :  Math.ceil(B / D); //숙제하는데 걸리는 시간

        System.out.println(Integer.valueOf((int) (L - day)));
    }
}
