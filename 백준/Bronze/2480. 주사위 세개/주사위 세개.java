import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A == B && A == C) {
            System.out.println((A * 1000) + 10000);
        } else if (A != B && B != C && C!=A) {
            int max;
            if (A>B) {
                if (A > C) {
                    max = A;
                } else {
                    max = C;}
            }
            else {
                if (B > C) {
                    max = B;
                } else {
                    max = C;
                }
            }
            System.out.println(max * 100);
        } else {
            if (A == B || A ==C) {
                System.out.println((A*100) + 1000);
            }
            else {
                System.out.println((B*100) + 1000);
            }
        }
    }
}