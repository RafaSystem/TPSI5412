package view;

import controller.GestorCliente;
import controller.GestorRestaurante;
import model.Cliente;
import model.Restaurante;

public class PainelControlo {

	InserirCliente insCli;
	GestorCliente gerCli;
	InserirRestaurante insRes;
	GestorRestaurante gerRes;
	
public PainelControlo(){
		
		//Clientes
		insCli = new InserirCliente();
		gerCli = new GestorCliente();		
		Cliente c = insCli.criarCliente();
		gerCli.addCliente(c);

		
		
		//Restaurante
		insRes = new InserirRestaurante();
		gerRes = new GestorRestaurante();
		Restaurante r = insRes.criarRestaurante();
		gerRes.addRestaurante(r);
		
		gerCli.procurarCliente();
}
	
}
