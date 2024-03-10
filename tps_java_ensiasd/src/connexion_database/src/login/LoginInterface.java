package login ;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LoginInterface extends JFrame implements ActionListener {
    // Components
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

	public LoginInterface() {
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

            // Perform login authentication (dummy authentication for demonstration)
            if (username.equals("admin") && password.equals("password")) {
                JOptionPane.showMessageDialog(this, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        // Create and display the login interface
        SwingUtilities.invokeLater(() -> {
            LoginInterface loginInterface = new LoginInterface();
            loginInterface.setVisible(true);
        });
    }
}
