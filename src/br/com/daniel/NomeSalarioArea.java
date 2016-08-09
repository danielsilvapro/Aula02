package br.com.daniel;

import java.util.Scanner;

public class NomeSalarioArea {
	
	public static void main(String[] args) {
		String nome, area;
		float salario;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		nome = entrada.nextLine();
		System.out.println("Digite sua area");
		area = entrada.nextLine();
		System.out.println("Digite seu salario");
		salario = entrada.nextFloat();
		if (area == "TI");{
		salario *= 100/10;
		System.out.println(nome + area + salario);		
		}
	}
}
