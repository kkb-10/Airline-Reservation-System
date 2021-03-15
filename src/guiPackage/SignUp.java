package guiPackage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.*;
import javax.swing.UIManager;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.*;
public class SignUp extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField_2;
	private JTextField textField_3;
	
	String name="";
	String email;
	String password="";
	String confPassword="";
	String gender="";
	String date="";
	String mobile="";
	
	boolean isValid(String email) 
	{
	      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	      return email.matches(regex);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setTitle("SignUp");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(1920,1080));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(371, 259, -116, 19);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField_1.setEchoChar('*');
				password=String.valueOf(passwordField_1.getPassword());
			}
		});
		passwordField_1.setBounds(918, 359, 96, 19);
		contentPane.add(passwordField_1);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name=textField.getText();
			}
		});
		textField.setBounds(918, 276, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("E-mail");
		lblNewLabel.setBounds(815, 317, 65, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(815, 279, 39, 13);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				email=textField_1.getText();
			}
		});
		textField_1.setBounds(918, 317, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField_2.setEchoChar('*');
				confPassword=String.valueOf(passwordField_2.getPassword());
			}
		});
		passwordField_2.setBounds(1205, 359, 96, 19);
		contentPane.add(passwordField_2);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(815, 362, 83, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Confirm Password");
		lblNewLabel_3.setBounds(1065, 362, 111, 13);
		contentPane.add(lblNewLabel_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected())
				{
					passwordField_1.setEchoChar((char)0);
				}
				else
				{
					passwordField_1.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setBounds(918, 384, 123, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Show Password");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox_1.isSelected())
				{
					passwordField_2.setEchoChar((char)0);
				}
				else
				{
					passwordField_2.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox_1.setBounds(1205, 384, 131, 21);
		contentPane.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setBounds(815, 435, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected())
				{
					gender="Male";
				}
			}
		});
		rdbtnNewRadioButton.setBounds(918, 431, 53, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1.isSelected())
				{
					gender="Female";
				}
			}
		});
		rdbtnNewRadioButton_1.setBounds(1013, 431, 81, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		ButtonGroup group =new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Date of Birth");
		lblNewLabel_5.setBounds(815, 480, 83, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Mobile Number");
		lblNewLabel_6.setBounds(815, 525, 96, 13);
		contentPane.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mobile=textField_3.getText();
			}
		});
		textField_3.setBounds(918, 522, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		
		dateChooser.setBounds(918, 474, 96, 19);
		contentPane.add(dateChooser);
		JButton btnNewButton = new JButton("CREATE ACCOUNT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name=textField.getText();
				email=textField_1.getText();
				password=String.valueOf(passwordField_1.getPassword());
				confPassword=String.valueOf(passwordField_2.getPassword());
				date  = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
				mobile=textField_3.getText();
				
				System.out.println(name);
				System.out.println(email);
				System.out.println(password);
				System.out.println(confPassword);
				System.out.println(gender);
				System.out.println(date);
				System.out.println(mobile);
				
				
				if(name.equals("") || email.equals("") || password.equals("") || confPassword.equals("") || gender.equals("") || date.equals("") || mobile.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Cannot leave a field Empty!");
				}
				else if(!password.equals(confPassword))
				{
					JOptionPane.showMessageDialog(null,"Password and Confirm Password do not match!");
				}
				else if(!isValid(email))
				{
					JOptionPane.showMessageDialog(null,"Invalid Email Address!");
				}
				else
				{
					try 
					{
						BufferedWriter addCustomerData = new BufferedWriter(new FileWriter("src/data/customerData.txt",true));
						addCustomerData.write(email+"\n");
						addCustomerData.write(password+"\n");
						addCustomerData.write(name+"\n");
						addCustomerData.write(gender+"\n");
						addCustomerData.write(date+"\n");
						addCustomerData.write(mobile+"\n");
						addCustomerData.close();
					} 
					catch (IOException e1)
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					JOptionPane.showMessageDialog(null,"Account Successfully Created!");
					
					HomeScreen hs= new HomeScreen();
					hs.setVisible(true);
					dispose();
				}		
			}
		});
		btnNewButton.setBounds(959, 583, 195, 21);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel()
		{
			public void paintComponent(Graphics g) 
			{ 
                Image img = Toolkit.getDefaultToolkit().getImage(  
                        SignUp.class.getResource("/images/SignUpicon1.jpg"));  
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		panel.setBounds(371, 318, 258, 220);
		contentPane.add(panel);
		
		JLabel lblNewLabel_10 = new JLabel("NEW CUSTOMER SIGNUP");
		lblNewLabel_10.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		lblNewLabel_10.setBounds(379, 571, 297, 38);
		contentPane.add(lblNewLabel_10);
		
		
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeScreen homeScreen=new HomeScreen();
				homeScreen.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(1445, 10, 85, 21);
		contentPane.add(btnNewButton_1);
		
		
		setLocationRelativeTo(null);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width, screenSize.height);
        setLocation(00,00);
        setVisible(true);
	}
}
