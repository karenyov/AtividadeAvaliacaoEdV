package exerc01;

import atividade.Lista;

/**
 * @author Karen 31 de mar de 2018
 */
public class Principal {

	/**
	 * Exercício 1 – Programar na classe Lista um método de nome
	 * addInicio(nro:int) para inserir os elementos no início da lista, desta
	 * forma, o início da lista será sempre deslocado para o nó inserido.
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
