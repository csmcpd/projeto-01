/**
 * 
 */
package Capgemini;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.security.auth.Destroyable;

/**
 * @author estudante
 *
 */
public class Exercicio03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner recebeTexto = new Scanner(System.in);
		//System.out.println("Escreva um texto");
		//String textoDigitado = recebeTexto.nextLine();
		String textoDigitado = "abcdefghijkl";
		
		
		
		String texto = textoDigitado;
		
		/**
		 * Remove os espaços da string
		 */
		String textoSemEspacos = texto.replaceAll("\\s+", "");
		System.out.println("String sem espaços = " + textoSemEspacos);
		
		/**
		 * Obtém o número de caracteres da string
		 */
		int numeroCaracteresTexto = textoSemEspacos.length();
		System.out.println("Numero de caracteres do texto = " + numeroCaracteresTexto);
		
		/**
		 * Obtem a Raiz da quantidade de caracteres
		 */
		double raiz = Math.sqrt(numeroCaracteresTexto);
		System.out.println("Raiz quadrada = " + raiz);
		double raizDoubleAcima = Math.ceil(raiz);
		System.out.println("Raiz quadrada arredondada pra cima = " + raizDoubleAcima);
		double raizDoubleAbaxio = Math.floor(raiz);
		System.out.println("Raiz quadrada arredondada pra baixo = " + raizDoubleAbaxio);
		
		/**
		 * Teste verifica se L x C >=T
		 */
		
		System.out.println("Verifica se o número de Linhas X Colunas é maior ou igual ao numero de caracteres");
		double multiplicacao = raizDoubleAcima * raizDoubleAbaxio;
		if (multiplicacao >= numeroCaracteresTexto) {
			System.out.println("Númer de Linhas X Colunas é >= T");
			
			/**
			 * Escolhendo o grid com menor área
			 */
			int mult = (int)multiplicacao;
			if (mult == numeroCaracteresTexto) {
				System.out.println("menor grid L X C é igual ao n de caracteres");
			}else if (mult > numeroCaracteresTexto) {
				System.out.println("menor grid L X C é maior que o n de caracteres");
			} else {
				System.out.println("Algo deu errado na verificação de menor grid");
			}
		} else {
			System.out.println("Numero de L X C é menor que numero de caracteres");
			double repete = raizDoubleAcima * raizDoubleAcima;
			raizDoubleAbaxio = raizDoubleAcima;
			
			System.out.println("Mudou a raizDoubleabaixo " + raizDoubleAbaxio);
			System.out.println("Multiplica a maior raiz por ela mesmo = " + repete);
		}
		
		
		char[] charTextoDigitado = new char[numeroCaracteresTexto];
		charTextoDigitado = textoSemEspacos.toCharArray();

		
		int num1 = (int)raizDoubleAbaxio;
		int num2 = (int)raizDoubleAcima;
		char[][] charDimensional = new char[num1][num2];
		
		int contador = 0;
		
		for(int i = 0; i < num1; i++) {
			for(int j = 0; j < num2; j++) {
							
				charDimensional[i][j] = charTextoDigitado[contador+j];
				
				System.out.println(charDimensional[i][j]);				
			}	
						
			//System.out.printf("%n");
			contador = contador + (int)raizDoubleAcima;				
		}
		
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		for(int i = 0; i < raizDoubleAbaxio; i++) {
			for(int j = 0; j < raizDoubleAcima; j++) {
				//System.out.println(charDimensional[i][j]);
				arrayList.add(String.valueOf(charDimensional[i][j]));
			}
			System.out.println(arrayList);
			arrayList.clear();
			
		}
		
		for(int i = 0; i < raizDoubleAbaxio; i++) {
			for(int j = 0; j < raizDoubleAcima; j++) {
				//System.out.println(charDimensional[i][j]);
				arrayList.add(String.valueOf(charDimensional[i][j]));
			}
			System.out.println(arrayList);
			arrayList.clear();
			
		}
		
	}
	
}
