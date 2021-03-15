package guiPackage;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.DefaultComboBoxModel;

public class AddFlight extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	
	String flightID;
	String flightName;
	String date;
	String from;
	String to;
	String business;
	String economy;
	String arrival;
	String departure;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddFlight frame = new AddFlight();
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
	public AddFlight() {
		setTitle("Add Flight Details-ADMIN");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel()
		{
			public void paintComponent(Graphics g) {  
                Image img = Toolkit.getDefaultToolkit().getImage(  
                          HomeScreen.class.getResource("/images/Admin1.png"));  
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}

		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(1920,1080));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Flight ID");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(463, 200, 56, 16);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(636, 198, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Flight Name");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(463, 248, 92, 16);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setBounds(636, 246, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("From");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(463, 299, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("To");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(866, 299, 86, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Price for Business Class");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(463, 360, 158, 16);
		contentPane.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(636, 358, 116, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Arrival Time");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(866, 424, 123, 16);
		contentPane.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(636, 422, 116, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Departure Time");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(463, 424, 135, 16);
		contentPane.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setBounds(1032, 422, 116, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(1032, 248, 116, 19);
		contentPane.add(dateChooser);
		
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin hs= new AdminLogin();
				hs.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(892, 512, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("Price for Economy Class");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(866, 362, 141, 13);
		contentPane.add(lblNewLabel_8);
		
		textField_8 = new JTextField();
		textField_8.setBounds(1032, 359, 116, 19);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Date");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(866, 250, 45, 13);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton_2 = new JButton("Logout");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeScreen hs= new HomeScreen();
				hs.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(1416, 21, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mumbai - (BOM)", "Bangalore - (BLR)", "Chennai - (MAA)", "Kolkata - (CCU)", "Lucknow - (LKO)", "Amritsar - (ATQ)", "Visakhapatnam - (VTZ)", "Kannur - (CNN)", "Surat - (STV)", "Indore - (IDR)", "Guwahati- (GAU)"}));
		comboBox.setBounds(636, 297, 116, 21);
		contentPane.add(comboBox);
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Chennai - (MAA)", "Mumbai - (BOM)", "Bangalore - (BLR)", "Kolkata - (CCU)", "Lucknow - (LKO)", "Amritsar - (ATQ)", "Visakhapatnam - (VTZ)", "Kannur - (CNN)", "Surat - (STV)", "Indore - (IDR)", "Guwahati- (GAU)"}));
		comboBox_1.setBounds(1032, 297, 116, 21);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Add ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flightID=textField.getText();
				flightName=textField_1.getText();
				date  = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
				from = comboBox.getSelectedItem().toString();
				to= comboBox_1.getSelectedItem().toString();
				business= textField_4.getText();
				economy= textField_8.getText();
				departure= textField_5.getText();
				arrival= textField_6.getText();
				
				if(flightID.equals("") || flightName.equals("") || date.equals("") || from.equals("") || to.equals("") || business.equals("") || economy.equals("") || departure.equals("") || arrival.equals("") )
				{
					JOptionPane.showMessageDialog(null,"Cannot leave a field Empty!");
				}
				else
				{
					try 
					{
						BufferedWriter add = new BufferedWriter(new FileWriter("src/data/flightData.txt",true));
						add.write(flightID+"\n");
						add.write(flightName+"\n");
						add.write(date+"\n");
						add.write(from+"\n");
						add.write(to+"\n");
						add.write(business+"\n");
						add.write(economy+"\n");
						add.write(departure+"\n");
						add.write(arrival+"\n");
						
						add.close();
					} 
					catch (IOException e1)
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					JOptionPane.showMessageDialog(null,"Flight Added Successfully!");
					
					AdminLogin hs= new AdminLogin();
					hs.setVisible(true);
					dispose();
				}		
			}
		});
		btnNewButton.setBounds(694, 512, 97, 25);
		contentPane.add(btnNewButton);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width, screenSize.height);
        setLocation(00,00);
        setVisible(true);
	}
}
