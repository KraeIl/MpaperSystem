package assets.content.UIclasses;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Color;
import java.awt.Font;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

public class Caixa extends JPanel{
    public int x, y, width, height;
    private LocalDateTime now;

    public Caixa(){

        x = 125;
        y = 50;

        setBackground(new Color(242, 240, 243));
        setVisible(true);
        setLayout(null);

        //Clock
        addClock();

        //MpaperTitle
        addTitle();
    }
    
    public void addClock(){
        
        JLabel tC = new JLabel();
        tC.setForeground(Color.BLACK);
        tC.setFont(new Font("arial", Font.BOLD, 50));
        tC.setBorder(null);
        tC.setBounds(100, 300, 800, 80);
        add(tC);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        Timer tm = new Timer();
        tm.scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                now = LocalDateTime.now();
                tC.setText(dtf.format(now));
            }
        }, 0, 1000);
    }

    public void addTitle(){
        
        JLabel t = new JLabel();
        t.setText("Mister Paper");
        t.setForeground(Color.BLACK);
        t.setFont(new Font("arial", Font.BOLD, 50));
        t.setBounds(100, 100, 600, 80);
        add(t);
    }

}
