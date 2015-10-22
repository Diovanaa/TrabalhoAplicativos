package FRAME;

import DAO.CidadeDAO;
import DAO.ColaboradorDAO;
import DAO.EnderecoDAO;
import DAO.GrupoColaboradorDAO;
import DAO.IMPL.CidadeDAOIMPL;
import DAO.IMPL.ColaboradorDAOIMPL;
import DAO.IMPL.EnderecoDAOIMPL;
import DAO.IMPL.GrupoColaboradorDAOIMPL;
import DAO.IMPL.PessoaDAOIMPL;
import DAO.IMPL.UnidadeFederativaDAOIMPL;
import DAO.PessoaDAO;
import DAO.UTIL.ComboBoxCidade;
import DAO.UTIL.ComboBoxGrpColaborador;
import DAO.UTIL.ComboBoxUF;
import DAO.UnidadeFederativaDAO;
import MODEL.Cidade;
import MODEL.Colaborador;
import MODEL.Endereco;
import MODEL.GrupoColaborador;
import MODEL.Pessoa;
import MODEL.UnidadeFederativa;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;

public class FrameCadastroFuncionario extends javax.swing.JFrame {

    public FrameCadastroFuncionario() {
        initComponents();
        setLocation(200, 100);
        unidadeFederativaDao = new UnidadeFederativaDAOIMPL();
        cidadeDao = new CidadeDAOIMPL();
        enderecoDao = new EnderecoDAOIMPL();
        pessoaDao = new PessoaDAOIMPL();
        grupoColaboradorDao = new GrupoColaboradorDAOIMPL();
        colaboradorDao = new ColaboradorDAOIMPL();
        novoColaborador();
        atualizaCBFuncao();
        atualizaTabela();
        atualizarCBUF();
        atualizaCBCidade();
        setcodigos();

        jtbColaboradores.setAutoResizeMode(jtbColaboradores.AUTO_RESIZE_OFF);
        jtbColaboradores.getColumnModel().getColumn(0).setPreferredWidth(75);
        jtbColaboradores.getColumnModel().getColumn(1).setPreferredWidth(500);
        jtbColaboradores.getColumnModel().getColumn(2).setPreferredWidth(186);
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
        jtbpcolaboradores = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbColaboradores = new javax.swing.JTable();
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
        jLabel30 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtfCpf = new javax.swing.JFormattedTextField();
        jcbSexo = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        jtfTelefoneCelular = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfSalario = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jcbUF = new javax.swing.JComboBox();
        jcbCidade = new javax.swing.JComboBox();
        jtfCodigo = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jcbfuncao = new javax.swing.JComboBox();
        jtfCep = new javax.swing.JFormattedTextField();
        jtfDataNacimento = new com.toedter.calendar.JDateChooser();
        jtfDataDemissão = new com.toedter.calendar.JDateChooser();
        jtfDataContratação = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Colaboradores");
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
        jLabel1.setText("Colaboradores");

        jtbpcolaboradores.setBackground(new java.awt.Color(153, 153, 153));
        jtbpcolaboradores.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jtbpcolaboradores.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jtbpcolaboradores.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtbpcolaboradoresStateChanged(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${colaboradores}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jtbColaboradores, "");
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pessoa.nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${grupoColaborador.descricao}"));
        columnBinding.setColumnName("Setor");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jtbColaboradores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbColaboradoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbColaboradores);

