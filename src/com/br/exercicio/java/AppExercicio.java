package com.br.exercicio.java;
import java.util.Scanner; //Importando o Scanner

public class AppExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
System.out.println("Olá, seja bem-vindo a nossa loja" + "\n" );

System.out.println("Qual o nome do vendedor?");
String nomeDoVendedor = entrada.next();


System.out.println("Nome ou código da peça:");
String nomePeçaCód = entrada.next();    

System.out.println("Preço da peça:");
Double preco = entrada.nextDouble();     // Preço por Und

System.out.println("Quantidade de produtos vendidos:");
int qtdVendidas =  entrada.nextInt();   // Qtd de produtos vendidos


Double result = preco * qtdVendidas;
Double vComissao = (result*5)/100;

System.out.println("Sua comissão é no valor de:" + vComissao);


	}
 
}
