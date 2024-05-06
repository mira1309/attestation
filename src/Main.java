import java.util.List;

public class Main {
    public static void main(String[] args) {

        FilterServiceImpl flightServiceImpl = new FilterServiceImpl();
        List<Flight> flights = FlightBuilder.createFlights();

        System.out.println(flightServiceImpl.flightWithTwoHourDuration(flights));
        System.out.println("-----------------------------------------------------");
        System.out.println(flightServiceImpl.multiSegmentFlight(flights));
        System.out.println("-----------------------------------------------------");
        System.out.println(flightServiceImpl.flightDepartingInThePast(flights));

    }
}