public class AirLines {

        String airlineName;
        String destination;
        String departureTime;
        int flightNumber;
        int passengers;
        double ticketPrice;
        String seatType;
        String gate;
        boolean international;
        String pilotName;

        public AirLines() {
            this("Unknown", "Unknown", "00:00", 0, 0, 0.0, "Economy", "A1", false, "Unknown");
        }

        public AirLines(String airlineName, String destination) {
            this(airlineName, destination, "00:00", 0, 0, 0.0, "Economy", "A1", false, "Unknown");
        }

        public AirLines(String airlineName, String destination, String departureTime, int flightNumber) {
            this(airlineName, destination, departureTime, flightNumber, 0, 0.0, "Economy", "A1", false, "Unknown");
        }

        public AirLines(String airlineName, String destination, String departureTime, int flightNumber, int passengers, double ticketPrice) {
            this(airlineName, destination, departureTime, flightNumber, passengers, ticketPrice, "Economy", "A1", false, "Unknown");
        }

        public AirLines(String airlineName, String destination, String departureTime, int flightNumber, int passengers, double ticketPrice, String seatType, String gate, boolean international, String pilotName) {
            this.airlineName = airlineName;
            this.destination = destination;
            this.departureTime = departureTime;
            this.flightNumber = flightNumber;
            this.passengers = passengers;
            this.ticketPrice = ticketPrice;
            this.seatType = seatType;
            this.gate = gate;
            this.international = international;
            this.pilotName = pilotName;
        }

        public void info() {
            System.out.println("Airline: " + airlineName + ", Destination: " + destination);
        }
    }
