public class Assign3 {
     public static void main(String[] args) {
        int a = 0, b = 1, count = 0;

        while(count < 8) {
            int num = a;
            int c = a + b;
            a = b;
            b = c;

            int factors = 0;
            for(int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    factors++;
                }
            }

            if(factors == 2) {
                System.out.print(num + " ");
                count++;
            }
        }
    }
}

