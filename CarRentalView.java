import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CarRentalView extends JPanel {
    private JButton rentButton;
    private JButton returnButton;
    private JComboBox<Car> carComboBox;
    private JTextField rentalDaysField;
    private JLabel titleLabel;
    private JLabel carListLabel;
    private JLabel rentalDaysLabel;

    public CarRentalView() {
        setLayout(new BorderLayout());

        titleLabel = new JLabel("Car Rental System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

        carListLabel = new JLabel("Available Cars:", SwingConstants.CENTER);
        carListLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        carListLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        rentalDaysLabel = new JLabel("Rental Days:", SwingConstants.CENTER);
        rentalDaysLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        rentalDaysLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        rentButton = new JButton("Rent Car");
        rentButton.setFont(new Font("Arial", Font.PLAIN, 18));
        rentButton.setBackground(new Color(59, 89, 182));
        rentButton.setForeground(Color.WHITE);
        rentButton.setFocusPainted(false);
        rentButton.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        returnButton = new JButton("Return Car");
        returnButton.setFont(new Font("Arial", Font.PLAIN, 18));
        returnButton.setBackground(new Color(59, 89, 182));
        returnButton.setForeground(Color.WHITE);
        returnButton.setFocusPainted(false);
        returnButton.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        carComboBox = new JComboBox<>();
        carComboBox.setFont(new Font("Arial", Font.PLAIN, 16));

        rentalDaysField = new JTextField();
        rentalDaysField.setFont(new Font("Arial", Font.PLAIN, 16));

        JPanel centerPanel = new JPanel(new GridLayout(4, 1));
        centerPanel.add(carListLabel);
        centerPanel.add(carComboBox);
        centerPanel.add(rentalDaysLabel);
        centerPanel.add(rentalDaysField);

        JPanel southPanel = new JPanel(new GridLayout(1, 2));
        southPanel.add(rentButton);
        southPanel.add(returnButton);

        add(titleLabel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
    }

    public void setCarList(Car[] cars) {
        carComboBox.removeAllItems();
        for (Car car : cars) {
            carComboBox.addItem(car);
        }
    }

    public Car getSelectedCar() {
        return (Car) carComboBox.getSelectedItem();
    }

    public int getRentalDays() {
        try {
            return Integer.parseInt(rentalDaysField.getText());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public void addRentButtonListener(ActionListener listener) {
        rentButton.addActionListener(listener);
    }

    public void addReturnButtonListener(ActionListener listener) {
        returnButton.addActionListener(listener);
    }
}