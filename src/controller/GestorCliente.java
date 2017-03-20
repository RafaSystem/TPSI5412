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
		System.out.println("Insira o id do Cliente que quer procurar: ");
		int id = sc.nextInt();
		
		for(int i=0;i<=arCliente.get(i).getIdCliente();i++){
			if(id==arCliente.get(i).getIdCliente()){
				System.out.println("id do cliente: "+arCliente.get(i).getIdCliente());
				System.out.println("nome do cliente: "+arCliente.get(i).getNome());
				System.out.println("morada do cliente: "+arCliente.get(i).getMorada());
				System.out.println("email do cliente: "+arCliente.get(i).getEmail());
				System.out.println("telefone do cliente: "+arCliente.get(i).getTelefone());
			}
		}
		
	}
	
	
	}
	
	
