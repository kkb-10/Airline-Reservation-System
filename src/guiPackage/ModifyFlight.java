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

import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;

public class ModifyFlight extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
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
	private JTextField textField;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyFlight frame = new ModifyFlight();
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
	public ModifyFlight() {
		setTitle("Modify Flight Details-ADMIN");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel()
		{
			public void paintComponent(Graphics g) {  
                Image img = Toolkit.getDefaultToolkit().getImage(  
                		ModifyFlight.class.getResource("/images/Admin1.png"));  
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}

		};
		contentPane.setMinimumSize(new Dimension(1920, 1080));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(1920, 1080));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Flight ID");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(545, 134, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Flight Name");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(373, 311, 92, 16);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setBounds(525, 309, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Source");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(373, 368, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(525, 366, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Destination");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(703, 368, 86, 16);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(853, 366, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Price for Business Class");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(373, 426, 141, 16);
		contentPane.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(525, 424, 116, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Arrival");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(703, 486, 56, 16);
		contentPane.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(525, 484, 116, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Departure");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(373, 486, 56, 16);
		contentPane.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setBounds(853, 484, 116, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin hs= new AdminLogin();
				hs.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(768, 546, 97, 25);
		contentPane.add(btnNewButton_1);
		
		int count = 0;

	    try 
	    {
	      File file = new File("src/data/flightData.txt");

	      Scanner sc = new Scanner(file);

	      while(sc.hasNextLine()) {
	        sc.nextLine();
	        count++;
	      }
	      sc.close();
	    } 
	    catch (Exception e) 
	    {
	      e.getStackTrace();
	    }
		int i=0;
	    String[] flightid = new String[count/9];
		try 
		{
            FileReader reader = new FileReader("src/data/flightData.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            while ((flightID = bufferedReader.readLine()) != null) 
            {
            	flightid[i]=(flightID);
            	flightName= bufferedReader.readLine();
            	date= bufferedReader.readLine();
            	from= bufferedReader.readLine();
            	to= bufferedReader.readLine();
            	business= bufferedReader.readLine();
            	economy= bufferedReader.readLine();
            	arrival= bufferedReader.readLine();
            	departure= bufferedReader.readLine();
            	i++;
            	
            }
            reader.close();
 
        } 
		catch (IOException e) 
		{
            e.printStackTrace();
        }
		
		JComboBox comboBox = new JComboBox();
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>( flightid );
		comboBox.setModel( model );
		comboBox.setBounds(642, 132, 116, 21);
		contentPane.add(comboBox);
		
		
		
		JLabel lblNewLabel_8 = new JLabel("MODIFY DETAILS");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(654, 246, 105, 13);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Date");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(703, 313, 45, 13);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_8_1 = new JLabel("Price for Economy Class");
		lblNewLabel_8_1.setForeground(Color.WHITE);
		lblNewLabel_8_1.setBounds(703, 428, 141, 13);
		contentPane.add(lblNewLabel_8_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(853, 424, 116, 22);
		contentPane.add(textField_8);
		
		JButton btnNewButton_3 = new JButton("Logout");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeScreen hs= new HomeScreen();
				hs.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(1431, 22, 85, 21);
		contentPane.add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setBounds(850, 310, 119, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Search Flight");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flightID=comboBox.getSelectedItem().toString();
				String flightid1;
				try 
				{
		            FileReader reader = new FileReader("src/data/flightData.txt");
		            BufferedReader bufferedReader = new BufferedReader(reader);
		 
		            while ((flightid1 = bufferedReader.readLine()) != null) 
		            {
		            	
		            	flightName= bufferedReader.readLine();
		            	date= bufferedReader.readLine();
		            	from= bufferedReader.readLine();
		            	to= bufferedReader.readLine();
		            	business= bufferedReader.readLine();
		            	economy= bufferedReader.readLine();
		            	arrival= bufferedReader.readLine();
		            	departure= bufferedReader.readLine();
		            	if(flightid1.equals(flightID))
		            	{
		            		textField_1.setText(flightName);
		            		textField_2.setText(from);
		            		textField_3.setText(to);
		            		textField_4.setText(business);
		            		textField_5.setText(departure);
		            		textField_6.setText(arrival);
		            		textField_8.setText(economy);
		            		textField.setText(date);
		            	}
		            	
		            }
		            reader.close();
		 
		        } 
				catch (IOException e1) 
				{
		            e1.printStackTrace();
		        }
				
			}
		});
		btnNewButton_2.setBounds(642, 190, 116, 21);
		contentPane.add(btnNewButton_2);
		
		
		JButton btnNewButton = new JButton("Modify");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flightID=comboBox.getSelectedItem().toString();
				String flightid1;
				int flag=0;
				try 
				{
		            FileReader reader = new FileReader("src/data/flightData.txt");
		            BufferedReader bufferedReader = new BufferedReader(reader);
		            
		            BufferedWriter addFirst = new BufferedWriter(new FileWriter("src/data/temp.txt"));
		            addFirst.write("");
		            addFirst.close();
		            // Now temp file is empty
		            
		            
		            BufferedWriter add = new BufferedWriter(new FileWriter("src/data/temp.txt",true));
					
					
		            while ((flightid1 = bufferedReader.readLine()) != null) 
		            {
		            	
		            	flightName= bufferedReader.readLine();
		            	date= bufferedReader.readLine();
		            	from= bufferedReader.readLine();
		            	to= bufferedReader.readLine();
		            	business= bufferedReader.readLine();
		            	economy= bufferedReader.readLine();
		            	departure= bufferedReader.readLine();
		            	arrival= bufferedReader.readLine();
		            	if(flightid1.equals(flightID))
		            	{
		            		flightName= textField_1.getText();
			            	date= textField.getText();
			            	from= textField_2.getText();
			            	to= textField_3.getText();
			            	business= textField_4.getText();
			            	economy= textField_8.getText();
			            	departure= textField_5.getText();
			            	arrival= textField_6.getText();
		            	}
		            	
		            	
		            	add.write(flightid1+"\n");
						add.write(flightName+"\n");
						add.write(date+"\n");
						add.write(from+"\n");
						add.write(to+"\n");
						add.write(business+"\n");
						add.write(economy+"\n");
						add.write(departure+"\n");
						add.write(arrival+"\n");
		            	
		            }
		            reader.close();
					add.close();
					
					reader = new FileReader("src/data/temp.txt");
		            bufferedReader = new BufferedReader(reader);
		            
					addFirst = new BufferedWriter(new FileWriter("src/data/flightData.txt"));
		            addFirst.write("");
		            addFirst.close();
		            // Now temp file is empty
		            
		            
		            add = new BufferedWriter(new FileWriter("src/data/flightData.txt",true));
		            
		            while ((flightid1 = bufferedReader.readLine()) != null) 
		            {
		            	
		            	flightName= bufferedReader.readLine();
		            	date= bufferedReader.readLine();
		            	from= bufferedReader.readLine();
		            	to= bufferedReader.readLine();
		            	business= bufferedReader.readLine();
		            	economy= bufferedReader.readLine();
		            	departure= bufferedReader.readLine();
		            	arrival= bufferedReader.readLine();
		            	add.write(flightid1+"\n");
						add.write(flightName+"\n");
						add.write(date+"\n");
						add.write(from+"\n");
						add.write(to+"\n");
						add.write(business+"\n");
						add.write(economy+"\n");
						add.write(departure+"\n");
						add.write(arrival+"\n");
		            	
		            }
		            reader.close();
					add.close();
		 
		        } 
				catch (IOException e1) 
				{
		            e1.printStackTrace();
		        }
				
				JOptionPane.showMessageDialog(null,"Modification Successful!");
				AdminLogin login= new AdminLogin();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(571, 546, 97, 25);
		contentPane.add(btnNewButton);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width, screenSize.height);
        setLocation(00,00);
        setVisible(true);
	}
}
