package dao;

import java.util.List;

public interface GenericDAO2<T> {
	void inserir(T entidade);//inserir no banco
	void alterar(T entidade);//alterar no banco
	void excluir(T entidade);//excluir no banco

	T buscar(Integer id);
	
	List<T>todos();
}
