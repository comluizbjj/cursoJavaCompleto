import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int qtdQuartos = sc.nextInt();
		sc.nextLine();
		System.out.println(" ");
		
		Quartos[] vect = new Quartos[10];
		
		for(int cont=1; cont <= qtdQuartos; cont++) {
			
			System.out.println("Rent #" + cont);
			
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			System.out.println(" ");
			
			vect[quarto] = new Quartos(nome,email,quarto);
		}
		
		
		System.out.println("Busy rooms:");
		
		for (int cont = 0; cont < vect.length; cont++) {
			
			if (vect[cont] != null) {
				System.out.println(vect[cont]);
			}	
		}		
		
		sc.close();		

	}

}
