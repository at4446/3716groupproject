/*This class contains the method for creating the first window to select create society and etc*/
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Start_window {

	JFrame frame;

	/**
	 * Create the application.
	 */
	public Start_window() {
		initialize(); // Calls initialize
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() { //Creates the window
		frame = new JFrame();
		frame.setBounds(500, 500, 489, 357);
		frame.setLocation(700, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		//Creates create society button
		JButton btnNewButton = new JButton("Create Society");
		btnNewButton.addActionListener(new ActionListener() {
			//Performs the button click
			public void actionPerformed(ActionEvent event1) {
				frame.dispose();
				new NewSociety();//Calls the method newsociety to create new society
			}
		});
		btnNewButton.setBounds(145, 73, 146, 25);
		frame.getContentPane().add(btnNewButton);
		
		//Creates Jin society button
		JButton btnJoinSociety = new JButton("Join Society");
		//btnJoinSociety.setBorder(BorderFactory.createLineBorder(Color.pink));
		btnJoinSociety.setBounds(145, 111, 146, 25);
		frame.getContentPane().add(btnJoinSociety);
		
		//Creates Hold election button
		JButton btnHoldElection = new JButton("Hold Election");
		btnHoldElection.setBounds(145, 149, 146, 25);
		frame.getContentPane().add(btnHoldElection);
		
		//Creates Message Society button
		JButton btnMessageSociety = new JButton("Message Society");
		btnMessageSociety.setBounds(145, 185, 146, 25);
		frame.getContentPane().add(btnMessageSociety);
		
		//Creates Label
		JLabel lblWhatWouldYou = new JLabel("What would you like to do?");
		lblWhatWouldYou.setBounds(132, 27, 175, 16);
		frame.getContentPane().add(lblWhatWouldYou);
		
		//Creates Delete society button
		JButton btnDeleteSociety = new JButton("Delete Society");
		btnDeleteSociety.addActionListener(new ActionListener() {
			
			//Performs the action of the button clicked
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new DeleteSociety();
			}
		});
		btnDeleteSociety.setBounds(145, 223, 146, 25);
		frame.getContentPane().add(btnDeleteSociety);
	}
}
