/**
 *
 * @author caasieu
 */

import Classes.Jogador;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingUtilities;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//  implements Runnable, KeyListener 
public class TelaPrincipal extends Frame {
    
    private final int width = 840;
    private final int height = 480;
    
    public TelaPrincipal() {
        
        PaintingField pf = new PaintingField(width, height); // cria instancia do campo que a gente vai pintar o nosso jogo
        Jogador jogador_1 = new Jogador(0, 0, true, new Dimension(width, height));  // cria jogador 1
        Jogador jogador_2 = new Jogador(0, 0, false, new Dimension(width, height)); // cria jogador 2
        
        // adiciona os jogadores 1 e 2 ao array de jogador da classe PaintField que eh o nosso campo
        pf.addGameObject(jogador_1); 
        pf.addGameObject(jogador_2);
        
        add(pf);
        
        setLayout(null);
        setSize(width, height); // define o tamanho da tela
        setLocationRelativeTo(null); // define a posicao da tela, no caso ela vai ficar no centro
        setTitle("AirHockey - Game do time!"); // define o titulo da tela que vai aparecer em cima da janela
        
        
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
