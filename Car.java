public class Car {
    private String make;
    private String model;
    private int year;
    private int rentalRate;
    private int rentalDays;

    public Car(String make, String model, int year, int rentalRate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalRate = rentalRate;
        this.rentalDays = 0;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getRentalRate() {
        return rentalRate;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    @Override
    public String toString() {
        return make + " " + model + " (" + year + ")";
    }
}