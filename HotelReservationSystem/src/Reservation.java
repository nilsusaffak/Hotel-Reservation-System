import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reservation extends JFrame {
    private JTextField reservationIdField;
    private JTextField checkInDateField;
    private JTextField checkOutDateField;
    private JTextField hotelIdField;
    private JTextField userIdField;
    private JTextField roomIdField;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton submitButton;

    public Reservation() {
        initializeUI();
    }

    private void initializeUI() {

        setTitle("Reservation Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));


        JLabel reservationIdLabel = new JLabel("Reservation ID:");
        JLabel checkInDateLabel = new JLabel("Check-in Date:");
        JLabel checkOutDateLabel = new JLabel("Check-out Date:");
        JLabel hotelIdLabel = new JLabel("Hotel ID:");
        JLabel userIdLabel = new JLabel("User ID:");
        JLabel roomIdLabel = new JLabel("Room ID:");

        reservationIdField = new JTextField();
        checkInDateField = new JTextField();
        checkOutDateField = new JTextField();
        hotelIdField = new JTextField();
        userIdField = new JTextField();
        roomIdField = new JTextField();

        JButton submitButton = new JButton("Submit");

        add(reservationIdLabel);
        add(reservationIdField);
        add(checkInDateLabel);
        add(checkInDateField);
        add(checkOutDateLabel);
        add(checkOutDateField);
        add(hotelIdLabel);
        add(hotelIdField);
        add(userIdLabel);
        add(userIdField);
        add(roomIdLabel);
        add(roomIdField);
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Butona tıklanınca yapılacak işlemler
                int reservationId = Integer.parseInt(reservationIdField.getText());
                String checkInDate = checkInDateField.getText();
                String checkOutDate = checkOutDateField.getText();
                int hotelId = Integer.parseInt(hotelIdField.getText());
                int userId = Integer.parseInt(userIdField.getText());
                int roomId = Integer.parseInt(roomIdField.getText());


                System.out.println("Reservation ID: " + reservationId);
                System.out.println("Check-in Date: " + checkInDate);
                System.out.println("Check-out Date: " + checkOutDate);
                System.out.println("Hotel ID: " + hotelId);
                System.out.println("User ID: " + userId);
                System.out.println("Room ID: " + roomId);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Reservation().setVisible(true);
            }
        });
    }
}
