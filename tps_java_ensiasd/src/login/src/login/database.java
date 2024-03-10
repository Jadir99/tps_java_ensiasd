package login;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class database extends JFrame implements ActionListener {

    // Components
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public database() {
        // Frame setup
        setTitle("Login");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
        setLayout(new GridLayout(3, 2, 10, 10)); // Add some spacing between components

        // Components initialization
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        loginButton.setBackground(Color.BLUE); // Set button background color
        loginButton.setForeground(Color.WHITE); // Set button text color

        // Add components to the frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel()); // Empty label for layout purpose
        add(loginButton);

        // Register action listener for the login button
        loginButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // Establish a connection
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users_login", "root", "")) {

                // Perform database operations
                String sqlQuery = "SELECT * FROM users WHERE username LIKE ? AND password = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
                    preparedStatement.setString(1, username);
                    preparedStatement.setString(2, password);
                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
                        if (resultSet.next()) {
                            JOptionPane.showMessageDialog(this, "Login successful!, welcomme sir "+username+"");

                            
                        } else {
                            JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.");
                        }
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

        // Create and display the login interface
        SwingUtilities.invokeLater(() -> {
            database loginInterface = new database();
            loginInterface.setVisible(true);
        });
    }
}