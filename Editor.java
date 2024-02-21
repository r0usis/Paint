/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.JPanel;


/**
 *
 * Essa classe implementa os métodos 
 * chamados pela classe Janela 
 * 
 * @author Luzia e Roseane 
 * 
 */
public class Editor {
    protected Figura e;
    protected Color color;
    protected int verificador;
    protected boolean preencher;
    protected Graphics g;
    protected int cont;
    protected DefaultListModel listaHistoricoJanela;
    
    
    public Editor() throws IOException {
        e = new Figura();
        verificador = 0;
        preencher = false;
        color = Color.BLACK;
        cont = 0;
    }
    
    public Figura getFigura(){
        return e;
    }
    
    public int getVerificador() {
        return verificador;
    }
    
    public void setHistorico(DefaultListModel listaHistorico) {
        this.listaHistoricoJanela = listaHistorico;
    }
    
    public void setVerificador(int verificador) {
        this.verificador = verificador;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    
    public void setPreencher(boolean preencher) {
        this.preencher = preencher;
    }
    
    public void addFigura(Graphics g, int x1, int x2, int y1, int y2) {
        this.g = g;
        
        if(preencher == true){
           
            preenche(g, x1, x2, y1, y2);
        } else{
            
            desenha(g, x1, x2, y1, y2);
        }
    }
    
    public void desenha (Graphics g, int x1, int x2, int y1, int y2) {
        
        switch (verificador) {
            case 1:
                try{
                    Quadrado q = new Quadrado(x1, y1, x2, y2, color);
                    e.addForma(q, verificador, preencher);
                    q.desenhaQuadrado(g);
                    listaHistoricoJanela.addElement("Quadrado "+cont);
                    cont++;
                    
                }catch(CoordNegativa ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",WARNING_MESSAGE);
                }
                break;
            case 2:
                try{
                    TrianguloRetangulo t = new TrianguloRetangulo(x1, y1, x2, y2, color);
                    e.addForma(t, verificador, preencher);
                    t.desenhaTriangulo(g);
                    listaHistoricoJanela.addElement("Triangulo "+cont);
                    cont++;
                }catch(CoordNegativa ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",WARNING_MESSAGE);
                }
                break;
            case 3:
                try{
                    Circulo c = new Circulo(x1, y1, x2, y2, color);
                    e.addForma(c, verificador, preencher);
                    c.desenhaCirculo(g);
                    listaHistoricoJanela.addElement("Circulo "+cont);
                    cont++;
                }catch(CoordNegativa ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",WARNING_MESSAGE);
                }
                break;
            default:
                break;
        }
    }
    
    public void preenche(Graphics g, int x1, int x2, int y1, int y2){
        
        switch (verificador) {
            case 1:
                try {
                    Quadrado q = new Quadrado(x1, y1, x2, y2,color);
                    e.addForma(q, verificador, preencher);
                    q.preencheQuadrado(g);
                    listaHistoricoJanela.addElement("Quadrado "+cont);
                    cont++;
                } catch(CoordNegativa ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(),"Erro",WARNING_MESSAGE);
                }
                break;
            case 2:
                try {
                    TrianguloRetangulo t = new TrianguloRetangulo(x1, y1, x2, y2,color);
                    e.addForma(t, verificador, preencher);
                    t.preencheTriangulo(g);
                    listaHistoricoJanela.addElement("Triangulo "+cont);
                    cont++;
                }catch(CoordNegativa ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(),"Erro",WARNING_MESSAGE);
                }
                break;
            case 3:
                try {
                    Circulo c = new Circulo(x1, y1, x2, y2,color);
                    e.addForma(c, verificador, preencher);
                    c.preencheCirculo(g);
                    listaHistoricoJanela.addElement("Circulo "+cont);
                    cont++;
                }catch(CoordNegativa ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(),"Erro",WARNING_MESSAGE);
                }
                break;
            default:
                break;
        }
    }
    
    public void subsPreenche(Graphics g, int index) throws Exception{
        
        if (index >= 0) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 923, 573);
       
            e.getForma(index).setPreencher(true);
         
            //repinta todas as figuras pra atualizar o Graphics
            for (int i = 0; i < e.getFormas().size(); i++) {
                try {
                    e.desenharForma(g, i);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Forma Inexistente!", "Erro", WARNING_MESSAGE);
                }
            }
        } else {
            throw new Exception();
        }
        
    }
    
    public void salvar(File diretorio, String nome) throws IOException {
        
        int height = 515, width = 1195;
        
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        try {
            File arquivo = new File(diretorio, nome+".txt");
            arquivo.createNewFile();
            FileWriter arq = new FileWriter(arquivo, false);
            PrintWriter write = new PrintWriter(arq);
            Graphics gImage = image.getGraphics();
            Forma2D f;
            Color c;
            int contador, v, x1, x2, y1, y2;
            int red, blue, green;
            gImage.setColor(Color.WHITE);
            gImage.fillRect(0,0,width,height);
            write.write(e.getFormas().size()+"\n");
            
            for(contador=0;contador<e.getFormas().size();contador++) {
                f = e.getForma(contador);
                v = f.getVerificador();
                c = f.getColor();
                gImage.setColor(c);
                x1 = f.getX1();
                y1 = f.getY1();
                x2 = f.getX2();
                y2 = f.getY2();
                red = c.getRed();
                green = c.getGreen();
                blue = c.getBlue();
                
                switch (v) {
                    case 1 :
                        if (f.isPreencher()) {
                            f.preencheQuadrado(gImage);
                            //Tipo de forma-cor-coordenadas-base-altura-preencher
                            write.write(1+" " + red + " " + green + " " + blue + " "
                                    +x1+" "+y1+" "+x2+" "+y2+" "+1+"\n");
                        } else {
                            f.desenhaQuadrado(gImage);
                            //Tipo de forma-cor-coordenadas-base-altura-preencher
                            write.write(1+" " + red + " " + green + " " + blue + " "
                                    +x1+" "+y1+" "+x2+" "+y2+" "+0+"\n");
                        }
                        
                        break;
                    case 2:
                        if (f.isPreencher()) {
                            f.preencheTriangulo(gImage);
                            //Tipo de forma-cor-coordenadas-preencher
                            write.write(2 +" " + red + " " + green + " " + blue + " "
                                    + x1 + " " + y1 + " " + x2 + " " + y2 + " " + 1 + "\n");
                        } else {
                            f.desenhaTriangulo(gImage);
                            //Tipo de forma-cor-coordenadas-preencher
                            write.write(2 +" " + red + " " + green + " " + blue + " "
                                    + x1 + " " + y1 + " " + x2 + " " + y2 + " " + 0 + "\n");
                        }
                        break;
                    case 3:
                        if (f.isPreencher()) {
                            f.preencheCirculo(gImage);
                            //Tipo de forma-cor-coordenadas-preencher
                            write.write(3 +" " + red + " " + green + " " + blue + " "
                                    + x1 + " " + y1 + " " + x2 + " " + y2 + " " + 1 + "\n");
                            
                            
                        } else {
                            f.desenhaCirculo(gImage);
                            //Tipo de forma-cor-coordenadas-preencher
                            write.write(3 +" " + red + " " + green + " " + blue + " "
                                    + x1 + " " + y1 + " " + x2 + " " + y2 + " " + 0 + "\n");
                        }
                        break;
                    default:
                        break;
                }
            }   
            write.flush();
            write.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        ImageIO.write(image, "JPEG", new File(diretorio, nome+".jpeg"));
        
    }
    
    public void carregar(Graphics g, File diretorio) throws IOException {
        
        FileReader r = new FileReader(diretorio.getAbsolutePath());
        BufferedReader ler = new BufferedReader(r);
        int i, length, x1,x2,y1,y2;
        length = Integer.parseInt(ler.readLine());
        String linha[] = new String[9];
        for(i=1; i<=length; i++) {
            linha = ler.readLine().split(" ");
            x1 = Integer.parseInt(linha[4]);
            x2 = Integer.parseInt(linha[5]);
            y1 = Integer.parseInt(linha[6]);
            y2 = Integer.parseInt(linha[7]);
            this.color = getColor(Integer.parseInt(linha[1]), Integer.parseInt(linha[2]), Integer.parseInt(linha[3]));
            this.verificador = Integer.parseInt(linha[0]);
            this.preencher = Integer.parseInt(linha[8])==1;
            addFigura(g, x1, y1, x2, y2);
            
        }
    }
    
    private Color getColor(final int r, final int g, final int b){
        
        return new Color(r, g, b);
    }
    
    public void editar (Graphics g, int a, int b, int x, int y, int index) throws Exception {
        
        if (a>=0 && b>=0 && x>=0 && y>=0){
            try {
                editarTamanho(g, index, b, a);
                editarPosicao(g, index, x, y);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Selecione uma figura.", "Erro", WARNING_MESSAGE);
            }
        } else if (a>=0 && b>=0) {
            try {
                editarTamanho(g, index, b, a);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Selecione uma figura.", "Erro", WARNING_MESSAGE);
            }
        } else if (x>=0 && y>=0) {
            try {
                editarPosicao(g, index, x, y);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Selecione uma figura.", "Erro", WARNING_MESSAGE);
            }
        } else if (a<0 && b<0 && x<0 && y<0){
            throw new Exception();
        }
    }
    
    public void editarTamanho(Graphics g, int index, int base, int altura) throws Exception {
        
        if (index >= 0) {
            e.getForma(index).setBase(base);
            e.getForma(index).setAltura(altura);
        
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 923, 573);
        
            for(int c = 0; c< e.getFormas().size();c++) {
                try {
                    e.desenharForma(g, c);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Forma Inexistente!", "Erro", WARNING_MESSAGE);
                }
            }
        } else {
            throw new Exception();
        }
        
    }
    
    public void editarPosicao(Graphics g, int index, int x, int y) throws Exception{
        
        if(index >= 0) {
            e.getForma(index).setX(x);
            e.getForma(index).setY(y);
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 923, 573);
            for(int c = 0; c<e.getFormas().size();c++) {
                try {
                    e.desenharForma(g, c);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Forma Inexistente!", "Erro", WARNING_MESSAGE);
                }
            }
        } else {
            throw new Exception();
        }
        
        
        
    }
    
    public void editarCor (Graphics g, Color color, int index) throws Exception {
       
        if(index >= 0) {
            try {
                e.getForma(index).setColor(color);
            } catch (IndexOutOfBoundsException ex) {
                JOptionPane.showMessageDialog(null, "Figura inexistente!", "Erro", WARNING_MESSAGE);
            }
        
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 923, 573);
            
            
            for(int c = 0; c < e.getFormas().size(); c++) {
                try {
                    e.desenharForma(g, c);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Forma Inexistente!", "Erro", WARNING_MESSAGE);
                }
            }
        } else if (index<0){
            throw new Exception();
        }
    }
    
    public void apagarFigura(Graphics g, int n){
        
        e.rmFigura(n);
        cont--;
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 923, 573);
        
        for(int i = 0; i< e.getFormas().size();i++) {
            try {
                e.desenharForma(g, i);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Forma inexistente!", "Erro", WARNING_MESSAGE);
            }
        }
        
            
    }
    
    public void limpar(JPanel p) {
        
        e.rmFiguras();
        p.repaint();
        listaHistoricoJanela.clear();
        cont = 0;
        color = Color.BLACK;
    }  
    
        
}
