import java.util.Scanner;

public class LabProgram {
   
   public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon) {
      
      double gallonsUsed;
      double totalCost;
      
      gallonsUsed = drivenMiles / milesPerGallon;
      totalCost = dollarsPerGallon * gallonsUsed;
      
      
     // System.out.printf("%.2f", totalCost);
      
     // if (i < 2) {
     //    System.out.printf(" ");
     // }
      
      return totalCost;
   }
      
      
      
   
   public static void main(String[] args) {
      double drivenMiles = 0;
      double milesPerGallon = 0;
      double dollarsPerGallon = 0;
      int i = 0;
      
      Scanner scnr = new Scanner(System.in);
      
      
      milesPerGallon = scnr.nextDouble();
      dollarsPerGallon = scnr.nextDouble();
      
      //drivingCost(10.0, milesPerGallon, dollarsPerGallon);
      //drivingCost(50.0, milesPerGallon, dollarsPerGallon);
      //drivingCost(400.0, milesPerGallon, dollarsPerGallon);
      
      System.out.printf("%.2f", drivingCost(10.0, milesPerGallon, dollarsPerGallon));
      System.out.printf(" ");
      System.out.printf("%.2f", drivingCost(50.0, milesPerGallon, dollarsPerGallon));
      System.out.printf(" ");
      System.out.printf("%.2f", drivingCost(400.0, milesPerGallon, dollarsPerGallon));
      
      System.out.println("");
      
   }
}
