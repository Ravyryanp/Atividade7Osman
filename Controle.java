package Controle;

import Modelagem.Modelagem;

public class Controle {
	 {
		    private Modelagem Modelagem;
		    private Visao visao;

		    public Controle() {
		        this.modelagem = new modelagem();
		        this.visao = new Visao();
		    }

		    public void executar() {
		        int[] numeros = visao.solicitarNumeros();
		        for (int i = 0; i < 10; i++) {
		            modelo.setNumero(i, numeros[i]);
		        }

		        modelo.bubbleSort();

		        visao.mostrarNumeros(modelo.getNumeros());
		    }

		    public static void main(String[] args) {
		        Controle controle = new Controle();
		        controle.executar();
		    }
	 }
}
