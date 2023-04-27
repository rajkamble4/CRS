import java.util.ArrayList;
import java.util.List;

public class CarRentalModel {
    private List<Car> availableCars;
    private List<Car> rentedCars;

    public CarRentalModel() {
        availableCars = new ArrayList<>();
        rentedCars = new ArrayList<>();
        availableCars.add(new Car("Toyota", "Camry", 2018, 50));
        availableCars.add(new Car("Honda", "Accord", 2019, 60));
        availableCars.add(new Car("Nissan", "Altima", 2020, 70));
    }

    public List<Car> getAvailableCars() {
        return availableCars;
    }

    public List<Car> getRentedCars() {
        return rentedCars;
    }

    public void rentCar(Car car, int rentalDays) {
        availableCars.remove(car);
        car.setRentalDays(rentalDays);
        rentedCars.add(car);
    }

    public void returnCar(Car car) {
        rentedCars.remove(car);
        car.setRentalDays(0);
        availableCars.add(car);
    }
}