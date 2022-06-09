package javassk;
import java.awt.Toolkit;
public class JavaSSK {
    public static void main(String[] args) {
        Toolkit toolKit = Toolkit.getDefaultToolkit();
        int locationX= (int)((toolKit.getScreenSize().width - 1280)/2);
        int locationY = (int)((toolKit.getScreenSize().height - 720)/2);
        
        FmLogin fmhome = new FmLogin();
        fmhome.setLocation(locationX, locationY);
        fmhome.setVisible(true);
    }
    
}
