package exerc01;

import atividade.Lista;

/**
 * @author Karen 31 de mar de 2018
 */
public class Principal {

	/**
	 * Exerc�cio 1 � Programar na classe Lista um m�todo de nome
	 * addInicio(nro:int) para inserir os elementos no in�cio da lista, desta
	 * forma, o in�cio da lista ser� sempre deslocado para o n� inserido.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Lista a = new Lista();

		a.add(7);
		a.add(5);
		a.add(2);
		a.addInicio(12);
		a.print();
	}

}
