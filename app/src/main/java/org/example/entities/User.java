package org.example.entities;
import java.util.List;

public class User {
    private String name;
    private String password;
    private String hashedPassword;
    private List<Ticket> ticketsBoooked;
    private String userId;

    public User(String name, String password, String hashedPassword, List<Ticket> ticketsBoooked, String userId) {
        this.name = name;
        this.password = password;
        this.hashedPassword = hashedPassword;
        this.ticketsBoooked = ticketsBoooked;
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTicketsBoooked(List<Ticket> ticketsBoooked) {
        this.ticketsBoooked = ticketsBoooked;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public List<Ticket> getTicketsBoooked() {
        return ticketsBoooked;
    }

    public String getUserId() {
        return userId;
    }


}
