
import java.util.Scanner;

public class PaintJobEstimator {
    public static void main(String[] args) {
        
        int totalSquareFootage = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many rooms will be painted?:");
        int roomsPainted = keyboard.nextInt();
            for(int i = 1; i <= roomsPainted; i++) {
                System.out.println("How many square feet are in room " + i + "?:");
                int roomSquareFootage = keyboard.nextInt();
                totalSquareFootage += roomSquareFootage;
            }
            
        System.out.println("What is the cost of paint per gallon:");
        double paintCostPerGallon = keyboard.nextDouble();
        
        double paintGallonsRequired = calculateGallonsRequired(totalSquareFootage);
        System.out.println("The amount of paint needed is : " + paintGallonsRequired + " gallons.");
        
        double paintCost = calculatePaintCost(paintCostPerGallon, paintGallonsRequired);
        System.out.println("The cost of paint is: $" + paintCost);
        
        double laborHours = calculateLaborHours(totalSquareFootage);
        System.out.println("The paint job will take " + laborHours + " hours.");
        
        double laborCost = calculateLaborCost(totalSquareFootage);
        System.out.println("The labor cost is: $" + laborCost);
        
        double totalCost = calculateTotalCost(paintCost, laborCost);
        System.out.println("The total cost is: $" + totalCost);

    }
    
    public static double calculateGallonsRequired(double totalSquareFootage){
        return totalSquareFootage / 115;
    }
    
    public static double calculatePaintCost(double paintCostPerGallon, double paintGallonsRequired) {
        return paintCostPerGallon * paintGallonsRequired; 
    }
    
    public static double calculateLaborHours(double totalSquareFootage) {
        final double LABOR_HOURS_PER_SQUARE_FOOT = 0.0695; 
        return totalSquareFootage * LABOR_HOURS_PER_SQUARE_FOOT;
    }
   
    public static double calculateLaborCost(double totalSquareFootage) {
        final double LABOR_COST_PER_SQUARE_FOOT = 144/115;
        return totalSquareFootage * LABOR_COST_PER_SQUARE_FOOT;        
    }
    
    public static double calculateTotalCost(double paintCost, double laborCost) {
        return paintCost + laborCost;
    }
    
}
