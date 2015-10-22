
package DAO;

import MODEL.Venda;
import java.util.Date;
import java.util.List;

public interface VendaDAO {
    void inserir(Venda venda);
    void alterar(Venda venda);
    void remover(Venda venda);
    Venda buscaPorId(Integer codigo);  
    Integer buscaIdMaio();
    List<Venda> buscarTodos();
    List<Venda> buscarCampoPesquisa(String parametro);
    List<Venda> buscarParametrosRelatorio(Integer parceiro, Integer colaborador);
    List<Venda> buscarPorPeriodo(Date vendaI, Date vendaF);
    
}
