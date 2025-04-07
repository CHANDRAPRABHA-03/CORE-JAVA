package com.specifer.access.internal;

    public class Temple {

        public  Temple(){
            System.out.println(" In no-arg Temple constructor running");
        }
        public void ticket_counter(){
            System.out.println("Running public ticket_counter method ");
        }
        void darshan_hall(){
            System.out.println("Running package default darshan_hall method");
        }
        private void prasada() {
            System.out.println("Running private prasada method");
        }

}