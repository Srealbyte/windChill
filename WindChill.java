import java.util.Scanner;
import java.lang.Math;
public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);//creating scanner object for input
		double temperature = 0;	// declare the variables
		double windSpeed = 0;
		double windChill = 0;							
		
		System.out.println("Wind Chill Calculator\n"); //Header	
		
		System.out.print("Enter the temperature in Fahrenheit (must be >= -45 and <= 40):");// asking for user input for temperature
		
		temperature = keyboard.nextDouble();//assigning user input input to temperature
		
		System.out.print("Enter the wind speed (must be >= 5 and <= 60): ");// Asking for user input for wind speed
		
		windSpeed = keyboard.nextDouble();//assigning user input to wind speed	
		
		System.out.println("\n");
		
		windChill=35.74+0.6215*temperature-35.75*Math.pow(windSpeed,.16)+
		0.4275*temperature*Math.pow(windSpeed,.16); //Calculate the wind chill speed using the formula provided
		System.out.println("Wind Chill Temperature: "+windChill+" degrees Fahrenheit");
		System.out.println("Programmer: Steven Rao");
		
	}

}
