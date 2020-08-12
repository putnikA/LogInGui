import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI implements ActionListener {
	private static JFrame frame;
	private static JPanel panel;
	private static JLabel lblName;
	private static JTextField txtUser;
	private static JLabel lblPassword;
	private static JPasswordField txtPassword;
	private static JButton button;
	private static JLabel lblSuccess;
	
	public static void main(String[] args) {
		frame = new JFrame("Log in");
		JPanel panel = new JPanel();
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		lblName = new JLabel("User name:");
		lblName.setBounds(10, 20, 80, 25);
		panel.add(lblName);
		
		txtUser = new JTextField(20);
		txtUser.setBounds(100, 20, 150, 25);
		panel.add(txtUser);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setBounds(10, 55, 80, 25);
		panel.add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(100, 55, 150, 25);
		panel.add(txtPassword);
		
		button = new JButton("Log in");
		button.setBounds(10, 90, 70, 20);
		panel.add(button);
		
		
		button.addActionListener(new GUI());
		
		lblSuccess = new JLabel("");
		lblSuccess.setBounds(10, 115, 200, 20);
		panel.add(lblSuccess);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = txtUser.getText();
		String password = txtPassword.getText();
		
		if(user.equals("Aleksa") && password.equals("aleksa123")) {
			lblSuccess.setText("Login successful!");
		} else {
			lblSuccess.setText("Invalid username or password!");
		}

	}

}
