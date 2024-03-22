package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Purchase {
    private String userCardNr;
    private LocalDateTime dateTime;
    private ArrayList<Vehicle> shoppinglist;

    public String getUserCardNr() {
        return userCardNr;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public ArrayList<Vehicle> getShoppinglist() {
        return shoppinglist;
    }

    public void setUserCardNr(String userCardNr) {
        this.userCardNr = userCardNr;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setShoppinglist(ArrayList<Vehicle> shoppinglist) {
        this.shoppinglist = shoppinglist;
    }
}
