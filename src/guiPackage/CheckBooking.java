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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class CheckBooking extends JFrame {

	private JPanel contentPane;
	
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
	String currentCustomerName;
	String userId,email,password;
	String gender;
	String dob;
	String mobile;
	String flightid1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBooking frame = new CheckBooking();
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
	public CheckBooking() {
		setTitle("Check Booking- CUSTOMER");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel()
		{
			public void paintComponent(Graphics g) {  
                Image img = Toolkit.getDefaultToolkit().getImage(  
                		CheckBooking.class.getResource("/images/Admin1.png"));  
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}

		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(1920,1080));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select Flight ID");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(589, 422, 100, 13);
		contentPane.add(lblNewLabel);
		
		//Searching present customer
		
		try 
		{
            FileReader reader = new FileReader("src/data/currentCustomer.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            while ((email = bufferedReader.readLine()) != null) 
            {
				password= bufferedReader.readLine();
				currentCustomerName= bufferedReader.readLine();
				gender= bufferedReader.readLine();
				dob= bufferedReader.readLine();
				mobile= bufferedReader.readLine();
            }
            reader.close();
 
        } 
		catch (IOException e) 
		{
            e.printStackTrace();
        }
		
		int count = 0;

	    try 
	    {
	      File file = new File("src/data/bookingData.txt");

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
	    String[] flightid = new String[count/10];
		try 
		{
            FileReader reader = new FileReader("src/data/bookingData.txt");
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
				if(Name.equals(currentCustomerName))
				{
					flightid[i]=flightID;
					i++;
				}
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
		comboBox.setBounds(711, 418, 107, 21);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("View Boarding Pass");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flightid1=comboBox.getSelectedItem().toString();
				if(flightid1.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Select Flight ID!");
				}
				else
				{	
					try 
					{
						BufferedWriter addFirst = new BufferedWriter(new FileWriter("src/data/currentTicket.txt"));
			            addFirst.write("");
			            addFirst.close();
			            
			            BufferedWriter add = new BufferedWriter(new FileWriter("src/data/currentTicket.txt",true));
			            
			            //Read bookingData.txt file
			            FileReader reader = new FileReader("src/data/bookingData.txt");
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
							
							
							if(Name.equals(currentCustomerName) && flightid1.equals(flightID))
							{
								
								
								add.write(flightID+"\n");
					            add.write(Name+"\n");
					            add.write(date+"\n");
					            add.write(seatClass+"\n");
					            add.write(from+"\n");
					            add.write(to+"\n");
					            add.write(departure+"\n");
					            add.write(arrival+"\n");
					            add.write(SeatNo+"\n");
					            add.write(price+"\n");
							}
			            }
						reader.close();
						add.close();
					}
					catch (IOException e1) 
					{
			            e1.printStackTrace();
			        }
					
					Ticket login= new Ticket();
					login.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setBounds(689, 515, 147, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeScreen login= new HomeScreen();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(1414, 24, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginScreen login= new LoginScreen();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(689, 599, 147, 21);
		contentPane.add(btnNewButton_2);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width, screenSize.height);
        setLocation(00,00);
        setVisible(true);
	}

}
