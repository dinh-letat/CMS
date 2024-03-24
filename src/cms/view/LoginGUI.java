package cms.view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginGUI extends JFrame implements ActionListener {

	private JFrame frame;
    private JTextField username;
    private JPasswordField password;
    private JButton login;

    public LoginGUI() {
        setTitle("Đăng nhập");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public void component() {
    	

        // Hàng username
        JPanel usernamePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel usernameLabel = new JLabel("Tên đăng nhập:");
        username = new JTextField(20);
        usernamePanel.add(usernameLabel);
        usernamePanel.add(username);

        // Hàng password
        JPanel passwordPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel passwordLabel = new JLabel("Mật khẩu:");
        password = new JPasswordField(5);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(password);

        // Nút đăng nhập
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        login = new JButton("Đăng nhập");
        login.addActionListener(this);
        buttonPanel.add(login);

        add(usernamePanel);
        add(passwordPanel);
        add(buttonPanel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String usernameInput = username.getText();
        String passwordInput = new String(password.getPassword());

        if (usernameInput.equals("dinh") && passwordInput.equals("adminpassword")) {
            dispose(); // Đóng cửa sổ đăng nhập
            new CMSGui(); // Mở cửa sổ CMS
        } else {
            JOptionPane.showMessageDialog(this, "Đăng nhập thất bại. Vui lòng thử lại", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
}
