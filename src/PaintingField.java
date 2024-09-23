
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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import java.util.ArrayList;
import java.util.List;


public class PaintingField extends Canvas {
    private List<Jogador> jogadores;
    private BufferedImage offscreenImage;
    
    public PaintingField(int width, int height) {
        setSize(new Dimension(width, height));
        this.setBackground(Color.BLACK);
        jogadores = new ArrayList<>();
        
        setFocusable(true); // Make the painting field focusable to receive key events
        requestFocusInWindow(); // Request focus for key events
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
        
        // Clear the offscreen image
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, offscreenImage.getWidth(), offscreenImage.getHeight());
        
        g2.setColor(new Color(255,255,255));    
        g2.fillRect(0, 0, 10, this.getSize().height/3);
        g2.fillRect(0, 320, 10, this.getSize().height/3);
        g2.fillRect(this.getSize().width - 10, 0, 15, this.getSize().height/3);
        g2.fillRect(this.getSize().width - 10, 320, 15, this.getSize().height/3);
        g2.fillRect(this.getSize().width/2, 0, 10, this.getSize().height);
        
        //g2.drawOval(this.getSize().width/2 - 55, this.getSize().height/2 - 60, 120, 120); 
        //g2.drawOval(this.getSize().width/2 - 25, this.getSize().height/2 - 30, 60, 60); 
        g2.drawOval(this.getSize().width/2 - 40, this.getSize().height/2 - 45, 90, 90); 
        
        
        // Draw all game objects
        for (Jogador obj : jogadores) {
            obj.draw(g2);
        }
        
        g2.dispose();
        g.drawImage(offscreenImage, 0, 0, null);
        
    }  
    
}
