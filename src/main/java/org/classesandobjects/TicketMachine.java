package org.classesandobjects;

public class TicketMachine {

    public static void main(String[] args) {
        //create an object called ticket of type Ticket
        Ticket ticket = new Ticket();
        //Set destination of ticket to New York
        ticket.setDestination("New York");
        //Set price of ticket as 15.30
        ticket.setPrice(15.30);
        //Set isReturn value = true
        ticket.setIsReturn(true);
        //Print value of destination
        System.out.println("Destination " +ticket.getDestination());
        //Print value of ticket
        System.out.println("Price "+ticket.getPrice());
        //Print value of setPrice
        System.out.println("Is Return "+ticket.getIsReturn());
    }

}
