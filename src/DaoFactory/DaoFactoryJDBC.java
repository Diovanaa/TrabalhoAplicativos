package DaoFactory;

import dao.ClienteDAO;
import dao.ClienteDAOJDBC;



 
public  class DaoFactoryJDBC implements AbstractDaoFactory{

	@Override
	public ClienteDAO clienteDao(){
		return new ClienteDAOJDBC();
	}
	
}
