package FRAME;

import DAO.GrupoItemDAO;
import DAO.IMPL.GrupoItemDAOIMPL;
import DAO.IMPL.SubGrupoItensDAOIMPL;
import DAO.SubGrupoItemDAO;
import DAO.UTIL.ComboBoxGrupoItem;
import MODEL.GrupoItem;
import MODEL.SubGrupoItem;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;

public class FrameSubGrupoItem extends javax.swing.JFrame {

    public FrameSubGrupoItem() {
        initComponents();
        setLocation(200, 100);

        grupoItemDao = new GrupoItemDAOIMPL();
        subGrupoItemDao = new SubGrupoItensDAOIMPL();
        novoSubgrupo();
        atualizaTabela();
        atualizaComboBoxGrupoItem();
        jtbSubGrupoItem.setAutoResizeMode(jtbSubGrupoItem.AUTO_RESIZE_OFF);
        jtbSubGrupoItem.getColumnModel().getColumn(0).setPreferredWidth(100);
        jtbSubGrupoItem.getColumnModel().getColumn(1).setPreferredWidth(353);
        jtbSubGrupoItem.getColumnModel().getColumn(2).setPreferredWidth(121);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        jbtAlterar = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtSalvar = new javax.swing.JButton();
        jbtSair = new javax.swing.JButton();
        jbtNovo = new javax.swing.JButton();
        jtbpSubGrupoItem = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbSubGrupoItem = new javax.swing.JTable();
        jtfPesquisar = new javax.swing.JTextField();
        jbtPesquisar = new javax.swing.JButton();
        jbtDetalhar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfDescricaoSubGrupo = new javax.swing.JTextField();
        jcbGrupoItem = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sub Grupo Item");
        setLocation(new java.awt.Point(200, 100));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Hiragino Sans GB", 0, 24)); // NOI18N
        jLabel1.setText("Sub Grupo de Item");

        jbtAlterar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtAlterar.setText("Alterar");
        jbtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAlterarActionPerformed(evt);
            }
        });

        jbtExcluir.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtExcluir.setText("Excluir");
        jbtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirActionPerformed(evt);
            }
        });

        jbtSalvar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtSalvar.setText("Salvar");
        jbtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarActionPerformed(evt);
            }
        });

        jbtSair.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtSair.setText("Sair");
        jbtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSairActionPerformed(evt);
            }
        });

        jbtNovo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtNovo.setText("Novo");
        jbtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNovoActionPerformed(evt);
            }
        });

        jtbpSubGrupoItem.setBackground(new java.awt.Color(102, 102, 102));
        jtbpSubGrupoItem.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jtbpSubGrupoItem.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtbpSubGrupoItemStateChanged(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${subGrupoItens}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jtbSubGrupoItem);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descricao}"));
        columnBinding.setColumnName("Descrição");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${grupoItem.descricao}"));
        columnBinding.setColumnName("Grupo");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jtbSubGrupoItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbSubGrupoItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbSubGrupoItem);

        jtfPesquisar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jtfPesquisar.setToolTipText("Campo de Pesquisa");

        jbtPesquisar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtPesquisar.setText("Pesquisar");
        jbtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisarActionPerformed(evt);
            }
        });

        jbtDetalhar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtDetalhar.setText("Detalhar");
        jbtDetalhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDetalharActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jtfPesquisar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 148, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jbtPesquisar))
                            .add(jbtDetalhar))
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jtfPesquisar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jbtPesquisar))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 212, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jbtDetalhar)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtbpSubGrupoItem.addTab("Subgrupos", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel2.setText("*Código");

        jtfCodigo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${subGrupoItem.codigo}"), jtfCodigo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel3.setText("*Descrição");

        jtfDescricaoSubGrupo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${subGrupoItem.descricao}"), jtfDescricaoSubGrupo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jcbGrupoItem.setRenderer(new ComboBoxGrupoItem());
        jcbGrupoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbGrupoItemActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel4.setText("*Grupo de Item");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jLabel2)
                    .add(jLabel3)
                    .add(jtfCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtfDescricaoSubGrupo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .add(jLabel4)
                    .add(jcbGrupoItem, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(330, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jtfCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jtfDescricaoSubGrupo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jcbGrupoItem, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jtbpSubGrupoItem.addTab("Cadastro", jPanel3);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jbtNovo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jbtSalvar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jbtAlterar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jbtExcluir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jbtSair, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jLabel1))
                    .add(jtbpSubGrupoItem))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel1)
                .add(12, 12, 12)
                .add(jtbpSubGrupoItem, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 333, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jbtSalvar)
                    .add(jbtExcluir)
                    .add(jbtNovo)
                    .add(jbtAlterar)
                    .add(jbtSair)))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSairActionPerformed
        dispose();
    }//GEN-LAST:event_jbtSairActionPerformed

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed
        jtbpSubGrupoItem.setSelectedIndex(1);
        novoSubgrupo();
        atualizaComboBoxGrupoItem();
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtDetalharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDetalharActionPerformed
        setSubGrupoItem(subGrupoItens.get(jtbSubGrupoItem.getSelectedRow()));
        setaGrupoJCBGrupoItem();
        jtbpSubGrupoItem.setSelectedIndex(1);
        jbtSalvar.setEnabled(false);
    }//GEN-LAST:event_jbtDetalharActionPerformed

    private void jtbpSubGrupoItemStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtbpSubGrupoItemStateChanged
        if (jtbpSubGrupoItem.getSelectedIndex() == 0) {
            jbtAlterar.setVisible(false);
            jbtExcluir.setVisible(false);
            jbtSalvar.setVisible(false);
        } else {
            jbtSalvar.setVisible(true);
            jbtAlterar.setVisible(true);
            jbtExcluir.setVisible(true);
            if (!(subGrupoItem.getDescricao() == null)) {
                jbtSalvar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jtbpSubGrupoItemStateChanged

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed
        try {
            if (subGrupoItem.getDescricao() == null
                    || subGrupoItem.getGrupoItem() == null) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos Necessários.");
            } else {
                subGrupoItemDao.inserir(subGrupoItem);
                novoSubgrupo();
                atualizaTabela();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos Necessários.");
        }

    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void jbtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAlterarActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null,
                    "Deseja realmente fazer esta auteração ?",
                    "Atenção!", JOptionPane.YES_NO_OPTION) == 0) {
                subGrupoItemDao.alterar(subGrupoItem);
                atualizaTabela();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro !\nMotivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtAlterarActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null,
                    "Deseja realmente excluir este Sub Grupo ?",
                    "Atenção!", JOptionPane.YES_NO_OPTION) == 0) {
                subGrupoItemDao.remover(subGrupoItem);
                novoSubgrupo();
                atualizaTabela();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro !\nMotivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisarActionPerformed
        setSubGrupoItens(subGrupoItemDao.buscarPorDescricao(jtfPesquisar.getText()));
        jtbSubGrupoItem.addRowSelectionInterval(0, 0);
    }//GEN-LAST:event_jbtPesquisarActionPerformed

    private void jcbGrupoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbGrupoItemActionPerformed
        subGrupoItem.setGrupoItem((GrupoItem) jcbGrupoItem.getSelectedItem());
    }//GEN-LAST:event_jcbGrupoItemActionPerformed

    private void jtbSubGrupoItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbSubGrupoItemMouseClicked
        if (evt.getClickCount() == 2) {
            setSubGrupoItem(subGrupoItens.get(jtbSubGrupoItem.getSelectedRow()));
            setaGrupoJCBGrupoItem();
            jtbpSubGrupoItem.setSelectedIndex(1);
            jbtSalvar.setEnabled(false);
        }

    }//GEN-LAST:event_jtbSubGrupoItemMouseClicked

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
            java.util.logging.Logger.getLogger(FrameSubGrupoItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameSubGrupoItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameSubGrupoItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameSubGrupoItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSubGrupoItem().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtAlterar;
    private javax.swing.JButton jbtDetalhar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtPesquisar;
    private javax.swing.JButton jbtSair;
    private javax.swing.JButton jbtSalvar;
    private javax.swing.JComboBox jcbGrupoItem;
    private javax.swing.JTable jtbSubGrupoItem;
    private javax.swing.JTabbedPane jtbpSubGrupoItem;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfDescricaoSubGrupo;
    private javax.swing.JTextField jtfPesquisar;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private SubGrupoItem subGrupoItem;
    private SubGrupoItemDAO subGrupoItemDao;
    private List<SubGrupoItem> subGrupoItens;
    private GrupoItemDAO grupoItemDao;
    List<GrupoItem> grupoItens;

    public SubGrupoItem getSubGrupoItem() {
        return subGrupoItem;
    }

    public void setSubGrupoItem(SubGrupoItem subGrupoItem) {
        SubGrupoItem subGrupoItemVelho = this.subGrupoItem;
        this.subGrupoItem = subGrupoItem;
        firePropertyChange("subGrupoItem", subGrupoItemVelho, this.subGrupoItem);
    }

    public List<SubGrupoItem> getSubGrupoItens() {
        return subGrupoItens;
    }

    public void setSubGrupoItens(List<SubGrupoItem> subGrupoItens) {
        List<SubGrupoItem> subGrupoItensVelho = this.subGrupoItens;
        this.subGrupoItens = ObservableCollections.observableList(subGrupoItens);
        firePropertyChange("subGrupoItens", subGrupoItensVelho, this.subGrupoItens);
    }

    private void atualizaTabela() {
        setSubGrupoItens(subGrupoItemDao.buscarTodos());
        if (subGrupoItemDao.buscarTodos().isEmpty()) {
        } else {
            jtbSubGrupoItem.addRowSelectionInterval(0, 0);
        }
    }

    private void novoSubgrupo() {
        setSubGrupoItem(new SubGrupoItem(new GrupoItem()));
        setcodigos();
        jbtSalvar.setEnabled(true);
    }

    private void atualizaComboBoxGrupoItem() {
        if (grupoItens != null) {
            grupoItens.clear();
        } else {
            grupoItens = grupoItemDao.buscarTodos();
            for (GrupoItem gpItem : grupoItens) {
                jcbGrupoItem.addItem(gpItem);
            }
            jcbGrupoItem.setSelectedIndex(0);
        }
    }

    //metodo pega um objeto e seleciona no comboBox
    private void setaGrupoJCBGrupoItem() {
        jcbGrupoItem.getModel().setSelectedItem(subGrupoItem.getGrupoItem());
    }

    private void setcodigos() {
        if (subGrupoItemDao.buscaIdMaio() == null) {
            subGrupoItem.setCodigo(1);
        } else {
            subGrupoItem.setCodigo(subGrupoItemDao.buscaIdMaio() + 1);
        }
        jtfCodigo.setText(subGrupoItem.getCodigo().toString());
    }
}
