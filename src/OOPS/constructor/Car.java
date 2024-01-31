package OOPS.constructor;

public class Car {
    private int wheeels;
    private int seats;
    private String name;

    public Car(int x1, int x2, String name) {
        wheeels = x1;
        seats = x2;
        this.name = name;
    }

    /**
     * Copy constructor
     */
    public Car(Car c) {
        this.wheeels = c.wheeels;
        this.seats = c.seats;
        this.name = c.name;
    }

    public int getWheeels() {
        return wheeels;
    }

    public void setWheeels(int wheeels) {
        this.wheeels = wheeels;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
