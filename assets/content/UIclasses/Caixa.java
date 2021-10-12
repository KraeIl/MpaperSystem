package assets.content.UIclasses;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Color;
import java.awt.Font;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  
import assets.content.forms.*;
import java.awt.event.ActionEvent;


public class Caixa extends JPanel{
    public int x, y, width, height;
    private LocalDateTime now;

    public Caixa(){

        x = 125;
        y = 50;

        setBackground(new Color(242, 240, 243));
        setVisible(true);
        setLayout(null);
        setFocusable(true);
        requestFocusInWindow();

        //Clock
        addClock();

        //MpaperTitle
        addTitle();

        //Setting Keybidings
        AbstractAction OpenVenda = new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new Venda();
            }
        };
        AbstractAction OpenComp = new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new VendaComp();
            }
        };
        AbstractAction OpenRetirada = new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new Retirada();
            }
        };
        AbstractAction OpenFechamento = new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new Fechamento();
            }
        };

        getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("NUMPAD1"), "Venda");
        getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("NUMPAD2"), "Comp");
        getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("NUMPAD3"), "Retirada");
        getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("F"), "Fechamento");

        getActionMap().put("Venda", OpenVenda);
        getActionMap().put("Comp", OpenComp);
        getActionMap().put("Retirada", OpenRetirada);
        getActionMap().put("Fechamento", OpenFechamento);
    }
    
    public void addClock(){
        
        JLabel tC = new JLabel();
        tC.setForeground(Color.BLACK);
        tC.setFont(new Font("arial", Font.BOLD, 40));
        tC.setBorder(null);
        tC.setBounds(50, 300, 600, 80);
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
        t.setFont(new Font("arial", Font.BOLD, 40));
        t.setBounds(50, 100, 600, 80);
        add(t);
    }
}
