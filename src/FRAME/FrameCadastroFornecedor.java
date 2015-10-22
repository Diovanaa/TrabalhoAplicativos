package FRAME;

import DAO.CidadeDAO;
import DAO.EnderecoDAO;
import DAO.FornecedorDAO;
import DAO.IMPL.CidadeDAOIMPL;
import DAO.IMPL.EnderecoDAOIMPL;
import DAO.IMPL.FornecedorDAOIMPL;
import DAO.IMPL.PessoaDAOIMPL;
import DAO.IMPL.UnidadeFederativaDAOIMPL;
import DAO.PessoaDAO;
import DAO.UTIL.ComboBoxCidade;
import DAO.UTIL.ComboBoxUF;
import DAO.UnidadeFederativaDAO;
import MODEL.Cidade;
import MODEL.Endereco;
import MODEL.Fornecedor;
import MODEL.Pessoa;
import MODEL.UnidadeFederativa;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;

public class FrameCadastroFornecedor extends javax.swing.JFrame {

    public FrameCadastroFornecedor() {
        initComponents();
        setLocation(200, 100);
        unidadeFederativaDao = new UnidadeFederativaDAOIMPL();
        cidadeDao = new CidadeDAOIMPL();
        enderecoDao = new EnderecoDAOIMPL();
        pessoaDao = new PessoaDAOIMPL();
        fornecedorDao = new FornecedorDAOIMPL();

        novoFornecedor();
        atualizaTabela();
        atualizarCBUF();
        atualizaCBCidade();
        setcodigos();
        jtbFornecedores.setAutoResizeMode(jtbFornecedores.AUTO_RESIZE_OFF);
        jtbFornecedores.getColumnModel().getColumn(0).setPreferredWidth(100);
        jtbFornecedores.getColumnModel().getColumn(1).setPreferredWidth(445);
        jtbFornecedores.getColumnModel().getColumn(2).setPreferredWidth(123);
        jtbFornecedores.getColumnModel().getColumn(3).setPreferredWidth(103);

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
        jtbpFornecedores = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbFornecedores = new javax.swing.JTable();
        jtfPesquisar = new javax.swing.JTextField();
        jbtDetalhar = new javax.swing.JButton();
        jbtPesquisar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jtfCnpj = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        jtfRazaoSocial = new javax.swing.JTextField();
        jtfTelefone = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        jtfInsEstadual = new javax.swing.JTextField();
        jtfNomeFantasia = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jtfRua = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jtfBairro = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jtfNumero = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jcbCidade = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        jlbDataCadastro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jcbUF = new javax.swing.JComboBox();
        jtfDataFundacao = new com.toedter.calendar.JDateChooser();
        jLabel31 = new javax.swing.JLabel();
        jtfTelefoneCelular = new javax.swing.JFormattedTextField();
        jLabel32 = new javax.swing.JLabel();
        jcbSexo = new javax.swing.JComboBox();
        jtfCep = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fornecedor");
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
        jLabel1.setText("Fornecedores");

        jtbpFornecedores.setBackground(new java.awt.Color(153, 153, 153));
        jtbpFornecedores.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jtbpFornecedores.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jtbpFornecedores.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtbpFornecedoresStateChanged(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jtbFornecedores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${fornecedores}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jtbFornecedores);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${razaoSocial}"));
        columnBinding.setColumnName("Razão Social");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${inscEstadual}"));
        columnBinding.setColumnName("Inscrição Estadual");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataFuncacao}"));
        columnBinding.setColumnName("Data Fundação");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jtbFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbFornecedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbFornecedores);

        jtfPesquisar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jtfPesquisar.setToolTipText("Campo de Pesquisa");

        jbtDetalhar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtDetalhar.setText("Detalhar");
        jbtDetalhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDetalharActionPerformed(evt);
            }
        });

        jbtPesquisar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtPesquisar.setText("Pesquisar");
        jbtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisarActionPerformed(evt);
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
                        .add(0, 513, Short.MAX_VALUE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
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
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 282, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jbtDetalhar)
                .addContainerGap())
        );

        jtbpFornecedores.addTab("Fornecedores", jPanel4);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Grande", 0, 12))); // NOI18N
        jPanel3.setToolTipText("Cadastro");

        try {
            jtfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${fornecedor.cnpj}"), jtfCnpj, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel18.setText("*CNPJ");

        jtfRazaoSocial.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jtfRazaoSocial.setToolTipText("Razão Social");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${fornecedor.razaoSocial}"), jtfRazaoSocial, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        try {
            jtfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfTelefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${fornecedor.pessoa.endereco_codigo.telefone}"), jtfTelefone, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel20.setText("Telefone");

        jtfInsEstadual.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${fornecedor.inscEstadual}"), jtfInsEstadual, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtfNomeFantasia.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${fornecedor.pessoa.nome}"), jtfNomeFantasia, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel21.setText("*Inscrição Estadual");

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel22.setText("*Nome Fantasia");

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel23.setText("Data Fundação");

        jtfEmail.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${fornecedor.pessoa.endereco_codigo.email}"), jtfEmail, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel25.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel25.setText("E-mail");

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel19.setText("*Razão Social");

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel24.setText("*Cidade");

        jtfRua.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${fornecedor.pessoa.endereco_codigo.rua}"), jtfRua, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtfRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRuaActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel26.setText("*Rua");

        jLabel27.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel27.setText("*Bairro");

        jtfBairro.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${fornecedor.pessoa.endereco_codigo.bairro}"), jtfBairro, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtfBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBairroActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel28.setText("*Numero");

        jtfNumero.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${fornecedor.pessoa.endereco_codigo.numero}"), jtfNumero, org.jdesktop.beansbinding.BeanProperty.create("text"));
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

        jlbDataCadastro.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

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

        jLabel31.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel31.setText("Telefone Celular");

        try {
            jtfTelefoneCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfTelefoneCelular.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${fornecedor.pessoa.endereco_codigo.celular}"), jtfTelefoneCelular, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabel32.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel32.setText("*Sexo");

        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Feminino", "Masculino" }));
        jcbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSexoActionPerformed(evt);
            }
        });
        jcbSexo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcbSexoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbSexoFocusLost(evt);
            }
        });
        jcbSexo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jcbSexoAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jcbSexoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        try {
            jtfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${fornecedor.pessoa.endereco_codigo.cep}"), jtfCep, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel22)
                            .add(jtfNomeFantasia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 501, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(0, 0, Short.MAX_VALUE)
                                .add(jLabel21)
                                .add(141, 141, 141))
                            .add(jtfInsEstadual)))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jtfCnpj, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 274, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel18))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jLabel19)
                                .add(0, 0, Short.MAX_VALUE))
                            .add(jtfRazaoSocial)))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel20)
                            .add(jtfTelefone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 161, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jtfTelefoneCelular, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 156, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel31))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jLabel25)
                                .add(0, 0, Short.MAX_VALUE))
                            .add(jtfEmail)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                        .add(jLabel4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtfCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jlbDataCadastro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(140, 140, 140))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel27)
                            .add(jtfBairro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 257, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jtfRua)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jLabel26)
                                .add(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel28)
                            .add(jtfNumero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jcbUF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel30))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jLabel24)
                                .add(0, 0, Short.MAX_VALUE))
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jcbCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 151, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel3Layout.createSequentialGroup()
                                        .add(jtfCep, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(0, 0, Short.MAX_VALUE))
                                    .add(jPanel3Layout.createSequentialGroup()
                                        .add(jLabel29)
                                        .add(160, 160, 160)
                                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jPanel3Layout.createSequentialGroup()
                                                .add(jLabel23)
                                                .add(100, 100, 100)
                                                .add(jLabel32)
                                                .add(0, 0, Short.MAX_VALUE))
                                            .add(jPanel3Layout.createSequentialGroup()
                                                .add(jtfDataFundacao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(jcbSexo, 0, 0, Short.MAX_VALUE)))))))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(14, 14, 14)
                        .add(jlbDataCadastro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel4)
                            .add(jtfCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(18, 18, 18)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel18)
                    .add(jLabel19))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jtfRazaoSocial, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtfCnpj, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel22)
                    .add(jLabel21))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jtfNomeFantasia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtfInsEstadual, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
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
                    .add(jLabel30)
                    .add(jLabel23)
                    .add(jLabel32)
                    .add(jLabel29))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(jcbUF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jcbCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jtfCep, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jtfDataFundacao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel27)
                            .add(jLabel26)
                            .add(jLabel28))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jtfRua, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(jtfBairro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jtfNumero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(jcbSexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jtbpFornecedores.addTab("Cadastro", jPanel3);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jtbpFornecedores)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jLabel1))
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
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(18, 18, 18)
                .add(jtbpFornecedores, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 405, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 40, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jbtSalvar)
                    .add(jbtExcluir)
                    .add(jbtNovo)
                    .add(jbtEditar)
                    .add(jbtCancelar)))
        );

        jtbpFornecedores.getAccessibleContext().setAccessibleName("Fornecedores");
        jtbpFornecedores.getAccessibleContext().setAccessibleDescription("Fornecedores");

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed
        novoFornecedor();
        limpacampodatas();
        jcbSexo.setSelectedIndex(0);
        jcbUF.setSelectedIndex(0);
        jcbCidade.setSelectedIndex(0);
        jtbpFornecedores.setSelectedIndex(1);


    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed

        dispose();

    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jtfRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRuaActionPerformed

    private void jtfBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBairroActionPerformed

    private void jtfNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNumeroActionPerformed

    private void jcbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCidadeActionPerformed
        fornecedor.getPessoa().getEndereco_codigo().setCidade_codigo(((Cidade) jcbCidade.getSelectedItem()));
    }//GEN-LAST:event_jcbCidadeActionPerformed

    private void jcbUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbUFActionPerformed
        atualizaCBCidade();
    }//GEN-LAST:event_jcbUFActionPerformed

    private void jcbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSexoActionPerformed
        if (jcbSexo.getSelectedIndex() == 0) {
            fornecedor.getPessoa().setSexo("F");
        } else {
            fornecedor.getPessoa().setSexo("M");
        }
    }//GEN-LAST:event_jcbSexoActionPerformed

    private void jcbSexoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbSexoFocusGained
    }//GEN-LAST:event_jcbSexoFocusGained

    private void jcbSexoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbSexoFocusLost
    }//GEN-LAST:event_jcbSexoFocusLost

    private void jcbSexoAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcbSexoAncestorMoved
    }//GEN-LAST:event_jcbSexoAncestorMoved

    private void jcbSexoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcbSexoAncestorAdded
    }//GEN-LAST:event_jcbSexoAncestorAdded

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed
        try {
            if (fornecedor.getCnpj() == null
                    || fornecedor.getRazaoSocial() == null
                    || fornecedor.getPessoa().getNome() == null
                    || fornecedor.getPessoa().getEndereco_codigo().getBairro() == null
                    || fornecedor.getPessoa().getEndereco_codigo().getRua() == null
                    || fornecedor.getPessoa().getEndereco_codigo().getNumero() == null
                    || fornecedor.getPessoa().getEndereco_codigo().getCep() == null
                    || fornecedor.getPessoa().getEndereco_codigo().getCidade_codigo()
                    .getUnidadeFederativa_codigo().getSigla() == null) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos Necessários.");
            } else {
                fornecedor.setDataCadastro(new Date());
                fornecedor.setDataFuncacao(jtfDataFundacao.getDate());
                enderecoDao.inserir(fornecedor.getPessoa().getEndereco_codigo());
                pessoaDao.inserir(fornecedor.getPessoa());
                fornecedorDao.inserir(fornecedor);
                atualizaTabela();
                limpacampodatas();
                jcbSexo.setSelectedIndex(0);
                jcbUF.setSelectedIndex(0);
                jcbCidade.setSelectedIndex(0);
                novoFornecedor();
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
                enderecoDao.alterar(fornecedor.getPessoa().getEndereco_codigo());
                pessoaDao.alterar(fornecedor.getPessoa());
                fornecedorDao.alterar(fornecedor);
                JOptionPane.showMessageDialog(rootPane, "Alterado com sucesso!");
                atualizaTabela();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro !\nMotivo: "
                    + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jbtEditarActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null,
                    "Deseja realmente excluir este Fornecedor ?",
                    "Atenção!", JOptionPane.YES_NO_OPTION) == 0) {
                fornecedorDao.remover(fornecedor);
                pessoaDao.remover(fornecedor.getPessoa());
                enderecoDao.remover(fornecedor.getPessoa().getEndereco_codigo());
                novoFornecedor();
                limpacampodatas();
                jcbSexo.setSelectedIndex(0);
                jcbUF.setSelectedIndex(0);
                jcbCidade.setSelectedIndex(0);
                atualizaTabela();
                jbtSalvar.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro !\nMotivo: "
                    + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtDetalharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDetalharActionPerformed
        try {
            jcbCidade.removeAllItems();
            cidades = null;
            
            setFornecedor(fornecedores.get(jtbFornecedores.getSelectedRow()));
            setaJCB();
            jbtSalvar.setEnabled(false);
            jtbpFornecedores.setSelectedIndex(1);
            
            setaJcbUf();
            setaJcbCidade();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,
                    "Para poder detalhar é preciso cadastrar um Fornecedor.");
        }
    }//GEN-LAST:event_jbtDetalharActionPerformed

    private void jtbFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbFornecedoresMouseClicked
        if (evt.getClickCount() == 2) {
            jcbCidade.removeAllItems();
            cidades = null;
            
            setFornecedor(fornecedores.get(jtbFornecedores.getSelectedRow()));
            setaJCB();
            jbtSalvar.setEnabled(false);
            jtbpFornecedores.setSelectedIndex(1);

            setaJcbUf();
            setaJcbCidade();
        }
    }//GEN-LAST:event_jtbFornecedoresMouseClicked

    private void jbtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisarActionPerformed
        setFornecedores(fornecedorDao.buscarPorNome(jtfPesquisar.getText()));
        jtbFornecedores.addRowSelectionInterval(0, 0);
    }//GEN-LAST:event_jbtPesquisarActionPerformed

    private void jtbpFornecedoresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtbpFornecedoresStateChanged
        if (jtbpFornecedores.getSelectedIndex() == 0) {
            jbtEditar.setVisible(false);
            jbtExcluir.setVisible(false);
            jbtSalvar.setVisible(false);
        } else {
            jbtSalvar.setVisible(true);
            jbtEditar.setVisible(true);
            jbtExcluir.setVisible(true);
            if (!(fornecedor.getRazaoSocial() == null)) {
                jbtSalvar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jtbpFornecedoresStateChanged

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
            java.util.logging.Logger.getLogger(FrameCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FrameCadastroFornecedor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JComboBox jcbUF;
    private javax.swing.JLabel jlbDataCadastro;
    private javax.swing.JTable jtbFornecedores;
    private javax.swing.JTabbedPane jtbpFornecedores;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JFormattedTextField jtfCep;
    private javax.swing.JFormattedTextField jtfCnpj;
    private javax.swing.JTextField jtfCodigo;
    private com.toedter.calendar.JDateChooser jtfDataFundacao;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfInsEstadual;
    private javax.swing.JTextField jtfNomeFantasia;
    private javax.swing.JTextField jtfNumero;
    private javax.swing.JTextField jtfPesquisar;
    private javax.swing.JTextField jtfRazaoSocial;
    private javax.swing.JTextField jtfRua;
    private javax.swing.JFormattedTextField jtfTelefone;
    private javax.swing.JFormattedTextField jtfTelefoneCelular;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private Integer var = null;
    private Fornecedor fornecedor;
    private List<Fornecedor> fornecedores;
    private FornecedorDAO fornecedorDao;
    //Cidade
    private List<Cidade> cidades;
    private CidadeDAO cidadeDao;
    //Endereco
    private EnderecoDAO enderecoDao;
    //UnidadeFederativa
    private UnidadeFederativaDAO unidadeFederativaDao;
    private List<UnidadeFederativa> unidadeFederativas;
    //Pessoa
    private PessoaDAO pessoaDao;
    private List<Pessoa> pessoas;

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        Fornecedor fornecedorVelho = this.fornecedor;
        this.fornecedor = fornecedor;
        firePropertyChange("fornecedor", fornecedorVelho, this.fornecedor);
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        List<Fornecedor> fornecedoresVelhos = this.fornecedores;
        this.fornecedores = ObservableCollections.observableList(fornecedores);
        firePropertyChange("fornecedores", fornecedoresVelhos, this.fornecedores);
    }

    public void atualizaTabela() {
        setFornecedores(fornecedorDao.buscarTodos());
        if (fornecedorDao.buscarTodos().isEmpty()) {
        } else {
            jtbFornecedores.addRowSelectionInterval(0, 0);
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

    private void setaJcbUf() {
        jcbUF.getModel().setSelectedItem(fornecedor.getPessoa()
                .getEndereco_codigo().getCidade_codigo().getUnidadeFederativa_codigo());
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
        jcbCidade.getModel().setSelectedItem(fornecedor.getPessoa()
                .getEndereco_codigo().getCidade_codigo());
    }

    private void novoFornecedor() {
        jbtSalvar.setEnabled(true);
        setFornecedor(new Fornecedor(new Pessoa(new Endereco(new Cidade(new UnidadeFederativa())))));
        setcodigos();
    }

    private void setcodigos() {
        if (enderecoDao.buscarIdMaior() == null) {
            fornecedor.getPessoa().getEndereco_codigo().setCodigo(1);
        } else {
            fornecedor.getPessoa().getEndereco_codigo().setCodigo(enderecoDao.buscarIdMaior() + 1);
        }
        if (pessoaDao.buscarIdMaior() == null) {
            fornecedor.getPessoa().setCodigo(1);
        } else {
            fornecedor.getPessoa().setCodigo(pessoaDao.buscarIdMaior() + 1);
        }
        if (fornecedorDao.buscaIdMaio() == null) {
            fornecedor.setCodigo(1);
        } else {
            fornecedor.setCodigo(fornecedorDao.buscaIdMaio() + 1);
        }
        jtfCodigo.setText(fornecedor.getCodigo().toString());
    }

    private void limpacampodatas() {
        jtfDataFundacao.setCalendar(null);
    }

    private void setaJCB() {
        jtfDataFundacao.getDateEditor().setDate(fornecedor.getDataFuncacao());
        jtfCodigo.setText(fornecedor.getCodigo().toString());
        if (fornecedor.getPessoa().getSexo().equals("F")) {
            jcbSexo.setSelectedIndex(0);
        } else {
            jcbSexo.setSelectedIndex(1);
        }

    }
}
