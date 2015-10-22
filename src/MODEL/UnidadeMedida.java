package MODEL;

public class UnidadeMedida {
    
    private Integer codigo;
    private String descricao;
    private String sigla;
    private Boolean fragmentaQtd;
    private Float quantidade;

    public UnidadeMedida() {
    }

    public UnidadeMedida(Integer codigo, String descricao, String sigla, Boolean fragmentaQtd, Float quantidade) {
        setCodigo(codigo);
        setDescricao(descricao);
        setSigla(sigla);
        setFragmentaQtd(fragmentaQtd);
        setQuantidade(quantidade);
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Boolean getFragmentaQtd() {
        return fragmentaQtd;
    }

    public void setFragmentaQtd(Boolean fragmentaQtd) {
        this.fragmentaQtd = fragmentaQtd;
    }

    public Float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return String.valueOf(codigo);
    }
   
    
    
}
