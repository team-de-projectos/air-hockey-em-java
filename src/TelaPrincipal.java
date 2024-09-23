/**
 *
 * @author caasieu
 */


import java.awt.Frame;
import javax.swing.SwingUtilities;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// import static components.Lado.*;


//  implements Runnable, KeyListener 
public class TelaPrincipal extends Frame {
    
    private final int width = 840;
    private final int height = 480;
    //private final CardLayout cardLayout;
    //private final JPanel mainPanel;
    
    public TelaPrincipal() {
        
        PaintingField pf = new PaintingField(width, height);
        add(pf);
        
        setLayout(null);
        setSize(width, height);
        setLocationRelativeTo(null);
        setTitle("AirHockey - Game do time!");
        
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }
}
