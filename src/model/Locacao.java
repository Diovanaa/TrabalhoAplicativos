package model;

public class Locacao {
	private Integer codigo;
	private Double qtd;
	private Double valorTotal;
	private Cliente cliente;
	private FilmeLocacao filmeLocacao;
	private Funcionario funcionario;
	
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Double getQtd() {
		return qtd;
	}
	public void setQtd(Double qtd) {
		this.qtd = qtd;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public FilmeLocacao getFilmeLocacao() {
		return filmeLocacao;
	}
	public void setFilmeLocacao(FilmeLocacao filmeLocacao) {
		this.filmeLocacao = filmeLocacao;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	
}