        jtfPesquisar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jtfPesquisar.setToolTipText("Campo de Pesquisa");
        jtfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisarActionPerformed(evt);
            }
        });

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
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
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
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jbtDetalhar)
                .addContainerGap())
        );

        jtbpcolaboradores.addTab("Colaboradores", jPanel4);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Grande", 0, 12))); // NOI18N
        jPanel3.setToolTipText("Cadastro");

        jtfNome.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jtfNome.setToolTipText("Razão Social");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${colaborador.pessoa.nome}"), jtfNome, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        try {
            jtfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfTelefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${colaborador.pessoa.endereco_codigo.telefone}"), jtfTelefone, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel20.setText("Telefone");

        jtfRg.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${colaborador.rg}"), jtfRg, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel21.setText("*Sexo");

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel22.setText("*RG");

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel23.setText("*Data Contratação");

        jtfEmail.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${colaborador.pessoa.endereco_codigo.email}"), jtfEmail, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel25.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel25.setText("E-mail");

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel19.setText("*Nome");

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel24.setText("*Cidade");

        jtfBairro.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${colaborador.pessoa.endereco_codigo.bairro}"), jtfBairro, org.jdesktop.beansbinding.BeanProperty.create("text"));
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

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${colaborador.pessoa.endereco_codigo.rua}"), jtfRua, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtfRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRuaActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel28.setText("*Numero");

        jtfNumero.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${colaborador.pessoa.endereco_codigo.numero}"), jtfNumero, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtfNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumeroActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel29.setText("*CEP");

        jLabel30.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel30.setText("*UF");

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel18.setText("*CPF");

        try {
            jtfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfCpf.setToolTipText("CPF");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${colaborador.cpf}"), jtfCpf, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

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

        jLabel31.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel31.setText("Telefone Celular");

        try {
            jtfTelefoneCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfTelefoneCelular.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${colaborador.pessoa.endereco_codigo.celular}"), jtfTelefoneCelular, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel3.setText("*Salário");

        jtfSalario.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${colaborador.salario}"), jtfSalario, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel33.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel33.setText("Data Demissão");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel2.setText("*Grupo de Colaborador");

        jLabel32.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel32.setText("Data Nacimento");

        jcbUF.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jcbUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbUFActionPerformed(evt);
            }
        });

        jcbCidade.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jcbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCidadeActionPerformed(evt);
            }
        });

        jtfCodigo.setEditable(false);
        jtfCodigo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jtfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel34.setText("*Código");

        jcbfuncao.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jcbfuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbfuncaoActionPerformed(evt);
            }
        });

        try {
            jtfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${colaborador.pessoa.endereco_codigo.cep}"), jtfCep, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel23)
                            .add(jtfDataContratação, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 138, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel33)
                            .add(jtfDataDemissão, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 138, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtfSalario)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(jcbfuncao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 261, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(60, 60, 60))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jLabel19)
                                .add(0, 0, Short.MAX_VALUE))
                            .add(jtfNome))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel18)
                            .add(jtfCpf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 266, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jtfRg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 155, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jcbSexo, 0, 148, Short.MAX_VALUE))
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jLabel22)
                                .add(144, 144, 144)
                                .add(jLabel21)
                                .add(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jtfTelefone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 198, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel20))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel31)
                            .add(jtfTelefoneCelular, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 228, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jLabel25)
                                .add(0, 0, Short.MAX_VALUE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jtfEmail))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jLabel32)
                                .add(75, 75, 75))
                            .add(jtfDataNacimento, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jLabel34)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtfCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 167, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel3Layout.createSequentialGroup()
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jcbUF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 83, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel30))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel24)
                                    .add(jcbCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 187, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel29)
                                    .add(jtfCep, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 205, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(0, 0, Short.MAX_VALUE))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel3Layout.createSequentialGroup()
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jtfBairro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 284, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel27))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jtfRua)
                                    .add(jPanel3Layout.createSequentialGroup()
                                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jLabel3)
                                            .add(jLabel26))
                                        .add(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel28)
                            .add(jtfNumero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jtfCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel34))
                .add(18, 18, 18)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel19)
                    .add(jLabel18))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jtfNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jtfCpf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel22)
                                    .add(jLabel21)
                                    .add(jLabel20))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jtfRg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jcbSexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jLabel31)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jtfTelefone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jtfTelefoneCelular, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel25)
                            .add(jLabel32))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtfEmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jtfDataNacimento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel24)
                    .add(jLabel30)
                    .add(jLabel29))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jcbUF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jcbCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtfCep, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel28)
                            .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(jLabel26)
                                .add(jLabel27)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jtfRua, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jtfNumero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jtfBairro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel23)
                            .add(jLabel33)
                            .add(jLabel3)
                            .add(jLabel2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(jtfSalario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jcbfuncao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jtfDataContratação, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jtfDataDemissão, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jtbpcolaboradores.addTab("Cadastro", jPanel3);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
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
                        .add(jbtCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(jtbpcolaboradores)
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
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jtbpcolaboradores, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 449, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 20, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jbtSalvar)
                    .add(jbtExcluir)
                    .add(jbtNovo)
                    .add(jbtEditar)
                    .add(jbtCancelar)))
        );

        jtbpcolaboradores.getAccessibleContext().setAccessibleName("Fornecedores");
        jtbpcolaboradores.getAccessibleContext().setAccessibleDescription("Fornecedores");

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed
        
        novoColaborador();
        limpacampodatas();
        jcbSexo.setSelectedIndex(0);
        jcbfuncao.setSelectedIndex(0);
        jcbUF.setSelectedIndex(0);
        jcbCidade.setSelectedIndex(0);
        jtbpcolaboradores.setSelectedIndex(1);
    }//GEN-LAST:event_jbtNovoActionPerformed
    private void jtfBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBairroActionPerformed
    }//GEN-LAST:event_jtfBairroActionPerformed
    private void jtfRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRuaActionPerformed
    }//GEN-LAST:event_jtfRuaActionPerformed
    private void jtfNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumeroActionPerformed
    }//GEN-LAST:event_jtfNumeroActionPerformed
    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jbtCancelarActionPerformed
    private void jtfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoActionPerformed
    }//GEN-LAST:event_jtfCodigoActionPerformed
    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed
        try {
            colaborador.setDataContratacao(jtfDataContratação.getDate());
            if (colaborador.getCpf() == null
                    || colaborador.getSalario() == null
                    || colaborador.getCpf() == null
                    || colaborador.getGrupoColaborador().getDescricao() == null
                    || colaborador.getDataContratacao() == null
                    || colaborador.getPessoa().getNome() == null
                    || colaborador.getPessoa().getSexo() == null
                    || colaborador.getPessoa().getEndereco_codigo().getBairro() == null
                    || colaborador.getPessoa().getEndereco_codigo().getRua() == null
                    || colaborador.getPessoa().getEndereco_codigo().getNumero() == null
                    || colaborador.getPessoa().getEndereco_codigo().getCep() == null
                    || colaborador.getPessoa().getEndereco_codigo().getCidade_codigo().getUnidadeFederativa_codigo().getSigla() == null) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos Necessários.");
            } else {
                colaborador.setDataDemissao(jtfDataDemissão.getDate());
                colaborador.setDataNascimento(jtfDataNacimento.getDate());
                
                enderecoDao.inserir(colaborador.getPessoa().getEndereco_codigo());
                pessoaDao.inserir(colaborador.getPessoa());
                colaboradorDao.inserir(colaborador);
                atualizaTabela();
                limpacampodatas();
                jcbSexo.setSelectedIndex(0);
                jcbfuncao.setSelectedIndex(0);
                jcbUF.setSelectedIndex(0);
                jcbCidade.setSelectedIndex(0);
                novoColaborador();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos Necessários.");
        }
    }//GEN-LAST:event_jbtSalvarActionPerformed
    private void jcbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCidadeActionPerformed
        colaborador.getPessoa()
                .getEndereco_codigo()
                .setCidade_codigo(((Cidade) jcbCidade.getSelectedItem()));
    }//GEN-LAST:event_jcbCidadeActionPerformed
    private void jcbUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbUFActionPerformed
        atualizaCBCidade();
    }//GEN-LAST:event_jcbUFActionPerformed
    private void jcbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSexoActionPerformed
        if (jcbSexo.getSelectedIndex() == 0) {
            colaborador.getPessoa().setSexo("F");
        } else {
            colaborador.getPessoa().setSexo("M");
        }
    }//GEN-LAST:event_jcbSexoActionPerformed
    private void jcbfuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbfuncaoActionPerformed
        colaborador.setGrupoColaborador((GrupoColaborador) jcbfuncao.getSelectedItem());
    }//GEN-LAST:event_jcbfuncaoActionPerformed
    private void jcbSexoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbSexoFocusGained
    }//GEN-LAST:event_jcbSexoFocusGained
    private void jcbSexoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcbSexoAncestorAdded
    }//GEN-LAST:event_jcbSexoAncestorAdded
    private void jcbSexoAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcbSexoAncestorMoved
    }//GEN-LAST:event_jcbSexoAncestorMoved
    private void jcbSexoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbSexoFocusLost
    }//GEN-LAST:event_jcbSexoFocusLost
    private void jtbpcolaboradoresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtbpcolaboradoresStateChanged
        if (jtbpcolaboradores.getSelectedIndex() == 0) {
            jbtEditar.setVisible(false);
            jbtExcluir.setVisible(false);
            jbtSalvar.setVisible(false);
        } else {
            jbtEditar.setVisible(true);
            jbtExcluir.setVisible(true);
            jbtSalvar.setVisible(true);
            
            if (!(colaborador.getSalario() == null)) {
                jbtSalvar.setEnabled(false);
            }           
        }
    }//GEN-LAST:event_jtbpcolaboradoresStateChanged
    private void jbtDetalharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDetalharActionPerformed
        try {
            jcbCidade.removeAllItems();
            cidades = null;
            
            setColaborador(colaboradores.get(jtbColaboradores.getSelectedRow()));
            setaJCB();
            jbtSalvar.setEnabled(false);
            jtbpcolaboradores.setSelectedIndex(1);
            
            setaJcbUf();
            setaJcbCidade();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Por favor para poder detalhar é preciso cadastrar um Colaborador.");
        }
    }//GEN-LAST:event_jbtDetalharActionPerformed
    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null,
                    "Deseja realmente excluir este Colaborador ?",
                    "Atenção!", JOptionPane.YES_NO_OPTION) == 0) {
                colaboradorDao.remover(colaborador);
                pessoaDao.remover(colaborador.getPessoa());
                enderecoDao.remover(colaborador.getPessoa().getEndereco_codigo());
                novoColaborador();
                limpacampodatas();
                jcbSexo.setSelectedIndex(0);
                jcbfuncao.setSelectedIndex(0);
                jcbUF.setSelectedIndex(0);
                jcbCidade.setSelectedIndex(0);
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
                enderecoDao.alterar(colaborador.getPessoa().getEndereco_codigo());
                pessoaDao.alterar(colaborador.getPessoa());
                colaboradorDao.alterar(colaborador);
                atualizaTabela();
                JOptionPane.showMessageDialog(rootPane, "Alterado com sucesso!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro !\nMotivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtEditarActionPerformed
    private void jtbColaboradoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbColaboradoresMouseClicked
        if (evt.getClickCount() == 2) {
            jcbCidade.removeAllItems();
            cidades = null;
            
            setColaborador(colaboradores.get(jtbColaboradores.getSelectedRow()));
            setaJCB();
            jtbpcolaboradores.setSelectedIndex(1);
            
            setaJcbUf();
            setaJcbCidade();
        }
    }//GEN-LAST:event_jtbColaboradoresMouseClicked
    private void jbtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisarActionPerformed
        setColaboradores(colaboradorDao.buscarPorNome(jtfPesquisar.getText()));
        if (colaboradorDao.buscarTodos().isEmpty()) {
        } else {
            jtbColaboradores.addRowSelectionInterval(0, 0);
        }
    }//GEN-LAST:event_jbtPesquisarActionPerformed

    private void jtfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisarActionPerformed

    }//GEN-LAST:event_jtfPesquisarActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FrameCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameCadastroFuncionario().setVisible(true);
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
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
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
    private javax.swing.JComboBox jcbfuncao;
    private javax.swing.JTable jtbColaboradores;
    private javax.swing.JTabbedPane jtbpcolaboradores;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JFormattedTextField jtfCep;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JFormattedTextField jtfCpf;
    private com.toedter.calendar.JDateChooser jtfDataContratação;
    private com.toedter.calendar.JDateChooser jtfDataDemissão;
    private com.toedter.calendar.JDateChooser jtfDataNacimento;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNumero;
    private javax.swing.JTextField jtfPesquisar;
    private javax.swing.JTextField jtfRg;
    private javax.swing.JTextField jtfRua;
    private javax.swing.JTextField jtfSalario;
    private javax.swing.JFormattedTextField jtfTelefone;
    private javax.swing.JFormattedTextField jtfTelefoneCelular;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private Integer var = null;
    private Colaborador colaborador;
    private List<Colaborador> colaboradores;
    private ColaboradorDAO colaboradorDao;
    private GrupoColaboradorDAO grupoColaboradorDao;
    private List<GrupoColaborador> grupoColaboradores;
    private List<Cidade> cidades;
    private CidadeDAO cidadeDao;
    private EnderecoDAO enderecoDao;
    private UnidadeFederativaDAO unidadeFederativaDao;
    private List<UnidadeFederativa> unidadeFederativas;
    private PessoaDAO pessoaDao;
    private List<Pessoa> pessoas;

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
        List<Colaborador> colaboradoresVelhos = this.colaboradores;
        this.colaboradores = ObservableCollections.observableList(colaboradores);
        firePropertyChange("colaboradores", colaboradoresVelhos, this.colaboradores);
    }

    public void atualizaTabela() {
        setColaboradores(colaboradorDao.buscarTodos());
        setColaboradores(getColaboradores());
        if (colaboradorDao.buscarTodos().isEmpty()) {
        } else {
            jtbColaboradores.addRowSelectionInterval(0, 0);
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

    private void setaJcbUf(){
        jcbUF.getModel().setSelectedItem(colaborador.getPessoa()
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
    
    private void setaJcbCidade(){
        jcbCidade.getModel().setSelectedItem(colaborador.getPessoa()
                .getEndereco_codigo().getCidade_codigo());
    }

    public void atualizaCBFuncao() {
        grupoColaboradores = grupoColaboradorDao.buscarTodos();
        for (GrupoColaborador co : grupoColaboradores) {
            jcbfuncao.addItem(co);
        }
        jcbfuncao.setRenderer(new ComboBoxGrpColaborador());
    }

    private void novoColaborador() {
        setColaborador(new Colaborador(new Pessoa(new Endereco(new Cidade(new UnidadeFederativa())))));
        setcodigos();
        jbtSalvar.setEnabled(true);
    }

    private void setcodigos() {
        if (enderecoDao.buscarIdMaior() == null) {
            colaborador.getPessoa().getEndereco_codigo().setCodigo(1);
        } else {
            colaborador.getPessoa().getEndereco_codigo().setCodigo(enderecoDao.buscarIdMaior() + 1);
        }
        if (pessoaDao.buscarIdMaior() == null) {
            colaborador.getPessoa().setCodigo(1);
        } else {
            colaborador.getPessoa().setCodigo(pessoaDao.buscarIdMaior() + 1);
        }
        if (colaboradorDao.buscaIdMaio() == null) {
            colaborador.setCodigo(1);
        } else {
            colaborador.setCodigo(colaboradorDao.buscaIdMaio() + 1);
        }
        jtfCodigo.setText(colaborador.getCodigo().toString());
    }

    private void limpacampodatas() {
        jtfDataContratação.setCalendar(null);
        jtfDataDemissão.setCalendar(null);
        jtfDataNacimento.setCalendar(null);
    }

    private void setaJCB() {
        jcbfuncao.getModel().setSelectedItem(colaborador.getGrupoColaborador());
        jtfCodigo.setText(colaborador.getCodigo().toString());
        jtfDataNacimento.getDateEditor().setDate(colaborador.getDataNascimento());
        jtfDataContratação.getDateEditor().setDate(colaborador.getDataContratacao());
        jtfDataDemissão.getDateEditor().setDate(colaborador.getDataDemissao());
        if (colaborador.getPessoa().getSexo().equals("F")) {
            jcbSexo.setSelectedIndex(0);
        } else {
            jcbSexo.setSelectedIndex(1);
        }
    }
}