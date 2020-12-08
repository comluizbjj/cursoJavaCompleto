import java.util.Scanner;
import entities.CalcDolar;
import entities.Conta;


public class Main {

	public static void main(String[] args) {
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
		
		
		
		/*
		System.out.print("Qual � a cota��o do d�lar atual: ");
		double valorCotacao = sc.nextDouble();
		System.out.print("Qual a quantidade de d�lares deseja comprar? ");
		int qtdDolares = sc.nextInt();
		
		double valorTotal = CalcDolar.calculaCotacao(valorCotacao,qtdDolares);
		
		System.out.printf("Valor total em reais  = : %.2f%n", valorTotal);
		*/
		
		
		/*
		System.out.print("Enter account number: ");
		int numConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char flagDeposito = sc.next().charAt(0);
		
		double valor=0;
		
		if(flagDeposito == 'y') {
			System.out.print("Enter initial deposit value: ");
			valor = sc.nextDouble();
		}
				
		Conta dados = new Conta(numConta, nome, valor);
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(dados);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		dados.addSaldoConta(deposito);
		System.out.println("Updated account data:");
		System.out.println(dados);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double retirada = sc.nextDouble();
		dados.removeSaldoConta(retirada);
		System.out.println("Updated account data:");
		System.out.println(dados);
		System.out.println();
		
		*/
		
		sc.close();
	}

}
