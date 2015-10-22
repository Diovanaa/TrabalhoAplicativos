package DAO;

import MODEL.GrupoItem;
import java.util.List;

public interface GrupoItemDAO {
    void inserir(GrupoItem grupoItem);
    void alterar(GrupoItem grupoItem);
    void remover(GrupoItem grupoItem);
    GrupoItem buscarPorCodigo(Integer codigo);
    List<GrupoItem> buscarPorDescricao(String descricao);
    List<GrupoItem> buscarTodos();
    Integer buscaIdMaio();
    
}
