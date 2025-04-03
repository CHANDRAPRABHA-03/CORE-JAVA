class SolarSystemRunner {
        public static void main(String[] args) {
            SolarSystem solar = new SolarSystem();
            SolarSystem mercury = new SolarSystem(1, "Mercury", "Small", "0", "Milky Way", false, 4.5, "Gray", 3.285e23, "57.9 million km");
            SolarSystem earth = new SolarSystem(1, "Earth", "Medium", "1", "Milky Way", true, 4.54, "Blue & Green", 5.972e24, "149.6 million km");
            SolarSystem mars = new SolarSystem(1, "Mars", "Small", "2", "Milky Way", false, 4.6, "Red", 6.39e23, "227.9 million km");
            SolarSystem jupiter = new SolarSystem(1, "Jupiter", "Large", "79", "Milky Way", false, 4.6, "Orange & White", 1.898e27, "778.5 million km");


            solar.displayInfo();
            mercury.displayInfo();
            earth.displayInfo();
            mars.displayInfo();
            jupiter.displayInfo();
        }
    }

