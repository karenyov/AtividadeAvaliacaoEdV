package atividade;

/**
 * @author Karen 31 de mar de 2018
 */
public class Lista {
	No inicio;

	public void add(int nro) {
		No no = new No();
		no.conteudo = nro;
		no.anterior = null;
		no.proximo = null;
		if (inicio == null) {
			inicio = no;
		} else {
			No ultimo = inicio;
			while (ultimo.proximo != null) {
				ultimo = ultimo.proximo;
			}
			ultimo.proximo = no;
			no.anterior = ultimo;
		}
	}

	public void print() {
		if (inicio == null) {
			System.out.println("\nLista vazia");
		} else {
			/* quebra de linha na tela */
			System.out.println();
			No ultimo = inicio;
			while (ultimo != null) {
				System.out.print(ultimo.conteudo + " ");
				ultimo = ultimo.proximo;
			}
		}
	}

	public void addInicio(int nro) {

		No newNo = new No(); // Nó auxiliar
		newNo.conteudo = nro; // add o conteudo passado para o inicio do No
		newNo.proximo = inicio;
		inicio = newNo; // add o No aux para o inicio

	}

	public void addOrder(int nro) {

		No no = new No();
		no.conteudo = nro;
		if (inicio == null) {
			inicio = no;
		} else if (inicio.conteudo >= no.conteudo) {
			no.proximo = inicio;
			no.proximo.anterior = no;
			inicio = no;
		} else {
			No current = inicio;
			while ((current.proximo != null) && (current.proximo.conteudo < no.conteudo)) {
				current = current.proximo;
			}
			no.proximo = current.proximo;

			if (current.proximo != null) {
				no.proximo.anterior = no;
			}

			current.proximo = no;
			no.anterior = current;

			inicio = current;
		}

	}
}
