package FRAME;

import DAO.CidadeDAO;
import DAO.EnderecoDAO;
import DAO.IMPL.CidadeDAOIMPL;
import DAO.IMPL.EnderecoDAOIMPL;
import DAO.IMPL.ParceiroDAOIMPL;
import DAO.IMPL.PessoaDAOIMPL;
import DAO.IMPL.UnidadeFederativaDAOIMPL;
import DAO.ParceiroDAO;
import DAO.PessoaDAO;
import DAO.UTIL.ComboBoxCidade;
import DAO.UTIL.ComboBoxUF;
import DAO.UnidadeFederativaDAO;
import MODEL.Cidade;
import MODEL.Endereco;
import MODEL.Parceiro;
import MODEL.Pessoa;
import MODEL.UnidadeFederativa;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;

public class FrameCadastroParceiro extends javax.swing.JFrame {

    public FrameCadastroParceiro() {
        initComponents();
        setLocation(200, 100);
        unidadeFederativaDao = new UnidadeFederativaDAOIMPL();
        cidadeDao = new CidadeDAOIMPL();
        enderecoDao = new EnderecoDAOIMPL();
        pessoaDao = new PessoaDAOIMPL();
        parceiroDao = new ParceiroDAOIMPL();
        novoParceiro();
        atualizaTabela();
        atualizarCBUF();
        atualizaCBCidade();
        setcodigos();
        jtbParceiros.setAutoResizeMode(jtbParceiros.AUTO_RESIZE_OFF);
        jtbParceiros.getColumnModel().getColumn(0).setPreferredWidth(75);
        jtbParceiros.getColumnModel().getColumn(1).setPreferredWidth(326);
        jtbParceiros.getColumnModel().getColumn(2).setPreferredWidth(130);
        jtbParceiros.getColumnModel().getColumn(3).setPreferredWidth(130);
        jtbParceiros.getColumnModel().getColumn(4).setPreferredWidth(100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jbtSalvar = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jbtEditar = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtNovo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtbpParceiros = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbParceiros = new javax.swing.JTable();
        jtfPesquisar = new javax.swing.JTextField();
        jbtPesquisar = new javax.swing.JButton();
        jbtDetalhar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jtfNome = new javax.swing.JTextField();
        jtfTelefone = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        jtfRg = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jtfBairro = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jtfRua = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jtfNumero = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jcbCidade = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtfCpf = new javax.swing.JFormattedTextField();
        jcbSexo = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        jtfTelefoneCelular = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfLimite = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfSaldo = new javax.swing.JTextField();
        jcbTipoPessoa = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jcbUF = new javax.swing.JComboBox();
        jlbDataCadastro = new javax.swing.JLabel();
        jtfDataNacimento = new com.toedter.calendar.JDateChooser();
        jtfCep = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Parceiros");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        jbtSalvar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtSalvar.setText("Salvar");
        jbtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarActionPerformed(evt);
            }
        });

        jbtCancelar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtCancelar.setText("Sair");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

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

        jbtNovo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtNovo.setText("Novo");
        jbtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNovoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Hiragino Sans GB", 0, 24)); // NOI18N
        jLabel1.setText("Parceiros");

        jtbpParceiros.setBackground(new java.awt.Color(153, 153, 153));
        jtbpParceiros.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jtbpParceiros.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jtbpParceiros.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtbpParceirosStateChanged(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${parceiros}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jtbParceiros);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Código");
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
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pessoa.endereco_codigo.celular}"));
        columnBinding.setColumnName("Celular");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${saldo}"));
        columnBinding.setColumnName("Saldo");
        columnBinding.setColumnClass(Float.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jtbParceiros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbParceirosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbParceiros);

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

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jtfPesquisar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 148, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtPesquisar)
                        .add(0, 503, Short.MAX_VALUE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                            .add(jPanel4Layout.createSequentialGroup()
                                .add(jbtDetalhar)
                                .add(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jtfPesquisar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jbtPesquisar))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 306, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jbtDetalhar)
                .addContainerGap())
        );

        jtbpParceiros.addTab("Parceiros", jPanel4);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Grande", 0, 12))); // NOI18N
        jPanel3.setToolTipText("Cadastro");

        jtfNome.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jtfNome.setToolTipText("Razão Social");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${parceiro.pessoa.nome}"), jtfNome, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        try {
            jtfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfTelefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${parceiro.pessoa.endereco_codigo.telefone}"), jtfTelefone, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel20.setText("Telefone");

        jtfRg.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${parceiro.rg}"), jtfRg, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel21.setText("*Sexo");

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel22.setText("RG/Insc.Estadual");

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel23.setText("Data Nacimento");

        jtfEmail.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${parceiro.pessoa.endereco_codigo.email}"), jtfEmail, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel25.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel25.setText("E-mail");

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel19.setText("*Nome");

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel24.setText("*Cidade");

        jtfBairro.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${parceiro.pessoa.endereco_codigo.bairro}"), jtfBairro, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtfBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBairroActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel26.setText("*Rua");

        jLabel27.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel27.setText("*Bairro");

        jtfRua.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${parceiro.pessoa.endereco_codigo.rua}"), jtfRua, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtfRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRuaActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel28.setText("*Número");

        jtfNumero.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${parceiro.pessoa.endereco_codigo.numero}"), jtfNumero, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtfNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumeroActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel29.setText("*CEP");

        jcbCidade.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jcbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCidadeActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel30.setText("*UF");

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel18.setText("*CPF/CNPJ");

        try {
            jtfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfCpf.setToolTipText("CPF");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${parceiro.cpf}"), jtfCpf, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jtfCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCpfActionPerformed(evt);
            }
        });

        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Feminino", "Masculino" }));
        jcbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSexoActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel31.setText("Telefone Celular");

        try {
            jtfTelefoneCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfTelefoneCelular.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${parceiro.pessoa.endereco_codigo.celular}"), jtfTelefoneCelular, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel2.setText("*Limite");

        jtfLimite.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${parceiro.limite}"), jtfLimite, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel3.setText("*Saldo");

        jtfSaldo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${parceiro.saldo}"), jtfSaldo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jcbTipoPessoa.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jcbTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Física", "Jurídica" }));
        jcbTipoPessoa.setToolTipText("Tipo de Pessoa");
        jcbTipoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoPessoaActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel32.setText("*Pessoa");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel4.setText("*Codigo");

        jtfCodigo.setEditable(false);
        jtfCodigo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        jcbUF.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jcbUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbUFActionPerformed(evt);
            }
        });

        jlbDataCadastro.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        try {
            jtfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${parceiro.pessoa.endereco_codigo.cep}"), jtfCep, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jLabel4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtfCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel22)
                                    .add(jtfRg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 149, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel23)
                                    .add(jtfDataNacimento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 168, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel21)
                                    .add(jcbSexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel2)
                                    .add(jtfLimite, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 126, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel3Layout.createSequentialGroup()
                                        .add(jLabel3)
                                        .add(0, 0, Short.MAX_VALUE))
                                    .add(jtfSaldo)))
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jLabel32)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jcbTipoPessoa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 143, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jlbDataCadastro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel27)
                                    .add(jtfBairro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 281, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jtfRua, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 366, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel26))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel28)
                                    .add(jtfNumero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel3Layout.createSequentialGroup()
                                        .add(jLabel19)
                                        .add(0, 0, Short.MAX_VALUE))
                                    .add(jtfNome))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel18)
                                    .add(jtfCpf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 274, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel20)
                                    .add(jtfTelefone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 151, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jtfTelefoneCelular, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 139, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel31))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jtfEmail)
                                    .add(jPanel3Layout.createSequentialGroup()
                                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jLabel29)
                                            .add(jLabel25))
                                        .add(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jcbUF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel30))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel24)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jcbCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 199, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jtfCep, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 205, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(6, 6, 6)
                        .add(jlbDataCadastro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel32)
                            .add(jcbTipoPessoa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(jtfCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, Short.MAX_VALUE)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel19)
                    .add(jLabel18))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jtfNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtfCpf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel22)
                            .add(jLabel21)
                            .add(jLabel23)
                            .add(jLabel2)
                            .add(jLabel3))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jtfRg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jcbSexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jtfLimite, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jtfSaldo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jtfDataNacimento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel20)
                    .add(jLabel25)
                    .add(jLabel31))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jtfTelefone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtfEmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtfTelefoneCelular, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel24)
                    .add(jLabel29)
                    .add(jLabel30))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jcbCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jcbUF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtfCep, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel26)
                    .add(jLabel28)
                    .add(jLabel27))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jtfRua, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtfNumero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtfBairro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(36, 36, 36))
        );

        jtbpParceiros.addTab("Cadastro", jPanel3);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jtbpParceiros)
                    .add(layout.createSequentialGroup()
                        .add(jbtNovo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtSalvar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtEditar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtExcluir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(18, 18, 18)
                .add(jtbpParceiros, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 431, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 26, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jbtSalvar)
                    .add(jbtExcluir)
                    .add(jbtNovo)
                    .add(jbtEditar)
                    .add(jbtCancelar)))
        );

        jtbpParceiros.getAccessibleContext().setAccessibleName("Fornecedores");
        jtbpParceiros.getAccessibleContext().setAccessibleDescription("Fornecedores");

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed
        novoParceiro();
        limpacampodatas();
        jcbSexo.setSelectedIndex(0);
        jcbTipoPessoa.setSelectedIndex(0);
        jcbUF.setSelectedIndex(0);
        jcbCidade.setSelectedIndex(0);
        jtbpParceiros.setSelectedIndex(1);
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jtfBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBairroActionPerformed

    private void jtfRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRuaActionPerformed

    private void jtfNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNumeroActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed

        dispose();

    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jtfCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCpfActionPerformed

    private void jcbTipoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoPessoaActionPerformed
        if (jcbTipoPessoa.getSelectedIndex() == 0) {
            try {
                jtfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
            } catch (ParseException ex) {
            }
        } else if (jcbTipoPessoa.getSelectedIndex() == 1) {
            try {
                jtfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
            } catch (ParseException ex) {
            }

        }
        if (jcbTipoPessoa.getSelectedIndex() == 0) {
            parceiro.setTipoPessoa("F");
        } else {
            parceiro.setTipoPessoa("J");
        }
    }//GEN-LAST:event_jcbTipoPessoaActionPerformed

    private void jcbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCidadeActionPerformed
        parceiro.getPessoa().getEndereco_codigo().setCidade_codigo(((Cidade) jcbCidade.getSelectedItem()));
    }//GEN-LAST:event_jcbCidadeActionPerformed

    private void jcbUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbUFActionPerformed
        atualizaCBCidade();
    }//GEN-LAST:event_jcbUFActionPerformed

    private void jcbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSexoActionPerformed
        if (jcbSexo.getSelectedIndex() == 0) {
            parceiro.getPessoa().setSexo("F");
        } else {
            parceiro.getPessoa().setSexo("M");
        }
    }//GEN-LAST:event_jcbSexoActionPerformed

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed

        try {
            if (parceiro.getCpf() == null
                    || parceiro.getPessoa().getNome() == null
                    || parceiro.getPessoa().getSexo() == null
                    || parceiro.getLimite() == null
                    || parceiro.getSaldo() == null
                    || parceiro.getPessoa().getEndereco_codigo().getBairro() == null
                    || parceiro.getPessoa().getEndereco_codigo().getRua() == null
                    || parceiro.getPessoa().getEndereco_codigo().getNumero() == null
                    || parceiro.getPessoa().getEndereco_codigo().getCep() == null
                    || parceiro.getPessoa().getEndereco_codigo().getCidade_codigo().getUnidadeFederativa_codigo().getSigla() == null) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos Necessários.");
            } else {
                parceiro.setDataNascimento(jtfDataNacimento.getDate());
                parceiro.setDataCadastro(new Date());
                enderecoDao.inserir(parceiro.getPessoa().getEndereco_codigo());
                if (jcbTipoPessoa.getSelectedIndex() == 0) {
                    parceiro.setTipoPessoa("F");
                } else {
                    parceiro.setTipoPessoa("J");
                }
                pessoaDao.inserir(parceiro.getPessoa());
                parceiroDao.inserir(parceiro);
                atualizaTabela();
                limpacampodatas();
                jcbSexo.setSelectedIndex(0);
                jcbTipoPessoa.setSelectedIndex(0);
                jcbUF.setSelectedIndex(0);
                jcbCidade.setSelectedIndex(0);
                novoParceiro();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos Necessários.");
        }
    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void jbtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEditarActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null,
                    "Deseja realmente fazer esta auteração ?",
                    "Atenção!", JOptionPane.YES_NO_OPTION) == 0) {
                enderecoDao.alterar(parceiro.getPessoa().getEndereco_codigo());
                pessoaDao.alterar(parceiro.getPessoa());
                parceiroDao.alterar(parceiro);
                atualizaTabela();
                JOptionPane.showMessageDialog(rootPane, "Alterado com sucesso!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro !\nMotivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtEditarActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null,
                    "Deseja realmente excluir este Parceiro ?",
                    "Atenção!", JOptionPane.YES_NO_OPTION) == 0) {
                parceiroDao.remover(parceiro);
                pessoaDao.remover(parceiro.getPessoa());
                enderecoDao.remover(parceiro.getPessoa().getEndereco_codigo());
                novoParceiro();
                limpacampodatas();
                jcbSexo.setSelectedIndex(0);
                jcbTipoPessoa.setSelectedIndex(0);
                jcbUF.setSelectedIndex(0);
                jcbCidade.setSelectedIndex(0);
                atualizaTabela();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro !\nMotivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtDetalharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDetalharActionPerformed
        try {
            jcbCidade.removeAllItems();
            cidades = null;

            setParceiro(parceiros.get(jtbParceiros.getSelectedRow()));
            setaJCB();
            jbtSalvar.setEnabled(false);
            jtbpParceiros.setSelectedIndex(1);

            setaJcbUF();
            setaJcbCidade();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Para poder detalhar"
                    + " é preciso cadastrar um Parceiro.");
        }
    }//GEN-LAST:event_jbtDetalharActionPerformed

    private void jtbParceirosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbParceirosMouseClicked
        if (evt.getClickCount() == 2) {
            jcbCidade.removeAllItems();
            cidades = null;
            
            setParceiro(parceiros.get(jtbParceiros.getSelectedRow()));
            setaJCB();
            jbtSalvar.setEnabled(false);
            jtbpParceiros.setSelectedIndex(1);
            
            setaJcbUF();
            setaJcbCidade();
        }
    }//GEN-LAST:event_jtbParceirosMouseClicked

    private void jbtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisarActionPerformed
        setParceiros(parceiroDao.buscarPorNome(jtfPesquisar.getText()));
        jtbParceiros.addRowSelectionInterval(0, 0);
    }//GEN-LAST:event_jbtPesquisarActionPerformed

    private void jtbpParceirosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtbpParceirosStateChanged
        if (jtbpParceiros.getSelectedIndex() == 0) {
            jbtEditar.setVisible(false);
            jbtExcluir.setVisible(false);
            jbtSalvar.setVisible(false);
        } else {
            jbtSalvar.setVisible(true);
            jbtEditar.setVisible(true);
            jbtExcluir.setVisible(true);
        }
    }//GEN-LAST:event_jtbpParceirosStateChanged

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
            java.util.logging.Logger.getLogger(FrameCadastroParceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroParceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroParceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroParceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FrameCadastroParceiro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtDetalhar;
    private javax.swing.JButton jbtEditar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtPesquisar;
    private javax.swing.JButton jbtSalvar;
    private javax.swing.JComboBox jcbCidade;
    private javax.swing.JComboBox jcbSexo;
    private javax.swing.JComboBox jcbTipoPessoa;
    private javax.swing.JComboBox jcbUF;
    private javax.swing.JLabel jlbDataCadastro;
    private javax.swing.JTable jtbParceiros;
    private javax.swing.JTabbedPane jtbpParceiros;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JFormattedTextField jtfCep;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JFormattedTextField jtfCpf;
    private com.toedter.calendar.JDateChooser jtfDataNacimento;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfLimite;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNumero;
    private javax.swing.JTextField jtfPesquisar;
    private javax.swing.JTextField jtfRg;
    private javax.swing.JTextField jtfRua;
    private javax.swing.JTextField jtfSaldo;
    private javax.swing.JFormattedTextField jtfTelefone;
    private javax.swing.JFormattedTextField jtfTelefoneCelular;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private Integer var;
    private Parceiro parceiro;
    private List<Parceiro> parceiros;
    private ParceiroDAO parceiroDao;
    //Cidade
    private List<Cidade> cidades;
    private CidadeDAO cidadeDao;
    //Endereco
    private EnderecoDAO enderecoDao;
    private Endereco endereco;
    //UnidadeFederativa
    private UnidadeFederativaDAO unidadeFederativaDao;
    private List<UnidadeFederativa> unidadeFederativas;
    //Pessoa
    private PessoaDAO pessoaDao;
    private List<Pessoa> pessoas;

    public Parceiro getParceiro() {
        return parceiro;
    }

    public void setParceiro(Parceiro parceiro) {
        Parceiro parceiroVelho = this.parceiro;
        this.parceiro = parceiro;
        firePropertyChange("parceiro", parceiroVelho, this.parceiro);
    }

    public List<Parceiro> getParceiros() {
        return parceiros;
    }

    public void setParceiros(List<Parceiro> parceiros) {
        List<Parceiro> parceirosVelhos = this.parceiros;
        this.parceiros = ObservableCollections.observableList(parceiros);
        firePropertyChange("parceiros", parceirosVelhos, this.parceiros);
    }

    public void atualizaTabela() {
        setParceiros(parceiroDao.buscarTodos());
        if (parceiroDao.buscarTodos().isEmpty()) {
        } else {
            jtbParceiros.addRowSelectionInterval(0, 0);
        }
    }

    public void atualizarCBUF() {
        jcbUF.removeAllItems();
        unidadeFederativas = null;
        unidadeFederativas = unidadeFederativaDao.buscarTodos();
        for (UnidadeFederativa un : unidadeFederativas) {
            jcbUF.addItem(un);
        }
        jcbUF.setRenderer(new ComboBoxUF());
    }

    private void setaJcbUF() {
        jcbUF.getModel().setSelectedItem(parceiro.getPessoa().
                getEndereco_codigo().getCidade_codigo().getUnidadeFederativa_codigo());
    }

    public void atualizaCBCidade() {
        jcbCidade.removeAllItems();
        cidades = null;
        cidades = cidadeDao.buscaCidades(jcbUF.getSelectedIndex() + 1);
        for (Cidade ci : cidades) {
            jcbCidade.addItem(ci);
        }
        jcbCidade.setRenderer(new ComboBoxCidade());
    }

    private void setaJcbCidade() {
        jcbCidade.getModel().setSelectedItem(parceiro.getPessoa().
                getEndereco_codigo().getCidade_codigo());
    }

    private void novoParceiro() {
        setParceiro(new Parceiro(new Pessoa(new Endereco(new Cidade(new UnidadeFederativa())))));
        setcodigos();
        jbtSalvar.setEnabled(true);
    }

    private void setcodigos() {
        if (enderecoDao.buscarIdMaior() == null) {
            parceiro.getPessoa().getEndereco_codigo().setCodigo(1);
        } else {
            parceiro.getPessoa().getEndereco_codigo().setCodigo(enderecoDao.buscarIdMaior() + 1);
        }
        if (pessoaDao.buscarIdMaior() == null) {
            parceiro.getPessoa().setCodigo(1);
        } else {
            parceiro.getPessoa().setCodigo(pessoaDao.buscarIdMaior() + 1);
        }
        if (parceiroDao.buscaIdMaio() == null) {
            parceiro.setCodigo(1);
        } else {
            parceiro.setCodigo(parceiroDao.buscaIdMaio() + 1);
        }

        jtfCodigo.setText(parceiro.getCodigo().toString());

    }

    private void setaJCB() {
        jtfCodigo.setText(parceiro.getCodigo().toString());
        jtfDataNacimento.getDateEditor().setDate(parceiro.getDataNascimento());
        if (parceiro.getPessoa().getSexo().equals("F")) {
            jcbSexo.setSelectedIndex(0);
        } else {
            jcbSexo.setSelectedIndex(1);
        }
        if (parceiro.getTipoPessoa().equals("F")) {
            jcbTipoPessoa.setSelectedIndex(0);
        } else {
            jcbTipoPessoa.setSelectedIndex(1);
        }
    }

    private void limpacampodatas() {
        jtfDataNacimento.setCalendar(null);
    }
}
