import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        System.out.println(solve(a, b, c));
    }

    private static long solve(long a, long b, long c) {
        if (b == 1) {
            return a % c;
        }
        long tmp = solve(a, b / 2, c); //지수를 절반으로 나누는 과정 (16-8-4-2-1
        tmp = (tmp * tmp) % c; //이후 쪼갠 수마다 모듈러 연산

        if (b % 2 != 0) { //지수가 홀수일 경우, 밑을 한번 더 곱해주어야 한다.
            tmp = (tmp * a) % c;
        }
        return tmp;
    }
}