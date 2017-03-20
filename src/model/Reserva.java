package model;

import java.util.ArrayList;

public class Reserva {
	ArrayList<Cliente> cliente;
	ArrayList<Restaurante> restaurante;
	
	public Reserva(ArrayList<Cliente> cliente, ArrayList<Restaurante> restaurante) {
		super();
		this.cliente = cliente;
		this.restaurante = restaurante;
	}

	public ArrayList<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(ArrayList<Cliente> cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Restaurante> getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(ArrayList<Restaurante> restaurante) {
		this.restaurante = restaurante;
	}
	
	
	

}
