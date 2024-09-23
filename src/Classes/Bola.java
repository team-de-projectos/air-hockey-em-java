/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Panel;

/**
 *
 * @author caasieu
 */
public class Bola {
  public Bola() {    
      
  }  
    
  
  public void draw(Graphics g) {
    Graphics2D g2 = (Graphics2D) g.create();
            
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
              
    // adding specifications  
    g2.setColor(new Color(120,60,60));    
    g2.fillOval(840/2, 480/2, 30, 30);   
    
    g2.dispose();
  } 
}
