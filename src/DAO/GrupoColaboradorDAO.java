
package DAO;

import MODEL.GrupoColaborador;
import java.util.List;

public interface GrupoColaboradorDAO {
     void inserir(GrupoColaborador grupoColaborador);
     void alterar(GrupoColaborador grupoColaborador);
     void remover(GrupoColaborador grupoColaborador);
     GrupoColaborador buscaPorId(Integer codigo);
     Integer buscarIdMaior();
     List<GrupoColaborador> buscarPorDescricao(String descricao);
     List<GrupoColaborador> buscarTodos();  
    
}
