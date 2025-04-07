public class Tickets {

        private String ticketType;
        private int ticketId;
        private route[] number;

        public Tickets(String ticketType,int ticketId, route[] number){
            this.ticketType= ticketType;
            this.ticketId =ticketId;
            this.number =number;
        }
        public void display(){
            System.out.println("ticektType :" +ticketType );
            System.out.println("ticektId :" +ticketId );

        }
    }
