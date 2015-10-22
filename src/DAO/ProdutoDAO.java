package DAO;

import MODEL.Produto;
import java.util.List;

public interface ProdutoDAO {
    void inserir(Produto produto);
    void alterar(Produto produto);
    void remover(Produto produto);
    Produto buscarPorCodigo(Integer codigo);
    List<Produto> buscarPorDescricao(String descricao);
    List<Produto> buscarTodos();
    List<Produto> buscarParametrosRelatorio(Integer fornecedor);
    Integer buscaIdMaio();
}
