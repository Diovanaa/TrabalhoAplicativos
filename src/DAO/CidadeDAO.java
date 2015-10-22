
package DAO;

import MODEL.Cidade;
import java.util.List;

public interface CidadeDAO {
    
    void inserir(Cidade cidade);
    void alterar(Cidade cidade);
    void remover(Cidade cidade);
    Cidade buscaPorId(Integer codigo);
    List<Cidade> buscarTodos();
    List<Cidade> buscaCidades(Integer unidadeFederativa_codigo);
    
}
