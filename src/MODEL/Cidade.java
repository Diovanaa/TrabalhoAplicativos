
package MODEL;

public class Cidade {
    private Integer codigo;
    private String nome;
    private UnidadeFederativa unidadeFederativa_codigo;

    public Cidade() {
    }
    public Cidade(UnidadeFederativa unidadeFederativa) {
           this.unidadeFederativa_codigo = unidadeFederativa;
    }

    public Cidade(Integer codigo, String nome, UnidadeFederativa unidadeFederativa_codigo) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeFederativa_codigo = unidadeFederativa_codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UnidadeFederativa getUnidadeFederativa_codigo() {
        return unidadeFederativa_codigo;
    }

    public void setUnidadeFederativa_codigo(UnidadeFederativa unidadeFederativa_codigo) {
        this.unidadeFederativa_codigo = unidadeFederativa_codigo;
    }
    

    @Override
    public String toString() {
        return nome;
    }
    
   
}
