package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.pilhaint.Pilha;
import controller.NPRController;

public class Ex2 {

	public static void main(String[] args) throws Exception {
		
		Pilha pilha = new Pilha();
		
		NPRController npr = new NPRController();
		
		int valor;
		
		String operador;
		
		for (int i = 0; i < 2; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
			npr.insereValor(pilha, valor);
		}
		
		operador = JOptionPane.showInputDialog("Digite um operador: ");
		System.out.println(npr.npr(pilha, operador));

	}

}