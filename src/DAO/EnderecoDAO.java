
package DAO;

import MODEL.Endereco;
import java.util.List;

public interface EnderecoDAO {
    void inserir(Endereco endereco);
    void alterar(Endereco endereco);
    void remover(Endereco endereco);
    Endereco buscarPorCodigo(Integer codigo);
    Integer buscarIdMaior();
    List<Endereco> buscarTodos(); 
}
