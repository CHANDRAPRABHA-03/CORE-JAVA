package file.java.Earth;

public class EarthRunner {
    public static void main(String [] args){
        Earth earth = new Earth();
        Gravitation gravitation = new Gravitation(earth);
        earth.Galaxy();
    }
}
