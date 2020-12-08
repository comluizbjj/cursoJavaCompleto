import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int qtdEmployees = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		List<Employees> list = new ArrayList<>();		
		
		for(int cont=1; cont <= qtdEmployees; cont++) {
			
			System.out.println("Employee #" + cont);
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			System.out.println(" ");
			
			list.add( new Employees(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase :");
		int idPlus = sc.nextInt();
		
		Employees dados= list.stream().filter(x -> x.idEmployee == idPlus).findFirst().orElse(null);
		
		if(dados == null) {
			System.out.println("This id does not exist!");
			System.out.println();
			
		}else {
			System.out.print("Enter the percentage:");
			double percent = sc.nextDouble();
			sc.nextLine();
			dados.UpdateSalay(percent);
			System.out.println();
		}
		
		System.out.println("List of employees:");
		for(Employees x : list) {
			
			System.out.println(x);
		}
		
		sc.close();	
	}

}
