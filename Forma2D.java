/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Classe abstrata das formas
 * @author Luzia e Roseane
 */

public abstract class Forma2D {
    protected int x1,y1,x2,y2;
    protected int x, y;
    protected Color color;
    protected int verificador;
    protected boolean preencher;
    protected int base, altura;

    public Forma2D(int x1, int y1, int x2, int y2) {
        if(x1 < 0 || x2 < 0|| y1 < 0 || y2 < 0){
            
            throw new CoordNegativa("Coordenada negativa"); //tamanho do painel1
        
        } else if(x2 > 923  || y2 > 587){
            
            throw new CoordNegativa("Coordenada negativa");
        }
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        verificador = 0;
        preencher = false;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }

    public int getVerificador() {
        return verificador;
    }

    public void setVerificador(int verificador) {
        this.verificador = verificador;
    }

    public boolean isPreencher() {
        return preencher;
    }

    public void setPreencher(boolean preencher) {
        this.preencher = preencher;
    }
    
    public Color getColor() {
        return color;
    }
    
    public int getX1() {
        return x1;
    }
    
    public int getY1() {
        return y1;
    }
    
    public int getX2() {
        return x2;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    public int getY2() {
        return y2;
    }
    
    public void desenhaQuadrado(Graphics g) {
        
    }
    public void desenhaCirculo(Graphics g) {
        
    }
    public void desenhaTriangulo(Graphics g) {
        
    }
    public void preencheQuadrado(Graphics g) {
        
    }
    public void preencheCirculo(Graphics g) {
        
    }
    public void preencheTriangulo(Graphics g) {
        
    }
    
    public void imprimeDados(){
    
    }
}
