package exerc02;

import atividade.Lista;

/**
 * @author Karen 31 de mar de 2018
 */
public class Principal {

	/**
	 * Exerc�cio 2 � Programar na classe Lista um m�todo de nome
	 * addOrder(nro:int) para inserir os elementos na lista em ordem crescente
	 * de valor, desta forma, a lista sempre estar� ordenada.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Lista a = new Lista();

		a.add(7);
		a.add(5);
		a.add(2);
		a.addOrder(12);
		a.print();

	}

}
