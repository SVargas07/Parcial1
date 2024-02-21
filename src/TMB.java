
public class TMB {

	
	private double peso;
	private double altura;
	private int edad;
	

	
	public TMB (double paramPeso, double paramAltura, int paramEdad)
	
	{
		this.peso = paramPeso;
		this.altura =paramAltura;
		this.edad =paramEdad;
		
	}
	
	
	public double calcularTMBHombre() 
	{
        return 88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * edad);
	}
	
	public double calcularTMBmujer() {
        return 447.593 + (9.247 * peso) + (3.098 * altura) - (4.33 * edad);
    }
}



