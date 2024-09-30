/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roadaccidents;

//import scanner to get user input
import java.util.Scanner;

/**
 *
 * @author okker
 */
public class RoadAccidents {
    
    // 2D array to store road accident data for cars and motorbikes
    public int[][] accidents = new int[3][2]; // [cities][0 = car, 1 = motorbike]
    public String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};
    
    // method to prompt for accident data from user
    public void accidentData() {
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter the number of car accidents for " + cities[i] + ": ");
            accidents[i][0] = input.nextInt();
            System.out.print("Enter the number of motorbike accidents for " + cities[i] + ": ");
            accidents[i][1] = input.nextInt();
        }
    }
    
    // Method to display the accident report
    public void roadAccidentReport() {
       System.out.println("--------------------------------------------------");
       System.out.println("ROAD ACCIDENT REPORT");
       System.out.println("--------------------------------------------------");
       System.out.println("                        CAR             MOTOR BIKE");
       for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + "\t\t" + accidents[i][0] + "\t\t" + accidents[i][1]);
        }
    }

    // Method to calculate and display total accidents for each city
    public void displayTotals() {
        int[] totals = new int[cities.length];
        int highestIndex = 0;
        
        for (int i = 0; i < cities.length; i++) {
            totals[i] = accidents[i][0] + accidents[i][1];
            System.out.println(cities[i] + "\t\t" + totals[i]);
            if (totals[i] > totals[highestIndex]) {
                highestIndex = i;
            }
        }
        System.out.println("     ");
        System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: " + cities[highestIndex]);
    }
    
    // Method to display the full report
    public void report() {
       roadAccidentReport();
       System.out.println("--------------------------------------------------");
       System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
       System.out.println("--------------------------------------------------");
       displayTotals();
       System.out.println("--------------------------------------------------");
    }
   
    
    public static void main(String[] args) {
        RoadAccidents roadAccidents = new RoadAccidents();
        roadAccidents.accidentData();// Get accident data
        roadAccidents.report();  // Display the detailed report and totals and city with most accidents
    }
    
}
//---------------------...ooo000 END OF FILE 000ooo...------------------------//*