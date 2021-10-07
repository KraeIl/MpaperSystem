package assets.content.UIclasses;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.*;



public class Button extends JButton{ 
    public int x, y, width, height;

    public Button(String bName){
        super(bName);
        setBorder(null);
        setFocusPainted(false);
        setBackground(new Color(22, 33, 53));
        setForeground(Color.WHITE);
        setFont(new Font("arial", Font.BOLD, 25));
    }   
    public void paintSideBar(){
        setBorder(BorderFactory.createMatteBorder(0, 2, 0, 0, new Color(216, 223, 242)));
    }
    public void deleteSideBar(){
        setBorder(null);
    }
}
