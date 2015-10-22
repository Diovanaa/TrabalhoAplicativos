
package FRAME;

import DAO.IMPL.ParceiroDAOIMPL;
import DAO.IMPL.PessoaDAOIMPL;
import DAO.ParceiroDAO;
import DAO.PessoaDAO;
import MODEL.Colaborador;
import MODEL.Parceiro;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;

public class FramePesquisaCliente extends javax.swing.JDialog {

    public FramePesquisaCliente() {
        initComponents();
        setLocation(290, 190);
        pessoaDao = new PessoaDAOIMPL();
        parceiroDao = new ParceiroDAOIMPL();
        atualizaTabela();
        jtbParceiros.setAutoResizeMode(jtbParceiros.AUTO_RESIZE_OFF);  
        jtbParceiros.getColumnModel().getColumn(0).setPreferredWidth(80);  
        jtbParceiros.getColumnModel().getColumn(1).setPreferredWidth(433);
        jtbParceiros.getColumnModel().getColumn(2).setPreferredWidth(140);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jtfPesquisar = new javax.swing.JTextField();
        jbtPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtConfirmar = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbParceiros = new javax.swing.JTable();

        setTitle("Pesquisa de Parceiros");
        setLocation(new java.awt.Point(290, 190));
        setResizable(false);

        jtfPesquisar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jtfPesquisar.setToolTipText("Campo de Pesquisa");

        jbtPesquisar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtPesquisar.setText("Pesquisar");
        jbtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Hiragino Sans GB", 0, 24)); // NOI18N
        jLabel1.setText("Pesquisa de Parceiros");

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

        jtbParceiros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${parceiros}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jtbParceiros);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pessoa.nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpf}"));
        columnBinding.setColumnName("CPF");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jtbParceiros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbParceirosMouseClicked(evt);
            }
        });
        jtbParceiros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtbParceirosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtbParceiros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 394, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtPesquisar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtCancelar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtConfirmar)
                    .addComponent(jbtCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisarActionPerformed
        setParceiros(parceiroDao.buscarPorNome(jtfPesquisar.getText()));
        if (parceiroDao.buscarPorNome(jtfPesquisar.getText()).isEmpty()) {
        } else {
            jtbParceiros.addRowSelectionInterval(0, 0);
        }
    }//GEN-LAST:event_jbtPesquisarActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jbtConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConfirmarActionPerformed
        try {
             if (jtbParceiros.getSelectedRow() != -1) {
                parceiro = parceiros.get(jtbParceiros.getSelectedRow());
                dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "É preciso adicionar um parceiro para que possa fazer a pesquisa");
        }
       
    }//GEN-LAST:event_jbtConfirmarActionPerformed

    private void jtbParceirosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbParceirosMouseClicked
        if (evt.getClickCount() == 2) {
            parceiro = parceiros.get(jtbParceiros.getSelectedRow());
            dispose();
        }
    }//GEN-LAST:event_jtbParceirosMouseClicked

    private void jtbParceirosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbParceirosKeyPressed
        if(evt.getKeyCode() == 10){
             parceiro = parceiros.get(jtbParceiros.getSelectedRow());
            dispose();
        }
    }//GEN-LAST:event_jtbParceirosKeyPressed

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
            java.util.logging.Logger.getLogger(FramePesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePesquisaCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtConfirmar;
    private javax.swing.JButton jbtPesquisar;
    private javax.swing.JTable jtbParceiros;
    private javax.swing.JTextField jtfPesquisar;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private PessoaDAO pessoaDao;
    private Parceiro parceiro;
    private List<Parceiro> parceiros;
    private ParceiroDAO parceiroDao;

    public PessoaDAO getPessoaDao() {
        return pessoaDao;
    }

    public void setPessoaDao(PessoaDAO pessoaDao) {
        this.pessoaDao = pessoaDao;
    }

    public List<Parceiro> getParceiros() {
        return parceiros;
    }

    public void setParceiros(List<Parceiro> parceiros) {
        List<Parceiro> parceirosVelhos = this.parceiros;
        this.parceiros = ObservableCollections.observableList(parceiros);
        firePropertyChange("parceiros", parceirosVelhos, this.parceiros);
    }

    
    
    public void setColaboradores(List<Colaborador> colaboradores) {
        
    }


    public void atualizaTabela() {
        setParceiros(parceiroDao.buscarTodos());
        if (parceiroDao.buscarTodos().isEmpty()) {
        } else {
            jtbParceiros.addRowSelectionInterval(0, 0);
        }
    }

    public Parceiro retornaParceiro() {
        return this.parceiro;
    }
}
