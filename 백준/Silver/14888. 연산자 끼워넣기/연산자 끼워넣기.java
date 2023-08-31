import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int[] arr, operator;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        operator = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) { //+, -,
            operator[i] = Integer.parseInt(st.nextToken());
        }

        solution(arr[0], 1);

        System.out.println(max);
        System.out.println(min);
    }

    public static void solution(int ans, int count) {
        if (count == n) {
            max = Math.max(max, ans);
            min = Math.min(min, ans);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {

                operator[i]--;

                switch (i) {
                    case 0 :
                        solution(ans + arr[count], count + 1);
                        break;
                    case 1:
                        solution(ans - arr[count], count + 1);
                        break;
                    case 2:
                        solution(ans * arr[count], count + 1);
                        break;
                    case 3:
                        solution(ans / arr[count], count + 1);
                        break;
                }

                operator[i]++;
            }
        }
    }

}