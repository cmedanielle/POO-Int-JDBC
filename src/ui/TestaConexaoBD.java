package ui;

import java.util.ArrayList;
import controllers.DAOPessoa;
import beans.Pessoa;

public class TestaConexaoBD {

	public static void main(String[] args) {
		DAOPessoa conexao = new DAOPessoa();
		
		System.out.println("Criando pessoas...");
		conexao.criarPessoa(new Pessoa("Maria Joaquina", 15));	
		conexao.criarPessoa(new Pessoa("Amaral Pereira", 30));
		System.out.println("-------------------------------------");
		
		System.out.println("Buscando uma pessoa...");
		Pessoa resultadoPessoa = conexao.buscarPessoa(1);
		System.out.println(resultadoPessoa.toString());
		System.out.println("-------------------------------------");
		
		System.out.println("Listando todas as pessoas do banco...");
		ArrayList<Pessoa> resultadoPessoas = conexao.verTodos();
		for (Pessoa p : resultadoPessoas) {
			System.out.println(p.toString());
		}
		System.out.println("-------------------------------------");
		
		System.out.println("Editando uma pessoa...");
		conexao.editarPessoa(5, "Góes", 23);
		
		resultadoPessoas = conexao.verTodos();
		for (Pessoa p : resultadoPessoas) {
			System.out.println(p.toString());
		}
		
		System.out.println("-------------------------------------");
		
		System.out.println("Excluindo uma pessoa...");
		conexao.excluirPessoa(1);
		
		resultadoPessoas = conexao.verTodos();
		for (Pessoa p : resultadoPessoas) {
			System.out.println(p.toString());
		}
	}
	
}
