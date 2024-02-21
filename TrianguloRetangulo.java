/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 * Classe usada para desenhar a forma Triângulo Retangulo
 * 
 * @author Luzia e Roseane
 */
public final class TrianguloRetangulo extends Forma2D{

    public TrianguloRetangulo(int x1, int y1, int x2, int y2) {
        super(x1,y1,x2,y2);
        color = Color.black;
        calcularTamanho();
    }
    
    public TrianguloRetangulo(int x1, int y1, int x2, int y2, Color color) {
        super(x1,y1,x2,y2);
        this.color = color;
        calcularTamanho();
    }
    
    public void calcularTamanho() {
        x = x1;
        y = y1;
        if(x1<x2 && y1<y2) {
            base = x2 - x1;
            altura = y2 - y1;
        } else if (x1<x2 && y1>y2) {
            base = x2 - x1;
            altura = y1 - y2;
        } else if (y1<y2 && x1>x2) {
            base = x1 - x2;
            altura = y2 - y1;
        } else if (y1>y2 && x1>x2) {
            base = x1 - x2;
            altura = y1 - y2;
        }
    }

    @Override
    public void desenhaTriangulo(Graphics g) {
        
        Polygon poligono = new Polygon();
        g.setColor(color);
        
        if(x1<x2 && y1<y2) {
            x2 = x + base;
            y2 = y + altura;
            
            poligono.addPoint(x,y);  
            poligono.addPoint(x2,y2);    
            poligono.addPoint(x,y2);
            g.drawPolygon(poligono);
                
        } else if (x1<x2 && y1>y2) {
            x2 = x + base;
            y2 = y - altura;
            
            poligono.addPoint(x,y);  
            poligono.addPoint(x2,y2);    
            poligono.addPoint(x2,y);
            g.drawPolygon(poligono);
                
            
        } else if (x1>x2 && y1<y2) {
            x2 = x - base;
            y2 = y + altura;
            
            poligono.addPoint(x,y);  
            poligono.addPoint(x2,y2);    
            poligono.addPoint(x2,y);  
            g.drawPolygon(poligono);
            
            
        } else if(x1>x2 && y1>y2) {
            
            x2 = x - base;
            y2 = y - altura;
            
            poligono.addPoint(x,y);    
            poligono.addPoint(x2,y2);  
            poligono.addPoint(x,y2);  
            g.drawPolygon(poligono);
            
        }
        
    }
    
    @Override
    public void preencheTriangulo(Graphics g){
        
        Polygon poligono = new Polygon();
        g.setColor(color);
        
        if(x1<x2 && y1<y2) {
            x2 = x1 + base;
            y2 = y1 + altura;
            
            poligono.addPoint(x1,y1);  
            poligono.addPoint(x2,y2);    
            poligono.addPoint(x1,y2);
            g.fillPolygon(poligono);
                
        } else if (x1<x2 && y1>y2) {
            x2 = x1 + base;
            y2 = y1 - altura;
            
            poligono.addPoint(x1,y1);  
            poligono.addPoint(x2,y2);    
            poligono.addPoint(x2,y1);
            g.fillPolygon(poligono);
                
            
        } else if (x1>x2 && y1<y2) {
            x2 = x1 - base;
            y2 = y1 + altura;
            
            poligono.addPoint(x1,y1);  
            poligono.addPoint(x2,y2);    
            poligono.addPoint(x2,y1);  
            g.fillPolygon(poligono);
            
            
        } else if(x1>x2 && y1>y2) {
            
            x2 = x1 - base;
            y2 = y1 - altura;
            
            poligono.addPoint(x1,y1);    
            poligono.addPoint(x2,y2);  
            poligono.addPoint(x1,y2);  
            g.fillPolygon(poligono);
            
        }
        
    }
    
    @Override
    public void imprimeDados(){
       
       System.out.println("Triangulo");
       System.out.println("X1:"+x1);
       System.out.println("Y1:"+y1);
       System.out.println("X2:"+x2);
       System.out.println("Y2:"+y2);
       
    }
}
