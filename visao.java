package Visao;

import java.util.Scanner;

public class visao {
	
	public void exibirNumeros(int[] numeros) {
		Scanner in = new Scanner(System.in);
		int x[] =  new int[5];
		int n,i,aux;
		for(i=0;i<=4;i++){
			System.out.println("Digite o " + (i+1 + "o número:"));
				x[i]= in.nextInt();
		}
	}
}
