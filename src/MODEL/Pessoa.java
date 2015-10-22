
package MODEL;

public class Pessoa {
    private Integer codigo;
    private String nome;
    private String sexo;
    private Endereco endereco_codigo;

    public Pessoa(Integer codigo, String nome, String sexo, Endereco endereco_codigo) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.endereco_codigo = endereco_codigo;
    }

    public Pessoa() {
        
    }
    public Pessoa(Endereco endereco) {
        this.endereco_codigo = endereco;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco_codigo() {
        return endereco_codigo;
    }

    public void setEndereco_codigo(Endereco endereco_codigo) {
        this.endereco_codigo = endereco_codigo;
    }

    @Override
    public String toString() {
        return String.valueOf(codigo);
    }
    
    
    
}
