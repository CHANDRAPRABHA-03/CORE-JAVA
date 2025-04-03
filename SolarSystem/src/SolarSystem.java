public class SolarSystem {
        int noOfPlanets;
        String planetNames;
        String planetSize;
        String noOfMoons;
        String galaxy;
        boolean habitable;
        double age;
        String planetColor;
        double planetWeight;
        String planetDistanceFromSun;


        public SolarSystem() {

        }


        public SolarSystem(int noOfPlanets, String planetNames) {
            this.noOfPlanets= noOfPlanets;
            this.planetNames = planetNames;
        }


        public SolarSystem(int noOfPlanets, String planetNames, String planetSize, String noOfMoons) {
            this(noOfPlanets, planetNames);
            this.planetSize =planetSize;
            this.noOfMoons= noOfMoons;
        }


        public SolarSystem(int noOfPlanets, String planetNames, String planetSize, String noOfMoons, String galaxy, boolean habitable) {
            this(noOfPlanets, planetNames, planetSize, noOfMoons);
            this.galaxy = galaxy;
            this.habitable = habitable;
        }

        public SolarSystem(int noOfPlanets, String planetNames, String planetSize, String noOfMoons, String galaxy, boolean habitable, double age, String planetColor, double planetWeight, String planetDistanceFromSun) {
            this(noOfPlanets, planetNames, planetSize, noOfMoons);
            this.galaxy = galaxy;
            this.habitable = habitable;
            this.age = age;
            this.planetColor = planetColor;
            this.planetWeight = planetWeight;
            this.planetDistanceFromSun = planetDistanceFromSun;
        }


        public void displayInfo() {
            System.out.println("------ Solar System Information ------");
            System.out.println("Number of Planets: " + noOfPlanets);
            System.out.println("Planet Names: " + planetNames);
            System.out.println("Planet Size: " + planetSize);
            System.out.println("Number of Moons: " + noOfMoons);
            System.out.println("Galaxy: " + galaxy);
            System.out.println("Habitable: " + habitable);
            System.out.println("Age: " + age + " billion years");
            System.out.println("Planet Color: " + planetColor);
            System.out.println("Planet Weight: " + planetWeight + " kg");
            System.out.println("Distance from Sun: " + planetDistanceFromSun);
            System.out.println("-------------------------------------");
        }
    }
