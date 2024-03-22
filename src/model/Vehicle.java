package model;

public abstract class Vehicle {
    private int id;
    private String title;
    private String vehicleCode;
    private float price;
    private int quantity;
    EnergyType eType;
    private static int counter = 0;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getVehicleCode() {
        return vehicleCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    public EnergyType geteType() {
        return eType;
    }

    public void setId() {
        this.id = id;
        counter++;
    }

    public void setTitle(String title) {
        if(title != null && title.matches("[A-Za-z ]{3,20}"))
            this.title = title;
        else
            this.title = "--------";
    }

    public void setVehicleCode() {
        this.vehicleCode = id + "_" + title;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        if(price > 0 && price < 1000000)
           this.price = price;
        else
            this.price = 1000;
    }

    public void seteType(EnergyType eType) {
        this.eType = eType;
    }

    public Vehicle() {
        setId();
        setTitle("default vehicle");
        setVehicleCode();
        setQuantity(1);
        setPrice(999.99f);
        seteType(EnergyType.not_specified);


    }

    public Vehicle(String title, float price, int quantity, EnergyType type)
    {
        setId();
        setTitle(title);
        setVehicleCode();
        setQuantity(quantity);
        setPrice(price);
        seteType(type);


    }

    //4. toString
    public String toString()
    {
        return id + ": " + title + "(" + vehicleCode + "), " + price + " eur [" + quantity + "], " + eType;
    }


}
