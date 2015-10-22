package DAO;

import MODEL.GrupoItem;
import MODEL.SubGrupoItem;
import java.util.List;

public interface SubGrupoItemDAO {

    void inserir(SubGrupoItem subGrupoItem);
    void alterar(SubGrupoItem subGrupoItem);
    void remover(SubGrupoItem subGrupoItem);
    SubGrupoItem buscarPorCodigo(Integer codigo);
    List<SubGrupoItem> buscarPorDescricao(String descricao);
    List<SubGrupoItem> buscarTodos();
    List<SubGrupoItem> buscarPorGrupoItem(Integer codigo);
    Integer buscaIdMaio();
    
}
