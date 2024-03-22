package model;

public class  Bus extends Vehicle {
     private int numberOfSeats;
     private boolean hasBaggageDivision;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isHasBaggageDivision() {
        return hasBaggageDivision;
    }

    public void setNumberOfSeats() {
        if(numberOfSeats > 5 && numberOfSeats < 300)
           this.numberOfSeats = numberOfSeats;
        else
            this.numberOfSeats = 10;

    }

    public void setHasBaggageDivision() {
        this.hasBaggageDivision = hasBaggageDivision;
    }

    public Bus() {
        super();
        setNumberOfSeats();
        setHasBaggageDivision();
    }

    public Bus(String title, float price, int quantity, EnergyType energyType) {
        super(title,price,quantity,energyType);
        setNumberOfSeats();
        setHasBaggageDivision();

    }

    @Override
    public String toString() {
        return "Bus{" +
                "numberOfSeats=" + numberOfSeats +
                ", hasBaggageDivision=" + hasBaggageDivision +
                '}';
    }
}
