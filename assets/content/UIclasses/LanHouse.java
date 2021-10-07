package assets.content.UIclasses;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Color;
import java.awt.Font;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

public class LanHouse extends JPanel{
    public int x, y, width, height;
    private LocalDateTime now;

    public LanHouse(){

        x = 150;
        y = 50;

        setBackground(new Color(242, 240, 243));
        setVisible(true);
        setLayout(null);

        //Clock
        addClock();
    }
    
    public void addClock(){
        
        JLabel t = new JLabel();
        t.setForeground(Color.BLACK);
        t.setFont(new Font("arial", Font.BOLD, 50));
        t.setBorder(null);
        t.setBounds(200, 400, 800, 80);
        add(t);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        Timer tm = new Timer();
        tm.scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                now = LocalDateTime.now();
                t.setText(dtf.format(now));
            }
        }, 0, 1000);
    }

}
