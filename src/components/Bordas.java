/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import static components.Lado.*;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

/**
 *
 * @author caasieu
 */



public class Bordas extends JButton {
  
    
  public boolean touchable = false;
  private static Lado lado = Lado.ESQUERDA_CIMA;
  
  public Bordas() {    
    //setSize(20, 20);    
    //lado = l;
  }  
    
  public void mudaLado(Lado l) {
      lado = l;
      
      setLocation(0, 0);
      
      
        //addMouseListener(new MouseAdapter() {
        //  public void mousePressed(MouseEvent e) {
        //  button.setLocation(e.getX(), e.getY());
        //  }
        //});
  }
  
      
    
}
