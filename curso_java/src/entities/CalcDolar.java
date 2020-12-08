package entities;

public class CalcDolar {
	
	
	public static final double IOF = 1.06;
		
	
	public static double calculaCotacao(double valorDolar, int qtdDolar) {
		return (valorDolar * qtdDolar) * IOF;
	}
}
