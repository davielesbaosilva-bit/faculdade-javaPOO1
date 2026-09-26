package Aplicacao;

import java.util.Scanner;

import Entidades.Quarto;

public class Programa {

	public static void main(String[] args) {
		java.util.Scanner sc = new Scanner(System.in);
		Quarto[][] pensionato = new Quarto[3][10];
		int qnt, numero, andar;
		String nome, email;
		System.out.println("Quantos quartos serao alugados?");
		qnt = sc.nextInt();
		for (int i = 1; i <= qnt; i++) {
			System.out.println("##Aluguel##");
			System.out.println("Nome: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.println("Andar");
			andar = sc.nextInt();
			System.out.println("Email: ");
			email = sc.next();
			System.out.println("Quarto: ");
			numero = sc.nextInt();
			Quarto quarto = new Quarto(andar, numero, nome, email);
			pensionato[andar - 1][numero - 1] = quarto;
		}
		System.out.println();
		System.out.println("Quartos ocupados:");
		for (int i = 0; i < pensionato.length; i++) {
			for (int j = 0; j < pensionato[0].length; j++) {
				if (pensionato[i][j] != null) {
					System.out.println(pensionato[i][j]);
				}
			}
		}
	}

}
