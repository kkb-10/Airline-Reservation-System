package guiPackage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	String userId="";
	String password="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Customer Login");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(1920,1080));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(821, 335, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setEchoChar('*');
			}
		});
		passwordField.setBounds(821, 401, 96, 19);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("E-mail");
		lblNewLabel.setBounds(736, 338, 54, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(736, 404, 75, 13);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected())
				{
					passwordField.setEchoChar((char)0);
				}
				else
				{
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setBounds(821, 449, 149, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userId=textField.getText();
				password=String.valueOf(passwordField.getPassword());
				
				Server server=new Server();
				
				if(userId.equals("") || password.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Cannot leave a field Empty!");
				}
				else if(server.userValidation(userId, password)==false)
				{
					JOptionPane.showMessageDialog(null,"Incorrect E-mail or Password!");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Login Successful!");
					LoginScreen login= new LoginScreen();
					login.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setBounds(819, 513, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_10 = new JLabel("CUSTOMER LOGIN");
		lblNewLabel_10.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		lblNewLabel_10.setBounds(326, 540, 297, 38);
		contentPane.add(lblNewLabel_10);
		
		JPanel panel = new JPanel()
		{
			public void paintComponent(Graphics g) 
			{  
                Image img = Toolkit.getDefaultToolkit().getImage(  
                          Login.class.getResource("/images/SignUpicon1.jpg"));  
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}

		};
		panel.setBounds(307, 308, 217, 222);
		contentPane.add(panel);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeScreen homeScreen = new HomeScreen();
				homeScreen.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(1445, 10, 85, 21);
		contentPane.add(btnNewButton_1);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width, screenSize.height);
        setLocation(00,00);
        setVisible(true);
	}
}
