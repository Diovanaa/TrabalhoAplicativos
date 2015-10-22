package MODEL;

public class Produto {

    private Integer codigo;
    private String codigoFabrica;
    private String descricao;
    private Float precoVenda;
    private Float precoCompra;
    private Float saldoEstoque;
    private UnidadeMedida unidadeMedida;
    private SubGrupoItem subGrupoItens;
    private Fornecedor fornecedor;

    public Produto(Integer codigo, String codigoFabrica, String descricao, Float precoVenda,
            Float precoCompra, Float saldoEstoque, UnidadeMedida unidadeMedida,
            SubGrupoItem subGrupoItens, Fornecedor fornecedor) {
        setCodigo(codigo);
        setCodigoFabrica(codigoFabrica);
        setDescricao(descricao);
        setPrecoVenda(precoVenda);
        setPrecoCompra(precoCompra);
        setSaldoEstoque(saldoEstoque);
        setUnidadeMedida(unidadeMedida);
        setSubGrupoItens(subGrupoItens);
        setFornecedor(fornecedor);
    }

    public Produto() {
    }

    public Produto(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public Produto(UnidadeMedida unidadeMedida, SubGrupoItem subGrupoItens, Fornecedor fornecedor) {
        this.unidadeMedida = unidadeMedida;
        this.subGrupoItens = subGrupoItens;
        this.fornecedor = fornecedor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCodigoFabrica() {
        return codigoFabrica;
    }

    public void setCodigoFabrica(String codigoFabrica) {
        this.codigoFabrica = codigoFabrica;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(Float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public Float getSaldoEstoque() {
        return saldoEstoque;
    }

    public void setSaldoEstoque(Float saldoEstoque) {
        this.saldoEstoque = saldoEstoque;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    
    public SubGrupoItem getSubGrupoItens() {
        return subGrupoItens;
    }

    public void setSubGrupoItens(SubGrupoItem subGrupoItens) {
        this.subGrupoItens = subGrupoItens;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return String.valueOf(codigo);
    }
    
}
