import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {
    static int n, answer = Integer.MAX_VALUE;
    static int[][] arr;
    static boolean[][] visited;
    static Map<Point, Integer> map = new HashMap<>();
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                int price = Integer.parseInt(s[j]);
                arr[i][j] = price;
                map.put(new Point(i, j), price);
            }
        }

        go(0, 0);
        System.out.println(answer);
    }

    private static void go(int count, int price) {
        if (count == 3) {
            answer = Math.min(price, answer);
            return;
        }
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                Point point = new Point(i, j);
                if (check(point)) {
                    go(count + 1, price + flower(point));
                    wither(point);
                }
            }
        }
    }

    private static void wither(Point point) {
        visited[point.x][point.y] = false;
        for (int i = 0; i < 4; i++) {
            int ny = point.x + dy[i];
            int nx = point.y + dx[i];

            visited[ny][nx] = false;
        }
    }

    private static int flower(Point point) {
        visited[point.x][point.y] = true;
        int temp = arr[point.x][point.y];

        for (int i = 0; i < 4; i++) {
            int ny = point.x + dy[i];
            int nx = point.y + dx[i];

            visited[ny][nx] = true;
            temp += arr[ny][nx];
        }
        return temp;
    }

    private static boolean check(Point point) {
        for (int i = 0; i < 4; i++) {
            int ny = point.x + dy[i];
            int nx = point.y + dx[i];

            if (ny < 0 || nx < 0 || ny >= n || nx >= n || visited[ny][nx]) {
                return false;
            }
        }
        return true;
    }
}