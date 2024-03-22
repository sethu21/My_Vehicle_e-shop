package model;

public class Tractor extends Vehicle {

    private String additionalTechniques;
    private boolean isOnlyLargeTires;

    public String getAdditionalTechniques() {
        return additionalTechniques;
    }

    public boolean isOnlyLargeTires() {
        return isOnlyLargeTires;
    }

    public void setAdditionalTechniques( ) {
        this.additionalTechniques = additionalTechniques;
    }

    public void setOnlyLargeTires() {
        isOnlyLargeTires = isOnlyLargeTires;
    }

    public Tractor() {
        super();
        setAdditionalTechniques();
        setOnlyLargeTires();
    }

    public Tractor(String additionalTechniques, boolean isOnlyLargeTires) {
        this.additionalTechniques = additionalTechniques;
        this.isOnlyLargeTires = isOnlyLargeTires;
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "additionalTechniques='" + additionalTechniques + '\'' +
                ", isOnlyLargeTires=" + isOnlyLargeTires +
                '}';
    }
}
