package DAO;

import MODEL.ProdutosDaVenda;
import java.util.List;

public interface produtosDaVendaDAO {

    void inserir(ProdutosDaVenda produtosDaVenda);

    void alterar(ProdutosDaVenda produtosDaVenda);

    void remover(ProdutosDaVenda produtosDaVenda);

    ProdutosDaVenda buscaPorId(Integer venda_codigo);

    Integer buscaIdMaio();

    List<ProdutosDaVenda> buscarTodos();
}
