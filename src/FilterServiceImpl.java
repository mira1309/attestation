import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class FilterServiceImpl {

    List<Flight> flightWithTwoHourDuration(List<Flight> flights) {
        return flights.stream()
                .filter(flight -> {
                    List<Segment> segments = flight.getSegments();
                    if(segments.size() == 1) {
                        Segment segment = segments.get(0);
                        Duration duration = Duration.between(segment.getDepartureDate(), segment.getArrivalDate());
                        long hours = duration.toHours();
                        return hours == 2;
                    }
                    return false;
                })
                .toList();
    }

    List<Flight> multiSegmentFlight(List<Flight> flights) {
        return flights.stream()
                .filter(flight -> {
                    List<Segment> segments = flight.getSegments();
                    return (segments.size() > 1);
                })
                .toList();
    }

    List<Flight> flightDepartingInThePast(List<Flight> flights) {
        return flights.stream()
                .filter(flight -> {
                    List<Segment> segments = flight.getSegments();
                    return segments.stream().allMatch(segment1 -> segment1.getDepartureDate().isBefore(LocalDateTime.now()));
                })
                .toList();
    }
}
