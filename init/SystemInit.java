package init;
import assets.content.UIclasses.myWindow;

public class SystemInit {
    public static myWindow window;
    
    public static void main (String args[]){
        window = new myWindow();
        window.setVisible(true);
    }
}  
 