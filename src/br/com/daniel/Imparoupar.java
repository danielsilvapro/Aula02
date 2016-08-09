package br.com.daniel;

import java.util.Scanner;

public class Imparoupar {
	
	public static void main(String[] args) {
		double num;
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite numero");
    num = entrada.nextDouble();
    if (num % 2 == 0){
    	System.out.println("Numero Par");
    }
    else {
    	System.out.println("Numero impar");
    }
    }
	}
