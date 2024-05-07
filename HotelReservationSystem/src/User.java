import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User extends JFrame {
    private JTextField textFieldName;
    private JTextField textFieldLastname;
    private JTextField textFieldPassword;
    private JButton buttonEnter;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;

    public User() {
        initializeUI();
    }

    private void initializeUI() {
        // Pencere ayarları
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Hotel Reservation");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2));

        // Bileşenlerin oluşturulması
        JLabel labelName = new JLabel("Name:");
        JLabel labelLastname = new JLabel("Lastname:");
        JLabel labelPassword = new JLabel("Password:");

        textFieldName = new JTextField();
        textFieldLastname = new JTextField();
        textFieldPassword = new JTextField();

        buttonEnter = new JButton("Enter");

        // Bileşenlerin panele eklenmesi
        add(labelName);
        add(textFieldName);
        add(labelLastname);
        add(textFieldLastname);
        add(labelPassword);
        add(textFieldPassword);

        add(buttonEnter);

        // Kaydet butonuna tıklama
        buttonEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Butona tıklanınca yapılacak işlemler
                String name = textFieldName.getText();
                String lastname = textFieldLastname.getText();
                String password = textFieldPassword.getText();



                System.out.println("Name: " + name);
                System.out.println("Lastname: " + lastname);
                System.out.println("Password: " + password);

            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }
}