public class VillageRunner {
    public static void main(String[] args) {
        Transport transport1 = new Transport(3000,2000);
        Transport transport2 = new Transport(1000,400);
        Village village=new Village("Shivpur",101,new Transport [] { transport1,transport2});
        village.display();
    }
}
