 class ElectronicsInfo {
    String brand;
    String model;
    String type;
    double price;
    int warrantyYears;
    boolean isSmartDevice;
    double powerConsumption;
    String color;
    double weight;
    String dimensions;

    public ElectronicsInfo() {

    }

    public ElectronicsInfo(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public ElectronicsInfo(String brand, String model, String type, double price) {
        this(brand, model);
        this.type = type;
        this.price = price;
    }

    public ElectronicsInfo(String brand, String model, String type, double price, int warrantyYears, boolean isSmartDevice) {
        this(brand, model, type, price);
        this.warrantyYears = warrantyYears;
        this.isSmartDevice = isSmartDevice;
    }

    public ElectronicsInfo(String brand, String model, String type, double price, int warrantyYears, boolean isSmartDevice, double powerConsumption, String color, double weight, String dimensions) {
        this(brand, model, type, price, warrantyYears,isSmartDevice);
        this.powerConsumption = powerConsumption;
        this.color = color;
        this.weight = weight;
        this.dimensions = dimensions;
    }

    public void displayInfo() {
        System.out.println("------ Electronics Information ------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println("Smart Device: " + isSmartDevice);
        System.out.println("Power Consumption: " + powerConsumption + " W");
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Dimensions: " + dimensions);
        System.out.println("-------------------------------------");
    }
}
