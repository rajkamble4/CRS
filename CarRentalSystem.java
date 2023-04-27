import javax.swing.*;

public class CarRentalSystem {
    public static void main(String[] args) {
        CarRentalModel model = new CarRentalModel();
        CarRentalView view = new CarRentalView();
        CarRentalController controller = new CarRentalController(model, view);

        JFrame frame = new JFrame("Car Rental System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(view);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}