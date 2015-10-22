package DAO;

import MODEL.Compra;
import MODEL.ProdutosDaCompra;
import java.util.List;

public interface ProdutoDaCompraDAO {

    void inserir(ProdutosDaCompra produtosDaCompra);
    void alterar(ProdutosDaCompra produtosDaCompra);
    void remover(ProdutosDaCompra produtosDaCompra);
    void removerAllProdutosDaCompra(ProdutosDaCompra produtosDaCompra);  
    ProdutosDaCompra buscarPorCodigo(Integer codigo);
    List<ProdutosDaCompra> buscarTodos();
    List<ProdutosDaCompra> buscarPorCompra(Compra compra);
    List<ProdutosDaCompra> buscarParametrosRelatorio(Integer codigo);
 
    
}
