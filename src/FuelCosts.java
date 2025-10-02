import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        double tanksize = 0.0;
        double mpg = 0.0;
        double pricePerGal = 0.0;
        double miles100cost = 0.0;
        double fullTankDistance = 0.0;
        boolean done = false;
        String trash = "";

        do {
            System.out.println("Enter the size of the gas tank in gallons: ");
            if (in.hasNextDouble())
            {
                tanksize = in.nextDouble();
                in.nextLine();
                if (tanksize <= 0)
                {
                    System.out.println("Tank size must be greater than 0. Please try again.");
                }
                else
                {
                    done = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + " Please try again.");
            }

        } while (!done);
        done = false;
        do {
            System.out.println("Enter the miles per gallon: ");
            if (in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine();
                if (mpg <= 0)
                {
                    System.out.println("The miles per gallon must be greater than 0. Please try again.");
                }
                else
                {
                    done = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + " Please try again.");
            }

        } while (!done);
        done = false;
        do {
            System.out.println("Enter the price per gallon: ");
            if (in.hasNextDouble())
            {
                pricePerGal = in.nextDouble();
                in.nextLine();
                if (pricePerGal <= 0)
                {
                    System.out.println("The price per gallon must be greater than 0. Please try again.");
                }
                else
                {
                    done = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + " Please try again.");
            }

        } while (!done);

        miles100cost = (100/mpg) * pricePerGal;
        fullTankDistance = tanksize * mpg;
        System.out.printf("The cost per 100 miles is $%.2f%n", miles100cost);
        System.out.printf("The distance possible on a full tank is %.1f miles%n", fullTankDistance);

    }
}
