package guiPackage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.*
;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;public class HomeScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen frame = new HomeScreen();
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
	public HomeScreen() {
		setTitle("Home Screen");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel()
		{
			public void paintComponent(Graphics g) {  
                Image img = Toolkit.getDefaultToolkit().getImage(  
                          HomeScreen.class.getResource("/images/homeScreenImage.jpg"));  
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}

		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(1920,1080));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login lg=new Login();
				lg.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(357, 558, 117, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SIGNUP");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp signUp=new SignUp();
				signUp.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(731, 558, 117, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ADMIN LOGIN");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLoginPage adminLogin=new AdminLoginPage();
				adminLogin.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(1075, 558, 117, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
		lblNewLabel.setBounds(700, 106, 148, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("AIRLINE RESERVATION SYSTEM");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(582, 167, 410, 43);
		contentPane.add(lblNewLabel_1);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width, screenSize.height);
        setLocation(00,00);
        setVisible(true);
	}
}
