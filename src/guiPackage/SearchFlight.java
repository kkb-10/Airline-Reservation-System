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
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class SearchFlight extends JFrame {

	private JPanel contentPane;
	
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
					SearchFlight frame = new SearchFlight();
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
	public SearchFlight() {
		setTitle("Search Flights");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel()
		{
			public void paintComponent(Graphics g) {  
                Image img = Toolkit.getDefaultToolkit().getImage(  
                          SearchFlight.class.getResource("/images/Admin1.png"));  
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}

		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(1920,1080));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("From");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(489, 330, 29, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("To");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(797, 330, 29, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Departure Date");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(605, 426, 96, 19);
		contentPane.add(lblNewLabel_2);
		
		
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeScreen login= new HomeScreen();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(1427, 10, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(752, 426, 109, 19);
		contentPane.add(dateChooser);
		
		JPanel panel = new JPanel()
		{
			public void paintComponent(Graphics g) {  
                Image img = Toolkit.getDefaultToolkit().getImage(  
                          SearchFlight.class.getResource("/images/locationicon.png"));  
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}

		};
		panel.setBounds(523, 314, 38, 32);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel() {
			public void paintComponent(Graphics g) {
				Image img = Toolkit.getDefaultToolkit().getImage(  
                        SearchFlight.class.getResource("/images/locationicon.png"));  
              g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		panel_1.setBounds(828, 314, 38, 32);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel() {
			public void paintComponent(Graphics g) {
				Image img = Toolkit.getDefaultToolkit().getImage(  
                        SearchFlight.class.getResource("/images/Calendaricon.png"));  
              g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		panel_1_1.setBounds(704, 415, 38, 38);
		contentPane.add(panel_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mumbai - (BOM)", "Bangalore - (BLR)", "Chennai - (MAA)", "Kolkata - (CCU)", "Lucknow - (LKO)", "Amritsar - (ATQ)", "Visakhapatnam - (VTZ)", "Kannur - (CNN)", "Surat - (STV)", "Indore - (IDR)", "Guwahati- (GAU)"}));
		comboBox.setBounds(571, 326, 130, 21);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Chennai - (MAA)", "Mumbai - (BOM)", "Bangalore - (BLR)", "Kolkata - (CCU)", "Lucknow - (LKO)", "Amritsar - (ATQ)", "Visakhapatnam - (VTZ)", "Kannur - (CNN)", "Surat - (STV)", "Indore - (IDR)", "Guwahati- (GAU)"}));
		comboBox_1.setBounds(876, 326, 131, 21);
		contentPane.add(comboBox_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginScreen login= new LoginScreen();
				login.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(822, 567, 150, 21);
		contentPane.add(btnBack);
		
		JButton btnNewButton = new JButton("Search Flights");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String date1;
				String from1;
				String to1;
				date1  = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
				from1 = comboBox.getSelectedItem().toString();
				to1= comboBox_1.getSelectedItem().toString();
				System.out.println(date1);
				System.out.println(from1);
				System.out.println(to1);
				if(date1.equals("") || from1.equals("") || to1.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Cannot leave a field Empty!");
				}
				else
				{
					int flag=0;
					try 
					{
						FileReader reader = new FileReader("src/data/flightData.txt");
			            BufferedReader bufferedReader = new BufferedReader(reader);
			            
			            BufferedWriter addFirst = new BufferedWriter(new FileWriter("src/data/search.txt"));
			            addFirst.write("");
			            addFirst.close();
			            
			            BufferedWriter add = new BufferedWriter(new FileWriter("src/data/search.txt",true));
			            while ((flightID = bufferedReader.readLine()) != null) 
			            {
			            	
			            	flightName= bufferedReader.readLine();
			            	date= bufferedReader.readLine();
			            	from= bufferedReader.readLine();
			            	to= bufferedReader.readLine();
			            	business= bufferedReader.readLine();
			            	economy= bufferedReader.readLine();
			            	departure= bufferedReader.readLine();
			            	arrival= bufferedReader.readLine();
			            	
			            	if( date1.equals(date) && from1.equals(from) && to1.equals(to) )
			            	{
			            		flag=1;
					            add.write(flightID+"\n");
								add.write(flightName+"\n");
								add.write(date+"\n");
								add.write(from+"\n");
								add.write(to+"\n");
								add.write(business+"\n");
								add.write(economy+"\n");
								add.write(departure+"\n");
								add.write(arrival+"\n");
			            	}
			            }
			            reader.close();
			            add.close();
					} 
					catch (IOException e1)
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(flag==0)
					{
						JOptionPane.showMessageDialog(null,"No Flights Available for your current Search!");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Flights Available!");
						FlightResults login= new FlightResults();
						login.setVisible(true);
						dispose();
					}
		            
				}
				
				
			}
		});
		btnNewButton.setBounds(605, 567, 150, 21);
		contentPane.add(btnNewButton);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width, screenSize.height);
        setLocation(00,00);
        setVisible(true);
	}
}
