
package MODEL;

public class ProdutosDaVenda {
    private Venda venda_codigo;
    private Produto produto_codigo;
    private Float quantidade;
    private Float valorUnitario;
    private Float valorTotal;

    public ProdutosDaVenda() {
    }
    
    public ProdutosDaVenda(Venda venda_codigo, Produto produto_codigo, Float quantidade, Float valorUnitario, Float valorTotal) {
        this.venda_codigo = venda_codigo;
        this.produto_codigo = produto_codigo;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
    }

    public Venda getVenda_codigo() {
        return venda_codigo;
    }

    public void setVenda_codigo(Venda venda_codigo) {
        this.venda_codigo = venda_codigo;
    }

    public Produto getProduto_codigo() {
        return produto_codigo;
    }

    public void setProduto_codigo(Produto produto_codigo) {
        this.produto_codigo = produto_codigo;
    }

    public Float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }

    public Float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
}
