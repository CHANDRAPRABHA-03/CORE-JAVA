import com.java.abs.internal.*;

public class Main {
    public static void main(String[] args) {
        MetroLine metro = new MetroLine();
        metro.greet();
        metro.showLine();


        BirthdayWish wish = new BirthdayWish();
        wish.makeWish();

        PositiveThought thought = new PositiveThought();
        thought.think();
        thought.reflect();

        NightDream myDream = new NightDream("Flying over mountains");
        myDream.describeDream();


        FullyFurnishedApartment apt = new FullyFurnishedApartment();
        apt.openDoor();
        apt.closeDoor();
        apt.turnOnLights();
        apt.turnOffLights();
    }
}
