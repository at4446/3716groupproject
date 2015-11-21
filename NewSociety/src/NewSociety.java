import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;

public class NewSociety implements ActionListener {
    private JFrame frame = new JFrame();
    
    private JTextField id_text;
    private JTextField major_text;
    private JTextField desc_text;
    private JTextField contact_text;
    private JTextField name_text;
    
    private JLabel name;
    private JLabel id;
    private JLabel major;
    private JLabel desc;
    private JLabel contact;
    
    private JButton button;
    
    private JPanel buttonpanel;
    private JPanel input_panel;
    
    
    

    public NewSociety() {
    	

        // the clickable button
        button = new JButton("Save Society");
        button.addActionListener(this);
        
        //textField
        
        id_text = new JTextField();
        major_text = new JTextField();
        desc_text = new JTextField();
        contact_text = new JTextField();
        name_text = new JTextField();
        
        //label
        name= new JLabel("Enter your name: ");        
        id= new JLabel("Student ID: ");
        major= new JLabel("Major: ");
        desc= new JLabel("Description: ");
        contact= new JLabel("Contact Info: ");


        // the panel with the button and text
        buttonpanel = new JPanel();
        buttonpanel.setLayout(new BorderLayout());
        buttonpanel.add(button, BorderLayout.SOUTH);       
        
        
        //ADD labels and input buttons TO PANEL
        input_panel = new JPanel();
        input_panel.setLayout(new GridLayout(5,2));
        input_panel.add(name);
        input_panel.add(name_text);
        input_panel.add(id);
        input_panel.add(id_text);
        input_panel.add(major);
        input_panel.add(major_text);
        input_panel.add(desc);
        input_panel.add(desc_text);
        input_panel.add(contact);
        input_panel.add(contact_text);

        // set up the frame and display it
        frame.add(buttonpanel, BorderLayout.SOUTH);
        frame.add(input_panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Create a New Society");
        final int FRAME_WIDTH = 300;
    	final int FRAME_HEIGHT = 400;
    	frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);        
        frame.setVisible(true);
    }

    // process the button clicks
    public void actionPerformed(ActionEvent event) {
    	try {
    	   BufferedWriter outfile = new BufferedWriter(new FileWriter("societies.txt"));
    	   outfile.append("Students name: ");
    	   outfile.append(name_text.getText());
    	   outfile.append("Students id: ");
    	   outfile.append(id_text.getText());
    	   outfile.append("Major: ");
    	   outfile.append(major_text.getText());
    	   outfile.append("Description: ");
    	   outfile.append(desc_text.getText());
    	   outfile.append("Contact Info: ");
    	   outfile.append(contact_text.getText());
    	   outfile.close();
    	}
    	   
       catch(FileNotFoundException e) {
           System.out.println("File not found.");
       }
       catch(NullPointerException j){
           System.out.println("Null.");
       }
       catch(IOException k){
           System.out.println("IO Exception.");            
       }
    };

    // create one Frame
    public static void main(String[] args) {
    	new NewSociety();
    }
    }