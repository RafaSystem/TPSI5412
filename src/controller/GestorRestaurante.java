package controller;

import java.util.ArrayList;
import model.Restaurante;

public class GestorRestaurante {
ArrayList<Restaurante> arRestaurante;
	
	public GestorRestaurante() {
		this.arRestaurante = new ArrayList<Restaurante>();	
	}
	
	public void addRestaurante(Restaurante res){
		arRestaurante.add(res);
	}

	
	
}
