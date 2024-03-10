package login;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class Register extends JFrame implements ActionListener {

    // Components
    private JLabel usernameLabel, passwordLabel, emailLabel;
    private JTextField usernameField, emailField;
    private JPasswordField passwordField;
    private JButton registerButton;

    public Register() {
        // Frame setup
        setTitle("Registration");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
        setLayout(new GridLayout(4, 2, 10, 10)); // Add some spacing between components

        // Components initialization
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        emailLabel = new JLabel("Email:");
        usernameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JPasswordField();
        registerButton = new JButton("Register");
        registerButton.setBackground(Color.BLUE); // Set button background color
        registerButton.setForeground(Color.WHITE); // Set button text color

        // Add components to the frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(emailLabel);
        add(emailField);
        add(new JLabel()); // Empty label for layout purpose
        add(registerButton);

        // Register action listener for the register button
        registerButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String email = emailField.getText();

            // Establish a connection
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users_login", "root", "")) {

                // Perform database operations
                String sqlQuery = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
                try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
                    preparedStatement.setString(1, username);
                    preparedStatement.setString(2, password);
                    preparedStatement.setString(3, email);
                    int rowsAffected = preparedStatement.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Registration successful! Welcome, " + username + ".");
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to register. Please try again.");
                    }
                }

            } catch (SQLException ex) {
                System.err.println("Database connection error.");
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Load the JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Failed to load MySQL JDBC driver. Check your classpath.");
            e.printStackTrace();
            return;
        }

        // Create and display the registration interface
        SwingUtilities.invokeLater(() -> {
        	Register registerInterface = new Register();
            registerInterface.setVisible(true);
        });
    }
}