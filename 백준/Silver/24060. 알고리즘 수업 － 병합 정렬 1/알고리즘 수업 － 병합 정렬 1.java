import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] sorted;
    static int k;
    static int count = 0;

    public static void mergeSort(int[] a) {

        sorted = new int[a.length];
        mergeSort(a, 0, a.length - 1);
        sorted = null;
    }

    private static void mergeSort(int[] a, int left, int right) {
        if(left == right) return;

        int mid = (left + right) / 2;

        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);

        merge(a, left, mid, right);

    }
    private static void merge(int[] a, int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int idx = left;


        while(l <= mid && r <= right) {
            if(a[l] <= a[r]) {
                sorted[idx] = a[l];
                idx++;
                l++;
                count++;
                if (count == k) {
                    System.out.println(sorted[idx - 1]);
                    System.exit(0);
                }
            }
            else {
                sorted[idx] = a[r];
                idx++;
                r++;
                count++;
                if (count == k) {
                    System.out.println(sorted[idx - 1]);
                    System.exit(0);
                }
            }
        }
        if(l > mid) {
            while(r <= right) {
                sorted[idx] = a[r];
                idx++;
                r++;
                count++;
                if (count == k) {
                    System.out.println(sorted[idx - 1]);
                    System.exit(0);
                }
            }
        }
        else {
            while(l <= mid) {
                sorted[idx] = a[l];
                idx++;
                l++;
                count++;
                if (count == k) {
                    System.out.println(sorted[idx - 1]);
                    System.exit(0);
                }
            }
        }
        for(int i = left; i <= right; i++) {
            a[i] = sorted[i];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(arr);
        System.out.println(-1);

    }
}