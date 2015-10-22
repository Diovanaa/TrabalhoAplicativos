
package MODEL;

import java.util.Date;

public class Colaborador {
    private Integer codigo;
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private Date dataContratacao;
    private Date dataDemissao;
    private Float salario;
    private Pessoa pessoa;
    private GrupoColaborador grupoColaborador;

    public Colaborador(Integer codigo, String cpf, String rg, Date dataNascimento, Date dataContratacao, Date dataDemissao, Float salario, Pessoa pessoa, GrupoColaborador grupoColaborador) {
        this.codigo = codigo;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.dataContratacao = dataContratacao;
        this.dataDemissao = dataDemissao;
        this.salario = salario;
        this.pessoa = pessoa;
        this.grupoColaborador = grupoColaborador;
    }



    public Colaborador() {
        
    }
    public Colaborador(GrupoColaborador grupoColaborador) {
        this.grupoColaborador = grupoColaborador;
    }
    
    public Colaborador(Pessoa pessoa) {
        this.pessoa = pessoa;
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

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContradacao) {
        this.dataContratacao = dataContradacao;
    }

    public Date getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public GrupoColaborador getGrupoColaborador() {
        return grupoColaborador;
    }

    public void setGrupoColaborador(GrupoColaborador grupoColaborador) {
        this.grupoColaborador = grupoColaborador;
    }

    @Override
    public String toString() {
        return String.valueOf(codigo);
    }

    
}
