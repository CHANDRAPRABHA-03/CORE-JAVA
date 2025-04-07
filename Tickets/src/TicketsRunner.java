public class TicketsRunner {
    public static void main(String[] args) {
        route Route1 = new route(3000, 2000);
        route Route2 = new route(1000, 400);
        Tickets tickets = new Tickets("dailypass", 101, new route[]{Route1, Route2});
        tickets.display();
    }
}
