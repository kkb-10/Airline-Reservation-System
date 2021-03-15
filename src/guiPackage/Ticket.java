package guiPackage;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Ticket extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	
	String flightID;
	String Name;
	String date;
	String seatClass;
	String from;
	String to;
	String price;
	String SeatNo;
	String arrival;
	String departure;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket frame = new Ticket();
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
	public Ticket() {
		setTitle("Boarding Pass");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel()
		{
			public void paintComponent(Graphics g) {  
                Image img = Toolkit.getDefaultToolkit().getImage(  
                		Ticket.class.getResource("/images/Admin1.png"));  
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}

		};
		contentPane.setBackground(SystemColor.activeCaptionText);
		contentPane.setForeground(SystemColor.activeCaptionText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(1920,1080));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOARDING PASS");
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(668, 167, 198, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Flight id");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(447, 277, 68, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(734, 282, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(837, 279, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(568, 279, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Date");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(447, 343, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Class");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(734, 343, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("From");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(447, 398, 45, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("To");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(734, 398, 45, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Departure Time");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(447, 458, 97, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Arrival Time");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(734, 458, 76, 13);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Seat No");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(447, 523, 45, 13);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Price");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(734, 523, 45, 13);
		contentPane.add(lblNewLabel_10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Thank You!");
				LoginScreen login= new LoginScreen();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(680, 624, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HomeScreen login= new HomeScreen();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(1416, 30, 85, 21);
		contentPane.add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(568, 340, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(568, 395, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(568, 455, 96, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(568, 520, 96, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(837, 340, 96, 19);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(837, 395, 96, 19);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(837, 455, 96, 19);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(837, 520, 96, 19);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					FileReader reader = new FileReader("src/data/currentTicket.txt");
		            BufferedReader bufferedReader = new BufferedReader(reader);
					while ((flightID = bufferedReader.readLine()) != null) 
		            {
						Name= bufferedReader.readLine();
						date= bufferedReader.readLine();
						seatClass= bufferedReader.readLine();
						from= bufferedReader.readLine();
						to= bufferedReader.readLine();
						departure= bufferedReader.readLine();
						arrival= bufferedReader.readLine();
						SeatNo= bufferedReader.readLine();
						price= bufferedReader.readLine();
						
						textField_1.setText(flightID);
						textField.setText(Name);
						textField_2.setText(date);
						textField_6.setText(seatClass);
						textField_3.setText(from);
						textField_7.setText(to);
						textField_4.setText(departure);
						textField_8.setText(arrival);
						textField_5.setText(SeatNo);
						textField_9.setText(price);
						
		            }
					reader.close();
		            
		        } 
				catch (IOException e1) 
				{
		            e1.printStackTrace();
		        }
			}
		});
		btnGenerate.setBounds(678, 214, 111, 21);
		contentPane.add(btnGenerate);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width, screenSize.height);
        setLocation(00,00);
        setVisible(true);
	}
}
