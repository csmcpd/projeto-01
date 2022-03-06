/**
 * 
 */
package Capgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Exercicio01Teste.
 *
 * @author cristiano
 */
public class Exercicio01Teste {

	/**
	 * Instantiates a new exercicio 01 teste.
	 */
	public Exercicio01Teste() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** 
		 * Variável receberá o mediano
		 */
		int recMediano = 0;
		
		/**
		 * Cria a lista de números 
		 */
		List<Integer> lista = new ArrayList<Integer>(Arrays.asList(new Integer[] {9,2,1,4,6}));
		
		/**
		 * cria um objeto da classe Exercicio01
		 */
		Exercicio01 exercicio01 = new Exercicio01();
		
		/**
		 * chama a função mediano inserindo a lista de números
		 */
		recMediano = exercicio01.mediano(lista);
		
		/**
		 * condicional if que realizara o teste na função mediano
		 */
		if(recMediano == 4) {
			System.out.println("Mediano retornou o valor: " + recMediano + " teste Ok!!!");
		} else {
			System.out.println("Seu teste falhou, verificar possiveis erros no código. ");
		}
		
	}

}
