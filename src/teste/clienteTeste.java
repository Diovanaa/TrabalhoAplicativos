package teste;

import model.Cliente;
import dao.ClienteDAO;
import dao.ClienteDAOJDBC;




public class clienteTeste {
	public static void main(String[]args){
		ClienteDAO clienteDAO = new ClienteDAOJDBC();
		Cliente cliente = new Cliente();
		cliente.setNome("Diovana");
		clienteDAO.inserir(cliente);	
		
		
	}
}
