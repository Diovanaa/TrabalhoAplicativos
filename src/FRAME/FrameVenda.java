package FRAME;

import DAO.IMPL.ProdutoDAOIMPL;
import DAO.IMPL.ProdutoDaVendaDAOIMPL;
import DAO.IMPL.VendaDAOIMPL;
import DAO.ProdutoDAO;
import DAO.ProdutoDaVendaDAO;
import DAO.VendaDAO;
import MODEL.Colaborador;
import MODEL.Parceiro;
import MODEL.Produto;
import MODEL.ProdutosDaVenda;
import MODEL.Venda;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class FrameVenda extends javax.swing.JFrame {

    public FrameVenda() {
        initComponents();
        setLocation(200, 100);
        jbtExcluir.setVisible(false);
        jbtAlterar.setVisible(false);
        vendaDao = new VendaDAOIMPL();
        tableModel = new DefaultTableModel();
        produtoDao = new ProdutoDAOIMPL();
        produtosDaVendaDao = new ProdutoDaVendaDAOIMPL();
        produtosDasVendas = new ArrayList<ProdutosDaVenda>();
        novaVenda();
        jtbVenda.setAutoResizeMode(jtbVenda.AUTO_RESIZE_OFF);  
        jtbVenda.getColumnModel().getColumn(0).setPreferredWidth(104);  
        jtbVenda.getColumnModel().getColumn(1).setPreferredWidth(450);
        jtbVenda.getColumnModel().getColumn(2).setPreferredWidth(115);  
        jtbVenda.getColumnModel().getColumn(3).setPreferredWidth(115);
        jtbVenda.getColumnModel().getColumn(4).setPreferredWidth(115);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jbtSair = new javax.swing.JButton();
        jbtNovo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jpn1 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jtfCliente = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jdcDataVenda = new com.toedter.calendar.JDateChooser();
        jbtPesquisaVendedor = new javax.swing.JButton();
        jtfVendedor = new javax.swing.JTextField();
        jbtPesquisaCliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbVenda = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jbtExcluirProduto = new javax.swing.JButton();
        jlbValorTotalVenda = new javax.swing.JLabel();
        jbtFinalizarVenda = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jbtImprimir = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jbtPesquisarVenda = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venda de Mercadoria");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

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

        jLabel1.setFont(new java.awt.Font("Hiragino Sans GB", 0, 24)); // NOI18N
        jLabel1.setText("Venda de Mercadoria");

        jpn1.setBackground(new java.awt.Color(153, 153, 153));
        jpn1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Grande", 0, 12))); // NOI18N
        jpn1.setToolTipText("Cadastro");

        jLabel31.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel31.setText("*Código");

        jLabel33.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel33.setText("*Colaborador");

        jLabel35.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel35.setText("*Parceiro");

        jtfCliente.setEditable(false);
        jtfCliente.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${venda.cliente_codigo.pessoa.nome}"), jtfCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfClienteActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel37.setText("*Data Venda");

        jtfCodigo.setEditable(false);
        jtfCodigo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${venda.codigo}"), jtfCodigo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoActionPerformed(evt);
            }
        });

        jbtPesquisaVendedor.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtPesquisaVendedor.setText("Buscar");
        jbtPesquisaVendedor.setToolTipText("Pesquisa Vendedor");
        jbtPesquisaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisaVendedorActionPerformed(evt);
            }
        });

        jtfVendedor.setEditable(false);
        jtfVendedor.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${venda.colaborador_codigo.pessoa.nome}"), jtfVendedor, org.jdesktop.beansbinding.BeanProperty.create("text"), "");
        bindingGroup.addBinding(binding);

        jtfVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfVendedorActionPerformed(evt);
            }
        });

        jbtPesquisaCliente.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtPesquisaCliente.setText("Buscar");
        jbtPesquisaCliente.setToolTipText("Pesquisa Vendedor");
        jbtPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisaClienteActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jpn1Layout = new org.jdesktop.layout.GroupLayout(jpn1);
        jpn1.setLayout(jpn1Layout);
        jpn1Layout.setHorizontalGroup(
            jpn1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpn1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jpn1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel31)
                    .add(jtfCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 106, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jpn1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jdcDataVenda, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 83, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jpn1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jpn1Layout.createSequentialGroup()
                        .add(jbtPesquisaVendedor)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtfVendedor))
                    .add(jLabel33))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jpn1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel35)
                    .add(jpn1Layout.createSequentialGroup()
                        .add(jbtPesquisaCliente)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtfCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 225, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpn1Layout.setVerticalGroup(
            jpn1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpn1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jpn1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel37, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jpn1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel31)
                        .add(jLabel35)
                        .add(jLabel33)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jpn1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jpn1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jtfCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jtfCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jbtPesquisaVendedor)
                        .add(jtfVendedor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jbtPesquisaCliente))
                    .add(jdcDataVenda, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jtbVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Quantidade", "Valor UN", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbVendaMouseClicked(evt);
            }
        });
        jtbVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtbVendaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jtbVenda);
        jtbVenda.getColumnModel().getColumn(0).setResizable(false);
        jtbVenda.getColumnModel().getColumn(1).setResizable(false);
        jtbVenda.getColumnModel().getColumn(2).setResizable(false);
        jtbVenda.getColumnModel().getColumn(3).setResizable(false);
        jtbVenda.getColumnModel().getColumn(4).setResizable(false);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Valor da Venda");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jbtExcluirProduto.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtExcluirProduto.setText("Excluir Produto");
        jbtExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirProdutoActionPerformed(evt);
            }
        });

        jlbValorTotalVenda.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jlbValorTotalVenda.setForeground(new java.awt.Color(255, 255, 255));

        jbtFinalizarVenda.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtFinalizarVenda.setText("Finalizar Venda");
        jbtFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFinalizarVendaActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("P busca produtos");

        jbtImprimir.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtImprimir.setText("Imprimir");
        jbtImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtImprimirActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jbtFinalizarVenda)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtExcluirProduto)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtImprimir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel9)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jlbValorTotalVenda, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 107, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel36)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(0, 458, Short.MAX_VALUE)
                    .add(jLabel10)
                    .add(0, 459, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel36)
                .add(3, 3, 3)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 327, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jlbValorTotalVenda, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jbtFinalizarVenda)
                        .add(jbtExcluirProduto)
                        .add(jLabel9)
                        .add(jbtImprimir)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(0, 196, Short.MAX_VALUE)
                    .add(jLabel10)
                    .add(0, 196, Short.MAX_VALUE)))
        );

        jbtCancelar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtCancelar.setText("Cancelar");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        jbtPesquisarVenda.setText("Pesquisar Venda");
        jbtPesquisarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisarVendaActionPerformed(evt);
            }
        });

        jbtExcluir.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtExcluir.setText("Excluir");
        jbtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirActionPerformed(evt);
            }
        });

        jbtAlterar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtAlterar.setText("Alterar");
        jbtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAlterarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jbtPesquisarVenda)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel1))
                    .add(jpn1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(jbtNovo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtAlterar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtExcluir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtSair, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(9, 9, 9)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jbtPesquisarVenda))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jpn1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(12, 12, 12)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jbtNovo)
                    .add(jbtCancelar)
                    .add(jbtSair)
                    .add(jbtExcluir)
                    .add(jbtAlterar)))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSairActionPerformed

        dispose();

    }//GEN-LAST:event_jbtSairActionPerformed

    private void jtfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfClienteActionPerformed

    private void jbtPesquisaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisaVendedorActionPerformed
        buscaVendedor();
    }//GEN-LAST:event_jbtPesquisaVendedorActionPerformed

    private void jbtPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisaClienteActionPerformed
        buscaCliente();
    }//GEN-LAST:event_jbtPesquisaClienteActionPerformed

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed
        limpaCampos();
        limpaTabela();
        jbtAlterar.setVisible(false);
        jbtExcluir.setVisible(false);
        jbtExcluirProduto.setVisible(true);
        jbtFinalizarVenda.setVisible(true);
        novaVenda();
        produtosDasVendas.removeAll(produtosDasVendas);
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFinalizarVendaActionPerformed
        try {
            venda.setCodigo(Integer.valueOf(jtfCodigo.getText()));
            venda.setDataVenda(jdcDataVenda.getDate());
            vendaDao.inserir(venda);
            for (ProdutosDaVenda prod : this.produtosDasVendas) {
                prod.setVenda_codigo(venda);
                produtosDaVendaDao.inserir(prod);
            }
            jbtExcluirProduto.setEnabled(false);
            jbtFinalizarVenda.setEnabled(false);
            jbtImprimir.setVisible(true);
            //novaVenda();
            JOptionPane.showMessageDialog(null, "Documento Salvo com Sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Campo não preenchido \n" + e.getMessage());
        }
    }//GEN-LAST:event_jbtFinalizarVendaActionPerformed

    private void jtfVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfVendedorActionPerformed

    private void jtbVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbVendaKeyPressed
        //pega tecla enter mas aplica função da tecla tab
        InputMap imap = jtbVenda.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        imap.put(KeyStroke.getKeyStroke("pressed ENTER"), "selectNextColumnCell");
        //identifica o indice da linha e coluna
        int linha = jtbVenda.getSelectedRow();
        int coluna = jtbVenda.getSelectedColumn();
        //seta o foco na celula que esta sendo editada
        jtbVenda.setSurrendersFocusOnKeystroke(true);
        //se for precionado F3 abre tela de pesquisa de produto
        if (evt.getKeyCode() == KeyEvent.VK_P) {
            buscaProduto();
        } //se houver um enter na coluna 2 seta a quantidade no produto
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER && jtbVenda.getSelectedColumn() == 2) {
                Object qtd = jtbVenda.getValueAt(linha, coluna);
                produtodavenda.setQuantidade(Float.parseFloat(String.valueOf(qtd)));
            } //se houver um enter na coluna 3 seta o valor UN do produto e calcula o total para a coluna 4
            else if (evt.getKeyCode() == KeyEvent.VK_ENTER && jtbVenda.getSelectedColumn() == 3) {
                Object unit = jtbVenda.getValueAt(linha, coluna);
                produtodavenda.setValorUnitario(Float.parseFloat(String.valueOf(unit)));
                jtbVenda.setValueAt(calculaTotalDoProduto(), linha, 4);
            }
            //se houver um enter na coluna 4 adiciona o item da linha na lista, cria nova linha e calcula o total da venda
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Preencha os campos em branco!");
        }

        if (evt.getKeyCode() == 10 && jtbVenda.getSelectedColumn() == 4) {
            produtosDasVendas.add(produtodavenda);
            inserirLinha();
            jlbValorTotalVenda.setText(String.valueOf(calculaTotalVenda()));
        }
    }//GEN-LAST:event_jtbVendaKeyPressed

    private void jtfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoActionPerformed
    }//GEN-LAST:event_jtfCodigoActionPerformed

    private void jbtExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirProdutoActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null,
                    "Deseja realmente excluir este produto?",
                    "Atenção!", JOptionPane.YES_NO_OPTION) == 0) {
                ProdutosDaVenda produtovenda = new ProdutosDaVenda();
                int linha = jtbVenda.getSelectedRow();
                produtovenda = produtosDasVendas.get(linha);
                System.out.println(produtovenda.getValorTotal());
                venda.setValorVenda(venda.getValorVenda() - produtovenda.getValorTotal());
                produtosDasVendas.remove(produtosDasVendas.get(linha));
                ((DefaultTableModel) jtbVenda.getModel()).removeRow(linha);
                jlbValorTotalVenda.setText(String.valueOf(venda.getValorVenda()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!\nMotivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbtExcluirProdutoActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        limpaCampos();
        limpaTabela();
        jbtAlterar.setVisible(false);
        jbtExcluir.setVisible(false);
        jbtExcluirProduto.setVisible(true);
        jbtFinalizarVenda.setVisible(true);
        novaVenda();
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jtbVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbVendaMouseClicked
    }//GEN-LAST:event_jtbVendaMouseClicked

    private void jbtPesquisarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisarVendaActionPerformed
        buscarVenda();
    }//GEN-LAST:event_jbtPesquisarVendaActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null,
                    "Deseja realmente excluir esta Venda?",
                    "Atenção!", JOptionPane.YES_NO_OPTION) == 0) {
                produtosDaVendaDao.removerAllProdutosDaVenda(produtodavenda);
                vendaDao.remover(venda);
                novaVenda();
                produtosDasVendas.removeAll(produtosDasVendas);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!\nMotivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtImprimirActionPerformed
        ProdutoDaVendaDAO dao = new ProdutoDaVendaDAOIMPL();
        try {
                    List<ProdutosDaVenda> dados = dao.buscarParametroParaImpressao(venda.getCodigo());
                    JRDataSource datasource = new JRBeanCollectionDataSource(dados);
                    JasperDesign jasper = JRXmlLoader.load("src/REPORT/Venda.jrxml");
                    JasperReport jasperReport = JasperCompileManager.compileReport(jasper);
                    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, datasource);
                    JasperViewer.viewReport(jasperPrint, false);
                  
        } catch (JRException ex) {
            System.out.println("Filtro não encontrado" + ex.getMessage());
        }
    }//GEN-LAST:event_jbtImprimirActionPerformed

    private void jbtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAlterarActionPerformed
        try {
            venda.setCodigo(Integer.valueOf(jtfCodigo.getText()));
            venda.setDataVenda(jdcDataVenda.getDate());
            try {
                vendaDao.alterar(venda);
                JOptionPane.showMessageDialog(null, "Documento Salvo com Sucesso");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Salvar!\nMotivo: "
                        + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
            try {
                produtodavenda.setVenda_codigo(venda);
                produtosDaVendaDao.removerAllProdutosDaVenda(produtodavenda);
                int linha = 0;
                while (linha < jtbVenda.getRowCount() - 1) {
                    if (produtosDasVendas.get(linha) != null) {
                        produtodavenda = produtosDasVendas.get(linha);
                        produtodavenda.setVenda_codigo(venda);

                        produtosDaVendaDao.inserir(produtodavenda);
                    }

                    linha++;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Salvar!\nMotivo: "
                        + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Campo não preenchido \n" + e.getMessage());
        }
    }//GEN-LAST:event_jbtAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(FrameVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameVenda().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtAlterar;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtExcluirProduto;
    private javax.swing.JButton jbtFinalizarVenda;
    private javax.swing.JButton jbtImprimir;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtPesquisaCliente;
    private javax.swing.JButton jbtPesquisaVendedor;
    private javax.swing.JButton jbtPesquisarVenda;
    private javax.swing.JButton jbtSair;
    private com.toedter.calendar.JDateChooser jdcDataVenda;
    private javax.swing.JLabel jlbValorTotalVenda;
    private javax.swing.JPanel jpn1;
    private javax.swing.JTable jtbVenda;
    private javax.swing.JTextField jtfCliente;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfVendedor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private Venda venda;
    private VendaDAO vendaDao;
    private ProdutosDaVenda produtodavenda;
    private List<ProdutosDaVenda> produtosDasVendas;
    private ProdutoDaVendaDAO produtosDaVendaDao;
    private Produto produto;
    private ProdutoDAO produtoDao;
    DefaultTableModel tableModel;

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    private void novaVenda() {
        setVenda(new Venda(new Parceiro(), new Colaborador(), new ArrayList<ProdutosDaVenda>()));
        limpaCampos();
        venda.setValorVenda(0f);
        setarCodigo();
        jbtImprimir.setVisible(false);
        jbtExcluirProduto.setEnabled(true);
        jbtFinalizarVenda.setEnabled(true);
    }

    private void setarCodigo() {
        if (vendaDao.buscaIdMaio() == null) {
            venda.setCodigo(1);
        } else {
            venda.setCodigo(vendaDao.buscaIdMaio() + 1);
        }
        jtfCodigo.setText(venda.getCodigo().toString());
    }

    private void limpaCampos() {
        jtfCodigo.setText("");
        jdcDataVenda.setDate(new Date());
        jtfVendedor.setText("");
        jtfCliente.setText("");
        jlbValorTotalVenda.setText("");
        limpaTabela();
    }

    public void buscaProduto() {
        //instancia produto
        Produto p = new Produto();
        //instancia produto da compra
        produtodavenda = new ProdutosDaVenda();
        //cria a tela de busca como modal
        FramePesquisaProduto tela_busca = new FramePesquisaProduto();
        tela_busca.setModal(true);
        //exibe a tela de pesquisa do produto
        tela_busca.setVisible(true);
        //recupera os dados
        p = tela_busca.retornaProduto();
        //seta o produto para o produto da compra
        produtodavenda.setProduto_codigo(p);
        //seta na tela o produto da compra
        if (produtodavenda.getProduto_codigo() != null) {
            Integer linhaSelecionada = jtbVenda.getSelectedRow();
            jtbVenda.setValueAt(p.getCodigo(), linhaSelecionada, 0);
            jtbVenda.setValueAt(p.getDescricao(), linhaSelecionada, 1);
            jtbVenda.setValueAt(p.getPrecoVenda(), linhaSelecionada, 3);
        }
    }

    private Float calculaTotalDoProduto() {
        Float preco;
        Float quant;
        Float total = null;
        preco = produtodavenda.getValorUnitario();
        quant = produtodavenda.getQuantidade();
        total = quant * preco;
        produtodavenda.setValorTotal(total);
        return produtodavenda.getValorTotal();
    }

    private Float calculaTotalVenda() {
        venda.setValorVenda(produtodavenda.getValorTotal() + venda.getValorVenda());
        return venda.getValorVenda();
    }

    private void inserirLinha() {
        int linha = jtbVenda.getSelectedRow();
        ((DefaultTableModel) jtbVenda.getModel()).addRow(new Vector());
        int coluna = -1;
        jtbVenda.changeSelection(linha, coluna, false, false);
    }

    private void limpaTabela() {
        ((DefaultTableModel) jtbVenda.getModel()).setNumRows(0);
        jtbVenda.updateUI();
        inserirLinha();
    }

    private void defineSaldoEstoque() {
        produtodavenda.getProduto_codigo().setSaldoEstoque(produtodavenda.getQuantidade());
    }

    public void buscaVendedor() {
        //cria a tela de busca como modal
        FramePesquisaColaborador tela_busca = new FramePesquisaColaborador();
        tela_busca.setModal(true);
        //exibe
        tela_busca.setVisible(true);
        //recupera os dados
        Colaborador c = new Colaborador();
        c = tela_busca.retornaColaborador();
        this.venda.setColaborador_codigo(c);

        if (venda.getColaborador_codigo() != null) {
            jtfVendedor.setText(venda.getColaborador_codigo().getPessoa().getNome());
        }
    }

    public void buscaCliente() {
        //cria a tela de busca como modal
        FramePesquisaCliente tela_busca = new FramePesquisaCliente();
        tela_busca.setModal(true);
        //exibe
        tela_busca.setVisible(true);
        //recupera os dados
        Parceiro p = new Parceiro();
        p = tela_busca.retornaParceiro();
        this.venda.setCliente_codigo(p);

        if (venda.getCliente_codigo() != null) {
            jtfCliente.setText(venda.getCliente_codigo().getPessoa().getNome());
        }
    }

    public void buscarVenda() {
        produtodavenda = new ProdutosDaVenda();
        //cria a tela de busca como modal
        FramePesquisaVenda tela_busca = new FramePesquisaVenda();
        tela_busca.setModal(true);
        //exibe
        tela_busca.setVisible(true);
        //recupera os dados
        Venda vend = new Venda();
        vend = tela_busca.retornaVenda();
        //seta na tela
        if (vend != null) {
            limpaCampos();
            limpaTabela();
            jbtAlterar.setVisible(true);
            jbtExcluir.setVisible(true);
            
            jbtFinalizarVenda.setVisible(false);

            this.venda.setCodigo(vend.getCodigo());
            this.venda.setDataVenda(vend.getDataVenda());
            this.venda.setCliente_codigo(vend.getCliente_codigo());
            this.venda.setColaborador_codigo(vend.getColaborador_codigo());
            this.venda.setValorVenda(vend.getValorVenda());
            produtodavenda.setVenda_codigo(vend);

            jtfCodigo.setText(String.valueOf(venda.getCodigo()));
            jdcDataVenda.setDate(venda.getDataVenda());
            jtfCliente.setText(venda.getCliente_codigo().getPessoa().getNome());
            jtfVendedor.setText(venda.getColaborador_codigo().getPessoa().getNome());

            produtosDasVendas = produtosDaVendaDao.buscarPorCompra(this.venda);

            int linha = 0;
            for (ProdutosDaVenda prods : produtosDasVendas) {
                jtbVenda.getModel().setValueAt(prods.getProduto_codigo().getCodigo(), linha, 0);
                jtbVenda.getModel().setValueAt(prods.getProduto_codigo().getDescricao(), linha, 1);
                jtbVenda.getModel().setValueAt(prods.getQuantidade(), linha, 2);
                jtbVenda.getModel().setValueAt(prods.getValorUnitario(), linha, 3);
                jtbVenda.getModel().setValueAt(prods.getValorTotal(), linha, 4);
                linha++;
                inserirLinha();
            }
            jlbValorTotalVenda.setText(String.valueOf(this.venda.getValorVenda()));
        }
    }
}