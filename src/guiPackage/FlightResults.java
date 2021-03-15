package guiPackage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class FlightResults extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	String flightID;
	String flightName;
	String date;
	String from;
	String to;
	String business;
	String economy;
	String arrival;
	String departure;
	
	String bookflightID;
	String bookflightName;
	String bookdate;
	String bookfrom;
	String bookto;
	String bookbusiness;
	String bookeconomy;
	String bookarrival;
	String bookdeparture;
	String c1,c2,custName,c4,c5,c6;
	String seatClass;
	String price;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlightResults frame = new FlightResults();
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
	public FlightResults() {
		setTitle("Flight Results and Booking");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel()
		{
			public void paintComponent(Graphics g) {  
                Image img = Toolkit.getDefaultToolkit().getImage(  
                		FlightResults.class.getResource("/images/Admin1.png"));  
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}

		};
		contentPane.setBackground(Color.GRAY);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(1920,1080));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Flight Name");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(603, 248, 112, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Departure Time ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(603, 302, 112, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Arrival Time");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(603, 362, 100, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Class");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(603, 424, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Flight Id");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(642, 98, 61, 13);
		contentPane.add(lblNewLabel_4);
		
		
		
		int count = 0;

	    try 
	    {
	      File file = new File("src/data/search.txt");

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
            FileReader reader = new FileReader("src/data/search.txt");
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
		comboBox.setBounds(724, 94, 120, 21);
		contentPane.add(comboBox);
		
		
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeScreen login= new HomeScreen();
				login.setVisible(true);
				dispose();
			}
			
		});
		btnNewButton_1.setBounds(1413, 20, 85, 21);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(724, 245, 120, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(724, 299, 120, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(724, 359, 120, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Business", "Economy"}));
		comboBox_1.setBounds(724, 420, 118, 21);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_6 = new JLabel("Seat");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(603, 531, 45, 13);
		contentPane.add(lblNewLabel_6);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1A", "1B", "1C", "1D", "1E", "1F", "2A", "2B", "2C", "2D", "2E", "2F", "3A", "3B", "3C", "3D", "3E", "3F", "4A", "4B", "4C", "4D", "4E", "4F", "5A", "5B", "5C", "5D", "5E", "5F", "6A", "6B", "6C", "6D", "6E", "6F", "7A", "7B", "7C", "7D", "7E", "7F", "8A", "8B", "8C", "8D", "8E", "8F", "9A", "9B", "9C", "9D", "9E", "9F", "10A", "10B", "10C", "10D", "10E", "10F", "11A", "11B", "11C", "11D", "11E", "11F", "12A", "12B", "12C", "12D", "12E", "12F", "13A", "13B", "13C", "13D", "13E", "13F", "14A", "14B", "14C", "14D", "14E", "14F", "15A", "15B", "15C", "15D", "15E", "15F", "16A", "16B", "16C", "16D", "16E", "16F", "17A", "17B", "17C", "17D", "17E", "17F", "18A", "18B", "18C", "18D", "18E", "18F", "19A", "19B", "19C", "19D", "19E", "19F", "20A", "20B", "20C", "20D", "20E", "20F", "21A", "21B", "21C", "21D", "21E", "21F", "22A", "22B", "22C", "22D", "22E", "22F", "23A", "23B", "23C", "23D", "23E", "23F", "24A", "24B", "24C", "24D", "24E", "24F", "25A", "25B", "25C", "25D", "25E", "25F", "26A", "26B", "26C", "26D", "26E", "26F", "27A", "27B", "27C", "27D", "27E", "27F", "28A", "28B", "28C", "28D", "28E", "28F", "29A", "29B", "29C", "29D", "29E", "29F", "30A", "30B", "30C", "30D", "30E", "30F"}));
		comboBox_2.setBounds(724, 527, 118, 21);
		contentPane.add(comboBox_2);
		
		
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchFlight login= new SearchFlight();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(911, 602, 85, 21);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_7 = new JLabel("Price");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(603, 479, 45, 13);
		contentPane.add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.setBounds(724, 476, 120, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Payment Type");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(911, 531, 91, 13);
		contentPane.add(lblNewLabel_8);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Credit Card", "Debit Card", "UPI"}));
		comboBox_3.setBounds(1012, 527, 110, 21);
		contentPane.add(comboBox_3);
		
		JLabel lblNewLabel_9 = new JLabel("Flight Details");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblNewLabel_9.setBounds(734, 186, 185, 35);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("SELECT FLIGHT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flightID=comboBox.getSelectedItem().toString();
				String flightid1;
				try 
				{
		            FileReader reader = new FileReader("src/data/search.txt");
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
		            		textField_1.setText(departure);
		            		textField_2.setText(arrival);
		            		textField.setText(flightName);
		            		bookflightID=flightid1;
		            		bookflightName=flightName;
		            		bookdate=date;
		            		bookfrom=from;
		            		bookto=to;
		            		bookbusiness=business;
		            		bookeconomy=economy;
		            		bookarrival=arrival;
		            		bookdeparture=departure;
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
		btnNewButton.setBounds(712, 140, 154, 21);
		contentPane.add(btnNewButton);
		
		
		
		JButton btnNewButton_4 = new JButton("Select Class");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String choice=comboBox_1.getSelectedItem().toString();
				if(choice.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Choose Class!");
				}
				else if(choice.equals("Business"))
				{
					textField_3.setText(business);
				}
				else
				{
					textField_3.setText(economy);
				}
			}
		});
		btnNewButton_4.setBounds(911, 420, 120, 21);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("Proceed");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					String seatNo=comboBox_2.getSelectedItem().toString();
					String choice=comboBox_1.getSelectedItem().toString();
					if(choice.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Choose Class!");
					}
					else if(choice.equals("Business"))
					{
						seatClass="Business";
						price=bookbusiness;
					}
					else
					{
						seatClass="Economy";
						price=bookeconomy;
					}
					FileReader reader = new FileReader("src/data/currentCustomer.txt");
		            BufferedReader bufferedReader = new BufferedReader(reader);
					while ((c1 = bufferedReader.readLine()) != null) 
		            {
						c2 = bufferedReader.readLine();
						custName = bufferedReader.readLine();
						c4 = bufferedReader.readLine();
						c5 = bufferedReader.readLine();
						c6 = bufferedReader.readLine();
		            }
					reader.close();
		            BufferedWriter addFirst = new BufferedWriter(new FileWriter("src/data/currentTicket.txt"));
		            addFirst.write("");
		            addFirst.close();
		            
		            BufferedWriter add = new BufferedWriter(new FileWriter("src/data/currentTicket.txt",true));
		            BufferedWriter addCurrent = new BufferedWriter(new FileWriter("src/data/bookingData.txt",true));
		            
		            add.write(bookflightID+"\n");
		            addCurrent.write(bookflightID+"\n");
		            
		            add.write(custName+"\n");
		            addCurrent.write(custName+"\n");
		            
		            add.write(bookdate+"\n");
		            addCurrent.write(bookdate+"\n");
		            
		            add.write(seatClass+"\n");
		            addCurrent.write(seatClass+"\n");
		            
		            add.write(bookfrom+"\n");
		            addCurrent.write(bookfrom+"\n");
		            
		            add.write(bookto+"\n");
		            addCurrent.write(bookto+"\n");
		            
		            add.write(bookdeparture+"\n");
		            addCurrent.write(bookdeparture+"\n");
		            
		            add.write(bookarrival+"\n");
		            addCurrent.write(bookarrival+"\n");
		            
		            add.write(seatNo+"\n");
		            addCurrent.write(seatNo+"\n");
		            
		            add.write(price+"\n");
		            addCurrent.write(price+"\n");
		            
		            add.close();
		            addCurrent.close();
		        } 
				catch (IOException e1) 
				{
		            e1.printStackTrace();
		        }
				
				
				
				
				Ticket login= new Ticket();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(770, 602, 85, 21);
		contentPane.add(btnNewButton_2);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width, screenSize.height);
        setLocation(00,00);
        setVisible(true);
	}
}
