import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Tomato {
    private int z;
    private int y;
    private int x;

    public Tomato(int z, int y, int x) {
        this.z = z;
        this.y = y;
        this.x = x;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }
}

public class Main {
    static int[][][] arr;
    static Queue<Tomato> queue = new LinkedList<>();
    static int[] dy = {1, -1, 0, 0, 0, 0};
    static int[] dx = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int answer = Integer.MAX_VALUE;

        arr = new int[h][n][m];

        boolean flag = false;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                String[] temp = br.readLine().split(" ");
                for (int k = 0; k < temp.length; k++) {
                    int value = Integer.parseInt(temp[k]);
                    switch (value) {
                        case 1:
                            arr[i][j][k] = value;
                            queue.add(new Tomato(i, j, k));
                            break;
                        case 0:
                            arr[i][j][k] = value;
                            flag = true;
                            break;
                        case -1:
                            arr[i][j][k] = value;
                    }
                }
            }
        }

        if (!flag) {
            System.out.println(0);
            return;
        }

        while (!queue.isEmpty()) {
            Tomato now = queue.poll();

            for (int i = 0; i < 6; i++) {
                int nz = now.getZ() + dz[i];
                int ny = now.getY() + dy[i];
                int nx = now.getX() + dx[i];

                if (ny < 0 || nx < 0 || nz < 0 || ny >= n || nx >= m || nz >= h) {
                    continue;
                }
                if (arr[nz][ny][nx] != 0) {
                    continue;
                }
                queue.add(new Tomato(nz, ny, nx));
                arr[nz][ny][nx] = arr[now.getZ()][now.getY()][now.getX()] + 1;
                answer = arr[now.getZ()][now.getY()][now.getX()];
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (arr[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}