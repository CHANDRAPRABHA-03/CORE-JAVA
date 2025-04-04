class AirLines {
    String airlineName;
    String country;
    int fleetSize;
    int destinations;
    String hub;
    boolean international;
    double foundingYear;
    String logoColor;
    double revenue;
    String slogan;

    public AirLines() {

    }

    public AirLines(String airlineName, String country) {
        this.airlineName = airlineName;
        this.country = country;
    }

    public AirLines(String airlineName, String country, int fleetSize, int destinations) {
        this(airlineName, country);
        this.fleetSize = fleetSize;
        this.destinations = destinations;
    }

    public AirLines(String airlineName, String country, int fleetSize, int destinations, String hub, boolean international) {
        this(airlineName, country, fleetSize, destinations);
        this.hub = hub;
        this.international = international;
    }

    public AirLines(String airlineName, String country, int fleetSize, int destinations, String hub, boolean international, double foundingYear, String logoColor, double revenue, String slogan) {
        this(airlineName, country, fleetSize, destinations,hub, international);
        this.foundingYear = foundingYear;
        this.logoColor = logoColor;
        this.revenue = revenue;
        this.slogan = slogan;
    }

    public void displayInfo() {
        System.out.println("------ Airline Information ------");
        System.out.println("Airline Name: " + airlineName);
        System.out.println("Country: " + country);
        System.out.println("Fleet Size: " + fleetSize);
        System.out.println("Destinations: " + destinations);
        System.out.println("Hub: " + hub);
        System.out.println("International: " + international);
        System.out.println("Founding Year: " + foundingYear);
        System.out.println("Logo Color: " + logoColor);
        System.out.println("Revenue: $" + revenue + " billion");
        System.out.println("Slogan: " + slogan);
        System.out.println();
    }
}

