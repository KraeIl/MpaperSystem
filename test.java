import javax.swing.*;
import java.awt.event.*;

public class test { 

    public static void main(String args[]){

        JFrame f=new JFrame("Button Example");
        JPanel p= new JPanel();  
        JButton b=new JButton("Click Here");


        b.setBounds(50,100,95,30);
        p.setSize(1600,900);  
        b.setName("Click Here");

        f.add(p);
        p.add(b);  
        f.setSize(1600,900);  
        f.setLayout(null);  
        f.setVisible(true);   
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                if (b.getName().equals("Click Here")){
                    System.out.println("You clicked the button, using an ActionListener");
                }
            }
        }); 
    }
}
