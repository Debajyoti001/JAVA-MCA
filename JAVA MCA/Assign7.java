public class Assign7 {
    public static void main(String[] args) {
        
        int limit = 10; 
        
        int evenNum = 2;
        int factNum = 1;
        
        System.out.print("Sequence: ");
        
        for(int i = 1; i <= limit; i++) {
            
            if(i % 2 == 1) {
                System.out.print(evenNum + " ");
                evenNum = evenNum + 2;
            }
            else {
                int fact = 1;
                for(int j = 1; j <= factNum; j++) {
                    fact = fact * j;
                }
                System.out.print(fact + " ");
                factNum = factNum + 1;
            }
        }
    }
}