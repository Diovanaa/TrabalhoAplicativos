package teste;

import model.Cliente;
import dao.ClienteDAO;
import dao.ClienteDAOJDBC;




public class clienteTeste {
	public static void main(String[]args){
		ClienteDAO clienteDAO = new ClienteDAOJDBC();
		Cliente cliente = new Cliente();
		cliente.setCodigo(3);
		cliente.setNome("Diovana");
		cliente.setCpf("11111111111");
		cliente.setRg("6094465");
		cliente.setEndereco("Rua joao lunardi, 146n, bairro alvorada");
		cliente.setTelefone("33548956");
		
		clienteDAO.inserir(cliente);
		
	}
}
