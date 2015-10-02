package Relatorio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import DaoFactory.DaoFactory;
import model.Cliente;
import conexao.ConexaoUtil2;



public class RelatorioCliente {
	
public static void main(String[] args) {
		

	
		
		Map<String, Object> parametros = new HashMap<String, Object>();
		
		
		new RelatorioUtil().viewReport(
				"src/relatorio/RelatorioCliente.jasper",
				ConexaoUtil2.getCon(), parametros);

}
}
