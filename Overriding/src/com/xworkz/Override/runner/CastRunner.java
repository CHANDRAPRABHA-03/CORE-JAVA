package com.xworkz.Override.runner;

import com.xworkz.Override.external.*;

import com.xworkz.Override.internal.*;

public class CastRunner {
    public static void main(String[] args) {
        Actor tor = new Actor();
        tor.act();
        System.out.println();

        Actor tor1 = new Surya();
        tor1.act();

        System.out.println();

        Surya sooriya = new Surya();
        sooriya.act();

        System.out.println();

        Person purse = new Person();
        purse.castCheck(tor);
        purse.castCheck(tor1);
        purse.castCheck(sooriya);
        System.out.println("-------------");

        Android device = new Android();
        device.operate();

        System.out.println();

        Android advancedDevice = new Smartphone(); // Upcasting
        advancedDevice.operate();

        System.out.println();

        Smartphone pixel = new Smartphone(); // Direct object
        pixel.operate();
        pixel.connectToInternet(device);

        System.out.println();

        User user = new User();
        user.useDevice(device);         // Using base Android
        user.useDevice(advancedDevice);
        user.useDevice(pixel);// Using overridden Smartphone
        System.out.println("---------------------");

        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();

        System.out.println();

        Animal domesticAnimal = new Goat(); // Upcasting
        domesticAnimal.makeSound();

        System.out.println();

        Goat kid = new Goat(); // Direct object
        kid.makeSound();
        kid.chew(genericAnimal);

        System.out.println();

        Farmer farmer = new Farmer();
        farmer.careForAnimal(genericAnimal);    // Using base Animal
        farmer.careForAnimal(domesticAnimal);   // Using Goat as Animal
        farmer.careForAnimal(kid);              // Using direct Goat

        System.out.println("---------------------");

        Appliance generalAppliance = new Appliance();
        generalAppliance.start();

        System.out.println();

        Appliance smartWasher = new WashingMachine(); // Upcasting
        smartWasher.start();

        System.out.println();

        WashingMachine frontLoad = new WashingMachine(); // Direct object
        frontLoad.start();
        frontLoad.load(generalAppliance);

        System.out.println();

        Technician technician = new Technician();
        technician.inspectAppliance(generalAppliance);   // Using base Appliance
        technician.inspectAppliance(smartWasher);        // Upcasted WashingMachine
        technician.inspectAppliance(frontLoad);          // Direct WashingMachine

        System.out.println("---------------------");
        Bad bad = new Bad();
        bad.reveal();

        System.out.println();

        Bad disguised = new Lie();  // Upcasting
        disguised.reveal();

        System.out.println();

        Lie directLie = new Lie();
        directLie.reveal();
        directLie.coverUp(bad);

        System.out.println();

        TruthSeeker seeker = new TruthSeeker();
        seeker.investigate(bad);        // Base class
        seeker.investigate(disguised);  // Upcasted subclass
        seeker.investigate(directLie);  // Subclass object

        System.out.println("---------------------");
        Bag generalBag = new Bag();
        generalBag.carry();

        System.out.println();

        Bag techBag = new LaptopBag(); // Upcasting
        techBag.carry();

        System.out.println();

        LaptopBag dellBag = new LaptopBag(); // Direct object
        dellBag.carry();
        dellBag.carryLaptop(generalBag);

        System.out.println();

        Carrier carrier = new Carrier();
        carrier.useBag(generalBag);   // Using base Bag
        carrier.useBag(techBag);      // Upcasted LaptopBag
        carrier.useBag(dellBag);      // Direct LaptopBag

        System.out.println("---------------------");
        BankAccount generalAccount = new BankAccount();
        generalAccount.withdraw();

        System.out.println();

        BankAccount savingsUpcast = new SavingsAccount(); // Upcasting
        savingsUpcast.withdraw();

        System.out.println();

        SavingsAccount savingsDirect = new SavingsAccount(); // Direct object
        savingsDirect.withdraw();
        savingsDirect.calculateInterest(generalAccount);

        System.out.println();

        AccountManager manager = new AccountManager();
        manager.processAccount(generalAccount);   // Using base BankAccount
        manager.processAccount(savingsUpcast);    // Upcasted SavingsAccount
        manager.processAccount(savingsDirect);    // Direct SavingsAccount

        System.out.println("---------------------");
        Beautiful generalBeauty = new Beautiful();
        generalBeauty.showBeauty();

        System.out.println();

        Beautiful floralBeauty = new Flower(); // Upcasting
        floralBeauty.showBeauty();

        System.out.println();

        Flower rose = new Flower(); // Direct object
        rose.showBeauty();
        rose.scent(generalBeauty);

        System.out.println();

        Gardner gardner = new Gardner();
        gardner.admire(generalBeauty);   // Using base Beautiful
        gardner.admire(floralBeauty);    // Upcasted Flower
        gardner.admire(rose);            // Direct Flower

        System.out.println("---------------------");
        Bedsheet regularSheet = new Bedsheet();
        regularSheet.spread();

        System.out.println();

        Bedsheet silkSheetUpcast = new SilkBedsheet(); // Upcasting
        silkSheetUpcast.spread();

        System.out.println();

        SilkBedsheet silkSheetDirect = new SilkBedsheet(); // Direct object
        silkSheetDirect.spread();
        silkSheetDirect.shine(regularSheet);

        System.out.println();

        InteriorDesigner designer = new InteriorDesigner();
        designer.decorate(regularSheet);     // Using base Bedsheet
        designer.decorate(silkSheetUpcast);  // Upcasted SilkBedsheet
        designer.decorate(silkSheetDirect);  // Direct SilkBedsheet

        System.out.println("---------------------");
        Bill basicBill = new Bill();
        basicBill.print();

        System.out.println();

        Bill cashierBill = new Cashier(); // Upcasting
        cashierBill.print();

        System.out.println();

        Cashier directCashier = new Cashier(); // Direct object
        directCashier.print();
        directCashier.scan(basicBill);

        System.out.println();

        CheckoutManager managerr = new CheckoutManager();
        managerr.process(basicBill);       // Using base Bill
        managerr.process(cashierBill);     // Upcasted Cashier
        managerr.process(directCashier);   // Direct Cashier

        System.out.println("---------------------");
        Bird genericBird = new Bird();
        genericBird.sound();

        System.out.println();

        Bird talkingBird = new Parrot(); // Upcasting
        talkingBird.sound();

        System.out.println();

        Parrot greenParrot = new Parrot(); // Direct object
        greenParrot.sound();
        greenParrot.flyColorfully(genericBird);

        System.out.println();

        BirdWatcher watcher = new BirdWatcher();
        watcher.observe(genericBird);   // Using base Bird
        watcher.observe(talkingBird);   // Upcasted Parrot
        watcher.observe(greenParrot);   // Direct Parrot

        System.out.println("---------------------");
        Black generalBlack = new Black();
        generalBlack.describe();

        System.out.println();

        Black cosmicBlack = new BlackHole(); // Upcasting
        cosmicBlack.describe();

        System.out.println();

        BlackHole singularity = new BlackHole(); // Direct object
        singularity.describe();
        singularity.absorb(generalBlack);

        System.out.println();

        Astronomer astronomer = new Astronomer();
        astronomer.study(generalBlack);   // Using base Black
        astronomer.study(cosmicBlack);    // Upcasted BlackHole
        astronomer.study(singularity);    // Direct BlackHole

        System.out.println("---------------------");
        Book physicalBook = new Book();
        physicalBook.open();

        System.out.println();

        Book digitalBook = new EBook(); // Upcasting
        digitalBook.open();

        System.out.println();

        EBook kindleBook = new EBook(); // Direct object
        kindleBook.open();
        kindleBook.download(physicalBook);

        System.out.println();

        Reader reader = new Reader();
        reader.read(physicalBook);   // Using base Book
        reader.read(digitalBook);    // Upcasted EBook
        reader.read(kindleBook);     // Direct EBook

        System.out.println("---------------------");
        Brush basicBrush = new Brush();
        basicBrush.use();

        System.out.println();

        Brush artistBrush = new Painter(); // Upcasting
        artistBrush.use();

        System.out.println();

        Painter detailedPainter = new Painter(); // Direct object
        detailedPainter.use();
        detailedPainter.dipInPaint(basicBrush);

        System.out.println();

        Artistsss artistsss = new Artistsss();
        artistsss.paint(basicBrush);   // Using base Brush
        artistsss.paint(artistBrush);  // Upcasted Painter
        artistsss.paint(detailedPainter); // Direct Painter

        System.out.println("---------------------");
        Bullet basicBullet = new Bullet();
        basicBullet.fire();

        System.out.println();

        Bullet revolverBullet = new RevolverBullet(); // Upcasting
        revolverBullet.fire();

        System.out.println();

        RevolverBullet specificBullet = new RevolverBullet(); // Direct object
        specificBullet.fire();
        specificBullet.loadIntoChamber(basicBullet);

        System.out.println();

        Shooter shooter = new Shooter();
        shooter.shoot(basicBullet);   // Using base Bullet
        shooter.shoot(revolverBullet); // Upcasted RevolverBullet
        shooter.shoot(specificBullet); // Direct RevolverBullet

        System.out.println("---------------------");
        CableWire generalWire = new CableWire();
        generalWire.transmit();

        System.out.println();

        CableWire highDefWire = new Wire(); // Upcasting
        highDefWire.transmit();

        System.out.println();

        Wire advancedWire = new Wire(); // Direct object
        advancedWire.transmit();
        advancedWire.qualityCheck(generalWire);

        System.out.println();

        Inspector inspector = new Inspector();
        inspector.inspectWire(generalWire);  // Using base CableWire
        inspector.inspectWire(highDefWire);  // Upcasted Wire
        inspector.inspectWire(advancedWire);  // Direct Wire

        System.out.println("---------------------");
        Bird genericBirds = new Bird();
        genericBird.sound();

        System.out.println();

        Bird parrotBird = new Parrot(); // Upcasting
        parrotBird.sound();

        System.out.println();

        Parrot colorfulParrot = new Parrot(); // Direct object
        colorfulParrot.sound();
        colorfulParrot.flyColorfully(parrotBird);

        System.out.println();

        Zookeeper zookeeper = new Zookeeper();
        zookeeper.listenToBirdSound(genericBird);  // Using base Bird
        zookeeper.listenToBirdSound(parrotBird);  // Upcasted Parrot
        zookeeper.listenToBirdSound(colorfulParrot);  // Direct Parrot

        System.out.println("---------------------");
     Camera generalCamera = new Camera();
        generalCamera.capture();

        System.out.println();

        Camera dslrCamera = new Dslr(); // Upcasting
        dslrCamera.capture();

        System.out.println();

        Dslr advancedDslr = new Dslr(); // Direct object
        advancedDslr.capture();
        advancedDslr.zoomLens(generalCamera);

        System.out.println();

        Photographer photographer = new Photographer();
        photographer.takePhoto(generalCamera);  // Using base Camera
        photographer.takePhoto(dslrCamera);    // Upcasted DSLR
        photographer.takePhoto(advancedDslr);  // Direct DSLR

        System.out.println("---------------------");
        Canvas basicCanvas = new Canvas();
        basicCanvas.display();

        System.out.println();

        Canvas paintedCanvas = new Artist(); // Upcasting
        paintedCanvas.display();

        System.out.println();

        Artist skilledArtist = new Artist(); // Direct object
        skilledArtist.display();
        skilledArtist.paint(basicCanvas);

        System.out.println();

        Gallery artGallery = new Gallery();
        artGallery.exhibitCanvas(basicCanvas);  // Using base Canvas
        artGallery.exhibitCanvas(paintedCanvas);  // Upcasted Artist
        artGallery.exhibitCanvas(skilledArtist);  // Direct Artist

        System.out.println("---------------------");
        Carrot basicCarrot = new Carrot();
        basicCarrot.taste();

        System.out.println();

        Carrot vegCarrot = new Vegitables(); // Upcasting
        vegCarrot.taste();

        System.out.println();

        Vegitables juicyCarrot = new Vegitables(); // Direct object
        juicyCarrot.taste();
        juicyCarrot.nutrition(basicCarrot);

        System.out.println();

        Farm farm = new Farm();
        farm.analyzeTaste(basicCarrot);  // Using base Carrot
        farm.analyzeTaste(vegCarrot);   // Upcasted Vegetable
        farm.analyzeTaste(juicyCarrot); // Direct Vegetable

        System.out.println("---------------------");
        Champakali basicChampakali = new Champakali();
        basicChampakali.taste();

        System.out.println();

        Champakali dryFruitChampakali = new DryFruitChampakali(); // Upcasting
        dryFruitChampakali.taste();

        System.out.println();

        DryFruitChampakali specialDryFruitChampakali = new DryFruitChampakali(); // Direct object
        specialDryFruitChampakali.taste();
        specialDryFruitChampakali.serve(basicChampakali);

        System.out.println();

        Cust cust = new Cust();
        cust.enjoyDessert(basicChampakali);  // Using base Champakali
        cust.enjoyDessert(dryFruitChampakali);   // Upcasted DryFruitChampakali
        cust.enjoyDessert(specialDryFruitChampakali); // Direct DryFruitChampakali

        System.out.println("---------------------");
        Window normalWindow = new Window();
        normalWindow.open();

        System.out.println();

        Window glassWindow = new GlassWindow(); // Upcasting
        glassWindow.open();

        System.out.println();

        GlassWindow specialGlassWindow = new GlassWindow(); // Direct object
        specialGlassWindow.open();
        specialGlassWindow.reflect(normalWindow);

        System.out.println();

        Rooming rooming = new Rooming();
        rooming.manageWindow(normalWindow);  // Using base Window
        rooming.manageWindow(glassWindow);   // Upcasted GlassWindow
        rooming.manageWindow(specialGlassWindow); // Direct GlassWindow

        System.out.println("---------------------");


    }
}
