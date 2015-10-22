package FRAME;

import DAO.GrupoColaboradorDAO;
import DAO.IMPL.GrupoColaboradorDAOIMPL;
import MODEL.GrupoColaborador;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;

public class FrameCadastroGrupoColaborador extends javax.swing.JFrame {

    public FrameCadastroGrupoColaborador() {
        initComponents();
        setLocation(200, 100);
        grupoColaboradorDao = new GrupoColaboradorDAOIMPL();
        novoGrupo();
        atualizaTabela();
        jtbGrupoColaborador.setAutoResizeMode(jtbGrupoColaborador.AUTO_RESIZE_OFF);
        jtbGrupoColaborador.getColumnModel().getColumn(0).setPreferredWidth(75);
        jtbGrupoColaborador.getColumnModel().getColumn(1).setPreferredWidth(474);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        jbtEditar = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtSalvar = new javax.swing.JButton();
        jbtNovo = new javax.swing.JButton();
        jtbpGrupoColaborador = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbGrupoColaborador = new javax.swing.JTable();
        jtfPesquisar = new javax.swing.JTextField();
        jbtPesquisar = new javax.swing.JButton();
        jbtDetalhar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfDescricaoGrupo = new javax.swing.JTextField();
        jbtSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Grupo de Colaboradores");
        setLocation(new java.awt.Point(200, 100));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Hiragino Sans GB", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro Grupo de Colaboradores");

        jbtEditar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtEditar.setText("Alterar");
        jbtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEditarActionPerformed(evt);
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

