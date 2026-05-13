public class Assignment1 {
    public static void main(String[] args) {
        int a = 0, b = 1, sum = 0;

        System.out.println("Fibonacci Series:");
        for(int i = 1; i <= 10; i++) {
            System.out.print(a + " ");
            sum = sum + a;

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println("\nSum = " + sum);
    }
}