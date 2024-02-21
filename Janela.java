/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo;

import java.awt.Graphics;
import java.awt.*;
import java.io.IOException;
import javax.swing.*;
import static javax.swing.JFileChooser.OPEN_DIALOG;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Chama todos os métodos da Classe Editor e Painel
 * @author Luzia e Roseane
 */
public class Janela extends javax.swing.JFrame {
    
    boolean preencher;
    int x1, x2, y1, y2;

    int i = 0;
    DefaultListModel listaHistorico;    
   
    /**
     * Creates new form Janela
     */
    public Janela() {
        
        initComponents();
        preencher = false; 
        listaHistorico = new DefaultListModel();
        setLocationRelativeTo(null);
        jList1.setModel(listaHistorico);
        i = jList1.getSelectedIndex();
        painel1.getEditor().setHistorico(listaHistorico);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edicao = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelX = new javax.swing.JLabel();
        labelBase = new javax.swing.JLabel();
        labelY = new javax.swing.JLabel();
        labelAltura = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoX = new javax.swing.JTextField();
        base = new javax.swing.JTextField();
        campoY = new javax.swing.JTextField();
        altura = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        botaoAplicarEdicao = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        ajuda = new javax.swing.JFrame();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        botaoOKAjuda = new javax.swing.JButton();
        painel1 = new poo.Painel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel10 = new javax.swing.JLabel();
        botaoRemover = new javax.swing.JButton();
        botaoRepintar = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        botao_quad = new javax.swing.JButton();
        botao_circ = new javax.swing.JButton();
        botao_tri = new javax.swing.JButton();
        botao_preencher = new javax.swing.JToggleButton();
        botao_preenche = new javax.swing.JButton();
        botao_cor = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        var_x = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        var_y = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemSalvar_arquivo = new javax.swing.JMenuItem();
        itemCarreg_arquivo = new javax.swing.JMenuItem();
        itemSair_arquivo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemDeletar_Editar = new javax.swing.JMenuItem();
        info = new javax.swing.JMenu();
        botaoAjudaMenu = new javax.swing.JMenuItem();
        botaoSobreMenu = new javax.swing.JMenuItem();

        edicao.setAlwaysOnTop(true);

        jLabel4.setText("A forma que você escolheu possui as cordenadas:");

        jLabel5.setText("X:");

        jLabel6.setText("Base");

        jLabel7.setText("Y:");

        jLabel8.setText("Altura:");

        labelX.setText("0");

        labelBase.setText("0");

        labelY.setText("0");

        labelAltura.setText("0");

        jLabel9.setText("Digite as novas coodenadas:");

        altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaActionPerformed(evt);
            }
        });

        jLabel11.setText("Base:");

        jLabel12.setText("Altura:");

        jLabel13.setText("X:");

        jLabel14.setText("Y:");

        botaoAplicarEdicao.setText("Aplicar");
        botaoAplicarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAplicarEdicaoActionPerformed(evt);
            }
        });

        jLabel15.setText("Digite o novo tamanho:");

        javax.swing.GroupLayout edicaoLayout = new javax.swing.GroupLayout(edicao.getContentPane());
        edicao.getContentPane().setLayout(edicaoLayout);
        edicaoLayout.setHorizontalGroup(
            edicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(edicaoLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(edicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edicaoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(edicaoLayout.createSequentialGroup()
                        .addGroup(edicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(edicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelX)
                            .addComponent(labelBase))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(edicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(edicaoLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(labelAltura))
                            .addGroup(edicaoLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(labelY, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(143, 143, 143))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edicaoLayout.createSequentialGroup()
                .addGroup(edicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(edicaoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoAplicarEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(edicaoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(edicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(edicaoLayout.createSequentialGroup()
                                .addGroup(edicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(edicaoLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoX, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(edicaoLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoY, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(edicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edicaoLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edicaoLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel15))))
                .addGap(44, 44, 44))
        );
        edicaoLayout.setVerticalGroup(
            edicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(edicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edicaoLayout.createSequentialGroup()
                        .addGroup(edicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(labelX))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(edicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(labelBase)))
                    .addGroup(edicaoLayout.createSequentialGroup()
                        .addGroup(edicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(labelY))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(edicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(labelAltura))))
                .addGap(49, 49, 49)
                .addGroup(edicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(edicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(edicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(edicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(campoY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(botaoAplicarEdicao)
                .addContainerGap())
        );

        ajuda.setAlwaysOnTop(true);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/quadrado.png"))); // NOI18N
        jLabel16.setText("Quadrado");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/circulo.png"))); // NOI18N
        jLabel17.setText("Circulo");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/triangulo.png"))); // NOI18N
        jLabel18.setText("Triangulo");
        jLabel18.setToolTipText("");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/balde.png"))); // NOI18N
        jLabel19.setText("Preenche formas feitas");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/remover.png"))); // NOI18N
        jLabel20.setText("Apaga formas");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/editar.png"))); // NOI18N
        jLabel21.setText("Edita Formas");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/repintar.png"))); // NOI18N
        jLabel22.setText("Repinta cores");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/cores.png"))); // NOI18N
        jLabel23.setText("Altera cor");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/formasColoridas.png"))); // NOI18N
        jLabel24.setText("Formas Preenchidas");

        botaoOKAjuda.setText("OK");
        botaoOKAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOKAjudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ajudaLayout = new javax.swing.GroupLayout(ajuda.getContentPane());
        ajuda.getContentPane().setLayout(ajudaLayout);
        ajudaLayout.setHorizontalGroup(
            ajudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajudaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ajudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ajudaLayout.createSequentialGroup()
                        .addGroup(ajudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addGap(67, 67, 67)
                        .addGroup(ajudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(ajudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel22)
                                .addComponent(jLabel21))
                            .addComponent(jLabel19))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ajudaLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoOKAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        ajudaLayout.setVerticalGroup(
            ajudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajudaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(ajudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(ajudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(ajudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(ajudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(ajudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoOKAjuda)
                    .addComponent(jLabel23))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini-Paint");
        setBackground(new java.awt.Color(103, 103, 103));

        painel1.setBackground(new java.awt.Color(255, 255, 255));
        painel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                painel1MouseMoved(evt);
            }
        });
        painel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                painel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                painel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 923, Short.MAX_VALUE)
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jList1);

        jLabel10.setFont(new java.awt.Font("Umpush", 0, 18)); // NOI18N
        jLabel10.setText("Histórico");

        botaoRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/remover.png"))); // NOI18N
        botaoRemover.setText("Remover");
        botaoRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        botaoRepintar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/repintar.png"))); // NOI18N
        botaoRepintar.setText("Repintar");
        botaoRepintar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoRepintar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRepintarActionPerformed(evt);
            }
        });

        botaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/editar.png"))); // NOI18N
        botaoEditar.setText("Editar");
        botaoEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        botao_quad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/quadrado.png"))); // NOI18N
        botao_quad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao_quad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_quadActionPerformed(evt);
            }
        });
        jToolBar1.add(botao_quad);

        botao_circ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/circulo.png"))); // NOI18N
        botao_circ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao_circ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_circActionPerformed(evt);
            }
        });
        jToolBar1.add(botao_circ);

        botao_tri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/triangulo.png"))); // NOI18N
        botao_tri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao_tri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_triActionPerformed(evt);
            }
        });
        jToolBar1.add(botao_tri);

        botao_preencher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/formasColoridas.png"))); // NOI18N
        botao_preencher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao_preencher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_preencherMouseClicked(evt);
            }
        });
        jToolBar1.add(botao_preencher);

        botao_preenche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/balde.png"))); // NOI18N
        botao_preenche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao_preenche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_preencheActionPerformed(evt);
            }
        });
        jToolBar1.add(botao_preenche);

        botao_cor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/cores.png"))); // NOI18N
        botao_cor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao_cor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_corActionPerformed(evt);
            }
        });
        jToolBar1.add(botao_cor);

        jLabel3.setFont(new java.awt.Font("Umpush", 0, 15)); // NOI18N
        jLabel3.setText("Coordenadas");

        var_x.setText("X : ");

        jLabel1.setText("0");

        var_y.setText("Y : ");

        jLabel2.setText("0");

        jMenuBar1.setBackground(new java.awt.Color(195, 193, 190));

        jMenu1.setText("Arquivo");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        itemSalvar_arquivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        itemSalvar_arquivo.setText("Salvar");
        itemSalvar_arquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalvar_arquivoActionPerformed(evt);
            }
        });
        jMenu1.add(itemSalvar_arquivo);

        itemCarreg_arquivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        itemCarreg_arquivo.setText("Carregar");
        itemCarreg_arquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCarreg_arquivoActionPerformed(evt);
            }
        });
        jMenu1.add(itemCarreg_arquivo);

        itemSair_arquivo.setText("Sair");
        itemSair_arquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSair_arquivoActionPerformed(evt);
            }
        });
        jMenu1.add(itemSair_arquivo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        itemDeletar_Editar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itemDeletar_Editar.setText("Apagar tudo");
        itemDeletar_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeletar_EditarActionPerformed(evt);
            }
        });
        jMenu2.add(itemDeletar_Editar);

        jMenuBar1.add(jMenu2);

        info.setText("Ajuda");
        info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botaoAjudaMenu.setText("Ajuda");
        botaoAjudaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAjudaMenuActionPerformed(evt);
            }
        });
        info.add(botaoAjudaMenu);

        botaoSobreMenu.setText("Sobre");
        botaoSobreMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSobreMenuActionPerformed(evt);
            }
        });
        info.add(botaoSobreMenu);

        jMenuBar1.add(info);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(var_x)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(var_y)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoRepintar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoRemover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3)
                            .addComponent(var_x)
                            .addComponent(jLabel1)
                            .addComponent(var_y)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoRepintar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void imprimirDados() {
        jLabel1.setText(" " + painel1.getXTela());
        jLabel2.setText(" " + painel1.getYTela());
    }
    
    private void botao_quadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_quadActionPerformed
        
        painel1.getEditor().setVerificador(1);
    }//GEN-LAST:event_botao_quadActionPerformed

    private void botao_triActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_triActionPerformed
        
        painel1.getEditor().setVerificador(2);
    }//GEN-LAST:event_botao_triActionPerformed

    private void botao_circActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_circActionPerformed
        
        painel1.getEditor().setVerificador(3);
    }//GEN-LAST:event_botao_circActionPerformed

    private void itemSair_arquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSair_arquivoActionPerformed
        
        Fechar f = new Fechar(this, rootPaneCheckingEnabled);
        f.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_itemSair_arquivoActionPerformed

    private void itemCarreg_arquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCarreg_arquivoActionPerformed
        
        if(painel1.getEditor().getFigura().getFormas().isEmpty()) {
            JFileChooser carregar = new JFileChooser();
            carregar.setDialogType(OPEN_DIALOG);
            FileFilter extensao = new FileNameExtensionFilter("Arquivo txt", "txt");
            carregar.setFileFilter(extensao);
            carregar.showOpenDialog(painel1);
        
            try {
                painel1.getEditor().carregar(painel1.getGraphics(),carregar.getSelectedFile());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Não foi possível salvar.");            
            }
        } else {
            int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja salvar seu trabalho?", "Carregar Arquivo", YES_NO_CANCEL_OPTION, WARNING_MESSAGE);
            switch(confirmacao) {
                case 0:
                    itemSalvar_arquivoActionPerformed(evt);
                    painel1.getEditor().limpar(painel1);
                    itemCarreg_arquivoActionPerformed(evt);
                    break;
                case 1:
                    painel1.getEditor().limpar(painel1);
                    itemCarreg_arquivoActionPerformed(evt);
                    break;
                default:
                    break;
            }
            
        }
    }//GEN-LAST:event_itemCarreg_arquivoActionPerformed

    private void itemSalvar_arquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalvar_arquivoActionPerformed
        
        JFileChooser salvar = new JFileChooser();
        FileFilter extensao = new FileNameExtensionFilter("Arquivo JPEG", ".jpeg");
        salvar.setFileFilter(extensao);
        salvar.showSaveDialog(painel1);
        try {
            painel1.getEditor().salvar(salvar.getCurrentDirectory(), salvar.getSelectedFile().getName());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível salvar.");
        }
        
        
    }//GEN-LAST:event_itemSalvar_arquivoActionPerformed

    private void botao_corActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_corActionPerformed
        
        Color c = Color.black;
        c = JColorChooser.showDialog(Janela.this, "Selecione uma cor", c);
        painel1.getEditor().setColor(c);
    }//GEN-LAST:event_botao_corActionPerformed
          
    private void botao_preencheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_preencheActionPerformed
        
        i = jList1.getSelectedIndex();

        Graphics g = painel1.getGraphics();
        
        try{
            
            painel1.getEditor().subsPreenche(g, i);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Selecione uma forma.", "Erro", WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_botao_preencheActionPerformed

    private void botaoSobreMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSobreMenuActionPerformed
        
        MandaJobs send = new MandaJobs(this, rootPaneCheckingEnabled);
        send.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_botaoSobreMenuActionPerformed

    private void botao_preencherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_preencherMouseClicked
        
        if(preencher == false){
            
            painel1.getEditor().setPreencher(true);
            preencher = true;
        }else{
            
            painel1.getEditor().setPreencher(false);
            preencher = false;
        }
        
        
    }//GEN-LAST:event_botao_preencherMouseClicked

    private void itemDeletar_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeletar_EditarActionPerformed
                
        if(!painel1.getEditor().getFigura().getFormas().isEmpty()) {
            
            int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja salvar seu trabalho?");
            
            switch(confirmacao) {
                case 0:
                    itemSalvar_arquivoActionPerformed(evt);
                    painel1.getEditor().limpar(painel1);
                case 1:
                    painel1.getEditor().limpar(painel1);
                case 3:
                    break;
            }
        } else {
            painel1.getEditor().limpar(painel1);
        }
        
        listaHistorico.clear();
        
    }//GEN-LAST:event_itemDeletar_EditarActionPerformed

    private void painel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painel1MouseMoved
        
        jLabel1.setText(""+evt.getX());
        jLabel2.setText(""+evt.getY());
        
    }//GEN-LAST:event_painel1MouseMoved
    
    private void painel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painel1MouseReleased
        
        x2 = evt.getX();
        y2 = evt.getY();
        
    }//GEN-LAST:event_painel1MouseReleased

    private void painel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painel1MousePressed
       x1 = evt.getX();
       y1 = evt.getY();
       
    }//GEN-LAST:event_painel1MousePressed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
       
        try {
            i = jList1.getSelectedIndex();
            listaHistorico.remove(i);
            try {
                Graphics g = painel1.getGraphics();
                painel1.getEditor().apagarFigura(g,i);
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Número Inválido. Tente Novamente", "Erro", WARNING_MESSAGE);
            }
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void botaoRepintarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRepintarActionPerformed
        
            i = jList1.getSelectedIndex();
            Color color = Color.BLACK;
            color = JColorChooser.showDialog(Janela.this, "Selecione uma cor", color);
            
            Graphics g = painel1.getGraphics();
            
            try {
                painel1.getEditor().editarCor(g,color,i);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Selecione uma figura. " + i, "Erro", WARNING_MESSAGE);
            }
        
    }//GEN-LAST:event_botaoRepintarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
     
        try {
                edicao.setVisible(true);
                edicao.setSize(455, 330);
                edicao.setResizable(false);
                i = jList1.getSelectedIndex();
                
                int x = painel1.getEditor().e.getForma(i).getX();
                int b = painel1.getEditor().e.getForma(i).getBase();
                int y = painel1.getEditor().e.getForma(i).getY();
                int a = painel1.getEditor().e.getForma(i).getAltura();
                
                labelX.setText(""+x);
                labelBase.setText(""+b);
                labelY.setText(""+y);
                labelAltura.setText(""+a);
                campoX.setText(String.valueOf(-1));
                campoY.setText(String.valueOf(-1));
                base.setText(String.valueOf(-1));
                altura.setText(String.valueOf(-1));
                
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane a = new JOptionPane("Número Inválido. Tente Novamente");
                a.setVisible(true);
            }
        
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void alturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaActionPerformed
        
    }//GEN-LAST:event_alturaActionPerformed

    private void botaoAplicarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAplicarEdicaoActionPerformed
        
        int i = jList1.getSelectedIndex();
        int x=-1,y=-1,a=-1,b=-1;
        
        try{
            x = Integer.parseInt(campoX.getText());
            b = Integer.parseInt(base.getText());
            y = Integer.parseInt(campoY.getText());
            a = Integer.parseInt(altura.getText());
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Digite números ", "Erro", WARNING_MESSAGE);
        }
        
        
        try {
            painel1.getEditor().editar(painel1.getGraphics(),a,b,x,y,i);
            edicao.setVisible(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Digite pelo menos dois campos.", "Erro", WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_botaoAplicarEdicaoActionPerformed

    private void botaoAjudaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAjudaMenuActionPerformed
        
        ajuda.setVisible(true);
        ajuda.setSize(447, 320);
        ajuda.setResizable(false);        
    }//GEN-LAST:event_botaoAjudaMenuActionPerformed

    private void botaoOKAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOKAjudaActionPerformed
        
        ajuda.setVisible(false);
    }//GEN-LAST:event_botaoOKAjudaActionPerformed

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame ajuda;
    private javax.swing.JTextField altura;
    private javax.swing.JTextField base;
    private javax.swing.JMenuItem botaoAjudaMenu;
    private javax.swing.JButton botaoAplicarEdicao;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoOKAjuda;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoRepintar;
    private javax.swing.JMenuItem botaoSobreMenu;
    private javax.swing.JButton botao_circ;
    private javax.swing.JButton botao_cor;
    private javax.swing.JButton botao_preenche;
    private javax.swing.JToggleButton botao_preencher;
    private javax.swing.JButton botao_quad;
    private javax.swing.JButton botao_tri;
    private javax.swing.JTextField campoX;
    private javax.swing.JTextField campoY;
    private javax.swing.JFrame edicao;
    private javax.swing.JMenu info;
    private javax.swing.JMenuItem itemCarreg_arquivo;
    private javax.swing.JMenuItem itemDeletar_Editar;
    private javax.swing.JMenuItem itemSair_arquivo;
    private javax.swing.JMenuItem itemSalvar_arquivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel labelAltura;
    private javax.swing.JLabel labelBase;
    private javax.swing.JLabel labelX;
    private javax.swing.JLabel labelY;
    protected poo.Painel painel1;
    private javax.swing.JLabel var_x;
    private javax.swing.JLabel var_y;
    // End of variables declaration//GEN-END:variables

    
}
