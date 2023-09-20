package herança;

// Superclasse
public class Funcionário extends Pessoa_Física {
	
	private String cartao;
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	
	public String getCartao() {
		return(cartao);
	}

}
