package main.java;
import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        // Start here!

        //add scanner type object
        Scanner in = new Scanner(System.in);

        // gets the tax rate
        System.out.println("Enter the sales tax rate: ");
        double tax = in.nextDouble();

        //gets the number of boards
        System.out.println("How many boards do you need?? ");
        int numBoard = in.nextInt();

        //gets the number of windows
        System.out.println("How many windows do you need? ");
        int numWindow = in.nextInt();

        //creates a constuction object
        Construction construct = new Construction(8, 11, tax);

        //calculates cost of windows and boards
        double bCost = construct.lumberCost(numBoard);
        double wCost = construct.windowCost(numWindow);

        //gets the total
        double total = bCost + wCost;
        System.out.println("Total: " + total);

        //gets the total plus tax
        double totalPlusTax = construct.grandTotal(total);
        System.out.print("Grand total: " + totalPlusTax);
    }
}
