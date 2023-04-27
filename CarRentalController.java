import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarRentalController {
    private CarRentalModel model;
    private CarRentalView view;

    public CarRentalController(CarRentalModel model, CarRentalView view) {
        this.model = model;
        this.view = view;

        view.setCarList(model.getAvailableCars().toArray(new Car[0]));

        view.addRentButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Car selectedCar = view.getSelectedCar();
                int rentalDays = view.getRentalDays();
                if (selectedCar != null && rentalDays > 0) {
                    model.rentCar(selectedCar, rentalDays);
                    view.setCarList(model.getAvailableCars().toArray(new Car[0]));
                }
            }
        });

        view.addReturnButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Car selectedCar = view.getSelectedCar();
                if (selectedCar != null) {
                    model.returnCar(selectedCar);
                    view.setCarList(model.getAvailableCars().toArray(new Car[0]));
                }
            }
        });
    }
}