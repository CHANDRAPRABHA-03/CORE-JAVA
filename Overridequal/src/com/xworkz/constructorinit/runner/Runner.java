package com.xworkz.constructorinit.runner;

import com.xworkz.constructorinit.internal.*;

public class Runner {
    public static void main(String[] args) {
        Marker mark1 = new Marker("Red",50,"Fabercastel",90);
        Marker mark2 = new Marker("Pink",60,"Apsara",70);
        Marker mark3 = new Marker("Orange",20,"Nataraja",100);

        Marker mark4 = new Marker("Orange",20,"Nataraja",100);

        boolean match = mark3.equals(mark4);
        boolean matchh = mark1.equals(mark2);
        boolean notMatch = mark3.equals(mark2);
        System.out.println("Marker not match :"+notMatch);

        Cake cake1 = new Cake("Vanilla", 2, "Round", "White");
        Cake cake2 = new Cake("Chocolate", 3, "Square", "Brown");
        Cake cake3 = new Cake("Chocolate", 3, "Square", "Brown");
        boolean ma = cake2.equals(cake3);
        boolean nun = cake1.equals(cake3);
        System.out.println("Cake match: " +ma);
        System.out.println("Cake not match: " + nun);
        System.out.println("-----------------------------------------------");

        Pencil pencil1 = new Pencil("Apsara", "Black", 10.0, true);
        Pencil pencil2 = new Pencil("Nataraj", "Red", 8.0, false);
        Pencil pencil3 = new Pencil("Nataraj", "Red", 8.0, false);

        boolean equal = pencil2.equals(pencil3);
        boolean not = pencil1.equals(pencil3);

        System.out.println("Pencil match: " + equal);
        System.out.println("Pencil not match: " + not);
        System.out.println("-----------------------------------------------");

        Banana b1 = new Banana();
        b1.setType("Cavendish");
        b1.setOrigin("India");
        b1.setPrice(10.5);
        b1.setRipe(true);

        Banana b2 = new Banana();
        b2.setType("Cavendish");
        b2.setOrigin("India");
        b2.setPrice(10.5);
        b2.setRipe(true);

        Banana b3 = new Banana();
        b3.setType("Red Banana");
        b3.setOrigin("Kerala");
        b3.setPrice(15.0);
        b3.setRipe(false);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        boolean bananamatch = b1.equals(b2);      // true
        boolean banananotMatch = b2.equals(b3);   // false

        System.out.println("Banana match result: " + bananamatch);
        System.err.println("Banana not match result: " + banananotMatch);

        Bike yamaha1 = new Bike();
        yamaha1.setBrand("Yamaha");
        yamaha1.setColor("Blue");
        yamaha1.setEngineCC(150);
        yamaha1.setPrice(95000.0);

        Bike yamaha2 = new Bike();
        yamaha2.setBrand("Yamaha");
        yamaha2.setColor("Blue");
        yamaha2.setEngineCC(150);
        yamaha2.setPrice(95000.0);

        Bike royal = new Bike();
        royal.setBrand("Royal Enfield");
        royal.setColor("Black");
        royal.setEngineCC(350);
        royal.setPrice(180000.0);

        System.out.println(yamaha1);
        System.out.println(yamaha2);
        System.out.println(royal);

        boolean bikematch = yamaha1.equals(yamaha2);      // true
        boolean bikenotMatch = yamaha2.equals(royal);     // false

        System.out.println("Bike match result: " + bikematch);
        System.err.println("Bike not match result: " + bikenotMatch);
        System.out.println("-----------------------------------------------");

        Earphone earphone1 = new Earphone("Boat", "In-Ear", true, 1499.0);
        Earphone earphone2 = new Earphone("JBL", "Over-Ear", false, 1999.0);
        Earphone earphone3 = new Earphone("JBL", "Over-Ear", false, 1999.0);

        boolean ear = earphone2.equals(earphone3);
        boolean notear = earphone1.equals(earphone3);

        System.out.println("Earphone match: " + ear);
        System.out.println("Earphone not match: " + notear);
        System.out.println("-----------------------------------------------");
        Coco coco1 = new Coco("Tender", "Kerala", 1.2, true);
        Coco coco2 = new Coco("Mature", "Sri Lanka", 1.5, false);
        Coco coco3 = new Coco("Mature", "Sri Lanka", 1.5, false);

        boolean co= coco2.equals(coco3);
        boolean naco = coco1.equals(coco3);

        System.out.println("Coco match: " + co);
        System.out.println("Coco not match: " + naco);
        System.out.println("-----------------------------------------------");

        Chikku chikku1 = new Chikku("Kalipatti", "Tamil Nadu", 0.25, true);
        Chikku chikku2 = new Chikku("Dwarapudi", "Andhra Pradesh", 0.3, false);
        Chikku chikku3 = new Chikku("Dwarapudi", "Andhra Pradesh", 0.3, false);

        boolean chi = chikku2.equals(chikku3);
        boolean nochi = chikku1.equals(chikku3);

        System.out.println("Chikku match: " + chi);
        System.out.println("Chikku not match: " + nochi);
        System.out.println("-----------------------------------------------");

        Peacock peacock1 = new Peacock("Green", "Indian", 5.0, true);
        Peacock peacock2 = new Peacock("Blue", "Ceylon", 4.5, false);
        Peacock peacock3 = new Peacock("Blue", "Ceylon", 4.5, false);
        Peacock peacock4 = new Peacock("Purple", "African", 4.8, true);

        boolean isSamePeacock = peacock2.equals(peacock3);
        boolean isDifferentPeacock = peacock1.equals(peacock4);
        boolean arePeacocksEqual = peacock3.equals(peacock4);

        System.out.println("Peacock 2 matches Peacock 3: " + isSamePeacock);
        System.out.println("Peacock 1 does not match Peacock 4: " + isDifferentPeacock);
        System.out.println("Peacock 3 matches Peacock 4: " + arePeacocksEqual);
        System.out.println("-----------------------------------------------");

        Pumpkin pumpkin1 = new Pumpkin("Winter", "Orange", 2.5, true);
        Pumpkin pumpkin2 = new Pumpkin("Summer", "Yellow", 3.0, false);
        Pumpkin pumpkin3 = new Pumpkin("Summer", "Yellow", 3.0, false);
        Pumpkin pumpkin4 = new Pumpkin("Autumn", "Green", 2.8, true);

        boolean isEqualPumpkin = pumpkin2.equals(pumpkin3);
        boolean isDifferentPumpkin = pumpkin1.equals(pumpkin4);
        boolean arePumpkinsMatching = pumpkin3.equals(pumpkin4);

        System.out.println("Pumpkin 2 matches Pumpkin 3: " + isEqualPumpkin);
        System.out.println("Pumpkin 1 does not match Pumpkin 4: " + isDifferentPumpkin);
        System.out.println("Pumpkin 3 matches Pumpkin 4: " + arePumpkinsMatching);
        System.out.println("-----------------------------------------------");

        Ginger ginger1 = new Ginger("Organic", "India", 0.5, true);
        Ginger ginger2 = new Ginger("Non-Organic", "China", 0.4, false);
        Ginger ginger3 = new Ginger("Non-Organic", "China", 0.4, false);
        Ginger ginger4 = new Ginger("Wild", "Indonesia", 0.6, true);

        boolean isGingerEqual = ginger2.equals(ginger3);
        boolean isGingerDifferent = ginger1.equals(ginger4);
        boolean areGingersMatching = ginger3.equals(ginger4);

        System.out.println("Ginger 2 matches Ginger 3: " + isGingerEqual);
        System.out.println("Ginger 1 does not match Ginger 4: " + isGingerDifferent);
        System.out.println("Ginger 3 matches Ginger 4: " + areGingersMatching);
        System.out.println("-----------------------------------------------");

        Cucumber cucumber1 = new Cucumber("English", "Green", 0.3, true);
        Cucumber cucumber2 = new Cucumber("Japanese", "Light Green", 0.35, false);
        Cucumber cucumber3 = new Cucumber("Japanese", "Light Green", 0.35, false);
        Cucumber cucumber4 = new Cucumber("Indian", "Dark Green", 0.4, true);

        boolean isCucumberEqual = cucumber2.equals(cucumber3);
        boolean isCucumberDifferent = cucumber1.equals(cucumber4);
        boolean areCucumbersMatching = cucumber3.equals(cucumber4);

        System.out.println("Cucumber 2 matches Cucumber 3: " + isCucumberEqual);
        System.out.println("Cucumber 1 does not match Cucumber 4: " + isCucumberDifferent);
        System.out.println("Cucumber 3 matches Cucumber 4: " + areCucumbersMatching);
        System.out.println("-----------------------------------------------");

        Mint mint1 = new Mint("Peppermint", "Green", 0.2, true);
        Mint mint2 = new Mint("Spearmint", "Light Green", 0.25, false);
        Mint mint3 = new Mint("Spearmint", "Light Green", 0.25, false);
        Mint mint4 = new Mint("Wild Mint", "Dark Green", 0.3, true);

        boolean isMintEqual = mint2.equals(mint3);
        boolean isMintDifferent = mint1.equals(mint4);
        boolean areMintsMatching = mint3.equals(mint4);

        System.out.println("Mint 2 matches Mint 3: " + isMintEqual);
        System.out.println("Mint 1 does not match Mint 4: " + isMintDifferent);
        System.out.println("Mint 3 matches Mint 4: " + areMintsMatching);
        System.out.println("-----------------------------------------------");

        Twinkle twinkle1 = new Twinkle("Red Giant", "Red", 0.8, true);
        Twinkle twinkle2 = new Twinkle("White Dwarf", "White", 0.9, false);
        Twinkle twinkle3 = new Twinkle("White Dwarf", "White", 0.9, false);
        Twinkle twinkle4 = new Twinkle("Supernova", "Blue", 1.0, true);

        boolean isTwinkleEqual = twinkle2.equals(twinkle3);
        boolean isTwinkleDifferent = twinkle1.equals(twinkle4);
        boolean areTwinklesMatching = twinkle3.equals(twinkle4);

        System.out.println("Twinkle 2 matches Twinkle 3: " + isTwinkleEqual);
        System.out.println("Twinkle 1 does not match Twinkle 4: " + isTwinkleDifferent);
        System.out.println("Twinkle 3 matches Twinkle 4: " + areTwinklesMatching);
        System.out.println("-----------------------------------------------");

        Watermelon watermelon1 = new Watermelon("Seedless", "Green", 5.0, true);
        Watermelon watermelon2 = new Watermelon("Citrullus", "Yellow", 6.5, false);
        Watermelon watermelon3 = new Watermelon("Citrullus", "Yellow", 6.5, false);
        Watermelon watermelon4 = new Watermelon("Oblong", "Dark Green", 7.0, true);

        boolean isWatermelonEqual = watermelon2.equals(watermelon3);
        boolean isWatermelonDifferent = watermelon1.equals(watermelon4);
        boolean areWatermelonsMatching = watermelon3.equals(watermelon4);

        System.out.println("Watermelon 2 matches Watermelon 3: " + isWatermelonEqual);
        System.out.println("Watermelon 1 does not match Watermelon 4: " + isWatermelonDifferent);
        System.out.println("Watermelon 3 matches Watermelon 4: " + areWatermelonsMatching);
        System.out.println("-----------------------------------------------");

        Syrup syrup1 = new Syrup("Maple", "Amber", 250.0, false);
        Syrup syrup2 = new Syrup("Blueberry", "Blue", 200.0, true);
        Syrup syrup3 = new Syrup("Blueberry", "Blue", 200.0, true);
        Syrup syrup4 = new Syrup("Strawberry", "Red", 300.0, false);

        boolean isSyrupEqual = syrup2.equals(syrup3);
        boolean isSyrupDifferent = syrup1.equals(syrup4);
        boolean areSyrupsMatching = syrup3.equals(syrup4);

        System.out.println("Syrup 2 matches Syrup 3: " + isSyrupEqual);
        System.out.println("Syrup 1 does not match Syrup 4: " + isSyrupDifferent);
        System.out.println("Syrup 3 matches Syrup 4: " + areSyrupsMatching);
        System.out.println("-----------------------------------------------");

        Tablet tablet1 = new Tablet("Apple", "iPad Pro", 12.9, true);
        Tablet tablet2 = new Tablet("Samsung", "Galaxy Tab", 10.5, true);
        Tablet tablet3 = new Tablet("Samsung", "Galaxy Tab", 10.5, true);
        Tablet tablet4 = new Tablet("Lenovo", "Yoga Tab", 8.0, false);

        boolean isTabletEqual = tablet2.equals(tablet3);
        boolean isTabletDifferent = tablet1.equals(tablet4);
        boolean areTabletsMatching = tablet3.equals(tablet4);

        System.out.println("Tablet 2 matches Tablet 3: " + isTabletEqual);
        System.out.println("Tablet 1 does not match Tablet 4: " + isTabletDifferent);
        System.out.println("Tablet 3 matches Tablet 4: " + areTabletsMatching);
        System.out.println("-----------------------------------------------");

        Mango mango1 = new Mango("Alphonso", "Yellow", 1.2, true);
        Mango mango2 = new Mango("Kesar", "Orange", 1.1, false);
        Mango mango3 = new Mango("Kesar", "Orange", 1.1, false);
        Mango mango4 = new Mango("Langra", "Green", 1.4, true);

        boolean isMangoEqual = mango2.equals(mango3);
        boolean isMangoDifferent = mango1.equals(mango4);
        boolean areMangosMatching = mango3.equals(mango4);

        System.out.println("Mango 2 matches Mango 3: " + isMangoEqual);
        System.out.println("Mango 1 does not match Mango 4: " + isMangoDifferent);
        System.out.println("Mango 3 matches Mango 4: " + areMangosMatching);
        System.out.println("-----------------------------------------------");

        Mouse mouse1 = new Mouse("Logitech", "Optical", 0.3, true);
        Mouse mouse2 = new Mouse("HP", "Wireless", 0.2, true);
        Mouse mouse3 = new Mouse("HP", "Wireless", 0.2, true);
        Mouse mouse4 = new Mouse("Dell", "Wired", 0.25, false);

        boolean isMouseEqual = mouse2.equals(mouse3);
        boolean isMouseDifferent = mouse1.equals(mouse4);
        boolean areMiceMatching = mouse3.equals(mouse4);

        System.out.println("Mouse 2 matches Mouse 3: " + isMouseEqual);
        System.out.println("Mouse 1 does not match Mouse 4: " + isMouseDifferent);
        System.out.println("Mouse 3 matches Mouse 4: " + areMiceMatching);
        System.out.println("-----------------------------------------------");

        Pineapple pineapple1 = new Pineapple("Queen", "Yellow", 1.5, true);
        Pineapple pineapple2 = new Pineapple("Red Spanish", "Yellow", 1.3, false);
        Pineapple pineapple3 = new Pineapple("Red Spanish", "Yellow", 1.3, false);
        Pineapple pineapple4 = new Pineapple("Variegated", "Green", 1.8, true);

        boolean isPineappleEqual = pineapple2.equals(pineapple3);
        boolean isPineappleDifferent = pineapple1.equals(pineapple4);
        boolean arePineapplesMatching = pineapple3.equals(pineapple4);

        System.out.println("Pineapple 2 matches Pineapple 3: " + isPineappleEqual);
        System.out.println("Pineapple 1 does not match Pineapple 4: " + isPineappleDifferent);
        System.out.println("Pineapple 3 matches Pineapple 4: " + arePineapplesMatching);
        System.out.println("-----------------------------------------------");

        Jackfruit jackfruit1 = new Jackfruit("Chakkarakeli", "Yellow", 10.0, true);
        Jackfruit jackfruit2 = new Jackfruit("Kochi", "Green", 12.0, false);
        Jackfruit jackfruit3 = new Jackfruit("Kochi", "Green", 12.0, false);
        Jackfruit jackfruit4 = new Jackfruit("Variegated", "Yellow", 9.5, true);

        boolean isJackfruitEqual = jackfruit2.equals(jackfruit3);
        boolean isJackfruitDifferent = jackfruit1.equals(jackfruit4);
        boolean areJackfruitsMatching = jackfruit3.equals(jackfruit4);

        System.out.println("Jackfruit 2 matches Jackfruit 3: " + isJackfruitEqual);
        System.out.println("Jackfruit 1 does not match Jackfruit 4: " + isJackfruitDifferent);
        System.out.println("Jackfruit 3 matches Jackfruit 4: " + areJackfruitsMatching);
        System.out.println("-----------------------------------------------");

        Carrot carrot1 = new Carrot("Nantes", "Orange", 0.25, true);
        Carrot carrot2 = new Carrot("Imperator", "Orange", 0.3, true);
        Carrot carrot3 = new Carrot("Imperator", "Orange", 0.3, true);
        Carrot carrot4 = new Carrot("Danvers", "Purple", 0.2, false);

        boolean isCarrotEqual = carrot2.equals(carrot3);
        boolean isCarrotDifferent = carrot1.equals(carrot4);
        boolean areCarrotsMatching = carrot3.equals(carrot4);

        System.out.println("Carrot 2 matches Carrot 3: " + isCarrotEqual);
        System.out.println("Carrot 1 does not match Carrot 4: " + isCarrotDifferent);
        System.out.println("Carrot 3 matches Carrot 4: " + areCarrotsMatching);
        System.out.println("-----------------------------------------------");

        Beans beans = new Beans();
        beans.setVariety("French Beans");
        beans.setColor("Green");
        beans.setWeight(0.5);
        beans.setFresh(true);

        Beans beans2 = new Beans();
        beans2.setVariety("French Beans");
        beans2.setColor("Green");
        beans2.setWeight(0.5);
        beans2.setFresh(true);

        Beans beans3 = new Beans();
        beans3.setVariety("Black Beans");
        beans3.setColor("Black");
        beans3.setWeight(1.0);
        beans3.setFresh(false);

        System.out.println(beans);
        System.out.println(beans2);
        System.out.println(beans3);

        boolean beansmatch = beans.equals(beans2);      // true
        boolean beansnotMatch = beans2.equals(beans3);   // false

        System.out.println("Beans match result: " + beansmatch);
        System.err.println("Beans not match result: " + beansnotMatch);
        System.out.println("-----------------------------------------------");

        Sesam sesam1 = new Sesam("Black", "Black", 0.2, true);
        Sesam sesam2 = new Sesam("White", "White", 0.15, false);
        Sesam sesam3 = new Sesam("White", "White", 0.15, false);
        Sesam sesam4 = new Sesam("Brown", "Brown", 0.25, true);

        boolean isSesamEqual = sesam2.equals(sesam3);
        boolean isSesamDifferent = sesam1.equals(sesam4);
        boolean areSesamsMatching = sesam3.equals(sesam4);

        System.out.println("Sesam 2 matches Sesam 3: " + isSesamEqual);
        System.out.println("Sesam 1 does not match Sesam 4: " + isSesamDifferent);
        System.out.println("Sesam 3 matches Sesam 4: " + areSesamsMatching);
        System.out.println("-----------------------------------------------");

        Color color1 = new Color("Red", "#FF0000", 255, true);
        Color color2 = new Color("Green", "#00FF00", 65280, true);
        Color color3 = new Color("Green", "#00FF00", 65280, true);
        Color color4 = new Color("Blue", "#0000FF", 255, true);

        boolean isColorEqual = color2.equals(color3);
        boolean isColorDifferent = color1.equals(color4);
        boolean areColorsMatching = color3.equals(color4);

        System.out.println("Color 2 matches Color 3: " + isColorEqual);
        System.out.println("Color 1 does not match Color 4: " + isColorDifferent);
        System.out.println("Color 3 matches Color 4: " + areColorsMatching);
        System.out.println("-----------------------------------------------");

        Icon icon1 = new Icon("Home", "🏠", "Blue", true);
        Icon icon2 = new Icon("Search", "🔍", "Black", false);
        Icon icon3 = new Icon("Search", "🔍", "Black", false);
        Icon icon4 = new Icon("Settings", "⚙️", "Gray", true);

        boolean isIconEqual = icon2.equals(icon3);
        boolean isIconDifferent = icon1.equals(icon4);
        boolean areIconsMatching = icon3.equals(icon4);

        System.out.println("Icon 2 matches Icon 3: " + isIconEqual);
        System.out.println("Icon 1 does not match Icon 4: " + isIconDifferent);
        System.out.println("Icon 3 matches Icon 4: " + areIconsMatching);
        System.out.println("-----------------------------------------------");

        Apple a1 = new Apple();
        a1.setVariety("Fuji");
        a1.setColor("Red");
        a1.setWeight(0.25);
        a1.setIsFresh(true);

        Apple a2 = new Apple();
        a2.setVariety("Fuji");
        a2.setColor("Red");
        a2.setWeight(0.25);
        a2.setIsFresh(true);

        Apple a3 = new Apple();
        a3.setVariety("Granny Smith");
        a3.setColor("Green");
        a3.setWeight(0.3);
        a3.setIsFresh(false);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        boolean applematch = a1.equals(a2);      // true
        boolean applenotMatch = a2.equals(a3);   // false

        System.out.println("Apple match result: " + applematch);
        System.err.println("Apple not match result: " + applenotMatch);

        Milk milk1 = new Milk("Cow", 2.0, 3.5, true);
        Milk milk2 = new Milk("Almond", 1.5, 1.0, true);
        Milk milk3 = new Milk("Almond", 1.5, 1.0, true);
        Milk milk4 = new Milk("Goat", 1.0, 4.0, false);

        boolean isMilkEqual = milk2.equals(milk3);
        boolean isMilkDifferent = milk1.equals(milk4);
        boolean areMilksMatching = milk3.equals(milk4);

        System.out.println("Milk 2 matches Milk 3: " + isMilkEqual);
        System.out.println("Milk 1 does not match Milk 4: " + isMilkDifferent);
        System.out.println("Milk 3 matches Milk 4: " + areMilksMatching);
        System.out.println("-----------------------------------------------");

        Powder powder1 = new Powder("Baby Powder", 100.0, "Lavender", true);
        Powder powder2 = new Powder("Face Powder", 50.0, "Rose", false);
        Powder powder3 = new Powder("Face Powder", 50.0, "Rose", false);
        Powder powder4 = new Powder("Talc Powder", 120.0, "Unscented", true);

        boolean isPowderEqual = powder2.equals(powder3);
        boolean isPowderDifferent = powder1.equals(powder4);
        boolean arePowdersMatching = powder3.equals(powder4);

        System.out.println("Powder 2 matches Powder 3: " + isPowderEqual);
        System.out.println("Powder 1 does not match Powder 4: " + isPowderDifferent);
        System.out.println("Powder 3 matches Powder 4: " + arePowdersMatching);
        System.out.println("-----------------------------------------------");

        Perfume perfume1 = new Perfume("Chanel", "Floral", 100.0, true);
        Perfume perfume2 = new Perfume("Dior", "Citrus", 50.0, false);
        Perfume perfume3 = new Perfume("Dior", "Citrus", 50.0, false);
        Perfume perfume4 = new Perfume("Tom Ford", "Woody", 75.0, true);

        boolean isPerfumeEqual = perfume2.equals(perfume3);
        boolean isPerfumeDifferent = perfume1.equals(perfume4);
        boolean arePerfumesMatching = perfume3.equals(perfume4);

        System.out.println("Perfume 2 matches Perfume 3: " + isPerfumeEqual);
        System.out.println("Perfume 1 does not match Perfume 4: " + isPerfumeDifferent);
        System.out.println("Perfume 3 matches Perfume 4: " + arePerfumesMatching);
        System.out.println("-----------------------------------------------");

        Mobile mobile1 = new Mobile("Apple", "iPhone 13", 999.99, true);
        Mobile mobile2 = new Mobile("Samsung", "Galaxy S21", 799.99, true);
        Mobile mobile3 = new Mobile("Samsung", "Galaxy S21", 799.99, true);
        Mobile mobile4 = new Mobile("OnePlus", "9 Pro", 1069.99, true);

        boolean isMobileEqual = mobile2.equals(mobile3);
        boolean isMobileDifferent = mobile1.equals(mobile4);
        boolean areMobilesMatching = mobile3.equals(mobile4);

        System.out.println("Mobile 2 matches Mobile 3: " + isMobileEqual);
        System.out.println("Mobile 1 does not match Mobile 4: " + isMobileDifferent);
        System.out.println("Mobile 3 matches Mobile 4: " + areMobilesMatching);
        System.out.println("-----------------------------------------------");

        Purple purple1 = new Purple("Lavender", 0.8, true, "Nature");
        Purple purple2 = new Purple("Violet", 0.7, true, "Flower");
        Purple purple3 = new Purple("Violet", 0.7, true, "Flower");
        Purple purple4 = new Purple("Mauve", 0.9, false, "Synthetic");

        boolean isPurpleEqual = purple2.equals(purple3);
        boolean isPurpleDifferent = purple1.equals(purple4);
        boolean arePurplesMatching = purple3.equals(purple4);

        System.out.println("Purple 2 matches Purple 3: " + isPurpleEqual);
        System.out.println("Purple 1 does not match Purple 4: " + isPurpleDifferent);
        System.out.println("Purple 3 matches Purple 4: " + arePurplesMatching);
        System.out.println("-----------------------------------------------");

        Green green1 = new Green("Forest", 0.9, true, "Nature");
        Green green2 = new Green("Lime", 0.6, false, "Synthetic");
        Green green3 = new Green("Lime", 0.6, false, "Synthetic");
        Green green4 = new Green("Olive", 0.7, true, "Nature");

        boolean isGreenEqual = green2.equals(green3);
        boolean isGreenDifferent = green1.equals(green4);
        boolean areGreensMatching = green3.equals(green4);

        System.out.println("Green 2 matches Green 3: " + isGreenEqual);
        System.out.println("Green 1 does not match Green 4: " + isGreenDifferent);
        System.out.println("Green 3 matches Green 4: " + areGreensMatching);
        System.out.println("-----------------------------------------------");

        Germ germ1 = new Germ("Bacterial", 1.5, true, "Soil");
        Germ germ2 = new Germ("Viral", 0.2, true, "Air");
        Germ germ3 = new Germ("Viral", 0.2, true, "Air");
        Germ germ4 = new Germ("Fungal", 3.0, false, "Water");

        boolean isGermEqual = germ2.equals(germ3);
        boolean isGermDifferent = germ1.equals(germ4);
        boolean areGermsMatching = germ3.equals(germ4);

        System.out.println("Germ 2 matches Germ 3: " + isGermEqual);
        System.out.println("Germ 1 does not match Germ 4: " + isGermDifferent);
        System.out.println("Germ 3 matches Germ 4: " + areGermsMatching);
        System.out.println("-----------------------------------------------");

        Mosquito mosquito1 = new Mosquito("Anopheles", 1.2, true, "Tropical");
        Mosquito mosquito2 = new Mosquito("Aedes", 1.0, false, "Urban");
        Mosquito mosquito3 = new Mosquito("Aedes", 1.0, false, "Urban");
        Mosquito mosquito4 = new Mosquito("Culex", 1.5, false, "Suburban");

        boolean isMosquitoEqual = mosquito2.equals(mosquito3);
        boolean isMosquitoDifferent = mosquito1.equals(mosquito4);
        boolean areMosquitoesMatching = mosquito3.equals(mosquito4);

        System.out.println("Mosquito 2 matches Mosquito 3: " + isMosquitoEqual);
        System.out.println("Mosquito 1 does not match Mosquito 4: " + isMosquitoDifferent);
        System.out.println("Mosquito 3 matches Mosquito 4: " + areMosquitoesMatching);
        System.out.println("-----------------------------------------------");

        Rain rain1 = new Rain("Monsoon", 25.4, false, "Tropical");
        Rain rain2 = new Rain("Acidic", 18.0, true, "Urban");
        Rain rain3 = new Rain("Acidic", 18.0, true, "Urban");
        Rain rain4 = new Rain("Drizzle", 5.2, false, "Coastal");

        boolean isRainEqual = rain2.equals(rain3);
        boolean isRainDifferent = rain1.equals(rain4);
        boolean areRainsMatching = rain3.equals(rain4);

        System.out.println("Rain 2 matches Rain 3: " + isRainEqual);
        System.out.println("Rain 1 does not match Rain 4: " + isRainDifferent);
        System.out.println("Rain 3 matches Rain 4: " + areRainsMatching);
        System.out.println("-----------------------------------------------");

        Fox fox1 = new Fox("Red Fox", 6.5, "Red", "Woodlands");
        Fox fox2 = new Fox("Arctic Fox", 4.0, "White", "Arctic");
        Fox fox3 = new Fox("Arctic Fox", 4.0, "White", "Arctic");
        Fox fox4 = new Fox("Fennec Fox", 1.5, "Tan", "Desert");

        boolean isFoxEqual = fox2.equals(fox3);
        boolean isFoxDifferent = fox1.equals(fox4);
        boolean areFoxesMatching = fox3.equals(fox4);

        System.out.println("Fox 2 matches Fox 3: " + isFoxEqual);
        System.out.println("Fox 1 does not match Fox 4: " + isFoxDifferent);
        System.out.println("Fox 3 matches Fox 4: " + areFoxesMatching);
        System.out.println("-----------------------------------------------");

        Lion lion1 = new Lion("African Lion", 190.0, "Golden", "Savanna");
        Lion lion2 = new Lion("Asiatic Lion", 160.0, "Brown", "Grassland");
        Lion lion3 = new Lion("Asiatic Lion", 160.0, "Brown", "Grassland");
        Lion lion4 = new Lion("Mountain Lion", 120.0, "Light Brown", "Mountain");

        boolean isLionEqual = lion2.equals(lion3);
        boolean isLionDifferent = lion1.equals(lion4);
        boolean areLionsMatching = lion3.equals(lion4);

        System.out.println("Lion 2 matches Lion 3: " + isLionEqual);
        System.out.println("Lion 1 does not match Lion 4: " + isLionDifferent);
        System.out.println("Lion 3 matches Lion 4: " + areLionsMatching);
        System.out.println("-----------------------------------------------");

        Tiger tiger1 = new Tiger("Bengal Tiger", 220.5, "Dense", "Forest");
        Tiger tiger2 = new Tiger("Siberian Tiger", 300.0, "Sparse", "Taiga");
        Tiger tiger3 = new Tiger("Siberian Tiger", 300.0, "Sparse", "Taiga");
        Tiger tiger4 = new Tiger("Malayan Tiger", 120.0, "Moderate", "Rainforest");

        boolean doesTigerMatch = tiger2.equals(tiger3);
        boolean areTigersSame = tiger1.equals(tiger4);
        boolean tigerSimilarityCheck = tiger3.equals(tiger4);

        System.out.println("Tiger 2 matches Tiger 3: " + doesTigerMatch);
        System.out.println("Tiger 1 and Tiger 4 same: " + areTigersSame);
        System.out.println("Tiger 3 similarity with Tiger 4: " + tigerSimilarityCheck);
        System.out.println("--------------------------------------------------------");

        Cheeta cheeta1 = new Cheeta("African Cheetah", 120.0, "Black Dots", "Savannah");
        Cheeta cheeta2 = new Cheeta("Asiatic Cheetah", 110.0, "Faint Dots", "Iran");
        Cheeta cheeta3 = new Cheeta("Asiatic Cheetah", 110.0, "Faint Dots", "Iran");
        Cheeta cheeta4 = new Cheeta("Saharan Cheetah", 100.0, "Sparse Dots", "Desert");

        boolean fastCompare = cheeta2.equals(cheeta3);
        boolean regionCheck = cheeta1.equals(cheeta4);
        boolean dotsMatch = cheeta3.equals(cheeta4);

        System.out.println("Cheeta2 matches Cheeta 3: " + fastCompare);
        System.out.println("Cheeta1 and Cheeta 4 same region: " + regionCheck);
        System.out.println("Cheeta3 and Cheeta 4 dot match: " + dotsMatch);
        System.out.println("--------------------------------------------------------");

        Peak peak1 = new Peak("Everest", 8848.86, "Himalayas", "Nepal");
        Peak peak2 = new Peak("K2", 8611, "Karakoram", "Pakistan");
        Peak peak3 = new Peak("K2", 8611, "Karakoram", "Pakistan");
        Peak peak4 = new Peak("Denali", 6190, "Alaska Range", "USA");

        boolean highestMatch = peak2.equals(peak3);
        boolean locationMatch = peak1.equals(peak4);
        boolean mountainMatch = peak3.equals(peak4);

        System.out.println("Peak 2 matches Peak 3: " + highestMatch);
        System.out.println("Peak 1 and Peak 4 same location: " + locationMatch);
        System.out.println("Peak 3 and Peak 4 mountain match: " + mountainMatch);
        System.out.println("--------------------------------------------------------");

        Clip clip1 = new Clip("Hair Clip", "Red", 5.0, "Plastic");
        Clip clip2 = new Clip("Binder Clip", "Black", 3.2, "Metal");
        Clip clip3 = new Clip("Binder Clip", "Black", 3.2, "Metal");
        Clip clip4 = new Clip("Paper Clip", "Silver", 4.5, "Steel");

        boolean binderCheck = clip2.equals(clip3);
        boolean compareStyles = clip1.equals(clip4);
        boolean compareClipMetals = clip3.equals(clip4);

        System.out.println("Clip 2 and Clip 3 match: " + binderCheck);
        System.out.println("Clip 1 and Clip 4 same style: " + compareStyles);
        System.out.println("Clip 3 and Clip 4 material match: " + compareClipMetals);
        System.out.println("--------------------------------------------------------");

        Sparrow sparrow1 = new Sparrow("House Sparrow", "Brown", 20.5, "Urban");
        Sparrow sparrow2 = new Sparrow("Tree Sparrow", "Chestnut", 21.0, "Forest");
        Sparrow sparrow3 = new Sparrow("Tree Sparrow", "Chestnut", 21.0, "Forest");
        Sparrow sparrow4 = new Sparrow("Mountain Sparrow", "Grey", 22.3, "Highlands");

        boolean forestCheck = sparrow2.equals(sparrow3);
        boolean colorMatch = sparrow1.equals(sparrow4);
        boolean wingCompare = sparrow3.equals(sparrow4);

        System.out.println("Sparrow 2 and Sparrow 3 match: " + forestCheck);
        System.out.println("Sparrow 1 and Sparrow 4 color match: " + colorMatch);
        System.out.println("Sparrow 3 and Sparrow 4 wing compare: " + wingCompare);
        System.out.println("--------------------------------------------------------");

        Crow crow1 = new Crow("Jungle Crow", "Black", 36.0, "Caw");
        Crow crow2 = new Crow("House Crow", "Black", 35.5, "Caw-Caw");
        Crow crow3 = new Crow("House Crow", "Black", 35.5, "Caw-Caw");
        Crow crow4 = new Crow("Rook", "Dark Grey", 38.2, "Craaw");

        boolean soundCheck = crow2.equals(crow3);
        boolean colorCheck = crow1.equals(crow4);
        boolean speciesCompare = crow3.equals(crow4);

        System.out.println("Crow 2 and Crow 3 match: " + soundCheck);
        System.out.println("Crow 1 and Crow 4 color match: " + colorCheck);
        System.out.println("Crow 3 and Crow 4 species compare: " + speciesCompare);
        System.out.println("--------------------------------------------------------");

        Monkey monkey1 = new Monkey("Capuchin", "Brown", 5, "Rainforest");
        Monkey monkey2 = new Monkey("Howler", "Black", 7, "Jungle");
        Monkey monkey3 = new Monkey("Howler", "Black", 7, "Jungle");
        Monkey monkey4 = new Monkey("Baboon", "Grey", 6, "Savannah");

        boolean soundMonkeyMatch = monkey2.equals(monkey3);
        boolean ageHabitatCheck = monkey1.equals(monkey4);
        boolean groupCompare = monkey3.equals(monkey4);

        System.out.println("Monkey 2 and Monkey 3 match: " + soundMonkeyMatch);
        System.out.println("Monkey 1 and Monkey 4 age & habitat match: " + ageHabitatCheck);
        System.out.println("Monkey 3 and Monkey 4 group compare: " + groupCompare);
        System.out.println("--------------------------------------------------------");

        Speaker speaker1 = new Speaker("JBL", "Bluetooth", 20, "Wireless");
        Speaker speaker2 = new Speaker("Sony", "Home Theater", 50, "Wired");
        Speaker speaker3 = new Speaker("Sony", "Home Theater", 50, "Wired");
        Speaker speaker4 = new Speaker("Boat", "Portable", 15, "Wireless");

        boolean homeTheaterCheck = speaker2.equals(speaker3);
        boolean brandCompare = speaker1.equals(speaker4);
        boolean connectionCheck = speaker3.equals(speaker4);

        System.out.println("Speaker 2 and Speaker 3 match: " + homeTheaterCheck);
        System.out.println("Speaker 1 and Speaker 4 brand compare: " + brandCompare);
        System.out.println("Speaker 3 and Speaker 4 connection check: " + connectionCheck);
        System.out.println("--------------------------------------------------------");

        Cyndrella cyn1 = new Cyndrella("Blue", "Glass", 18, "Dreamland");
        Cyndrella cyn2 = new Cyndrella("Pink", "Glass", 18, "Wonderland");
        Cyndrella cyn3 = new Cyndrella("Pink", "Glass", 18, "Wonderland");
        Cyndrella cyn4 = new Cyndrella("White", "Crystal", 20, "Fantasy");

        boolean shoeMatch = cyn2.equals(cyn3);
        boolean dressCheck = cyn1.equals(cyn4);
        boolean ageKingdom = cyn3.equals(cyn4);

        System.out.println("Cyndrella 2 and 3 shoe match: " + shoeMatch);
        System.out.println("Cyndrella 1 and 4 dress check: " + dressCheck);
        System.out.println("Cyndrella 3 and 4 age & kingdom match: " + ageKingdom);
        System.out.println("--------------------------------------------------------");

        Kingdom k1 = new Kingdom("Avaloria", "Queen Mira", 500000, "Northlands");
        Kingdom k2 = new Kingdom("Zaroth", "King Elric", 300000, "East Realm");
        Kingdom k3 = new Kingdom("Zaroth", "King Elric", 300000, "East Realm");
        Kingdom k4 = new Kingdom("Veridora", "Queen Nyra", 450000, "South Isles");

        boolean rulerCheck = k2.equals(k3);
        boolean nameRegionCheck = k1.equals(k4);
        boolean populationMatch = k3.equals(k4);

        System.out.println("Kingdom 2 and 3 ruler check: " + rulerCheck);
        System.out.println("Kingdom 1 and 4 name & region check: " + nameRegionCheck);
        System.out.println("Kingdom 3 and 4 population match: " + populationMatch);
        System.out.println("--------------------------------------------------------");

        Sky sky1 = new Sky("Blue", "Morning", 20, "Clear");
        Sky sky2 = new Sky("Grey", "Afternoon", 50, "Cloudy");
        Sky sky3 = new Sky("Grey", "Afternoon", 50, "Cloudy");
        Sky sky4 = new Sky("Black", "Night", 10, "Clear");

        boolean skyMatch1 = sky2.equals(sky3);
        boolean skyMatch2 = sky1.equals(sky4);
        boolean skyMatch3 = sky3.equals(sky4);

        System.out.println("Sky 2 and Sky 3 match: " + skyMatch1);
        System.out.println("Sky 1 and Sky 4 match: " + skyMatch2);
        System.out.println("Sky 3 and Sky 4 match: " + skyMatch3);
        System.out.println("--------------------------------------------------------");

        Rabbit rabbit1 = new Rabbit("White", "Small", 2, "Bunny");
        Rabbit rabbit2 = new Rabbit("Brown", "Medium", 3, "Angora");
        Rabbit rabbit3 = new Rabbit("Brown", "Medium", 3, "Angora");
        Rabbit rabbit4 = new Rabbit("Grey", "Large", 4, "Himalayan");

        boolean rabbitMatch1 = rabbit2.equals(rabbit3);
        boolean rabbitMatch2 = rabbit1.equals(rabbit4);
        boolean rabbitMatch3 = rabbit3.equals(rabbit4);

        System.out.println("Rabbit 2 and Rabbit 3 match: " + rabbitMatch1);
        System.out.println("Rabbit 1 and Rabbit 4 match: " + rabbitMatch2);
        System.out.println("Rabbit 3 and Rabbit 4 match: " + rabbitMatch3);
        System.out.println("--------------------------------------------------------");

    }

    }
