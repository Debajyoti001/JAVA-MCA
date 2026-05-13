import java.util.Scanner;

public class Assign9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a[][] = new int[3][3];
       int result[] = new int[3];
         System.out.println("Enter 3x3 matrix:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
    }
        for(int i=0; i<3; i++){
            int sum = 0;
            for(int j=0; j<3; j++){
                sum = sum + a[i][j];
            }
            result[i] = sum % 3;
        }

        System.out.println("Output:");
        for(int i = 0; i < 3; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }

}