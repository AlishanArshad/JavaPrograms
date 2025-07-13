//Create a program that converts
//temperatures between Celsius and
//Fahrenheit. Prompt the user to enter a
//temperature value and the unit of
//measurement, and then perform the
//conversion. Display the converted
//temperature.
import java.util.Scanner;
public class TempConverter{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temp to convert : ");
        int num = input.nextInt();
        System.out.println("Enter Unit, F for Fahrenheit and C for Celsius");
        String unit = input.next();
        String upp = unit.toUpperCase();
        if(upp.equals("F")){
            double fahrenheit = ((num * 1.8) + 32);
            System.out.println(fahrenheit);
        }
        if(upp.equals("C")){
            double celsius = ((num - 32) / 1.8);
            System.out.println(celsius);
        }

        }
    }
