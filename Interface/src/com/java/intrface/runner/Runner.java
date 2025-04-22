package com.java.intrface.runner;

import com.java.intrface.internal.*;


public class Runner {
    public static void main(String[] args) {
        Airport airport = new OneMethod();
        airport.Passport();
        OneMethod oneMethod = new OneMethod();
        oneMethod.RedPan();
        oneMethod.startClock();
        oneMethod.Candle();
        oneMethod.Idcard();

        System.out.println();



        // 1️⃣ Using INTERFACE types
                Company companyRef = new ScndMethod();
                companyRef.LoginTime();
                companyRef.Exit();
                companyRef.Work();

                Court courtRef = new ScndMethod();
                courtRef.Judgement();
                courtRef.Promise();
                courtRef.Lawyer();

                Football footballRef = new ScndMethod();
                footballRef.Goal();
                footballRef.Ball();
                footballRef.Shoe();

                Home homeRef = new ScndMethod();
                homeRef.Time();
                homeRef.Food();
                homeRef.Wakeup();

                Hospital hospitalRef = new ScndMethod();
                hospitalRef.patient();
                hospitalRef.Doctor();
                hospitalRef.Nurse();

                System.out.println("----");

                // 2 Using IMPLEMENTATION type
                ScndMethod implRef = new ScndMethod();
                implRef.LoginTime();
                implRef.Exit();
                implRef.Work();
                implRef.Judgement();
                implRef.Promise();
                implRef.Lawyer();
                implRef.Goal();
                implRef.Ball();
                implRef.Shoe();
                implRef.Time();
                implRef.Food();
                implRef.Wakeup();
                implRef.patient();
                implRef.Doctor();
                implRef.Nurse();


        System.out.println();

                // Interface references
                Hostel hostel = new FiveMethod();
                hostel.Timings();
                hostel.Warden();
                hostel.Bed();
                hostel.Locker();
                hostel.security();

                Hotel hotel = new FiveMethod();
                hotel.Parking();
                hotel.GoodFood();
                hotel.cleaning();
                hotel.Chef();
                hotel.Menu();

                Library library = new FiveMethod();
                library.Silence();
                library.Books();
                library.Librarian();
                library.LibraryCard();
                library.Newspaper();

                Metro metro = new FiveMethod();
                metro.line();
                metro.card();
                metro.Lift();
                metro.Announcement();
                metro.ScanCard();

                Mosque mosque = new FiveMethod();
                mosque.Gents();
                mosque.PrayerMat();
                mosque.quran();
                mosque.Ramdan();
                mosque.Shall();

                System.out.println("----");

                // 2️ Implementation class reference
                FiveMethod five = new FiveMethod();
                five.Timings();
                five.Warden();
                five.Bed();
                five.Locker();
                five.security();

                five.Parking();
                five.GoodFood();
                five.cleaning();
                five.Chef();
                five.Menu();

                five.Silence();
                five.Books();
                five.Librarian();
                five.LibraryCard();
                five.Newspaper();

                five.line();
                five.card();
                five.Lift();
                five.Announcement();
                five.ScanCard();

                five.Gents();
                five.PrayerMat();
                five.quran();
                five.Ramdan();
                five.Shall();

              System.out.println();



                // 1. Using interfaces as reference types
                Office office = new SevenMethod();
                Society society = new SevenMethod();
                School school = new SevenMethod();
                PoliceStation policeStation = new SevenMethod();
                RailwayStation railwayStation = new SevenMethod();

                // Office interface methods
                office.Laptop();
                office.Employee();
                office.Manager();
                office.HR();
                office.Accountant();

                // Society interface methods

                society.PromoteEducation();
                society.Job();
                society.Marriage();
                society.Equality();
                society.Safety();
                society.EconomicGrowth();
                society.HealthCare();

                // School interface methods

                school.Uniforms();
                school.discipline();
                school.Belt();
                school.Tie();
                school.Bag();
                school.Books();
                school.Teachers();

                // PoliceStation interface methods
                policeStation.Police();
                policeStation.Constable();
                policeStation.Jail();
                policeStation.Uniform();
                policeStation.PublicSafety();

                // RailwayStation interface methods
                railwayStation.ticket();
                railwayStation.Train();
                railwayStation.Passenger();
                railwayStation.Toilets();
                railwayStation.Seats();
                railwayStation.SleeperCoach();
                railwayStation.General();

                System.out.println("\n--- Using SevenMethod directly ---");

                // 2. Using implementation class as reference type
                SevenMethod method = new SevenMethod();

                // Office
                method.Laptop();
                method.Employee();
                method.Manager();
                method.HR();
                method.Accountant();

                // Society
                method.Apartment();
                method.ITSupport();
                method.Job();
                method.Marriage();
                method.Equality();
                method.Safety();
                method.EconomicGrowth();
                method.HealthCare();

                // School
                method.punctuality();
                method.Shoes();
                method.Uniforms();
                method.discipline();
                method.Belt();
                method.Tie();
                method.Bag();
                method.Books();
                method.Teachers();
                method.PromoteEducation();

                // PoliceStation
                method.Police();
                method.Constable();
                method.Jail();
                method.Uniform();
                method.PublicSafety();

                // RailwayStation
                method.ticket();
                method.Train();
                method.Passenger();
                method.Toilets();
                method.Seats();
                method.SleeperCoach();
                method.General();

        System.out.println();

            // Using interface as the type
            Bank bankRef = new NineMethods();
            bankRef.Amount();
            bankRef.Customer();
            bankRef.Security();
            bankRef.Atm();
            bankRef.BankManager();
            bankRef.BankEmployee();
            bankRef.issueLoan();
            bankRef.openAccount();
            bankRef.Loyal();

            Election electionRef = new NineMethods();
            electionRef.Candidate();
            electionRef.Machine();
            electionRef.Ink();
            electionRef.Place();
            electionRef.SecurityPolice();
            electionRef.CCcamera();
            electionRef.VoterId();
            electionRef.ageLimit();
            electionRef.Results();

            Temple templeRef = new NineMethods();
            templeRef.God();
            templeRef.Prasada();
            templeRef.Parking();
            templeRef.SlipperOut();
            templeRef.Queue();
            templeRef.Bell();
            templeRef.Flower();
            templeRef.Prayer();
            templeRef.Donation();

            Traffic trafficRef = new NineMethods();
            trafficRef.Vehicles();
            trafficRef.TrafficPolice();
            trafficRef.redSignal();
            trafficRef.OrangeSignal();
            trafficRef.GreenSignals();
            trafficRef.Fines();
            trafficRef.Helmet();
            trafficRef.ZebraCross();
            trafficRef.SpeedLimit();

            Volleyball volleyballRef = new NineMethods();
            volleyballRef.Court();
            volleyballRef.Ball();
            volleyballRef.Players();
            volleyballRef.Net();
            volleyballRef.Teams();
            volleyballRef.Captain();
            volleyballRef.Strength();
            volleyballRef.Serve();
            volleyballRef.Umpires();

            System.out.println("\n--- Using Implementation Type ---");

            NineMethods impl1 = new NineMethods();
            impl1.Amount();
            impl1.Customer();
            impl1.Security();
            impl1.Atm();
            impl1.BankManager();
            impl1.BankEmployee();
            impl1.issueLoan();
            impl1.openAccount();
            impl1.Loyal();
            impl1.Candidate();
            impl1.Machine();
            impl1.Ink();
            impl1.Place();
            impl1.SecurityPolice();
            impl1.CCcamera();
            impl1.VoterId();
            impl1.ageLimit();
            impl1.Results();
            impl1.God();
            impl1.Prasada();
            impl1.Parking();
            impl1.SlipperOut();
            impl1.Queue();
            impl1.Bell();
            impl1.Flower();
            impl1.Prayer();
            impl1.Donation();
            impl1.Vehicles();
            impl1.TrafficPolice();
            impl1.redSignal();
            impl1.OrangeSignal();
            impl1.GreenSignals();
            impl1.Fines();
            impl1.Helmet();
            impl1.ZebraCross();
            impl1.SpeedLimit();
            impl1.Court();
            impl1.Ball();
            impl1.Players();
            impl1.Net();
            impl1.Teams();
            impl1.Captain();
            impl1.Strength();
            impl1.Serve();
            impl1.Umpires();
        }


    }