package CCE103TABAOSARES;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Lab5Tabaosares_UserPassword implements ActionListener {
	
	private static JTextField username;
	private static JPasswordField password;
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		frame.setSize(300,200);
		frame.setTitle("Lab5Tabaosares");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JPanel p = new JPanel();
		
		frame.add(p);
		p.setLayout(null);
		
		JLabel user = new JLabel("Username: ");
		user.setBounds(10, 10, 80, 25);
		p.add(user);
		JLabel pass = new JLabel("Password: ");
		pass.setBounds(10, 40, 80, 25);
		p.add(pass);
		
		username = new JTextField();
		username.setBounds(80, 10, 120, 25);
		p.add(username);
		
		password = new JPasswordField();
		password.setBounds(80, 40, 120, 25);
		p.add(password);
		
		JButton login = new JButton("Log-in");
		login.setBounds(80, 70, 70, 25);
		login.addActionListener(new Lab5Tabaosares_UserPassword());
		p.add(login);
		
		frame.setVisible(true);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		
		String userInput = username.getText(); 
		String passInput = password.getText();
		
		System.out.println(userInput + " "+ passInput);
		
		if (userInput.equals("admin") && passInput.equals("secret"))
		{
			JOptionPane.showMessageDialog(null, "login successful...");
		}
		else
			JOptionPane.showMessageDialog(null, "Invalid username or Password.");
	}

}
