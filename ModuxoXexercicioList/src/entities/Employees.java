package entities;

public class Employees {
	
	public  int idEmployee;
	public   String name;
	private  double salary;
	
	public Employees(int idEmployee, String name, double salary) {
		this.idEmployee = idEmployee;
		this.name = name;
		this.salary = salary;
	}
		
	
	public Employees() {
		// TODO Auto-generated constructor stub
	}

	public void UpdateSalay(double percent) {
		salary = salary * ((percent / 100) + 1);
	}

	public String toString() {
		return idEmployee + ", "+ name + ", "+ String.format("%.2f", salary);
	}

}
