
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caasieu
 */


import Classes.Jogador;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import java.util.ArrayList;
import java.util.List;


public class PaintingField extends Canvas {
    private final List<Jogador> jogadores; // um array de jogadores do tipo "Jogador"
    private final BufferedImage offscreenImage;
    
    public PaintingField(int width, int height) {
        setSize(new Dimension(width, height));
        this.setBackground(Color.BLACK);
        jogadores = new ArrayList<>(); // cria uma lista vazia de jogadores
        
        
        setFocusable(true); // permite o canvas receber events
        requestFocusInWindow(); // pede o foco para usar o tecladoé
        offscreenImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    
    }
    
     public void addGameObject(Jogador obj) {
        jogadores.add(obj);
        repaint(); // Request a repaint to show the new object
    }
    
    @Override
    public void paint(Graphics g) {  
        
        Graphics2D g2 = (Graphics2D) offscreenImage.getGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // isso nao eh importante por agora
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, offscreenImage.getWidth(), offscreenImage.getHeight());
        
        // desenhando as bordas e a linha do meio e pintando todas de branco
        g2.setColor(new Color(255,255,255));    
        g2.fillRect(0, 0, 10, this.getSize().height/3);
        g2.fillRect(0, 320, 10, this.getSize().height/3);
        g2.fillRect(this.getSize().width - 10, 0, 15, this.getSize().height/3);
        g2.fillRect(this.getSize().width - 10, 320, 15, this.getSize().height/3);
        g2.fillRect(this.getSize().width/2, 0, 10, this.getSize().height);
        
        // desenhando a bolinha no meio
        g2.drawOval(this.getSize().width/2 - 40, this.getSize().height/2 - 45, 90, 90); 
        
        
        // desenha todos os jogadores, isso eh um loop tambem possivel em java
        for (Jogador obj : jogadores) {
            obj.draw(g2);
        }
        
        
        g2.dispose();
        g.drawImage(offscreenImage, 0, 0, null);
        
    }  
    
}
