import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] arrayLists;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] nge = new int[n];
        Arrays.fill(nge, -1);
        Stack<Integer> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) { //스택이 비어있지 않고, 동시에 스택의 peek가 현재 값보다 작을 때, 현재 값은 오큰수
                nge[stack.peek()] = arr[i];
                stack.pop();
            }
            stack.push(i);
        }
        for (int i = 0; i < n; i++) {
            sb.append(nge[i]).append(" ");
        }
        System.out.println(sb);
    }

}