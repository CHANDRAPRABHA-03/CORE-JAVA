class AirLinesRunner {
    public static void main(String[] args) {

        AirLines  defaultAirline = new AirLines ();
        AirLines  karnatakaAir = new AirLines ("Karnataka Airlines", "India", 12, 20, "Kempegowda International Airport (BLR)", true, 2025, "Blue & Gold", 1.5, "Connecting Karnataka Skies");
        AirLines  mangaloreWings = new AirLines ("Mangalore Wings", "India", 6, 12, "Mangaluru International Airport (IXE)", false, 2026, "White & Blue", 0.9, "Fly Coastal, Fly Fast");
        AirLines  mysoreAir = new AirLines ("Mysore Air", "India", 5, 10, "Mysore Airport (MYQ)", false, 2025, "Red & White", 0.8, "Bringing Heritage Closer");
        AirLines  hubballiExpress = new AirLines ("Hubballi Express", "India", 4, 8, "Hubballi Airport (HBX)", false, 2026, "Yellow & Green", 0.7, "Quick Wings, Quick Travel");


        defaultAirline.displayInfo();
        karnatakaAir.displayInfo();
        mangaloreWings.displayInfo();
        mysoreAir.displayInfo();
        hubballiExpress.displayInfo();
    }
}
