import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DeleteSociety implements ActionListener {
	private JFrame frame = new JFrame();
	private JLabel label;
	private JButton button;
	private JTextField text;
	private JPanel panel;
	private JPanel button_panel;
	
	public DeleteSociety(){
	
		//Create button to click
		button = new JButton("Delete Society");
        button.addActionListener(this);
        
        //Create label and text field
        label = new JLabel("What is the name of the society you wish to delete");
        text = new JTextField();
        
        //Add button to South position of panel
        button_panel = new JPanel();
        button_panel.setLayout(new BorderLayout());
        button_panel.add(button, BorderLayout.SOUTH);
        
        //Add label and text field to panel
        panel = new JPanel();
        panel.setLayout(new GridLayout(6,2));
        panel.add(label);
        panel.add(text);
        
     // set up the frame and display it
        frame.add(button_panel, BorderLayout.SOUTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Create a New Society");
        final int FRAME_WIDTH = 300;
    	final int FRAME_HEIGHT = 400;
    	frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);        
        frame.setVisible(true);
        
     

}

	public void actionPerformed(ActionEvent e) {
		File f = new File(text.getText().toLowerCase() + ".txt");
      	if(f.exists() && !f.isDirectory()) { 
      		f.delete();
      		frame.dispose();
      		new deletedmessage();
      	}
      	else{
      		frame.dispose();
      		new errormessage2();
      	}
		
	}
}
