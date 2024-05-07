import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payment extends JFrame {
    private JTextField paymentidField;
    private JTextField totalAmountField;
    private JTextField cardNumberField;
    private JTextField reservationidField;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton submitButton;

    public Payment() {
        initializeUI();
    }

    private void initializeUI() {
        // Pencere ayarları
        setTitle("Payment Information");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));


        JLabel paymentIdLabel = new JLabel("Payment ID:");
        JLabel totalAmountLabel = new JLabel("Total Amount:");
        JLabel cardNumberLabel = new JLabel("Card Number:");
        JLabel reservationIdLabel = new JLabel("Reservation ID:");

        paymentidField = new JTextField();
        totalAmountField = new JTextField();
        cardNumberField = new JTextField();
        reservationidField = new JTextField();

        JButton submitButton = new JButton("Submit");


        add(paymentIdLabel);
        add(paymentidField);
        add(totalAmountLabel);
        add(totalAmountField);
        add(cardNumberLabel);
        add(cardNumberField);
        add(reservationIdLabel);
        add(reservationidField);
        add(submitButton);

        // Submit butonuna tıklama olayının atanması
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Butona tıklanınca yapılacak işlemler
                int paymentId = Integer.parseInt(paymentidField.getText());
                double totalAmount = Double.parseDouble(totalAmountField.getText());
                String cardNumber = cardNumberField.getText();
                int reservationId = Integer.parseInt(reservationidField.getText());

                // Verilerin işlenmesi veya başka bir işlem
                // Bu kısımda verileri işleyebilir veya bir veritabanına kaydedebilirsiniz
                System.out.println("Payment ID: " + paymentId);
                System.out.println("Total Amount: " + totalAmount);
                System.out.println("Card Number: " + cardNumber);
                System.out.println("Reservation ID: " + reservationId);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }
}
