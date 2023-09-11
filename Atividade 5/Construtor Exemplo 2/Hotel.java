package Construtor;

public class Hotel {
	//atributos
	private String nome;
	private double preço;
	
	/* método construtor recebe o nome de classe */
	
	Hotel () {
		System.out.println("o método construtor inicializa os atributos com o valor default");
	}
	
	Hotel (String nome, double preço){
		this.nome = nome;
		this.preço = preço;
	}
	
	public String get_nome() {
		return nome;
	}
	
	public double get_preço() {
		return preço;
	}

}
