/**
 * 
 */
package Capgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Exercicio02Teste.
 *
 * @author estudante
 */
public class Exercicio02Teste {

	/**
	 * Instantiates a new exercicio 02 teste.
	 */
	public Exercicio02Teste() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean recebeResposta = false;
		int x = 2;
		
		/**
		 * Cria a lista de n�meros 
		 */
		List<Integer> lista = new ArrayList<Integer>(Arrays.asList(new Integer[] {1,5,3,4,2}));

		/**
		 * cria um objeto da classe Exercicio02
		 */
		Exercicio02 exercicio02 = new Exercicio02();
		
		/**
		 * chama a fun��o vetorPares inserindo a lista de n�meros e o valor de compara��o
		 *  e retorna um valor booleano que ser� armazenado na vari�vel recebeResposta
		 */
		
		recebeResposta = exercicio02.vetorPares(lista, x);
		
		/**
		 * condicional if testa a fun��o vetorPares
		 */
		if(recebeResposta) {
			System.out.println("Metodo vetorPares ok, retorno foi " + recebeResposta);
		}
		
	}

}
