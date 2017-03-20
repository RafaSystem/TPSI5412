package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;

public class GestorCliente {
	ArrayList<Cliente> arCliente;
	Scanner sc = new Scanner(System.in);
	
	public GestorCliente() {
		this.arCliente = new ArrayList<Cliente>();	
	}
	
	public void addCliente(Cliente cli){
		arCliente.add(cli);
	}
	
	
	public void procurarCliente(){
		System.out.println("Insira o id do Cliente: ");
		int id = sc.nextInt();
		
		for(Cliente cli : arCliente){
			if(cli.getIdCliente() == id){
				System.out.println(cli);
			}
		}
		
	}
	
	
	}
	
	
