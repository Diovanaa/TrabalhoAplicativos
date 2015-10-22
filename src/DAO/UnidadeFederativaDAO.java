
package DAO;

import MODEL.UnidadeFederativa;
import java.util.List;

public interface UnidadeFederativaDAO { 
    void inserir(UnidadeFederativa unidadeFederativa);
    void alterar(UnidadeFederativa unidadeFederativa);
    void remover(UnidadeFederativa unidadeFederativa);
    UnidadeFederativa buscarPorCodigo(Integer codigo);
    List<UnidadeFederativa> buscarTodos();

}
