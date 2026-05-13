import java.util.Scanner;
class Second {
    
    int update(int n){
      
        return n*5;
    }
}

public class updemo {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        x = sc.nextInt();
        Second obj= new Second();
        y = obj.update(x);
        System.out.println("Updated value of x is "+y);
        
    }
}