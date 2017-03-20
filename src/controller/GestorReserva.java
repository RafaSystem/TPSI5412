package controller;

import java.util.ArrayList;
import model.Reserva;

public class GestorReserva {
	ArrayList<Reserva> arReserva;
	
	public GestorReserva() {
		this.arReserva = new ArrayList<Reserva>();	
	}
	
	public void addReserva(Reserva rsv){
		arReserva.add(rsv);
	}
	
	
}
