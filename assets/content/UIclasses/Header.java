package assets.content.UIclasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Header extends JPanel{
    public int x, y, width, height;
    public JLabel t; 
    public Button b1;
    public Button b2;
    public List<Button> buttons;

    public Header(String Titulo, int bx, JFrame window){
        x = 200;
        y = 0;
        height = 50;
        buttons = new ArrayList<>();

        setBackground(new Color(65, 120, 203));

        setVisible(true);
        setLayout(null);

        //Title
        t = new JLabel();
        t.setText(Titulo);
        t.setForeground(Color.WHITE);
        t.setFont(new Font("arial", Font.BOLD, 30));
        t.setBorder(null);
        t.setBounds(50, 10, 200, 35);
        add(t);

        //Exit/Min buttons
        
        //Exit button
        b1 = new Button("X");
        b1.setName("X");

            //ButtonCustomizations
            b1.setVisible(true);
            b1.setForeground(new Color(22, 33, 53));
            b1.setBackground(new Color(65,120,203));
            b1.setFont(new Font("arial", Font.BOLD, 30));
        
            //ButtonBounds
            b1.x = (bx - 100) + 50;
            b1.y = 0;
            b1.width = 50;
            b1.height = 50;
            b1.setBounds(b1.x, b1.y, b1.width, b1.height);
            System.out.print("Width: " + getWidth() + "\n");
            System.out.print("B.x: " + b1.x + "\n");

            //Adding Button
            buttons.add(b1);
            add(b1);

        //Min button
        b2 = new Button("-");
        b2.setName("-");

            //ButtonCustomizations
            b2.setVisible(true);
            b2.setForeground(new Color(22, 33, 53));
            b2.setBackground(new Color(65,120,203));
            b2.setFont(new Font("arial", Font.BOLD, 30));
        
            //ButtonBounds
            b2.x = (bx - 100);
            b2.y = 0;
            b2.width = 50;
            b2.height = 50;
            b2.setBounds(b2.x, b2.y, b2.width, b2.height);
            System.out.print("Width: " + getWidth() + "\n");
            System.out.print("B.x: " + b2.x + "\n");

            //Adding Button
            buttons.add(b2);
            add(b2);

        //Buttons listeners
        for (Button b: buttons){
            b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if (b.getName().equals("-")){
                        window.setState(JFrame.ICONIFIED);
                    } else if (b.getName().equals("X")){
                        window.dispose();;
                        if (window.getName().equals("Mpaper")){
                            System.exit(0);
                        }
                    }
                }
            });
            b.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    b.setBackground(new Color(124, 153, 230));
                    b.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, new Color(216, 223, 242)));
                    
                    }
                
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    b.setBackground(new Color(65,120,203));
                    b.setBorder(null);
                }
            });
        }
    }
}