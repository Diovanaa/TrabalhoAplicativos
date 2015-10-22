package DAO;

import MODEL.Fornecedor;
import java.util.List;

public interface FornecedorDAO {

    void inserir(Fornecedor fornecedor);
    void alterar(Fornecedor fornecedor);
    void remover(Fornecedor fornecedor);
    Fornecedor buscaPorId(Integer codigo);  
    Integer buscaIdMaio();
    List<Fornecedor> buscarTodos();
    List<Fornecedor> buscarPorNome(String razaoSocial);
}
