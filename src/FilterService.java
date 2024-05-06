import java.util.List;

public interface FilterService {

    List<Flight> flightWithTwoHourDuration(List<Flight> flights);

    List<Flight> multiSegmentFlight(List<Flight> flights);

    List<Flight> flightDepartingInThePast(List<Flight> flights);
}
