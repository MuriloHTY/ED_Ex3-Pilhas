package view;

import br.edu.fateczl.pilhaint.Pilha;

public class Ex2 {

	public static void main(String[] args) throws Exception {
		
		
		Pilha pilha = new Pilha();
		
		
		int vetor[] = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3 , -6, 2, -9, 1, -5};
		
		
		int v1 = 0;
		int v2 = 0;
		
		
		int somaPop;
		
		for(int i = 0; i < 16; i++) {
			if(vetor[i] > -1) {
				pilha.push(vetor[i]);
			} else {
				v1 = pilha.pop();
				v2 = pilha.pop();
				somaPop = v1 + v2;
				pilha.push(v1);
				pilha.push(somaPop);
			}
		}
		
		System.out.println("Sua pilha contem "+pilha.size()+" valores.");

	}

}