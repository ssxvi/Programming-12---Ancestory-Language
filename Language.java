//Language Program
//
//@Trevor
//
//@1/20/21
//

import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.GridBagConstraints;  
import java.awt.GridBagLayout;



public class Language implements ActionListener{

    //JFrame objects
    JFrame frame;
    JPanel panel;
    JLabel label0, label1, label2, label3, label4, label5, label6, label7;
    JComboBox<String> cb1;
    JComboBox<String> cb2;
    JButton button0, button1, button2, button3;
    JTextField field0, field1, field2, field3;
    JCheckBox checkbox0, checkbox1, checkbox2;
    String lastSelectedItem;


    //Program variables
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
    static String output;

    
    
    //Constructor
    Language(String nameP, int numSpeakersP, String regionSpokenP, String wordOrderP){
        this.name = nameP;
        this.numSpeakers = numSpeakersP;
        this.regionsSpoken = regionSpokenP;
        this.wordOrder = wordOrderP;





    }

    public void generateDisplay(){
        //jframe stuff
        frame = new JFrame("french bad language");
        panel = new JPanel(new GridBagLayout());
    

        label0 = new JLabel("Welcome to our Linguist Database!");
        label1 = new JLabel("Welcome to program!");   
        label2 = new JLabel("List of Languages!!");
        label3 = new JLabel("Types of Languages");  
        field0 = new JTextField("Enter Name!");
        field1 = new JTextField("Enter Number of Speakers!");
        field2 = new JTextField("Enter Region!");
        field3 = new JTextField("Enter Word Order!");

        button0 = new JButton("Add Language!");
        button1 = new JButton("Remove Language");
        button2 = new JButton("i want to die x9");
        button3 = new JButton("Edit Language");

        checkbox0 = new JCheckBox("Mayan");
        checkbox1 = new JCheckBox("Mayan");
        checkbox2 = new JCheckBox("Mayan");
        
        frame.add(panel);

        GridBagConstraints c = new GridBagConstraints();
        
        c.fill = GridBagConstraints.BOTH; //makes element fill maximum horizontal space
        label0.setHorizontalAlignment(SwingConstants.CENTER); //centers element

        //Below is just the x and y coordinates of the element, as well as the size of the element


        label0.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setHorizontalAlignment(SwingConstants.CENTER);

        c.insets = new Insets(
        10,
        10,
        10,
        10);

        c.weightx = 1;
        c.weighty = 1;


        // 0
        c.gridy = 0;   
        c.gridwidth = 4;


        c.gridx = 0;

        panel.add(label0, c);




        // 1
        c.gridy = 1;   
        c.gridwidth = 2;


        c.gridx = 0;
        panel.add(field0, c);
        
        c.gridx = 2;
        c.gridwidth = 1;
        panel.add(checkbox0, c);
        checkbox0.addActionListener(this);


        c.gridx = 3;

        panel.add(button3, c);  
        button3.addActionListener(this);

        // 2
        c.gridy = 2;   
        c.gridwidth = 2;


        c.gridx = 0;
        panel.add(label2, c);

        c.gridx = 2;
        panel.add(label3, c);




        // 3
        c.gridy = 3;  


        c.gridx = 0;
        //cb1.setSelectedIndex(-1);
        //cb1.addActionListener(this);
        //panel.add(cb1, c);

        c.gridx = 2;
       // cb2.setSelectedIndex(-1);
        //cb2.addActionListener(this);
       // panel.add(cb2, c);





        // 4
        c.gridy = 4;   
        c.gridwidth = 1;

        c.gridx = 0;
        panel.add(button0, c);
        button0.addActionListener(this);

        c.gridx = 1;
        panel.add(button1, c);
        button1.addActionListener(this);

        c.gridx = 2;
        panel.add(button2, c);  
        button2.addActionListener(this);



        // 5
     

        c.gridy = 6;
        
        //Box.createHorizontalStrut(200);



        frame.pack();
        frame.setVisible(true);


    }
    public String getInfo(){
        return name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ". The languge follows the word order: " + wordOrder + ".";
    }


    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == cb1){

        }

        if (e.getSource() == cb2){

        }


        if (e.getSource() == button0){
            

        } else if (e.getSource() == button1){


        } else if (e.getSource() == button2){


        } else if (e.getSource() == button3){


        }

    }
    
    //Main
    public static void main(String args[]){

        Language English = new Language("English", 1000, "West", "subject-verb-object");
        
        English.generateDisplay();
    }

}


//Test code

    /*
    Language English = new Language("English", 1000, "West", "subject-verb-object");
    
    English.getInfo();
    System.out.println(output);


    Language Mayan = new Mayan("Yucatec", 812633);
    Language Chinese = new SinoTibetan("chwinese", 812633);
    System.out.println(Mayan.getInfo());
    System.out.println(Chinese.getInfo());
    */ 