package DaoFactory;

import dao.ClienteDAO;
import dao.ClienteDAOTexto;


public class DaoFactoryTXT implements AbstractDaoFactory{
	
	public ClienteDAO clienteDao() {
		return new ClienteDAOTexto();
	}

}
