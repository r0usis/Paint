/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo;

import java.awt.Color;
import java.awt.Graphics;


/**
 * Classe usada para desenhar a forma Circulo
 * @author Luzia e Roseane
 */
public final class Circulo extends Forma2D{
    private double raio;
    

    public Circulo(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
        color = Color.black;
        calcularTamanho();
        verificaPosicao();
    }
    
    public Circulo(int x1, int y1, int x2, int y2, Color color) {
        super(x1, y1, x2, y2);
        this.color = color;
        calcularTamanho();
        verificaPosicao();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public void calcularTamanho() {
        altura = (int) (Math.sqrt((y2-y1)*(y2-y1)));
        base = (int) (Math.sqrt((x2-x1)*(x2-x1)));
    }
    
    public void verificaPosicao() {
        if(x1<x2 && y1<y2) {
            x = x1;
            y = y1;
            
        } else if (x1<x2 && y1>y2) {
            x=x1;
            y=y2;
            
        } else if (y1<y2 && x1>x2) {
            x=x2;
            y=y1;
                
        } else if(y1>y2 && x1>x2) {
            x=x2;
            y=y2;
        }
    }
    
    @Override
    public void desenhaCirculo(Graphics g){
        g.setColor(this.color);
        g.drawOval(x,y,base,altura);
    }

    @Override
    public void preencheCirculo(Graphics g){
        g.setColor(this.color);
        g.fillOval(x,y,base,altura); 
    }
    
    @Override
    public void imprimeDados(){
       
       System.out.println("Circulo");
       System.out.println("X1:"+x1);
       System.out.println("Y1:"+y1);
       System.out.println("X2:"+x2);
       System.out.println("Y2:"+y2);
    }
}
