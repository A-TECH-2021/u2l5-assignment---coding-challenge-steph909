package main.java;
import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        // your code here.

        // creates new scanner
        Scanner in = new Scanner(System.in);

        //sets starting latitude
        System.out.println("Enter the latitude of the starting location: ");
        double startingLatitude = in.nextDouble();

        //sets starting longitude
        System.out.println("Enter the longitude of the starting location: ");
        double startingLongitude = in.nextDouble();

        //sets ending latitude
        System.out.println("Enter the latitude of the ending location: ");
        double endingLatitude = in.nextDouble();

        //sets ending longitude
        System.out.println("Enter the longitude of the ending location: ");
        double endingLongitude = in.nextDouble();

        //diffrece in latitude
        //double diffLatitude = startingLatitude - endingLatitude;
        //double diffLongitude = startingLongitude - endingLongitude;

        GeoLocation location = new GeoLocation(startingLatitude, startingLongitude);
        GeoLocation location2 = new GeoLocation(endingLatitude, endingLongitude);

        double totalDiff = location.distanceFrom(location2);

        System.out.println(totalDiff);
    }
}
