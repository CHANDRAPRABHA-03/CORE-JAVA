package com.xworkz.Override.runner;

import com.xworkz.Override.external.*;
import com.xworkz.Override.internal.*;


public class runner {
        public static void main(String[] args) {
            Mobile mobile = new Mobile();
            mobile.ScreenOff();

            System.out.println();   //

            Mobile tab = new Tab();
            tab.ScreenOff();

            System.out.println();   //

            Tab tab1 = new Tab();
            tab1.ScreenOff();
            tab1.rotate(mobile);
            tab1.rotate(null);
            System.out.println("-----------------------------");

            BankAccount account = new BankAccount();
            account.withdraw();
            System.out.println();
            BankAccount savingsAsAccount = new SavingsAccount();
            savingsAsAccount.withdraw();
            System.out.println();

            SavingsAccount savings = new SavingsAccount();
            savings.withdraw();
            savings.calculateInterest(account);
            savings.calculateInterest(null);

            System.out.println("-----------------------------");


                    Camera cam = new Camera();
                    cam.capture();

                    System.out.println();

                    Camera dslrAsCam = new Dslr();
                    dslrAsCam.capture();

                    System.out.println();

                    Dslr dslr1 = new Dslr();
                    dslr1.capture();
                    dslr1.zoomLens(cam);
                    dslr1.zoomLens(null);
                    System.out.println("-----------------------------");
            Instrument instrument = new Instrument();
            instrument.play();

            System.out.println();

            Instrument guitarAsInstrument = new Guitar();
            guitarAsInstrument.play();

            System.out.println();

            Guitar guitar = new Guitar();
            guitar.play();
            guitar.tune(instrument);
            guitar.tune(null);

            System.out.println("-----------------------------");
            Appliance appliance = new Appliance();
            appliance.start();

            System.out.println();

            Appliance machineAsAppliance = new WashingMachine();
            machineAsAppliance.start();

            System.out.println();

            WashingMachine machine = new WashingMachine();
            machine.start();
            machine.load(appliance);
            machine.load(null);

            System.out.println("-----------------------------");

            Bag genericBag = new Bag();
            genericBag.carry();

            System.out.println();

            Bag techBag = new LaptopBag();
            techBag.carry(); // Overridden method

            System.out.println();

            LaptopBag laptopBag = new LaptopBag();
            laptopBag.carry(); // Subclass method
            laptopBag.carryLaptop(genericBag); // Extra method
            laptopBag.carryLaptop(null);

            System.out.println("-----------------------------");
            Watch basicWatch = new Watch();
            basicWatch.showTime();

            System.out.println();

            Watch advancedWatch = new SmartWatch();
            advancedWatch.showTime(); // Overridden method

            System.out.println();

            SmartWatch smartWatch = new SmartWatch();
            smartWatch.showTime(); // Subclass method
            smartWatch.trackFitness(basicWatch); // Extra method
            smartWatch.trackFitness(null);

            System.out.println("-----------------------------");

            Bedsheet basic = new Bedsheet();
            basic.spread();

            System.out.println();

            Bedsheet fancy = new SilkBedsheet();
            fancy.spread(); // Overridden method

            System.out.println();

            SilkBedsheet silk = new SilkBedsheet();
            silk.spread();
            silk.shine(basic);
            silk.shine(null);

            System.out.println("-----------------------------");
            Pillow regular = new Pillow();
            regular.support();

            System.out.println();

            Pillow special = new MemoryFoamPillow();
            special.support(); // Runtime polymorphism

            System.out.println();

            MemoryFoamPillow memory = new MemoryFoamPillow();
            memory.support();
            memory.contour(regular);
            memory.contour(null);

            System.out.println("-----------------------------");
            Book physical = new Book();
            physical.open();

            System.out.println();

            Book digital = new EBook(); // Runtime polymorphism
            digital.open();

            System.out.println();

            EBook kindle = new EBook();
            kindle.open();
            kindle.download(physical);
            kindle.download(null);

            System.out.println("-----------------------------");
            Bird bird = new Bird();
            bird.sound();

            System.out.println();

            Bird parrotAsBird = new Parrot(); // Runtime polymorphism
            parrotAsBird.sound();

            System.out.println();

            Parrot parrot = new Parrot();
            parrot.sound();
            parrot.flyColorfully(bird);
            parrot.flyColorfully(null);

            System.out.println("-----------------------------");

            Animal animal = new Animal();
            animal.makeSound();

            System.out.println();

            Animal goatAsAnimal = new Goat(); // Runtime polymorphism
            goatAsAnimal.makeSound();

            System.out.println();

            Goat goat = new Goat();
            goat.makeSound();
            goat.chew(animal);
            goat.chew(null);

            System.out.println("-----------------------------");

            Container container = new Container();
            container.holdLiquid();

            System.out.println();

            Container mugAsContainer = new Mug(); // Polymorphism
            mugAsContainer.holdLiquid();

            System.out.println();

            Mug mug = new Mug();
            mug.holdLiquid();
            mug.handleGrip(container);
            mug.handleGrip(null);

            System.out.println("-----------------------------");

            Leader leader = new Leader();
            leader.serveNation();

            System.out.println();

            Leader indira = new IndiraGandhi(); // Runtime polymorphism
            indira.serveNation();

            System.out.println();

            IndiraGandhi ig = new IndiraGandhi();
            ig.serveNation();
            ig.emergencyPeriod(leader);
            ig.emergencyPeriod(null);

            System.out.println("-----------------------------");
            Actor actor = new Actor();
            actor.act();

            System.out.println();

            Actor surya = new Surya();
            surya.act();

            System.out.println();

            Surya suryaObj = new Surya();
            suryaObj.act();
            suryaObj.promoteEducation(actor);
            suryaObj.promoteEducation(null);

            System.out.println("-----------------------------");
            Vehicle vehicle = new Vehicle();
            vehicle.start();

            System.out.println();

            Vehicle scooter = new Scooter(); // Runtime polymorphism
            scooter.start();

            System.out.println();

            Scooter scooterObj = new Scooter();
            scooterObj.start();
            scooterObj.kickStart(vehicle);
            scooterObj.kickStart(null);

            System.out.println("-----------------------------");
            TVShow show = new TVShow();
            show.broadcast();

            System.out.println();

            TVShow serial = new Serial(); // Runtime polymorphism
            serial.broadcast();

            System.out.println();

            Serial serialObj = new Serial();
            serialObj.broadcast();
            serialObj.cliffhanger(show);
            serialObj.cliffhanger(null);

            System.out.println("-----------------------------");
            Snack snack = new Snack();
            snack.eat();

            System.out.println();

            Snack chips = new Chips(); // Runtime polymorphism
            chips.eat();

            System.out.println();

            Chips chipsObj = new Chips();
            chipsObj.eat();
            chipsObj.flavor(snack);
            chipsObj.flavor(null);

            System.out.println("-----------------------------");
            ObjectItem item = new ObjectItem();
            item.reflect();

            System.out.println();

            ObjectItem mirror = new Mirror(); // Runtime polymorphism
            mirror.reflect();

            System.out.println();

            Mirror mirrorObj = new Mirror();
            mirrorObj.reflect();
            mirrorObj.clean(item);
            mirrorObj.clean(null);

            System.out.println("-----------------------------");
            Fabric fabric = new Fabric();
            fabric.absorb();

            System.out.println();

            Fabric towel = new Towel(); // Runtime polymorphism
            towel.absorb();

            System.out.println();

            Towel towelObj = new Towel();
            towelObj.absorb();
            towelObj.dry(fabric);
            towelObj.dry(null);

            System.out.println("-----------------------------");
            HeadGear headGear = new HeadGear();
            headGear.protect();

            System.out.println();

            HeadGear helmet = new Helmet(); // Runtime polymorphism
            helmet.protect();

            System.out.println();

            Helmet helmetObj = new Helmet();
            helmetObj.protect();
            helmetObj.strap(headGear);
            helmetObj.strap(null);

            System.out.println("-----------------------------");
            Window window = new Window();
            window.open();

            System.out.println();

            Window glass = new GlassWindow(); // Runtime polymorphism
            glass.open();

            System.out.println();

            GlassWindow glassWindow = new GlassWindow();
            glassWindow.open();
            glassWindow.reflect(window);
            glassWindow.reflect(null);

            System.out.println("-----------------------------");
            Shoe shoe = new Shoe();
            shoe.wear();

            System.out.println();

            Shoe sneaker = new Sneaker(); // Runtime polymorphism
            sneaker.wear();

            System.out.println();

            Sneaker sneakerObj = new Sneaker();
            sneakerObj.wear();
            sneakerObj.laceUp(shoe);
            sneakerObj.laceUp(null);

            System.out.println("-----------------------------");
            Paper paper = new Paper();
            paper.writeOn();

            System.out.println();

            Paper notebook = new Notebook(); // Runtime polymorphism
            notebook.writeOn();

            System.out.println();

            Notebook notebookObj = new Notebook();
            notebookObj.writeOn();
            notebookObj.tear(paper);
            notebookObj.tear(null);

            System.out.println("-----------------------------");
            Mouse mouse = new Mouse();
            mouse.click();

            System.out.println();

            Mouse wireless = new WirelessMouse();
            wireless.click();

            System.out.println();

            WirelessMouse wirelessMouse = new WirelessMouse();
            wirelessMouse.click();
            wirelessMouse.connect(mouse);
            wirelessMouse.connect(null);

            System.out.println("-----------------------------");
            Furniture furniture = new Furniture();
            furniture.material();

            System.out.println();

            Furniture sofaAsFurniture = new Sofa();
            sofaAsFurniture.material();

            System.out.println();

            Sofa sofa = new Sofa();
            sofa.material();
            sofa.comfort(furniture);
            sofa.comfort(null);

            System.out.println("-----------------------------");
            CableWire wire = new CableWire();
            wire.transmit();

            System.out.println();

            CableWire WireAsWire = new Wire();
            WireAsWire.transmit();

            System.out.println();

            Wire  wire1= new Wire();
            wire1.transmit();
            wire1.qualityCheck(wire);
            wire1.qualityCheck(null);
            System.out.println("-----------------------------");

            RemoteCar base = new RemoteCar();
            base.drive();

            System.out.println();

            RemoteCar toyAsBase = new Toy();
            toyAsBase.drive();

            System.out.println();

            Toy toy = new Toy();
            toy.drive();
            toy.autoPark(base);
            toy.autoPark(null);
            System.out.println("-----------------------------");
            Grass natural = new Grass();
            natural.grow();

            System.out.println();

            Grass synthetic = new ArtificialGrass(); // Polymorphism
            synthetic.grow(); // Overridden method

            System.out.println();

            ArtificialGrass fullArtificial = new ArtificialGrass();
            fullArtificial.grow();
            fullArtificial.wash(natural);
            fullArtificial.wash(null);

            System.out.println("-----------------------------");
            IceCream iceCream = new IceCream();
            iceCream.melt();

            System.out.println();

            IceCream coneAsIceCream = new ConeIceCream(); // Upcasting
            coneAsIceCream.melt(); // Overridden method

            System.out.println();

            ConeIceCream cone = new ConeIceCream();
            cone.melt();
            cone.addToppings(iceCream);
            cone.addToppings(null);

            System.out.println("-----------------------------");
            GreenGrapes greenGrapes = new GreenGrapes();
            greenGrapes.taste();

            System.out.println();

            GreenGrapes poly = new Grapes(); // Upcasting
            poly.taste();

            System.out.println();

            Grapes child = new Grapes();
            child.taste();
            child.makeWine(greenGrapes);
            child.makeWine(null);

            System.out.println("-----------------------------");
            Chrome chrome = new Chrome();
            chrome.launch();

            System.out.println();

            Chrome upcasted = new GoogleChrome(); // Upcasting
            upcasted.launch();

            System.out.println();

            GoogleChrome subclass = new GoogleChrome();
            subclass.launch();
            subclass.browseIncognito(chrome);
            subclass.browseIncognito(null);

            System.out.println("-----------------------------");

            Plug plug = new Plug();
            plug.providePower();

            System.out.println();

            Plug adapterAsPlug = new Adapter(); // Runtime polymorphism
            adapterAsPlug.providePower();

            System.out.println();

            Adapter adapter = new Adapter();
            adapter.providePower();
            adapter.connectDevice(plug);
            adapter.connectDevice(null);

            System.out.println("-----------------------------");
            Juice juice = new Juice();
            juice.drink();

            System.out.println();

            Juice orangeAsJuice = new OrangeJuice(); // Runtime polymorphism
            orangeAsJuice.drink();

            System.out.println();

            OrangeJuice orangeJuice = new OrangeJuice();
            orangeJuice.drink();
            orangeJuice.serveWithSnack(juice);
            orangeJuice.serveWithSnack(null);

            System.out.println("-----------------------------");
            Android android = new Android();
            android.operate();

            System.out.println();

            Android phoneAsAndroid = new Smartphone(); // Runtime polymorphism
            phoneAsAndroid.operate();

            System.out.println();

            Smartphone phone = new Smartphone();
            phone.operate();
            phone.connectToInternet(android);
            phone.connectToInternet(null);

            System.out.println("-----------------------------");
            Song song = new Song();
            song.play();

            System.out.println();

            Song popAsSong = new PopSong(); // Runtime polymorphism
            popAsSong.play();

            System.out.println();

            PopSong pop = new PopSong();
            pop.play();
            pop.danceToBeat(song);
            pop.danceToBeat(null);

            System.out.println("-----------------------------");
            Bullet bullet = new Bullet();
            bullet.fire();

            System.out.println();

            Bullet revolverAsBullet = new RevolverBullet(); // Runtime polymorphism
            revolverAsBullet.fire();

            System.out.println();

            RevolverBullet revolver = new RevolverBullet();
            revolver.fire();
            revolver.loadIntoChamber(bullet);
            revolver.loadIntoChamber(null);

            System.out.println("-----------------------------");
            Black black = new Black();
            black.describe();

            System.out.println();

            Black blackHoleAsBlack = new BlackHole(); // Runtime polymorphism
            blackHoleAsBlack.describe();

            System.out.println();

            BlackHole blackHole = new BlackHole();
            blackHole.describe();
            blackHole.absorb(black);
            blackHole.absorb(null);

            System.out.println("-----------------------------");
            Fear fear = new Fear();
            fear.express();

            System.out.println();

            Fear stageAsFear = new StageFear(); // Runtime polymorphism
            stageAsFear.express();

            System.out.println();

            StageFear stageFear = new StageFear();
            stageFear.express();
            stageFear.overcome(fear);
            stageFear.overcome(null);

            System.out.println("-----------------------------");
            Dream dream = new Dream();
            dream.experience();

            System.out.println();

            Dream nightmareAsDream = new Nightmare(); // Runtime polymorphism
            nightmareAsDream.experience();

            System.out.println();

            Nightmare nightmare = new Nightmare();
            nightmare.experience();
            nightmare.wakeUp(dream);
            nightmare.wakeUp(null);

            System.out.println("-----------------------------");
            Good good = new Good();
            good.reflect();

            System.out.println();

            Good deedAsGood = new Deed(); // Runtime polymorphism
            deedAsGood.reflect();

            System.out.println();

            Deed deed = new Deed();
            deed.reflect();
            deed.inspire(good);
            deed.inspire(null);

            System.out.println("-----------------------------");
            Bad bad = new Bad();
            bad.reveal();

            System.out.println();

            Bad lieAsBad = new Lie(); // Runtime polymorphism
            lieAsBad.reveal();

            System.out.println();

            Lie lie = new Lie();
            lie.reveal();
            lie.coverUp(bad);
            lie.coverUp(null);

            System.out.println("-----------------------------");
            Truth truth = new Truth();
            truth.declare();

            System.out.println();

            Truth factAsTruth = new Fact(); // Runtime polymorphism
            factAsTruth.declare();

            System.out.println();

            Fact fact = new Fact();
            fact.declare();
            fact.validate(truth);
            fact.validate(null);

            System.out.println("-----------------------------");
            Emotion emotion = new Emotion();
            emotion.express();

            System.out.println();

            Emotion tearAsEmotion = new Tear(); // Runtime polymorphism
            tearAsEmotion.express();

            System.out.println();

            Tear tear = new Tear();
            tear.express();
            tear.fall(emotion);
            tear.fall(null);

            System.out.println("-----------------------------");
            Comedy comedy = new Comedy();
            comedy.trigger();

            System.out.println();

            Comedy laughAsComedy = new Laughter(); // Runtime polymorphism
            laughAsComedy.trigger();

            System.out.println();

            Laughter laughter = new Laughter();
            laughter.trigger();
            laughter.echo(comedy);
            laughter.echo(null);

            System.out.println("-----------------------------");
            Pain pain = new Pain();
            pain.feel();

            System.out.println();

            Pain injuryAsPain = new Injury(); // Runtime polymorphism
            injuryAsPain.feel();

            System.out.println();

            Injury injury = new Injury();
            injury.feel();
            injury.treat(pain);
            injury.treat(null);

            System.out.println("-----------------------------");
            Talent talent = new Talent();
            talent.display();

            System.out.println();

            Talent achievementAsTalent = new Achievement(); // Runtime polymorphism
            achievementAsTalent.display();

            System.out.println();

            Achievement achievement = new Achievement();
            achievement.display();
            achievement.celebrate(talent);
            achievement.celebrate(null);

            System.out.println("-----------------------------");
            Rain rain = new Rain();
            rain.pour();

            System.out.println();

            Rain rainbowAsRain = new Rainbow(); // Runtime polymorphism
            rainbowAsRain.pour();

            System.out.println();

            Rainbow rainbow = new Rainbow();
            rainbow.pour();
            rainbow.shine(rain);
            rainbow.shine(null);

            System.out.println("-----------------------------");
            Seed seed = new Seed();
            seed.grow();

            System.out.println();

            Seed treeAsSeed = new Tree(); // Runtime polymorphism
            treeAsSeed.grow();

            System.out.println();

            Tree tree = new Tree();
            tree.grow();
            tree.provide(seed);
            tree.provide(null);

            System.out.println("-----------------------------");
            Star star = new Star();
            star.shine();

            System.out.println();

            Star galaxyAsStar = new Galaxy(); // Runtime polymorphism
            galaxyAsStar.shine();

            System.out.println();

            Galaxy galaxy = new Galaxy();
            galaxy.shine();
            galaxy.orbit(star);
            galaxy.orbit(null);

            System.out.println("-----------------------------");
            Shell shell = new Shell();
            shell.echo();

            System.out.println();

            Shell oceanAsShell = new Ocean(); // Runtime polymorphism
            oceanAsShell.echo();

            System.out.println();

            Ocean ocean = new Ocean();
            ocean.echo();
            ocean.cradle(shell);
            ocean.cradle(null);

            System.out.println("-----------------------------");
            Ink ink = new Ink();
            ink.flow();

            System.out.println();

            Ink poemAsInk = new Poem(); // Runtime polymorphism
            poemAsInk.flow();

            System.out.println();

            Poem poem = new Poem();
            poem.flow();
            poem.inspire(ink);
            poem.inspire(null);

            System.out.println("-----------------------------");
            Signal signal = new Signal();
            signal.transmit();

            System.out.println();

            Signal networkAsSignal = new Network(); // Runtime polymorphism
            networkAsSignal.transmit();

            System.out.println();

            Network network = new Network();
            network.transmit();
            network.connect(signal);
            network.connect(null);

            System.out.println("-----------------------------");
            Key key = new Key();
            key.open();

            System.out.println();

            Key lockAsKey = new Lock(); // Runtime polymorphism
            lockAsKey.open();

            System.out.println();

            Lock lock = new Lock();
            lock.open();
            lock.secure(key);
            lock.secure(null);

            System.out.println("-----------------------------");
            Fuel fuel = new Fuel();
            fuel.ignite();

            System.out.println();

            Fuel engineAsFuel = new Engine(); // Runtime polymorphism
            engineAsFuel.ignite();

            System.out.println();

            Engine engine = new Engine();
            engine.ignite();
            engine.run(fuel);
            engine.run(null);

            System.out.println("-----------------------------");
            Sun sun = new Sun();
            sun.radiate();

            System.out.println();

            Sun panelAsSun = new SolarPanel(); // Runtime polymorphism
            panelAsSun.radiate();

            System.out.println();

            SolarPanel panel = new SolarPanel();
            panel.radiate();
            panel.charge(sun);
            panel.charge(null);

            System.out.println("-----------------------------");
            Time time = new Time();
            time.tick();

            System.out.println();

            Time clockAsTime = new Clock(); // Runtime polymorphism
            clockAsTime.tick();

            System.out.println();

            Clock clock = new Clock();
            clock.tick();
            clock.display(time);
            clock.display(null);

            System.out.println("-----------------------------");
            Sound sound = new Sound();
            sound.produce();

            System.out.println();

            Sound speakerAsSound = new Speaker(); // Runtime polymorphism
            speakerAsSound.produce();

            System.out.println();

            Speaker speaker = new Speaker();
            speaker.produce();
            speaker.play(sound);
            speaker.play(null);

            System.out.println("-----------------------------");
            Scene scene = new Scene();
            scene.display();

            System.out.println();

            Scene projectorAsScene = new Projector(); // Runtime polymorphism
            projectorAsScene.display();

            System.out.println();

            Projector projector = new Projector();
            projector.display();
            projector.project(scene);
            projector.project(null);

            System.out.println("-----------------------------");
            File file = new File();
            file.store();

            System.out.println();

            File hardDriveAsFile = new HardDrive(); // Runtime polymorphism
            hardDriveAsFile.store();

            System.out.println();

            HardDrive hardDrive = new HardDrive();
            hardDrive.store();
            hardDrive.read(file);
            hardDrive.read(null);

            System.out.println("-----------------------------");
            Power power = new Power();
            power.supply();

            System.out.println();

            Power batteryAsPower = new Battery(); // Runtime polymorphism
            batteryAsPower.supply();

            System.out.println();

            Battery battery = new Battery();
            battery.supply();
            battery.recharge(power);
            battery.recharge(null);

            System.out.println("-----------------------------");
            Message message = new Message();
            message.deliver();

            System.out.println();

            Message messengerAsMessage = new Messenger(); // Runtime polymorphism
            messengerAsMessage.deliver();

            System.out.println();

            Messenger messenger = new Messenger();
            messenger.deliver();
            messenger.track(message);
            messenger.track(null);

            System.out.println("-----------------------------");
            Notification notification = new Notification();
            notification.alert();

            System.out.println();

            Notification appAsNotification = new App(); // Runtime polymorphism
            appAsNotification.alert();

            System.out.println();

            App app = new App();
            app.alert();
            app.display(notification);
            app.display(null);

            System.out.println("-----------------------------");
            Design design = new Design();
            design.create();

            System.out.println();

            Design softwareAsDesign = new Software(); // Runtime polymorphism
            softwareAsDesign.create();

            System.out.println();

            Software software = new Software();
            software.create();
            software.export(design);
            software.export(null);

            System.out.println("-----------------------------");
            Story story = new Story();
            story.write();

            System.out.println();

            Story editorAsStory = new Editor(); // Runtime polymorphism
            editorAsStory.write();

            System.out.println();

            Editor editor = new Editor();
            editor.write();
            editor.review(story);
            editor.review(null);

            System.out.println("-----------------------------");
            Podcast podcast = new Podcast();
            podcast.stream();

            System.out.println();

            Podcast hostAsPodcast = new Host(); // Runtime polymorphism
            hostAsPodcast.stream();

            System.out.println();

            Host host = new Host();
            host.stream();
            host.introduce(podcast);
            host.introduce(null);

            System.out.println("-----------------------------");
            Report report = new Report();
            report.generate();

            System.out.println();

            Report analystAsReport = new Analyst(); // Runtime polymorphism
            analystAsReport.generate();

            System.out.println();

            Analyst analyst = new Analyst();
            analyst.generate();
            analyst.analyze(report);
            analyst.analyze(null);

            System.out.println("-----------------------------");
            Invoice invoice = new Invoice();
            invoice.process();

            System.out.println();

            Invoice accountantAsInvoice = new Accountant(); // Runtime polymorphism
            accountantAsInvoice.process();

            System.out.println();

            Accountant accountant = new Accountant();
            accountant.process();
            accountant.audit(invoice);
            accountant.audit(null);

            System.out.println("-----------------------------");
            Bill bill = new Bill();
            bill.print();

            System.out.println();

            Bill cashierAsBill = new Cashier(); // Runtime polymorphism
            cashierAsBill.print();

            System.out.println();

            Cashier cashier = new Cashier();
            cashier.print();
            cashier.scan(bill);
            cashier.scan(null);

            System.out.println("-----------------------------");
            Order order = new Order();
            order.prepare();

            System.out.println();

            Order chefAsOrder = new Chef(); // Runtime polymorphism
            chefAsOrder.prepare();

            System.out.println();

            Chef chef = new Chef();
            chef.prepare();
            chef.cook(order);
            chef.cook(null);

            System.out.println("-----------------------------");
            Menu menu = new Menu();
            menu.display();

            System.out.println();

            Menu waiterAsMenu = new Waiter(); // Runtime polymorphism
            waiterAsMenu.display();

            System.out.println();

            Waiter waiter = new Waiter();
            waiter.display();
            waiter.takeOrder(menu);
            waiter.takeOrder(null);

            System.out.println("-----------------------------");
            Dessert dessert = new Dessert();
            dessert.serve();

            System.out.println();

            Dessert chefAsDessert = new PastryChef(); // Runtime polymorphism
            chefAsDessert.serve();

            System.out.println();

            PastryChef chef1 = new PastryChef();
            chef1.serve();
            chef1.decorate(dessert);
            chef1.decorate(null);

            System.out.println("-----------------------------");
            Noodle noodle = new Noodle();
            noodle.cook();

            System.out.println();

            Noodle chefAsNoodle = new WokChef(); // Runtime polymorphism
            chefAsNoodle.cook();

            System.out.println();

            WokChef chef2 = new WokChef();
            chef2.cook();
            chef2.toss(noodle);
            chef2.toss(null);

            System.out.println("-----------------------------");
            Grill grill = new Grill();
            grill.heatUp();

            System.out.println();

            Grill cookAsGrill = new Cook(); // Runtime polymorphism
            cookAsGrill.heatUp();

            System.out.println();

            Cook cook = new Cook();
            cook.heatUp();
            cook.grillFood(grill);
            cook.grillFood(null);

            System.out.println("-----------------------------");
            Canvas canvas = new Canvas();
            canvas.display();

            System.out.println();

            Canvas artistAsCanvas = new Artist(); // Runtime polymorphism
            artistAsCanvas.display();

            System.out.println();

            Artist artist = new Artist();
            artist.display();
            artist.paint(canvas);
            artist.paint(null);

            System.out.println("-----------------------------");
            Plant plant = new Plant();
            plant.grow();

            System.out.println();

            Plant gardenerAsPlant = new Gardener(); // Runtime polymorphism
            gardenerAsPlant.grow();

            System.out.println();

            Gardener gardener = new Gardener();
            gardener.grow();
            gardener.water(plant);
            gardener.water(null);

            System.out.println("-----------------------------");
            Brush brush = new Brush();
            brush.use();

            System.out.println();

            Brush painterAsBrush = new Painter(); // Runtime polymorphism
            painterAsBrush.use();

            System.out.println();

            Painter painter = new Painter();
            painter.use();
            painter.dipInPaint(brush);
            painter.dipInPaint(null);

            System.out.println("-----------------------------");
            Ship ship = new Ship();
            ship.sail();

            System.out.println();

            Ship captainAsShip = new Captain(); // Runtime polymorphism
            captainAsShip.sail();

            System.out.println();

            Captain captain = new Captain();
            captain.sail();
            captain.navigate(ship);
            captain.navigate(null);

            System.out.println("-----------------------------");
            Computer computer = new Computer();
            computer.boot();

            System.out.println();

            Computer programmerAsComputer = new Programmer(); // Runtime polymorphism
            programmerAsComputer.boot();

            System.out.println();

            Programmer programmer = new Programmer();
            programmer.boot();
            programmer.writeCode(computer);
            programmer.writeCode(null);

            System.out.println("-----------------------------");
            Ticket ticket = new Ticket();
            ticket.validate();

            System.out.println();

            Ticket passengerAsTicket = new Passenger(); // Runtime polymorphism
            passengerAsTicket.validate();

            System.out.println();

            Passenger passenger = new Passenger();
            passenger.validate();
            passenger.board(ticket);
            passenger.board(null);

            System.out.println("-----------------------------");
            Machine machines = new Machine();
            machines.operate();

            System.out.println();

            Machine operatorAsMachine = new Operator(); // Runtime polymorphism
            operatorAsMachine.operate();

            System.out.println();

            Operator operator = new Operator();
            operator.operate();
            operator.maintain(machines);
            operator.maintain(null);

            System.out.println("-----------------------------");
            Room room = new Room();
            room.clean();

            System.out.println();

            Room cleanerAsRoom = new Cleaner(); // Runtime polymorphism
            cleanerAsRoom.clean();

            System.out.println();

            Cleaner cleaner = new Cleaner();
            cleaner.clean();
            cleaner.mop(room);
            cleaner.mop(null);

            System.out.println("-----------------------------");
            Employee employee = new Employee();
            employee.work();

            System.out.println();

            Employee managerAsEmployee = new Manager(); // Runtime polymorphism
            managerAsEmployee.work();

            System.out.println();

            Manager manager = new Manager();
            manager.work();
            manager.manage(employee);
            manager.manage(null);

            System.out.println("-----------------------------");
            House house = new House();
            house.clean();

            System.out.println();

            House cleaningAsHouse = new Cleaning(); // Runtime polymorphism
            cleaningAsHouse.clean();

            System.out.println();

            Cleaning cleaning = new Cleaning();
            cleaning.clean();
            cleaning.sanitize(house);
            cleaning.sanitize(null);

            System.out.println("-----------------------------");
            Library library = new Library();
            library.organize();

            System.out.println();

            Library librarianAsLibrary = new Librarian(); // Runtime polymorphism
            librarianAsLibrary.organize();

            System.out.println();

            Librarian librarian = new Librarian();
            librarian.organize();
            librarian.manage(library);
            librarian.manage(null);

            System.out.println("-----------------------------");
            Beautiful beautiful = new Beautiful();
            beautiful.showBeauty();

            System.out.println();

            Beautiful up = new Flower(); // Upcasting
            up.showBeauty();

            System.out.println();

            Flower flower = new Flower();
            flower.showBeauty();
            flower.scent(beautiful);
            flower.scent(null);

            System.out.println("-----------------------------");
            Keyboard keyboard = new Keyboard();
            keyboard.type();

            System.out.println();

            Keyboard keyboard1 = new MechanicalKeyboard(); // Upcasting
            keyboard1.type();

            System.out.println();

            MechanicalKeyboard mechanicalKeyboard = new MechanicalKeyboard();
            mechanicalKeyboard.type();
            mechanicalKeyboard.soundQuality(keyboard1);
            mechanicalKeyboard.soundQuality(null);

            System.out.println("-----------------------------");
            // Creating an instance of the base class Headphones
            Headphones wiredHeadphones = new Headphones();
            wiredHeadphones.connect();

            System.out.println();

            // Creating an upcasted instance of BluetoothHeadphones
            Headphones wirelessHeadphones = new BluetoothHeadphones(); // Upcasting
            wirelessHeadphones.connect();

            System.out.println();

            // Creating an instance of BluetoothHeadphones and calling extra method
            BluetoothHeadphones bluetoothHeadphones = new BluetoothHeadphones();
            bluetoothHeadphones.connect();
            bluetoothHeadphones.batteryLife(wiredHeadphones);
            bluetoothHeadphones.batteryLife(null);

            System.out.println("-----------------------------");
            // Creating an instance of the base class SafetyPin
            SafetyPin basicSafetyPin = new SafetyPin();
            basicSafetyPin.lock();

            System.out.println();

            // Creating an upcasted instance of ChildSafetyPin
            SafetyPin childSafetyPin = new ChildSafetyPin(); // Upcasting
            childSafetyPin.lock();

            System.out.println();

            // Creating an instance of ChildSafetyPin and calling extra method
            ChildSafetyPin safetyPin = new ChildSafetyPin();
            safetyPin.lock();
            safetyPin.secure(basicSafetyPin);
            safetyPin.secure(null);

            System.out.println("-----------------------------");
            // Creating an instance of the base class Rubber
            Rubber basicRubber = new Rubber();
            basicRubber.use();

            System.out.println();

            // Creating an upcasted instance of EraserRubber
            Rubber eraserRubber = new EraserRubber(); // Upcasting
            eraserRubber.use();

            System.out.println();

            // Creating an instance of EraserRubber and calling the extra method
            EraserRubber eraser = new EraserRubber();
            eraser.use();
            eraser.clean(basicRubber);
            eraser.clean(null);

            System.out.println("-----------------------------");
            Pencil basicPencil = new Pencil();
            basicPencil.usage();

            System.out.println();

            // Creating an upcasted instance of ColoredPencil
            Pencil coloredPencil = new ColoredPencil(); // Upcasting
            coloredPencil.usage();

            System.out.println();

            // Creating an instance of ColoredPencil and calling the extra method
            ColoredPencil coloredPencilObj = new ColoredPencil();
            coloredPencilObj.usage();
            coloredPencilObj.sharpen(basicPencil);
            coloredPencilObj.sharpen(null);

            System.out.println("-----------------------------");
            Moon basicMoon = new Moon();
            basicMoon.shine();

            System.out.println();

            // Creating an upcasted instance of FullMoon
            Moon fullMoon = new FullMoon(); // Upcasting
            fullMoon.shine();

            System.out.println();

            // Creating an instance of FullMoon and calling the extra method
            FullMoon fullMoonObj = new FullMoon();
            fullMoonObj.shine();
            fullMoonObj.rise(basicMoon);
            fullMoonObj.rise(null);

            System.out.println("-----------------------------");
            Dosa dosa = new Dosa();
            dosa.taste();

            System.out.println();

            Dosa masala = new MasalaDosa(); // Upcasting
            masala.taste();

            System.out.println();

            MasalaDosa masalaDosa = new MasalaDosa();
            masalaDosa.taste();
            masalaDosa.serve(dosa);
            masalaDosa.serve(null);

            System.out.println("-----------------------------");
            Champakali champakali = new Champakali();
            champakali.taste();

            System.out.println();

            Champakali upgraded = new DryFruitChampakali(); // Upcasting
            upgraded.taste();

            System.out.println();

            DryFruitChampakali dry = new DryFruitChampakali();
            dry.taste();
            dry.serve(champakali);
            dry.serve(null);

            System.out.println("-----------------------------");
            Wheat wheat = new Wheat();
            wheat.grind();

            System.out.println();

            Wheat wheatref = new OrganicWheat(); // Upcasting
            wheatref.grind();

            System.out.println();

            OrganicWheat organic = new OrganicWheat();
            organic.grind();
            organic.store(wheat);
            organic.store(null);

            System.out.println("-----------------------------");
            Jasmine jasmine = new Jasmine();
            jasmine.fragrance();

            System.out.println();

            Jasmine jasminePolymorphic = new WildJasmine(); // Upcasting
            jasminePolymorphic.fragrance();

            System.out.println();

            WildJasmine wild = new WildJasmine();
            wild.fragrance();
            wild.bloom(jasmine);
            wild.bloom(null);

            System.out.println("-----------------------------");
            Carrot carrot = new Carrot();
            carrot.taste();

            System.out.println();

            Carrot carrot1 = new Vegitable(); // Upcasting
            carrot1.taste();

            System.out.println();

            Vegitable vegitable = new Vegitable();
            vegitable.taste();
            vegitable.nutrition(carrot);
            vegitable.nutrition(null);

            System.out.println("-----------------------------");
            Oil oil = new Oil();
            oil.use();

            System.out.println();

            Oil coconut = new CoconutOil(); // Upcasting
            coconut.use();

            System.out.println();

            CoconutOil coconutOil = new CoconutOil();
            coconutOil.use();
            coconutOil.benefits(oil);
            coconutOil.benefits(null);

            System.out.println("-----------------------------");
            Dairy dairy = new Dairy();
            dairy.produce();

            System.out.println();

            Dairy dairy1 = new MilkDairy(); // Upcasting
            dairy1.produce();

            System.out.println();

            MilkDairy milkDairy = new MilkDairy();
            milkDairy.produce();
            milkDairy.supply(dairy);
            milkDairy.supply(null);

            System.out.println("-----------------------------");

            CurlyHair curlyHair = new CurlyHair();
            curlyHair.look();

            System.out.println();

            CurlyHair styled = new StyledCurlyHair(); // Upcasting
            styled.look();

            System.out.println();

            StyledCurlyHair styledCurly = new StyledCurlyHair();
            styledCurly.look();
            styledCurly.shine(curlyHair);
            styledCurly.shine(null);

            System.out.println("-----------------------------");
            Dog dog = new Dog();
            dog.bark();

            System.out.println();

            Dog shihTzuAsDog = new ShihTzu(); // Upcasting
            shihTzuAsDog.bark();

            System.out.println();

            ShihTzu realShihTzu = new ShihTzu();
            realShihTzu.bark();
            realShihTzu.cuddle(dog);
            realShihTzu.cuddle(null);

            System.out.println("-----------------------------");



        }

        }


