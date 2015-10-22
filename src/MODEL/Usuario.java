
package MODEL;

public class Usuario {
    private Integer codigo;
    private String usuario;
    private String senha;

    public Usuario() {
    }

    public Usuario(Integer codigo, String usuario, String senha) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
