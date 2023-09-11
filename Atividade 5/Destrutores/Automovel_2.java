import java.text.*;

public class Automovel_2 {
	
	private static int ano;
	String marca;
	String modelo;
	String cor;
	private static double preco;
	
	NumberFormat nf = NumberFormat.getNumberInstance();
	
	Automovel_2(int ano, String marca, double preco)
	/* parâmetros dos atributos com os mesmos nomes: usa-se a referência this */
	{
		this.ano = ano;
		this.marca = marca;
		modelo = "Scort";
		cor = "amarelo";
		this.preco = preco;
	}
	public static double atualizaPreco(double valor) {
		return preco = (valor* ano / 1988);
	}
	
	public void mostracaroo () {
		System.out.println("\n" + "carro marca" + "\t" + marca + "\n" + "modelo" + "\t" + modelo + "\n" + "ano" + "\t" + ano + "\n" + "cor" + "\t" + cor + "\n" + "preco" + "\t" + nf.format(atualizaPreco(7654.77)));
	}
}