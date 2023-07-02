import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int a = sc.nextInt();
        int sum2 = 0;

        for (int i = 0; i < a; i++) {
            int price = sc.nextInt();
            int b = sc.nextInt();
            int sum = (price * b);
            sum2 += sum;
        }

        if (sum2 == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}