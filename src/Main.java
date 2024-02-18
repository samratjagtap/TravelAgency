//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import com.example.*;

public class Main {

    public static void main(String[] args) {
        // Create activities
        Activity surfing = new Activity("Surfing", "Enjoy surfing in sea", 50.0, 20);
        Activity hiking = new Activity("Hiking", "Explore scenic trails through lush forests", 30.0, 15);

        // Create destinations and add activities
        Destination goa = new Destination("Goa");
        goa.addActivity(surfing);

        Destination manali = new Destination("Manali");
        manali.addActivity(hiking);

        // Create travel package and add destinations
        TravelPackage package1 = new TravelPackage("Tropical Paradise", 50);
        package1.addDestination(goa);

        TravelPackage package2 = new TravelPackage("Adventure Seeker", 30);
        package2.addDestination(manali);

        // Create passengers
        StandardPassenger standardPassenger = new StandardPassenger("Nitara Roy", 1001,500.00);
        GoldPassenger goldPassenger = new GoldPassenger("Aayan Singh", 1002, 800.0);
        PremiumPassenger premiumPassenger = new PremiumPassenger("Ruhi Saxena", 1003);

        // Add passengers to packages
        package1.addPassenger(standardPassenger);
        package1.addPassenger(goldPassenger);
        package1.addPassenger(premiumPassenger);

        package2.addPassenger(standardPassenger);
        package2.addPassenger(goldPassenger);

        // Print itinerary of package1
        package1.printItinerary();

        // Print passenger list of package1
        package1.printPassengerList();

        System.out.println("Details:");
        // Print details of standardPassenger
        package1.printPassengerDetails(standardPassenger);


        // Print available activities
        package1.printAvailableActivities();
    }

}