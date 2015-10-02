package DaoFactory;

import dao.ClienteDAO;



public interface AbstractDaoFactory {

	/**
	 * Retorna uma implementação valida de ProdutoDAO
	 * @return ProdutoDAO
	 */
	ClienteDAO clienteDao();
}
