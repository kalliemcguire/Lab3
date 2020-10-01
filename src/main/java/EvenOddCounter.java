
import java.util.Random;

public class EvenOddCounter {
    public static void main(String[] args) {
        
        int evenNumberCount = 0;
        int oddNumberCount = 0;
        
        for (int i = 1; i<=100; i++) {
        Random randomInt = new Random();
            if (isEven(randomInt.nextInt())) {
                evenNumberCount++;
            } else {
                oddNumberCount++;
            } 
        }
        
        System.out.println("There were " + evenNumberCount + " even numbers.");
        System.out.println("There were " + oddNumberCount + " odd numbers.");
    }
    
    public static boolean isEven(int randomInt) {
        boolean isEven;
        
        isEven = (randomInt % 2) == 0;
        
        return isEven;
    }
}
