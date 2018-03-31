package atividade;

/**
 * @author Karen 31 de mar de 2018
 */
public class ListaCircular {
	No inicio;

	void add(int nro) {
		No no = new No();
		no.conteudo = nro;
		no.anterior = null;
		no.proximo = null;
		if (inicio == null) {
			inicio = no;
			no.proximo = no;
			no.anterior = no;
		} else {
			No ultimo = inicio;
			while (ultimo.proximo != inicio) {
				ultimo = ultimo.proximo;
			}
			ultimo.proximo.anterior = no;
			no.proximo = ultimo.proximo;
			no.anterior = ultimo;
			ultimo.proximo = no;
		}
	}

	void print() {
		if (inicio == null) {
			System.out.println("\nLista vazia");
		} else {
			System.out.println();
			No ultimo = inicio;
			do {
				System.out.print(ultimo.conteudo + " ");
				ultimo = ultimo.proximo;
			} while (ultimo != inicio);
		}
	}

}
