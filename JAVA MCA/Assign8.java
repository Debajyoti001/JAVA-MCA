public class Assign8 {
    public static void main(String[] args) {
        
        int a = 48;  
        int b = 18;  
        
        int num1 = a;
        int num2 = b;
        
        while(num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;  
            num1 = temp;
        }
        
        System.out.println("GCD of " + a + " and " + b + " = " + num1);
    }
}