package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Funcionarios;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionarios> lista = new ArrayList<>();
		String nome;
		int qtd, id;
		double salario;
		float percentual;
		System.out.println("Quantos empregados serão cadastrados? ");
		qtd = sc.nextInt();
		for (int i = 1; i <= qtd; i++) {
			System.out.println("--------------------------");
			System.out.print("Informe o id: ");
			id = sc.nextInt();
			System.out.print("Informe o nome: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.println("Informe o salario: ");
			salario = sc.nextDouble();
			System.out.println("--------------------------");
			Funcionarios func = new Funcionarios(nome, id, salario);
			lista.add(func);
		}
		System.out.println();
		System.out.println("Informe o Id do funcionário que terá seu salário modificado:");
		id = sc.nextInt();
		Funcionarios funcReajus = null;
		for (Funcionarios obj : lista) {
			if (obj.getId() == id) {
				funcReajus = obj;
			}
		}
		if (funcReajus != null) {
			System.out.println("Informe o percentual: ");
			percentual = sc.nextFloat();
			funcReajus.ajusteSalario(percentual);
		}
		System.out.println();
		System.out.println("Lista de Empregados: ");
		for (Funcionarios obj : lista) {
			System.out.println(obj);
		}
	}
}
