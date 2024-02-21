
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo;

/**
 * Classe usada para tratamento de erro
 * para coordenadas negativas
 * @author Luzia e Roseane
 */
public class CoordNegativa extends RuntimeException{
    
    
    public CoordNegativa(String message){
     
        super("Coordenadas inválidas");
    }

    
    
    
}
