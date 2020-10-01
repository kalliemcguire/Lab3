
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter a number:");
        int userInteger = keyboard.nextInt();
        
        boolean isPrime = isPrime(userInteger);
        System.out.println("Is " + userInteger + " a prime number? " + isPrime);
        
    }
    
    public static boolean isPrime(int userInteger) {
        boolean isPrime = true;
        for (int j = 2; j < userInteger; j++) {
            if (userInteger % j == 0) {
                isPrime = false;
            }     
        }
        return isPrime;
    }
}
