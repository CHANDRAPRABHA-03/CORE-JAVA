public class PropertyRunner {
    public static void main(String[] args) {
        Site site1 = new Site(10, 20);
        Site site2 = new Site(30, 400);
        Property property = new Property("ChandraProperty", "Maddur", 50000,
                new Site []{ site1, site2} );
        property.display();
    }
}

