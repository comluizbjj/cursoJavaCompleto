package Aplication;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int linhas = sc.nextInt();
		int colunas = sc.nextInt();
		
		int [][]matriz = new int[linhas][colunas];
		
		for(int cont=0;cont < matriz.length;cont++) {
			for(int cont2=0; cont2 < matriz[cont].length;cont2++) {
				matriz[cont][cont2] = sc.nextInt();
			}
		}
		
		int procura = sc.nextInt();
		
		for(int cont=0;cont < matriz.length;cont++) {
			for(int cont2=0; cont2 < matriz[cont].length;cont2++) {
				if (procura == matriz[cont][cont2]) {
					
					System.out.println("Position "+cont+","+cont2+":");
					
					//....ESQUERDA
					int auxLinha = cont2 - 1;
					if (auxLinha >= 0) {
						System.out.println("Left: "+matriz[cont][auxLinha]);
					}
					
					//....DIREITA
					auxLinha = cont2 + 1;
					if (auxLinha <  matriz[cont].length) {
						System.out.println("Right: "+matriz[cont][auxLinha]);
					}
					
					//....UP
					int auxColuna = cont - 1;
					if (auxColuna >= 0) {
						System.out.println("Up: "+matriz[auxColuna][cont2]);
					}
					
					//....DOWN
					auxColuna = cont + 1;
					if (auxColuna < matriz.length) {
						System.out.println("Down: "+matriz[auxColuna][cont2]);
					}
					
				}
			}
		}
		
		
		
		
		sc.close();	
	}

}
