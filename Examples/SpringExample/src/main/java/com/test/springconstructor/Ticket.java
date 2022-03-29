package com.test.springconstructor;
public class Ticket {
    private int id;
    private String ticketdate;
    public Ticket() {System.out.println("Ticket is "+ ticketdate);}
    public Ticket(int id) {this.id = id;}
    public Ticket(String ticketdate) {  this.ticketdate = ticketdate;}
    public Ticket(int id, String ticketdate) {
        this.id = id;
        this.ticketdate = ticketdate;
    }
    void display(){
        System.out.println(id+" "+ticketdate);
    }
}
