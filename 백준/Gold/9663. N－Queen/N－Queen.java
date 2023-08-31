import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;
    static int count = 0;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        solution(0);
        System.out.println(count);
    }

    public static void solution(int i) {

        if (i == n) {
            count++;
            return;
        }

        for (int j = 0; j < n; j++) {
            arr[i] = j;

            if (check(i)) {
                solution(i + 1);
            }
        }
    }

    //i 열에서의 해당 행의 배치가 유효한지를 판단한다. 같은 행 -> 대각선 순으로 판단. 만약에 하나라도 유효하지 않을 시, return false;
    private static boolean check(int i) {

        for (int j = 0; j < i; j++) { //0부터 i열까지 판단. i+1부터는 비어있는 관계로 판단할 이유가 없다.
            if (arr[i] == arr[j]) { //(같은 행 판단)
                return false;
            }
            else if (Math.abs(i - j) == Math.abs(arr[i] - arr[j])) { //(대각선 판단)
                return false;
            }
        }
        return true;
    }

}