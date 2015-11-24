/*This class contains the method for creating the first window to select create society and etc*/
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfigTemplate;

import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

import java.awt.Graphics;
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
		
		frame = new JFrame(" MUN Society Managment");
		frame.setBounds(500, 500, 489, 357);
		frame.setLocation(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		//Creates create society button
		JButton btnNewButton = new JButton("Create Society");
		btnNewButton.setBorder(BorderFactory.createLineBorder(Color.red));
		btnNewButton.setBackground(Color.orange);
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
		btnJoinSociety.setBorder(BorderFactory.createLineBorder(Color.red));
		
		btnJoinSociety.setBackground(Color.orange);
		btnJoinSociety.setBounds(145, 111, 146, 25);
		frame.getContentPane().add(btnJoinSociety);
		
		//Creates Hold election button
		JButton btnHoldElection = new JButton("Hold Election");
		btnHoldElection.setBounds(145, 149, 146, 25);
		btnHoldElection.setBorder(BorderFactory.createLineBorder(Color.red));
		btnHoldElection.setBackground(Color.orange);
		frame.getContentPane().add(btnHoldElection);
		
		//Creates Message Society button
		JButton btnMessageSociety = new JButton("Message Society");
		btnMessageSociety.setBounds(145, 185, 146, 25);
		btnMessageSociety.setBorder(BorderFactory.createLineBorder(Color.red));
		btnMessageSociety.setBackground(Color.orange);
		frame.getContentPane().add(btnMessageSociety);
		
		//Creates Label

		 
		JLabel lblWhatWouldYou = new JLabel("What would you like to do?");
		lblWhatWouldYou.setBounds(132, 27, 175, 16);

		lblWhatWouldYou.setForeground(Color.RED);
		frame.getContentPane().add(lblWhatWouldYou);
		
		//Creates Delete society button
		JButton btnDeleteSociety = new JButton("Delete Society");
		btnDeleteSociety.setBorder(BorderFactory.createLineBorder(Color.red));
		btnDeleteSociety.setBackground(Color.orange);
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
