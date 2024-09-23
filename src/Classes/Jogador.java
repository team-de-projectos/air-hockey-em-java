/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * @author caasieu
 */
public class Jogador {
    
    private final int id;
    private int pontos;
    private int posicaoX, posicaoY;
    private final Dimension windowSize;
    
    public boolean marcou = false;
    public float velocidade = 0.5f;
    public boolean principal = false;
    
    
    public Jogador(int x, int y, boolean principal, Dimension windowSize) {
        this.posicaoX = x;
        this.posicaoY = y;
        this.principal = principal;
        this.id = principal == true ? 1 : 2;
        this.windowSize = windowSize;
        
        
        
    }
    

    public void actualizarPontos() {
        if(marcou == true) {
            this.pontos += 1;
            this.marcou = false;
        }
        
        this.marcou = false;
    }
    
    public void andar(int novaPosicaoX, int novaPosicaoY) {
        this.posicaoX = novaPosicaoX;
        this.posicaoY = novaPosicaoY;
        
    }
    
    public int verificarVencedor() {
        if(this.pontos >= 3) {
            return this.id;
        }
        
        return -1;
    }
    
    
    public void draw(Graphics g) {
        int inicialX = this.principal == true ? 20 : this.windowSize.width - 60;
        
        g.setColor(new Color(45, 230, 120));
        g.fillOval( 
            inicialX + posicaoX,
            ((this.windowSize.height/2) + posicaoY) - 10, 
            45, 45 // largura e altura
        );
        
    }
}
