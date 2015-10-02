package dao;

import java.util.List;

import model.Cliente;

public class ClienteDAOTexto implements ClienteDAO{
	


	

		@Override
		public void inserir(Cliente entidade) {
			System.out.println("Salvando em texto");
		}

		@Override
		public void alterar(Cliente entidade) {
			
		}

		@Override
		public void excluir(Cliente entidade) {
			
		}

		@Override
		public Cliente buscar(Integer id) {
			return null;
		}

		@Override
		public List<Cliente> todos() {
			// TODO Auto-generated method stub
			return null;
		}

	}