        jbtNovo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtNovo.setText("Novo");
        jbtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNovoActionPerformed(evt);
            }
        });

        jtbpGrupoColaborador.setBackground(new java.awt.Color(153, 153, 153));
        jtbpGrupoColaborador.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jtbpGrupoColaborador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtbpGrupoColaboradorStateChanged(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${grupoColaboradores}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jtbGrupoColaborador);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descricao}"));
        columnBinding.setColumnName("Descrição");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jtbGrupoColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbGrupoColaboradorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbGrupoColaborador);

        jtfPesquisar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jtfPesquisar.setToolTipText("pesquisa item");

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
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
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
                .add(jbtDetalhar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtbpGrupoColaborador.addTab("Grupos", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel2.setText("*Código");

        jtfCodigo.setEditable(false);
        jtfCodigo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${grupoColaborador.codigo}"), jtfCodigo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel3.setText("*Descrição");

        jtfDescricaoGrupo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${grupoColaborador.descricao}"), jtfDescricaoGrupo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(jLabel3)
                    .add(jtfCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtfDescricaoGrupo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 335, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(205, Short.MAX_VALUE))
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
                .add(jtfDescricaoGrupo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        jtbpGrupoColaborador.addTab("Cadastro", jPanel3);
        jPanel3.getAccessibleContext().setAccessibleName("");

        jbtSair.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtSair.setText("Sair");
        jbtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSairActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jLabel1))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jbtNovo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jbtSalvar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jbtEditar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jbtExcluir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jbtSair, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jtbpGrupoColaborador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 567, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel1)
                .add(12, 12, 12)
                .add(jtbpGrupoColaborador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 333, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(6, 6, 6)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jbtSalvar)
                    .add(jbtNovo)
                    .add(jbtEditar)
                    .add(jbtExcluir)
                    .add(jbtSair)))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSairActionPerformed
        dispose();
    }//GEN-LAST:event_jbtSairActionPerformed

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed
        novoGrupo();
        jtbpGrupoColaborador.setSelectedIndex(1);
        jbtSalvar.setEnabled(true);
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtDetalharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDetalharActionPerformed
        try {
            setGrupoColaborador(grupoColaboradores.get(jtbGrupoColaborador.getSelectedRow()));
            jtbpGrupoColaborador.setSelectedIndex(1);
            jbtSalvar.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Por favor para poder detalhar é preciso cadastrar um Grupo de Colaborador.");
        }
    }//GEN-LAST:event_jbtDetalharActionPerformed

    private void jbtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisarActionPerformed
        setGrupoColaboradores(grupoColaboradorDao.buscarPorDescricao(jtfPesquisar.getText()));
        if (grupoColaboradorDao.buscarPorDescricao(jtfPesquisar.getText()).isEmpty()) {
        } else {
            jtbGrupoColaborador.addRowSelectionInterval(0, 0);
        }
    }//GEN-LAST:event_jbtPesquisarActionPerformed

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed
        try {
            if (grupoColaborador.getDescricao() == null) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos Necessários.");
            } else {
            grupoColaboradorDao.inserir(grupoColaborador);
            novoGrupo();
            atualizaTabela(); 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos Necessários.");
        }
    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void jtbGrupoColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbGrupoColaboradorMouseClicked
        try {
            if (evt.getClickCount() == 2) {
                setGrupoColaborador(grupoColaboradores.get(jtbGrupoColaborador.getSelectedRow()));
                jtbpGrupoColaborador.setSelectedIndex(1);
                jbtSalvar.setEnabled(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Por favor para poder detalhar é preciso cadastrar um Grupo de Colaborador.");
        }
    }//GEN-LAST:event_jtbGrupoColaboradorMouseClicked

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null,
                    "Deseja realmente excluir este Grupo de Colaborador ?",
                    "Atenção!", JOptionPane.YES_NO_OPTION) == 0) {
                grupoColaboradorDao.remover(grupoColaborador);
                novoGrupo();
                atualizaTabela();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro !\nMotivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEditarActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null,
                    "Deseja realmente fazer esta auteração ?",
                    "Atenção!", JOptionPane.YES_NO_OPTION) == 0) {
                grupoColaboradorDao.alterar(grupoColaborador);
                atualizaTabela();
                JOptionPane.showMessageDialog(rootPane, "Alterado com sucesso!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro !\nMotivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtEditarActionPerformed

    private void jtbpGrupoColaboradorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtbpGrupoColaboradorStateChanged
        if (jtbpGrupoColaborador.getSelectedIndex() == 0) {
            jbtEditar.setVisible(false);
            jbtExcluir.setVisible(false);
            jbtSalvar.setVisible(false);
        } else {
            jbtSalvar.setVisible(true);
            jbtEditar.setVisible(true);
            jbtExcluir.setVisible(true);
            if(!(grupoColaborador.getDescricao() == null)){
                jbtSalvar.setEnabled(false);
            } 
        }
    }//GEN-LAST:event_jtbpGrupoColaboradorStateChanged

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
            java.util.logging.Logger.getLogger(FrameCadastroGrupoColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroGrupoColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroGrupoColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroGrupoColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCadastroGrupoColaborador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtDetalhar;
    private javax.swing.JButton jbtEditar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtPesquisar;
    private javax.swing.JButton jbtSair;
    private javax.swing.JButton jbtSalvar;
    private javax.swing.JTable jtbGrupoColaborador;
    private javax.swing.JTabbedPane jtbpGrupoColaborador;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfDescricaoGrupo;
    private javax.swing.JTextField jtfPesquisar;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private GrupoColaborador grupoColaborador;
    private List<GrupoColaborador> grupoColaboradores;
    private GrupoColaboradorDAO grupoColaboradorDao;

    public GrupoColaborador getGrupoColaborador() {
        return grupoColaborador;
    }

    public void setGrupoColaborador(GrupoColaborador grupoColaborador) {
        GrupoColaborador grupoColaboradorVelho = this.grupoColaborador;
        this.grupoColaborador = grupoColaborador;
        firePropertyChange("grupoColaborador", grupoColaboradorVelho, this.grupoColaborador);
    }

    public List<GrupoColaborador> getGrupoColaboradores() {
        return grupoColaboradores;
    }

    public void setGrupoColaboradores(List<GrupoColaborador> grupoColaboradores) {
        List<GrupoColaborador> grupoColaboradoresVelhos = this.grupoColaboradores;
        this.grupoColaboradores = ObservableCollections.observableList(grupoColaboradores);
        firePropertyChange("grupoColaboradores", grupoColaboradoresVelhos, this.grupoColaboradores);
    }

    private void atualizaTabela() {
        setGrupoColaboradores(grupoColaboradorDao.buscarTodos());
        if (grupoColaboradorDao.buscarTodos().isEmpty()) {
        } else {
            jtbGrupoColaborador.addRowSelectionInterval(0, 0);
        }
    }

    private void novoGrupo() {
        jbtSalvar.setEnabled(true);
        setGrupoColaborador(new GrupoColaborador());
        
        if (grupoColaboradorDao.buscarIdMaior() == null) {
            grupoColaborador.setCodigo(1);
        } else {
            grupoColaborador.setCodigo(grupoColaboradorDao.buscarIdMaior() + 1);
        }
        jtfCodigo.setText(grupoColaborador.getCodigo().toString());
    }
    
}
