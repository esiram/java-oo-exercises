import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormRobot {

	private JFrame frmInteractiveRobots;
	//private <Robot> listModel;
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormRobot window = new FormRobot();
					window.frmInteractiveRobots.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormRobot() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInteractiveRobots = new JFrame();
		frmInteractiveRobots.setTitle("Interactive Robots");
		frmInteractiveRobots.setBounds(100, 100, 450, 300);
		frmInteractiveRobots.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInteractiveRobots.getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setBounds(150, 30, 253, 199);
		frmInteractiveRobots.getContentPane().add(list);
		
		JButton btnNewButton = new JButton("Create Robot");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Enter the new robot's name.");
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		btnNewButton.setBounds(28, 30, 112, 23);
		frmInteractiveRobots.getContentPane().add(btnNewButton);

		
		JButton btnNewButton_1 = new JButton("Select Robot");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Choose your robot by name.");
			}
		});
		btnNewButton_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		btnNewButton_1.setBounds(28, 67, 112, 23);
		frmInteractiveRobots.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Move Robot");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("How many moments should the robot move?");
			}
		});
		btnNewButton_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		btnNewButton_2.setBounds(28, 101, 112, 23);
		frmInteractiveRobots.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Rotate Robot");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Choose your robot by name.");
			}
		});
		btnNewButton_3.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		btnNewButton_3.setBounds(28, 139, 112, 23);
		frmInteractiveRobots.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Compute Robot Distance");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Select two different robots.");
			}
		});
		btnNewButton_4.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		btnNewButton_4.setBounds(28, 173, 112, 23);
		frmInteractiveRobots.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Exit");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Goodbye.");
			}
		});
		btnNewButton_5.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		btnNewButton_5.setBounds(28, 206, 112, 23);
		frmInteractiveRobots.getContentPane().add(btnNewButton_5);

	}
}
