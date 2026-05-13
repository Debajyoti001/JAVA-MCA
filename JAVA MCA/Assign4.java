import java.util.Scanner;

public class Assign4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 2;

        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = b - a;
            a = b;
            b = c * 2;
        }

        sc.close();
    }
}