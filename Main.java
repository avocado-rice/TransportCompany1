import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        double budget = 0;
        
        ArrayList<Station> stations = new ArrayList<>();
        
        stations.add(new CityStation("A",0, 0));
        stations.add(new CityStation("B", 200, 200));
        
        Train train1 = new Train();
        Train train2 = new Train();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Maximal simulation time [days]: ");
        
        int time_limit = scanner.nextInt();
        
        System.out.println("Ticket prices: ");
        
        double revenue_mod = scanner.nextInt();

        for(int day = 1; day <= time_limit; day++)
        {
            System.out.println("Simulation day: " + day);
            
            for(Station station : stations)
            {
                station.calculate_passengers(200, 600);
            }
            
            budget += revenue_mod * train1.transit(stations.get(0), stations.get(1));
            
            System.out.println("City A passengers: " + stations.get(0).passengers);
            System.out.println("Budget at the end of day: " + budget);
        }

        System.out.println("Total company profit: " + budget);
    }
}