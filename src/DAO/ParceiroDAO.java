
package DAO;

import MODEL.Parceiro;
import java.util.List;

public interface ParceiroDAO {
    
    void inserir(Parceiro parceiro);
    void alterar(Parceiro parceiro);
    void remover(Parceiro parceiro);
    Parceiro buscaPorId(Integer codigo);  
    Integer buscaIdMaio();
    List<Parceiro> buscarTodos();
    List<Parceiro> buscarPorNome(String nome);
    
}
