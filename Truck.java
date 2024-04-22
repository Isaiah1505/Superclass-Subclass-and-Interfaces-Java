package Assignment3;

import java.util.Objects;

public class Truck extends Vehicle{
    protected int seats;
    public double trunkSpace;

    Truck(){}

    public Truck(String color, int numberOfDoors, boolean gasPowered) {
        super(color, numberOfDoors, gasPowered);
    }

    public Truck(int numberOfDoors, boolean gasPowered) {
        super(numberOfDoors, gasPowered);
    }

    public Truck(String color, int numberOfDoors) {
        super(color, numberOfDoors);
    }

    public Truck(String color, boolean gasPowered) {
        super(color, gasPowered);
    }

    public Truck(String color, int numberOfDoors, boolean gasPowered, int seats) {
        super(color, numberOfDoors, gasPowered);
        this.seats = seats;
    }

    public Truck(String color, int numberOfDoors, boolean gasPowered, double trunkSpace) {
        super(color, numberOfDoors, gasPowered);
        this.trunkSpace = trunkSpace;
    }

    public Truck(String color, int numberOfDoors, boolean gasPowered, int seats, double trunkSpace) {
        super(color, numberOfDoors, gasPowered);
        this.seats = seats;
        this.trunkSpace = trunkSpace;
    }

    @Override
    public void isEcoFriendly(){
        super.isEcoFriendly();
        if(seats <= 2 && trunkSpace == 0){
            System.out.println("This truck has 2 seats and no truck space");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return seats == truck.seats && Double.compare(trunkSpace, truck.trunkSpace) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seats, trunkSpace);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "seats=" + seats +
                ", trunkSpace=" + trunkSpace +
                ", color='" + color + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", gasPowered=" + gasPowered +
                '}';
    }
}
