package MODEL;

public class ProdutosDaCompra {

    private Compra compra;
    private Produto produto;
    private Float quantidade;
    private Float valorUnitario;
    private Float valorTotal;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto Produto) {
        this.produto = Produto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
