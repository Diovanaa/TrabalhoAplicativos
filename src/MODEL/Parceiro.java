
package MODEL;

import java.util.Date;

public class Parceiro {
    private Integer codigo;
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private Date dataCadastro;
    private Float limite;
    private Float Saldo;
    private Pessoa pessoa;
    private String tipoPessoa;

    public Parceiro() {
    }

    public Parceiro(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Parceiro(Integer codigo, String cpf, String rg, Date dataNascimento, Date dataCadastro, Float limite, Float Saldo, Pessoa pessoa, String tipoPessoa) {
        this.codigo = codigo;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
        this.limite = limite;
        this.Saldo = Saldo;
        this.pessoa = pessoa;
        this.tipoPessoa = tipoPessoa;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Float getLimite() {
        return limite;
    }

    public void setLimite(Float limite) {
        this.limite = limite;
    }

    public Float getSaldo() {
        return Saldo;
    }

    public void setSaldo(Float Saldo) {
        this.Saldo = Saldo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
    
    
    
    
    
}
