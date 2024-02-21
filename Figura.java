/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 * Classe usada para adicionar
 * as formas criadas, remover e
 * chamar metodo desenhar especifico
 * para cada forma
 * @author Luzia e Roseane
 */
public class Figura {
    private ArrayList formas;
    private static int i;

    public Figura() {
        i = 0;
        formas = new ArrayList<Forma2D>();
    }
    
    public int getI() {
        return i;
    }
    
    public boolean addForma(Forma2D f, int verificador, boolean preencher){
        
        formas.add(f);
        f.setVerificador(verificador);
        f.setPreencher(preencher);
        i++;
        return true;
                    
    }
    public Forma2D getForma(int i){
        
        if(formas.get(i) == null){
            return null;
        }else{
            return (Forma2D) formas.get(i);
        }
    }
    
    public void desenharForma(Graphics g,int i) throws Exception{
        try {
            
            Forma2D f = (Forma2D)formas.get(i);
            
            switch (f.getVerificador()) {
            
                case 1:
                if(f.isPreencher()) {
                    f.preencheQuadrado(g);
                } else {
                    f.desenhaQuadrado(g);
                }
                break;
            case 2:
                if(f.isPreencher()) {
                    f.preencheTriangulo(g);
                } else {
                    f.desenhaTriangulo(g);
                }
            break;
                
            case 3:
                if(f.isPreencher()) {
                    f.preencheCirculo(g);
                } else {
                    f.desenhaCirculo(g);
                }
             break;
            default:
                throw new Exception();
            }
        } catch (IndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Figura inexistente!", "Erro", WARNING_MESSAGE);
        }
        
    }
    
    public ArrayList getFormas() {
        return formas;
    }
    
    public void rmFigura(int a){
        formas.remove(a);
        i--;
    }
    
    public void rmFiguras(){
        formas.clear();
        i = 0;
    }
    
    
}
