/**
 * 
 */
package Capgemini;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collection;
import java.util.Collections;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Exercicio02.
 *
 * @author estudante
 */
public class Exercicio02 {

	/**
	 * The main method.
	 *
	 */
	
	ArrayList<Integer> arrayNumero = new ArrayList<Integer>();
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Cria a lista de números
		 * 
		 */
		List<Integer> lista = new ArrayList<Integer>(Arrays.asList(new Integer[] {1,5,3,4,2}));
		
		/**
		 * Recebe a lista de numeros
		 */
		ArrayList<Integer> arrayNumero = new ArrayList<Integer>();
		
		/**
		 * Adiciona a lista de números
		 */
		arrayNumero.addAll(lista);
		
		/**
		 * Imprime a lista de numeros não ordenada
		 */
		System.out.println(arrayNumero);
		
		/**
		 * Ordena a lista de números
		 */
		arrayNumero.sort(null);
		
		/**
		 * Inverte a ordem da lista
		 */
		Collections.reverse(arrayNumero);
		
		/**
		 * Imprime a lista de números ordenados
		 */
		System.out.println(arrayNumero);
		
		int x = 2;
		int contador = 0;
		
		for(int i = 0; i < arrayNumero.size(); i++) {
			
			for(int j = 0; j < arrayNumero.size()-1; j++ ) {
				if((arrayNumero.get(i) - arrayNumero.get(j+1)) == x) {
					contador++;
					System.out.println("[" + (arrayNumero.get(i)+ "," + 
											  arrayNumero.get(j+1)+"]"));
				}
				
			}
			
		}
		System.out.println("Existem " + contador +
				" pares de inteiros no vetor com uma diferença de " + x);
	}
	
	/**
	 * vetor pares.
	 *
	 * @param lista the lista
	 * @param x the x
	 * @return true, if successful
	 */
	public boolean vetorPares(List lista, int x) {
		
		arrayNumero.addAll(lista);
		arrayNumero.sort(null);
		Collections.reverse(arrayNumero);
	
		boolean resposta = false;
		int contador = 0;
		
		for(int i = 0; i < arrayNumero.size(); i++) {
			
			for(int j = 0; j < arrayNumero.size()-1; j++ ) {
				if((arrayNumero.get(i) - arrayNumero.get(j+1)) == x) {
					contador++;
					System.out.println("[" + (arrayNumero.get(i)+ "," + 
											  arrayNumero.get(j+1)+"]"));
				}				
			}			
		}
		if(contador > 0) {
			resposta = true;
			System.out.println("Existem " + contador +
					" pares de inteiros no vetor com uma diferença de " + x);
		}
		return resposta;		
	}
}
