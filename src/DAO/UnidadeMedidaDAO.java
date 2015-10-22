
package DAO;

import MODEL.UnidadeMedida;
import java.util.List;

public interface UnidadeMedidaDAO {
    void inserir(UnidadeMedida unidadeMedida);
    void alterar(UnidadeMedida unidadeMedida);
    void remover(UnidadeMedida unidadeMedida);
    UnidadeMedida buscarPorCodigo(Integer codigo);
    List<UnidadeMedida> buscaPorDescricao(String descricao);
    Integer buscaIdMaio();
    List<UnidadeMedida> buscarTodos();
}
