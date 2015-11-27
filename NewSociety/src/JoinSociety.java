import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class JoinSociety{
	private JList<String> list;
	private JButton backButton;
	private JLabel search;
	private JPanel joinPanel;
	private JFrame joinFrame;
	private String[] societies;
	
	public JoinSociety(){
		
		
		societies= new String[10];
				for (int i=0; i<societies.length; i++){
					societies[i]= "Stic";
				}
		list = new JList<String>(societies);
		backButton = new JButton("Home Page");
		
		search = new JLabel("Search Society");
		
		//button functionality
		backButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				joinFrame.dispose();
				//new NewSo
			}
		});
		
		
		
		//add to panel
		joinPanel = new JPanel();
		joinPanel.add(search);
		joinPanel.add(list, BorderLayout.AFTER_LAST_LINE);
		joinPanel.add(backButton, BorderLayout.SOUTH);
		
		
	//add to frame
		joinFrame= new JFrame();
		joinFrame.add(joinPanel);
		joinFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		joinFrame.setTitle("Join Society");
		joinFrame.setVisible(true);
		joinFrame.setLocation(400,200);
		joinFrame.setSize(600, 600);
	}


}
