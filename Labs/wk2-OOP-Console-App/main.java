import java.text.DecimalFormat;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        // create Scanner object to get input in Console environment
        Scanner scan = new Scanner(System.in);

        /*Your solution goes here */
        String name = "";
        while( !name.equalsIgnoreCase("x") )// while ( name.equalsIgnoreCase("x") == false )
        {
            System.out.print("Enter name or X to quit: ");
            name = scan.nextLine();

            if( !name.equalsIgnoreCase("x") )
            {
                // get the rest of the information
                System.out.print("Enter age: ");
                int age = scan.nextInt();
                System.out.print("Enter weight: ");
                double weight = scan.nextDouble();
                System.out.print("Enter height - feet: ");
                int feet = scan.nextInt();
                System.out.print("Enter height - inches: ");
                double inches = scan.nextDouble(); // 10 ENTER
                scan.nextLine(); // use up the ENTER key

                // create HealthProfile object and show the health information
                HealthProfile hp = new HealthProfile(name, age, weight, feet, inches);
                System.out.println( "\nHealth Profile for " + hp.getName() );
                double bmi = hp.calculateBMI();
                DecimalFormat fmt = new DecimalFormat("0.0");
                System.out.println("BMI: " + fmt.format(bmi) );
                System.out.println("BMI Category: " + hp.calculateCategory() );
                System.out.println( "Max heart rate: " + hp.calculateMaxHR() );
                System.out.println("");

            }
        }

    }
}
