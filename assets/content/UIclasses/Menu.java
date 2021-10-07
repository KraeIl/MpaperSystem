package assets.content.UIclasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel{
    public int x, y, width, height;
    public boolean CCreated = false;
    public boolean LCreated = false;

    public Menu(Homepage home){    
        
        x = 0;
        y = 0;
        width = 150;

        setBackground(new Color(22, 33, 53));

        setVisible(true);
        setLayout(null);

        //Botões
        for (int i = 0; i < 3; i++){
            String bName = switch (i) {
                case 0 -> "Caixa";
                case 1 -> "Lan";
                case 2 -> "Ponto";
                default -> "";
            };

            Button b = new Button(bName);
            b.setName(bName);

            //ButtonAtributes
            b.x = 0;
            b.y = 100 + i*50;
            b.width = 150;
            b.height = 50;
            
            //SettingBounds
            b.setBounds(b.x, b.y, b.width, b.height);

            //Adding b
            add(b);
            
            //Setting actionListener
            b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(b.getName().equals("Caixa")){
                        
                        if (LCreated){
                            home.deleteLan();
                            LCreated = false;
                        }
                        if (!CCreated){
                            CCreated = home.CreateCaixa();
                            home.h.t.setText("Caixa");
                            
                        }
                    } else if(b.getName().equals("Lan")){
                        
                        if (CCreated){
                            home.deleteCaixa();
                            CCreated = false;
                        }
                        if (!LCreated){
                            LCreated = home.CreateLan();
                            home.h.t.setText("Lan House");
                            
                        }
                        

                    } else if(b.getName().equals("Ponto")){
                        
                    }
                    
                }
            });
            b.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseEntered(java.awt.event.MouseEvent evt) { 
                    b.paintHover();
                }
            
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    b.deleteHover();
                }
            });
        }
    }
}
