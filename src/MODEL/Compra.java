package MODEL;

import java.util.Date;
import java.util.List;

public class Compra {

    private Integer codigo;
    private Date dataCompra;
    private Float valorCompra;
    private Fornecedor fornecedor;
    private Colaborador colaborador;
    private List<ProdutosDaCompra> produtosDaCompra;

    public Compra(Integer codigo, Date dataCompra, Float valorCompra, Fornecedor fornecedor, Colaborador colaborador, List<ProdutosDaCompra> produtosDaCompra) {
        this.codigo = codigo;
        this.dataCompra = dataCompra;
        this.valorCompra = valorCompra;
        this.fornecedor = fornecedor;
        this.colaborador = colaborador;
        this.produtosDaCompra = produtosDaCompra;
    }

    public Compra() {
    }

    public Compra(Fornecedor fornecedor, Colaborador colaborador, List<ProdutosDaCompra> produtosDaCompra) {
        this.fornecedor = fornecedor;
        this.colaborador = colaborador;
        this.produtosDaCompra = produtosDaCompra;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public List<ProdutosDaCompra> getProdutosDaCompra() {
        return produtosDaCompra;
    }

    public void setProdutosDaCompra(List<ProdutosDaCompra> produtosDaCompra) {
        this.produtosDaCompra = produtosDaCompra;
    }
}
