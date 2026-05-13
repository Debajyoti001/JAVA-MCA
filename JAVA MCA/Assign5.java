import java.util.Scanner;

public class Assign5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            int value;

            if(i % 2 == 0) {
                value = -(i/2) * (i/2);   
            } else {
                value = ((i-1)/2) * ((i-1)/2);  
            }

            System.out.print(value + " ");
        }

        sc.close();
    }
}