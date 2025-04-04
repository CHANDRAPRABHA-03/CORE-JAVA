 class ElectronicsInfoRunner {
    public static void main(String[] args) {
        ElectronicsInfo defaultDevice = new ElectronicsInfo();
        ElectronicsInfo smartphone = new ElectronicsInfo("Apple", "iPhone 14", "Smartphone", 999.99, 2, true, 15, "Black", 0.174, "146.7 x 71.5 x 7.8 mm");
        ElectronicsInfo laptop = new ElectronicsInfo("Dell", "XPS 15", "Laptop", 1599.99, 3, true, 65, "Silver", 2.0, "345 x 230 x 18 mm");
        ElectronicsInfo tv = new ElectronicsInfo("Samsung", "QLED 65", "Television", 1299.99, 5, true, 120, "Gray", 24.5, "1449 x 831 x 46 mm");
        ElectronicsInfo refrigerator = new ElectronicsInfo("LG", "InstaView", "Refrigerator", 2199.99, 10, true, 200, "Stainless Steel", 110.0, "912 x 1790 x 738 mm");

        defaultDevice.displayInfo();
        smartphone.displayInfo();
        laptop.displayInfo();
        tv.displayInfo();
        refrigerator.displayInfo();
    }
}

