
package FRAME;

import DAO.FornecedorDAO;
import DAO.GrupoItemDAO;
import DAO.IMPL.FornecedorDAOIMPL;
import DAO.IMPL.GrupoItemDAOIMPL;
import DAO.IMPL.ProdutoDAOIMPL;
import DAO.IMPL.SubGrupoItensDAOIMPL;
import DAO.IMPL.UnidadeMedidaDAOIMPL;
import DAO.ProdutoDAO;
import DAO.SubGrupoItemDAO;
import DAO.UnidadeMedidaDAO;
import MODEL.Fornecedor;
import MODEL.GrupoItem;
import MODEL.Produto;
import MODEL.SubGrupoItem;
import MODEL.UnidadeMedida;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;

public class FramePesquisaProduto extends javax.swing.JDialog {

    public FramePesquisaProduto() {
        initComponents();
        setLocation(290, 190);
        produtoDao = new ProdutoDAOIMPL();
        fornecedorDao = new FornecedorDAOIMPL();
        grupoItemDao = new GrupoItemDAOIMPL();
        subGrupoItemDao = new SubGrupoItensDAOIMPL();
        unidadeMedidaDao = new UnidadeMedidaDAOIMPL();
        atualizaTabela();
        jtbProdutos.setAutoResizeMode(jtbProdutos.AUTO_RESIZE_OFF);  
        jtbProdutos.getColumnModel().getColumn(0).setPreferredWidth(110);  
        jtbProdutos.getColumnModel().getColumn(1).setPreferredWidth(543);
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
        jtbProdutos = new javax.swing.JTable();

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
        jLabel1.setText("Pesquisa de Produtos");

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

        jtbProdutos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${produtos}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jtbProdutos);
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
        jtbProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbProdutosMouseClicked(evt);
            }
        });
        jtbProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtbProdutosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtbProdutos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 397, Short.MAX_VALUE)
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
        setProdutos(produtoDao.buscarPorDescricao(jtfPesquisar.getText()));
        if (produtoDao.buscarPorDescricao(jtfPesquisar.getText()).isEmpty()) {
        } else {
            jtbProdutos.addRowSelectionInterval(0, 0);
        }
    }//GEN-LAST:event_jbtPesquisarActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jbtConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConfirmarActionPerformed
       try{
        if (jtbProdutos.getSelectedRow() != -1) {
            produto = produtos.get(jtbProdutos.getSelectedRow());
            dispose();
        }
         } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "É preciso adicionar um Produto para que possa fazer a pesquisa");
        }
    }//GEN-LAST:event_jbtConfirmarActionPerformed

    private void jtbProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbProdutosMouseClicked
        if (evt.getClickCount() == 2) {
            produto = produtos.get(jtbProdutos.getSelectedRow());
            dispose();
        }
    }//GEN-LAST:event_jtbProdutosMouseClicked

    private void jtbProdutosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbProdutosKeyPressed
        if(evt.getKeyCode() == 10){
            produto = produtos.get(jtbProdutos.getSelectedRow());
            dispose();
        }
    }//GEN-LAST:event_jtbProdutosKeyPressed

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
            java.util.logging.Logger.getLogger(FramePesquisaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePesquisaProduto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtConfirmar;
    private javax.swing.JButton jbtPesquisar;
    private javax.swing.JTable jtbProdutos;
    private javax.swing.JTextField jtfPesquisar;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private Produto produto;
    private List<Produto> produtos;
    private ProdutoDAO produtoDao;
    //Fornecedor
    private Fornecedor fornecedor;
    private FornecedorDAO fornecedorDao;
    //Grupo
    private GrupoItem grupoItem;
    private GrupoItemDAO grupoItemDao;
    List<GrupoItem> grupoItens;
    //SubGrupo
    private SubGrupoItem subGrupoItem;
    private SubGrupoItemDAO subGrupoItemDao;
    List<SubGrupoItem> subGrupoItens;
    //UnidadeMedida
    private UnidadeMedidaDAO unidadeMedidaDao;
    List<UnidadeMedida> unidadeMedidas;
    //FramePesqusia

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        List<Produto> produtosVelhos = this.produtos;
        this.produtos = ObservableCollections.observableList(produtos);
        firePropertyChange("produtos", produtosVelhos, this.produtos);
    }



    public void atualizaTabela() {
        setProdutos(produtoDao.buscarTodos());
        if (produtoDao.buscarTodos().isEmpty()) {
        } else {
            jtbProdutos.addRowSelectionInterval(0, 0);
        }
    }

    public Produto retornaProduto() {
        return this.produto;
    }
}
