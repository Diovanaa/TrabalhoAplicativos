package FRAME;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class FramePrincipal extends javax.swing.JFrame {

    public FramePrincipal() {
        initComponents();

        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtParceiros = new javax.swing.JButton();
        jbtFornecedor = new javax.swing.JButton();
        jbtColaboradores = new javax.swing.JButton();
        jbtSaida = new javax.swing.JButton();
        jbtEntrada = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtProduto = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jlbUsuarioLogado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlbData = new javax.swing.JLabel();
        jlbHora = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiParceiros = new javax.swing.JMenuItem();
        jmiFornecedores = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jmiColaboradores = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiProduto = new javax.swing.JMenuItem();
        jmiGrupoItem = new javax.swing.JMenuItem();
        jmiSubGrupoItem = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jmiCopiar = new javax.swing.JMenuItem();
        jmiColar = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jmiUsuarios = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Vendas");

        jbtParceiros.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtParceiros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/parceiro.png"))); // NOI18N
        jbtParceiros.setToolTipText("Cadastrar / Visualizar - Parceiros");
        jbtParceiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtParceirosActionPerformed(evt);
            }
        });

        jbtFornecedor.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fornecedor.png"))); // NOI18N
        jbtFornecedor.setToolTipText("Cadastrar / Visualizar - Fornecedores");
        jbtFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFornecedorActionPerformed(evt);
            }
        });

        jbtColaboradores.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtColaboradores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/colaboradores.png"))); // NOI18N
        jbtColaboradores.setToolTipText("Cadastrar / Visualizar - Colaboradores");
        jbtColaboradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtColaboradoresActionPerformed(evt);
            }
        });

        jbtSaida.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/venda.png"))); // NOI18N
        jbtSaida.setToolTipText("Venda de Mercadoria");
        jbtSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSaidaActionPerformed(evt);
            }
        });

        jbtEntrada.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/conta.png"))); // NOI18N
        jbtEntrada.setToolTipText("Compra de Mercadoria");
        jbtEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEntradaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Letter Gothic Std", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Sistema Vendas");

        jbtProduto.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/produto.png"))); // NOI18N
        jbtProduto.setToolTipText("Cadastrar / Visualizar - Produto");
        jbtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtProdutoActionPerformed(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 102));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jDesktopPane1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel2.setText("Usuário Logado:");

        jlbUsuarioLogado.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jlbUsuarioLogado.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jlbUsuarioLogadoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel3.setText("Data:");

        jlbData.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jlbData.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jlbDataAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jlbHora.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jlbHora.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jlbHoraAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jMenu1.setText("Visualizar");
        jMenu1.setToolTipText("Visualizar / Cadastrar");

        jmiParceiros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jmiParceiros.setText("Parceiros");
        jmiParceiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiParceirosActionPerformed(evt);
            }
        });
        jMenu1.add(jmiParceiros);

        jmiFornecedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jmiFornecedores.setText("Fornecedores");
        jmiFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFornecedoresActionPerformed(evt);
            }
        });
        jMenu1.add(jmiFornecedores);

        jMenu8.setText("Colaboradores");

        jmiColaboradores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jmiColaboradores.setText("Colaboradores");
        jmiColaboradores.setToolTipText("Colaboradores/Funcionários");
        jmiColaboradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiColaboradoresActionPerformed(evt);
            }
        });
        jMenu8.add(jmiColaboradores);

        jMenuItem2.setText("Grupo de Colaboradores");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem2);

        jMenu1.add(jMenu8);

        jMenu2.setText("Produtos");

        jmiProduto.setText("Produto");
        jmiProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(jmiProduto);

        jmiGrupoItem.setText("Grupo de Item");
        jmiGrupoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGrupoItemActionPerformed(evt);
            }
        });
        jMenu2.add(jmiGrupoItem);

        jmiSubGrupoItem.setText("Subgrupo de Item");
        jmiSubGrupoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSubGrupoItemActionPerformed(evt);
            }
        });
        jMenu2.add(jmiSubGrupoItem);

        jMenuItem12.setText("Unidade de Medida");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenu1.add(jMenu2);

        jMenuItem10.setText("Venda de Mercadoria");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem11.setText("Compra de Mercadoria");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Relatórios");

        jMenuItem6.setText("Produtos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem3.setText("Colaborador");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenu9.setText("Compras");

        jMenuItem4.setText("Compras");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem4);

        jMenuItem5.setText("Produtos da Compra");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem5);

        jMenu3.add(jMenu9);

        jMenu10.setText("Venda");

        jMenuItem7.setText("Vendas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem7);

        jMenuItem9.setText("Produtos da Venda");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem9);

        jMenu3.add(jMenu10);

        jMenuBar1.add(jMenu3);

        jMenu7.setText("Editar");

        jmiCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jmiCopiar.setText("Copiar");
        jmiCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCopiarActionPerformed(evt);
            }
        });
        jMenu7.add(jmiCopiar);

        jmiColar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jmiColar.setText("Colar");
        jmiColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiColarActionPerformed(evt);
            }
        });
        jMenu7.add(jmiColar);

        jMenuBar1.add(jMenu7);

        jMenu6.setText("Ferramentas");

        jmiUsuarios.setText("Cadastro de Usuários");
        jmiUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuariosActionPerformed(evt);
            }
        });
        jMenu6.add(jmiUsuarios);

        jMenuItem1.setText("Cadastro da Empresa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuBar1.add(jMenu6);

        jMenu4.setText("Ajuda");

        jMenuItem8.setText("Sobre");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Sair");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(jbtParceiros, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 118, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jbtColaboradores, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 118, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jbtFornecedor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 118, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jbtProduto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 118, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jbtEntrada, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 118, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jbtSaida, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 118, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 112, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jlbUsuarioLogado, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jlbData, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jlbHora, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel1)
                .addContainerGap())
            .add(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jbtParceiros, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jbtFornecedor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jbtColaboradores, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jbtProduto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jbtSaida, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jbtEntrada, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                            .add(jlbData, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel1)
                            .add(jLabel2)
                            .add(jLabel3)))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jlbUsuarioLogado, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jlbHora, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFornecedorActionPerformed
        new FrameCadastroFornecedor().setVisible(true);
    }//GEN-LAST:event_jbtFornecedorActionPerformed

    private void jbtParceirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtParceirosActionPerformed
        new FrameCadastroParceiro().setVisible(true);
    }//GEN-LAST:event_jbtParceirosActionPerformed

    private void jbtColaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtColaboradoresActionPerformed
        new FrameCadastroFuncionario().setVisible(true);
    }//GEN-LAST:event_jbtColaboradoresActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked

        if (evt.getClickCount() == 1) {
            dispose();
        }

    }//GEN-LAST:event_jMenu5MouseClicked

    private void jmiParceirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiParceirosActionPerformed
        new FrameCadastroParceiro().setVisible(true);
    }//GEN-LAST:event_jmiParceirosActionPerformed

    private void jmiColaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiColaboradoresActionPerformed
        new FrameCadastroFuncionario().setVisible(true);
    }//GEN-LAST:event_jmiColaboradoresActionPerformed

    private void jmiUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuariosActionPerformed
        new FrameCadastroUsuarios().setVisible(true);
    }//GEN-LAST:event_jmiUsuariosActionPerformed

    private void jmiFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFornecedoresActionPerformed
        new FrameCadastroFornecedor().setVisible(true);
    }//GEN-LAST:event_jmiFornecedoresActionPerformed

    private void jlbUsuarioLogadoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jlbUsuarioLogadoAncestorAdded
    }//GEN-LAST:event_jlbUsuarioLogadoAncestorAdded

    private void jlbDataAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jlbDataAncestorAdded

        jlbData.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis())));

    }//GEN-LAST:event_jlbDataAncestorAdded

    private void jlbHoraAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jlbHoraAncestorAdded
        Timer timer = new Timer();
        TimerTask tasks = new TimerTask() {
            @Override
            public void run() {
                jlbHora.setText(new SimpleDateFormat("HH:mm:ss").format(new Date(System.currentTimeMillis())));
            }
        };
        timer.schedule(tasks, 1000, 1000);
    }//GEN-LAST:event_jlbHoraAncestorAdded

    private void jbtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtProdutoActionPerformed
        new FrameCadastroProdutos().setVisible(true);
    }//GEN-LAST:event_jbtProdutoActionPerformed

    private void jmiSubGrupoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSubGrupoItemActionPerformed
        new FrameSubGrupoItem().setVisible(true);
    }//GEN-LAST:event_jmiSubGrupoItemActionPerformed

    private void jmiProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProdutoActionPerformed
        new FrameCadastroProdutos().setVisible(true);
    }//GEN-LAST:event_jmiProdutoActionPerformed

    private void jmiGrupoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGrupoItemActionPerformed
        new FrameGrupoItem().setVisible(true);
    }//GEN-LAST:event_jmiGrupoItemActionPerformed

    private void jmiCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCopiarActionPerformed
    }//GEN-LAST:event_jmiCopiarActionPerformed

    private void jmiColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiColarActionPerformed
    }//GEN-LAST:event_jmiColarActionPerformed

    private void jbtSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSaidaActionPerformed
        new FrameVenda().setVisible(true);
    }//GEN-LAST:event_jbtSaidaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new FrameCadastroEmpresa().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new FrameCadastroGrupoColaborador().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new FrameRelatorioProdutos().setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new FrameRelatorioColaboradores().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jbtEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEntradaActionPerformed
        new FrameCompra().setVisible(true);
    }//GEN-LAST:event_jbtEntradaActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        new FrameSobre().setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new FrameRelatorioCompras().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new FrameRelatorioItendeCompra().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        new FrameRelatorioItendeVenda().setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        new FrameRelatorioVenda().setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
         new FrameCompra().setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        new FrameVenda().setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        new FrameUnidadeMedida().setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JButton jbtColaboradores;
    private javax.swing.JButton jbtEntrada;
    private javax.swing.JButton jbtFornecedor;
    private javax.swing.JButton jbtParceiros;
    private javax.swing.JButton jbtProduto;
    private javax.swing.JButton jbtSaida;
    private javax.swing.JLabel jlbData;
    private javax.swing.JLabel jlbHora;
    private javax.swing.JLabel jlbUsuarioLogado;
    private javax.swing.JMenuItem jmiColaboradores;
    private javax.swing.JMenuItem jmiColar;
    private javax.swing.JMenuItem jmiCopiar;
    private javax.swing.JMenuItem jmiFornecedores;
    private javax.swing.JMenuItem jmiGrupoItem;
    private javax.swing.JMenuItem jmiParceiros;
    private javax.swing.JMenuItem jmiProduto;
    private javax.swing.JMenuItem jmiSubGrupoItem;
    private javax.swing.JMenuItem jmiUsuarios;
    // End of variables declaration//GEN-END:variables
   
    
    FrameLoginUsuario frmlogin;
    String usuario;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        jlbUsuarioLogado.setText(usuario);
    }
    /* public void recebeUsuario(){
     this.usuario = frmlogin.retornaUsuario();
     }
     */
}
