package MODEL;

import java.util.Date;

public class Fornecedor {

    private Integer codigo;
    private String razaoSocial;
    private String cnpj;
    private String inscEstadual;
    private Date dataFuncacao;
    private Date dataCadastro;
    private Pessoa pessoa;

    public Fornecedor(Integer codigo, String razaoSocial, String cnpj, String inscEstadual, 
            Date dataFuncacao, Date dataCadastro, Pessoa pessoa) {
        this.codigo = codigo;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.dataFuncacao = dataFuncacao;
        this.dataCadastro = dataCadastro;
        this.pessoa = pessoa;
    }

    public Fornecedor() {
    }

    public Fornecedor(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public Date getDataFuncacao() {
        return dataFuncacao;
    }

    public void setDataFuncacao(Date dataFuncacao) {
        this.dataFuncacao = dataFuncacao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
