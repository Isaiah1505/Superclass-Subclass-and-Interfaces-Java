package Assignment3;

import java.util.Objects;

public class Vehicle {
    public String color;
    protected int numberOfDoors;
    boolean gasPowered;

    Vehicle(){}

    public Vehicle(String color, int numberOfDoors, boolean gasPowered) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.gasPowered = gasPowered;
    }

    public Vehicle(int numberOfDoors, boolean gasPowered) {
        this.numberOfDoors = numberOfDoors;
        this.gasPowered = gasPowered;
    }

    public Vehicle(String color, int numberOfDoors) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

    public Vehicle(String color, boolean gasPowered) {
        this.color = color;
        this.gasPowered = gasPowered;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public boolean getGasPowered() {
        return gasPowered;
    }

    public void setColor(String color) {
            this.color = color;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setGasPowered(boolean gasPowered) {
        this.gasPowered = gasPowered;
    }

    public void isEcoFriendly(){
        if(gasPowered && numberOfDoors == 2){
            System.out.println("Vehicle is eco-friendly and is a two-door");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return numberOfDoors == vehicle.numberOfDoors && gasPowered == vehicle.gasPowered && Objects.equals(color, vehicle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, numberOfDoors, gasPowered);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", gasPowered=" + gasPowered +
                '}';
    }
}
