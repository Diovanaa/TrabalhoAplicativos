package MODEL;

public class SubGrupoItem {

    private Integer codigo;
    private String descricao;
    private GrupoItem grupoItem;

    public SubGrupoItem(Integer codigo, String descricao, GrupoItem grupoItem) {
        setCodigo(codigo);
        setDescricao(descricao);
        setGrupoItem(grupoItem);
    }

    public SubGrupoItem() {
    }

    public SubGrupoItem(GrupoItem grupoItem) {
        this.grupoItem = grupoItem;
    }
    
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public GrupoItem getGrupoItem() {
        return grupoItem;
    }

    public void setGrupoItem(GrupoItem grupoItem) {
        this.grupoItem = grupoItem;
    }

    @Override
    public String toString() {
        return String.valueOf(codigo);
    }
    
}
