
package DAO;

import MODEL.ProdutosDaVenda;
import MODEL.Venda;
import java.util.List;

public interface ProdutoDaVendaDAO {
        void inserir(ProdutosDaVenda produtosDaVenda);
        void alterar(ProdutosDaVenda produtosDaVenda);
        void remover(ProdutosDaVenda produtosDaVenda);
        void removerAllProdutosDaVenda(ProdutosDaVenda produtosDaVenda);
        ProdutosDaVenda buscarPorCodigo(Integer codigo);
        List<ProdutosDaVenda> buscarTodos();
        List<ProdutosDaVenda> buscarPorCompra(Venda venda);
        List<ProdutosDaVenda> buscarParametrosRelatorio(Integer codigo);
        List<ProdutosDaVenda> buscarParametroParaImpressao(Integer codigodavenda);
}
