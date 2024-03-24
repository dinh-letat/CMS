package cms.view;

import javax.swing.*;
import java.awt.event.*;

public class Login {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public Login() {
        frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(800, 500);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);
        
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        usernameField = new JTextField(20);
        usernameField.setBounds(100, 20, 160, 25);
        panel.add(usernameField);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 50, 160, 25);
        panel.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 80, 80, 25);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (username.equals("admin") && password.equals("admin")) {
                    // Đăng nhập thành công, chuyển hướng sang CMSGUI
                    frame.dispose(); // Đóng cửa sổ đăng nhập
                    new CMSGui(); // Mở cửa sổ CMS
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        panel.add(loginButton);
    }

    public static void main(String[] args) {
        new Login();
    }
}
