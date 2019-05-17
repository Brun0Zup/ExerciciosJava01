package com.br.exercicio.java;
import java.util.Scanner;
public class ConversorCelFah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		double C, F; 

		System.out.print("Conversor de temperatura: Graus Celsios -> Fahrenheit\n\n"); 
		
		System.out.print("Digite a temperatura em Celsius: ");
		C = entrada.nextDouble();
		
		F = ( 9 * C + 160 ) / 5;

		System.out.print("\n A medida convertida é " + F );

	}

}
