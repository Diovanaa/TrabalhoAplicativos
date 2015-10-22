
package DAO;

import MODEL.Colaborador;
import java.util.List;

public interface ColaboradorDAO {
        
    void inserir(Colaborador colaborador);
    void alterar(Colaborador colaborador);
    void remover(Colaborador colaborador);
    Colaborador buscaPorId(Integer codigo);
    Integer buscaIdMaio();
    List<Colaborador> buscarTodos();
    List<Colaborador> buscarPorNome(String nome);
    List<Colaborador> buscarParametrosRelatorio(Integer grupoColaborador);
    
}
