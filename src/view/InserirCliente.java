package view;

import java.util.Scanner;

import model.Cliente;

public class InserirCliente {
	
	public InserirCliente(){
		
	}
	
	public int i=0;
	private Scanner scanner;
	
	public Cliente criarCliente(){
		scanner = new Scanner(System.in);
		
		System.out.println("Insira o nome do Cliente: ");
		
		String nome = scanner.nextLine();
		
		System.out.println("Insira a morada do Cliente");
		String morada = scanner.nextLine();
		
		System.out.println("Insira o email do Cliente");
		String email = scanner.nextLine();
		
		System.out.println("Insira o numero de telefone do Cliente: ");
		String telefone = scanner.nextLine();
	
		System.out.println("Insira o id do Cliente");
		int idCliente = scanner.nextInt();
		
		Cliente c = new Cliente(nome, morada, email, telefone, idCliente);
		c.setNome(nome);
		c.setMorada(morada);
		c.setEmail(email);
		c.setTelefone(telefone);
		c.setIdCliente(idCliente);
		return c;
	}
	
}
