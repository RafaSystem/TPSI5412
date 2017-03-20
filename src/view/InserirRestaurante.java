package view;

import java.util.Scanner;
import model.Restaurante;

public class InserirRestaurante {

	public int i=0;
	private Scanner scanner;
	
	public Restaurante criarRestaurante(){
		scanner = new Scanner(System.in);
		
		
		System.out.println("Insira o nome do Restaurante: ");
		String nome = scanner.nextLine();
		
		System.out.println("Insira a morada do Restaurante: ");
		String morada = scanner.nextLine();
		
		System.out.println("Insira o contacto do Restaurante");
		String contacto = scanner.nextLine();
		
		System.out.println("Insira o a especialidade do Restaurante: ");
		String especialidade = scanner.nextLine();
		
		System.out.println("Insira o id do Restaurante");
		int idRestaurante = scanner.nextInt();
		
		
		Restaurante r = new Restaurante(nome, morada, contacto, especialidade, idRestaurante);
		r.setNome(nome);
		r.setMorada(morada);
		r.setContacto(contacto);
		r.setEspecialidade(especialidade);
		r.setIdRestaurante(idRestaurante);
		
		return r;
	}
	
}
