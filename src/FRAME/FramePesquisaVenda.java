package FRAME;

import DAO.IMPL.VendaDAOIMPL;
import DAO.VendaDAO;
import MODEL.Venda;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class FramePesquisaVenda extends javax.swing.JDialog {

    public FramePesquisaVenda() {
        initComponents();
        setLocation(290, 190);
        vendaDao = new VendaDAOIMPL();
        defineParametrosPesquisa();
        atualizaTabela();
        jtbVendas.setAutoResizeMode(jtbVendas.AUTO_RESIZE_OFF);
        jtbVendas.getColumnModel().getColumn(0).setPreferredWidth(77);
        jtbVendas.getColumnModel().getColumn(1).setPreferredWidth(99);
        jtbVendas.getColumnModel().getColumn(2).setPreferredWidth(186);
        jtbVendas.getColumnModel().getColumn(3).setPreferredWidth(186);
        jtbVendas.getColumnModel().getColumn(4).setPreferredWidth(98);
        retornaPrimeiroEUltimoDiaMes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        btnGroupTipoPesquisa = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbVendas = new javax.swing.JTable();
        jbtPesquisar = new javax.swing.JButton();
        jtfPesquisar = new javax.swing.JTextField();
        jbtConfirmar = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jdtDataFinal = new com.toedter.calendar.JDateChooser();
        jdtDataInicial = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jrbData = new javax.swing.JRadioButton();
        jrbDocumento = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setTitle("Pesquisa de Vendas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Pesquisa De Vendas");

        jtbVendas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${vendas}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jtbVendas, "");
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataVenda}"));
        columnBinding.setColumnName("Data Compra");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliente_codigo.pessoa.nome}"));
        columnBinding.setColumnName("Fornecedor");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${colaborador_codigo.pessoa.nome}"));
        columnBinding.setColumnName("Colaborador");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorVenda}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Float.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jtbVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbVendasMouseClicked(evt);
            }
        });
        jtbVendas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtbVendasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtbVendas);

        jbtPesquisar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtPesquisar.setText("Pesquisar");
        jbtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisarActionPerformed(evt);
            }
        });

        jtfPesquisar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jtfPesquisar.setToolTipText("Busca por: documento, cliente ou colaborador");
        jtfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisarActionPerformed(evt);
            }
        });
        jtfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPesquisarKeyTyped(evt);
            }
        });

        jbtConfirmar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtConfirmar.setText("Confirmar");
        jbtConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtConfirmarActionPerformed(evt);
            }
        });

        jbtCancelar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtCancelar.setText("Cancelar");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        jdtDataFinal.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        jdtDataInicial.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnGroupTipoPesquisa.add(jrbData);
        jrbData.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jrbData.setText("Pesquisar por data");
        jrbData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDataActionPerformed(evt);
            }
        });

        btnGroupTipoPesquisa.add(jrbDocumento);
        jrbDocumento.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jrbDocumento.setText("Pesquisar por documento");
        jrbDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDocumentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbData)
                    .addComponent(jrbDocumento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrbData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbDocumento)
                .addGap(12, 12, 12))
        );

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel2.setText("Data Inicial");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel3.setText("Data final");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(85, 85, 85)
                                                .addComponent(jLabel3)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jdtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jdtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtPesquisar)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtConfirmar)
                    .addComponent(jbtCancelar))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConfirmarActionPerformed
       try{
        if (jtbVendas.getSelectedRow() != -1) {
            venda = vendas.get(jtbVendas.getSelectedRow());
            dispose();
        }
         } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "É preciso fazer uma Venda para que possa fazer a pesquisa");
        }
    }//GEN-LAST:event_jbtConfirmarActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jbtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisarActionPerformed
        executaPesquisa();
    }//GEN-LAST:event_jbtPesquisarActionPerformed

    private void jtbVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbVendasMouseClicked
        if (evt.getClickCount() == 2) {
            venda = vendas.get(jtbVendas.getSelectedRow());
            dispose();
        }
    }//GEN-LAST:event_jtbVendasMouseClicked

    private void jtfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisarActionPerformed
        executaPesquisa();
    }//GEN-LAST:event_jtfPesquisarActionPerformed

    private void jtbVendasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbVendasKeyPressed
        if (evt.getKeyCode() == 10) {
            venda = vendas.get(jtbVendas.getSelectedRow());
            dispose();
        }
    }//GEN-LAST:event_jtbVendasKeyPressed

    private void jrbDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDataActionPerformed
        verificaRadioButton();
    }//GEN-LAST:event_jrbDataActionPerformed

    private void jrbDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDocumentoActionPerformed
        verificaRadioButton();
    }//GEN-LAST:event_jrbDocumentoActionPerformed

    private void jtfPesquisarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisarKeyTyped
        executaPesquisa();
    }//GEN-LAST:event_jtfPesquisarKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FramePesquisaVenda().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupTipoPesquisa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtConfirmar;
    private javax.swing.JButton jbtPesquisar;
    private com.toedter.calendar.JDateChooser jdtDataFinal;
    private com.toedter.calendar.JDateChooser jdtDataInicial;
    private javax.swing.JRadioButton jrbData;
    private javax.swing.JRadioButton jrbDocumento;
    private javax.swing.JTable jtbVendas;
    private javax.swing.JTextField jtfPesquisar;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private Venda venda;
    private List<Venda> vendas;
    private VendaDAO vendaDao;

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        List<Venda> vendasOld = this.vendas;
        this.vendas = vendas;
        firePropertyChange("vendas", vendasOld, this.vendas);
    }

    public void atualizaTabela() {
        setVendas(vendaDao.buscarTodos());
        if (vendaDao.buscarTodos().isEmpty()) {
        } else {
            jtbVendas.addRowSelectionInterval(0, 0);
        }
    }

    public Venda retornaVenda() {
        return this.venda;
    }

    private void executaPesquisa() {
        Venda vendaI = new Venda();
        Venda vendaF = new Venda();

        if (jrbDocumento.isSelected()) {
            setVendas(vendaDao.buscarCampoPesquisa(jtfPesquisar.getText()));
            if (vendaDao.buscarCampoPesquisa(jtfPesquisar.getText()).isEmpty()) {
            } else {
                jtbVendas.addRowSelectionInterval(0, 0);
            }
        } else if (jrbData.isSelected()) {
            vendaI.setDataVenda(jdtDataInicial.getDate());
            vendaF.setDataVenda(jdtDataFinal.getDate());
            setVendas(vendaDao.buscarPorPeriodo(vendaI.getDataVenda(), vendaF.getDataVenda()));
            if (vendaDao.buscarPorPeriodo(vendaI.getDataVenda(), vendaF.getDataVenda()).isEmpty()) {
            } else {
                jtbVendas.addRowSelectionInterval(0, 0);
            }
        }
    }

    private void verificaRadioButton() {
        if (jrbDocumento.isSelected()) {
            jdtDataInicial.setEnabled(false);
            jdtDataFinal.setEnabled(false);
            jtfPesquisar.setEnabled(true);
        } else if (jrbData.isSelected()) {
            jdtDataInicial.setEnabled(true);
            jdtDataFinal.setEnabled(true);
            jtfPesquisar.setEnabled(false);
        }
    }

    private void defineParametrosPesquisa() {
        jrbData.setSelected(true);
        jdtDataInicial.setDate(new Date());
        jdtDataFinal.setDate(new Date());
        verificaRadioButton();
    }

    private void retornaPrimeiroEUltimoDiaMes() {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        final Date primeiroDia = new Date(calendar.getTimeInMillis());
        jdtDataInicial.setDate(primeiroDia);

        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        final Date ultimoDia = new Date(calendar.getTimeInMillis());
        jdtDataFinal.setDate(ultimoDia);
    }
}
