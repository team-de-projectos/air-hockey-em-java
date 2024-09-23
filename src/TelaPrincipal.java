/**
 *
 * @author caasieu
 */

import Classes.Jogador;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.SwingUtilities;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//  implements Runnable, KeyListener 
public class TelaPrincipal extends Frame {
    
    private final int width = 840;
    private final int height = 480;
    
    public TelaPrincipal() {
        
        PaintingField pf = new PaintingField(width, height);
        Jogador jogador_1 = new Jogador(0, 0, true, new Dimension(width, height));
        Jogador jogador_2 = new Jogador(0, 0, false, new Dimension(width, height));
        
        pf.addGameObject(jogador_1);
        pf.addGameObject(jogador_2);
        
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
        
        
        // Os controles serão colocados aqui (Rodrigo e Vinicius)
        pf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                
                // funcao chamada para movimentar o jogador
                // jogador_1.andar(45, 0);
                
                // Isso serve para pintar a tela novamente quando o jogador anda
                pf.repaint();
            } 
        });
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

}
