
package MODEL;

import java.util.Calendar;
import java.util.Date;

public class Empresa {
    
    private Integer codigo;
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj; 
    private String inscricaoEstadual;
    private String nomeProprietario;
    private String email;
    private Date dataFundacao;
    private Endereco endereco_codigo;

    public Empresa() {
    }
    public Empresa(Endereco endereco) {
        this.endereco_codigo = endereco;
    }

    public Empresa(Integer codigo, String razaoSocial, String nomeFantasia, String cnpj, String inscricaoEstadual, String nomeProprietario, String email, Date dataFundacao, Endereco endereco_codigo) {
        this.codigo = codigo;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.nomeProprietario = nomeProprietario;
        this.email = email;
        this.dataFundacao = dataFundacao;
        this.endereco_codigo = endereco_codigo;
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

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Endereco getEndereco_codigo() {
        return endereco_codigo;
    }

    public void setEndereco_codigo(Endereco endereco_codigo) {
        this.endereco_codigo = endereco_codigo;
    }

    @Override
    public String toString() {
        return String.valueOf(codigo);
    }
    
    

    
}
