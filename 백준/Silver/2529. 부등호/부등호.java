import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    static String[] arr;
    static boolean[] visited;
    static int k;
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        k = Integer.parseInt(br.readLine());
        arr = new String[k];
        visited = new boolean[10];

        String s = br.readLine();
        arr = s.split(" ");
        go(0, "");
        sb.append(list.get(list.size() - 1)).append("\n").append(list.get(0));
        System.out.println(sb);
    }

    private static void go(int index, String answer) {
        if (index == k + 1) {
            list.add(answer);
            return;
        }
        for (int i = 0; i <= 9; i++) {
            if (visited[i]) {
                continue;
            }
            if (index == 0 || good(Integer.parseInt(String.valueOf(answer.charAt(index - 1))), i, arr[index - 1])) {
                visited[i] = true;
                go(index + 1, answer + i);
                visited[i] = false;
            }
        }
    }

    private static boolean good(int now, int next, String op) {
        if (now < next && op.equals("<")) {
            return true;
        }
        if (now > next && op.equals(">")) {
            return true;
        }
        return false;
    }
}