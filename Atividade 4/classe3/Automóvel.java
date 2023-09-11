package classe3;

public class Automóvel {
	
	//atributos
	private String modelo;
	private double preço;
	
	//métodos set
	public void set_modelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void set_preço(double preço) {
		this.preço = preço;
	}
	
	//método get
	public String get_modelo() {
		return modelo;
	}
	
	public double get_preço() {
		return preço;
	}

}
