import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {

    static int n, m, min, result;
    static int[][] arr;

    static ArrayList<Point> chicken = new ArrayList<>();
    static ArrayList<Point> home = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> combiChicken = new ArrayList<>();
    static ArrayList<Integer> arrayList = new ArrayList<>(m);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        arr = new int[n][n];
        m = Integer.parseInt(st.nextToken());
        result = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 2) {
                    chicken.add(new Point(i, j));
                }
                if (arr[i][j] == 1) {
                    home.add(new Point(i, j));
                }
            }
        }


        combi(-1); //조합을 구현하는 메소드

        for (ArrayList<Integer> a:
                combiChicken) { //조합으로 구현한 3가지 치킨집들의 경우의 수
            int sum = 0;
            for (Point h :
                    home) { //배열 내 집들의 리스트
                min = Integer.MAX_VALUE;
                for (int index : a) {
                    int dist = Math.abs(h.x - chicken.get(index).x) + Math.abs(h.y - chicken.get(index).y);
                    min = Math.min(dist, min);
                }
                sum += min;
            }
            result = Math.min(result, sum);
        }

        System.out.println(result);
    }

    private static void combi(int start) {
        if (arrayList.size() == m) {
            combiChicken.add(new ArrayList<>(arrayList));
            return;
        }
        for (int i = start+1; i < chicken.size(); i++) {
            arrayList.add(i);
            combi(i);
            arrayList.remove(arrayList.size() - 1);
        }
    }
}