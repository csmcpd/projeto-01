/**
 * 
 */
package Capgemini;

import java.util.ArrayList;
import java.util.List;

/**
 * @author estudante
 *
 */
public class Exercicio01 {

	/**
	 * @param args
	 */
	
	int  mediano;
	ArrayList<Integer> arrayNumero = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	/**
	 * Mediano.
	 *
	 * @param numeros the numeros
	 * @return the int
	 */
	public int mediano(List numeros) {
		arrayNumero.addAll(numeros);
		arrayNumero.sort(null);
		
		
		Integer numero = arrayNumero.size();
		//System.out.println(numero);
		int rec = (numero/2);
		//System.out.println(rec);
		//System.out.println(arrayNumero.get(rec));
		
		return mediano = arrayNumero.get(rec);
	}

}
