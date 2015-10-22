package FRAME;

import DAO.ColaboradorDAO;
import DAO.IMPL.ColaboradorDAOIMPL;
import MODEL.Colaborador;
import MODEL.GrupoColaborador;
import java.util.List;
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

public class FrameRelatorioColaboradores extends javax.swing.JFrame {

    public FrameRelatorioColaboradores() {
        initComponents();
        setLocation(290, 190);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        jbtGerarRelatorio = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jbtPesquisaVendedor = new javax.swing.JButton();
        jtfGrupoColaborador = new javax.swing.JTextField();
        jchbFiltro = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Colaboradores");
        setLocation(new java.awt.Point(200, 100));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Hiragino Sans GB", 0, 24)); // NOI18N
        jLabel1.setText("Relatório de Colaboradores");

        jbtGerarRelatorio.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtGerarRelatorio.setText("Gerar Relatório");
        jbtGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtGerarRelatorioActionPerformed(evt);
            }
        });

        jbtCancelar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtCancelar.setText("Cancelar");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel4.setText("Grupo de Colaborador");

        jbtPesquisaVendedor.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtPesquisaVendedor.setText("Buscar");
        jbtPesquisaVendedor.setToolTipText("Pesquisa Vendedor");
        jbtPesquisaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisaVendedorActionPerformed(evt);
            }
        });

        jtfGrupoColaborador.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${grupoColaborador.descricao}"), jtfGrupoColaborador, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtfGrupoColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfGrupoColaboradorActionPerformed(evt);
            }
        });

        jchbFiltro.setSelected(true);
        jchbFiltro.setText("Relatório sem Filtro");
        jchbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchbFiltroActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("Gerar Filtro por:");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jtfGrupoColaborador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 251, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtPesquisaVendedor))
                    .add(jLabel4)
                    .add(jchbFiltro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 164, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jbtPesquisaVendedor)
                    .add(jtfGrupoColaborador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(62, 62, 62)
                .add(jchbFiltro)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jbtGerarRelatorio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 122, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 122, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(84, 318, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(0, 0, Short.MAX_VALUE)
                                .add(jLabel1))
                            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jbtGerarRelatorio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jbtCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtGerarRelatorioActionPerformed
        ColaboradorDAO dao = new ColaboradorDAOIMPL();
        try {

            if (jchbFiltro.isSelected() == true) {
                List<Colaborador> dados = dao.buscarTodos();
                //DataSource para o relatório com os dados dentro.
                JRDataSource datasource = new JRBeanCollectionDataSource(dados);
                //localiza arquivo .jrxml
                JasperDesign jasper = JRXmlLoader.load("src/REPORT/RelatorioColaboradores.jrxml");
                //campila para arquivo .jasper
                JasperReport jasperReport = JasperCompileManager.compileReport(jasper);
                //Gerar arquivo para impressão
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, datasource);
                //Chama visualizador do relatório
                JasperViewer.viewReport(jasperPrint, false);
                
            } else {
                List<Colaborador> dados = dao.buscarParametrosRelatorio(grupoColaborador.getCodigo());
                JRDataSource datasource = new JRBeanCollectionDataSource(dados);
                JasperDesign jasper = JRXmlLoader.load("src/REPORT/RelatorioColaboradores.jrxml");
                JasperReport jasperReport = JasperCompileManager.compileReport(jasper);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, datasource);
                JasperViewer.viewReport(jasperPrint, false);
                
            }
        } catch (JRException ex) {
            System.out.println("Filtro não encontrado" + ex.getMessage());
        }
    }//GEN-LAST:event_jbtGerarRelatorioActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jbtPesquisaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisaVendedorActionPerformed
        buscaGrupoColaborador();
        jchbFiltro.setSelected(false);
    }//GEN-LAST:event_jbtPesquisaVendedorActionPerformed

    private void jtfGrupoColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfGrupoColaboradorActionPerformed

    }//GEN-LAST:event_jtfGrupoColaboradorActionPerformed

    private void jchbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchbFiltroActionPerformed
        if(jchbFiltro.isSelected()== true)
            jtfGrupoColaborador.setText(null);
            
    }//GEN-LAST:event_jchbFiltroActionPerformed

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
            java.util.logging.Logger.getLogger(FrameRelatorioColaboradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRelatorioColaboradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRelatorioColaboradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRelatorioColaboradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameRelatorioColaboradores().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtGerarRelatorio;
    private javax.swing.JButton jbtPesquisaVendedor;
    private javax.swing.JCheckBox jchbFiltro;
    private javax.swing.JTextField jtfGrupoColaborador;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private Colaborador colaborador;
    private List<Colaborador> colaboradores;
    private GrupoColaborador grupoColaborador;
    private List<GrupoColaborador> grupoColaboradores;

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        Colaborador colaboradorVelho = this.colaborador;
        this.colaborador = colaborador;
        firePropertyChange("colaborador", colaboradorVelho, this.colaborador);
    }

    public List<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(List<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }

    public GrupoColaborador getGrupoColaborador() {
        return grupoColaborador;
    }

    public void setGrupoColaborador(GrupoColaborador grupoColaborador) {
        this.grupoColaborador = grupoColaborador;
    }

    public List<GrupoColaborador> getGrupoColaboradores() {
        return grupoColaboradores;
    }

    public void setGrupoColaboradores(List<GrupoColaborador> grupoColaboradores) {
        this.grupoColaboradores = grupoColaboradores;
    }

    public void buscaGrupoColaborador() {
        //cria a tela de busca como modal
        FramePesquisaGrupoColaborador tela_busca = new FramePesquisaGrupoColaborador();
        tela_busca.setModal(true);
        //exibe
        tela_busca.setVisible(true);
        //recupera os dados

        grupoColaborador = tela_busca.retornaGrupoColaborador();
        setGrupoColaborador(grupoColaborador);
        //seta na tela
        if (getGrupoColaborador() != null) {
            jtfGrupoColaborador.setText(grupoColaborador.getDescricao());
        }
    }
}
