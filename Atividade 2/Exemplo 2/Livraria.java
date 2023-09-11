package abstração2;

import javax.swing.JOptionPane;

import encapsulamento_1.Acesso_Numeros;
public class Livraria {
	
	String editora;
	String autor;
	String livro;
	int quantidade;
	double preco;
	
	public void Informa_Livros(int codigo) {
		
		switch(codigo) {
		
		case 1: JOptionPane.showMessageDialog(null, "CATEGORIA ROMANCE \n" + 
				"\n LIVRO: " + livro +
				"\n EDITORA: " + editora +
				"\n AUTOR: " + autor +
				"\n QUANTIDADE: " + quantidade +
				"\n PREÇO: " + preco,"", JOptionPane.PLAIN_MESSAGE); break;
		
		case 2: JOptionPane.showMessageDialog(null, "CATEGORIA ESPÍRITA \n" + 
				"\n LIVRO: " + livro +
				"\n EDITORA: " + editora +
				"\n AUTOR: " + autor +
				"\n QUANTIDADE: " + quantidade +
				"\n PREÇO: " + preco,"", JOptionPane.PLAIN_MESSAGE); break;
		
		case 3: JOptionPane.showMessageDialog(null, "CATEGORIA INFORMÁTICA \n" + 
				"\n LIVRO: " + livro +
				"\n EDITORA: " + editora +
				"\n AUTOR: " + autor +
				"\n QUANTIDADE: " + quantidade +
				"\n PREÇO: " + preco,"", JOptionPane.PLAIN_MESSAGE); break;
				
		default: System.out.println("código não corrsponde a nenhuma categoria de livro"); 
		}
	}

}





package encapsulamento_1;

public class Acesso_Numeros {
	
	int a;
	public int b;
	private int c;
	protected int d;
	
	public void setNumero(String id, int numero) {
		if (id == "a")
			this.a = numero;
		
		if (id == "b")
			this.c =numero;
		
		if (id == "d")
			this.d = numero;
	}
	
	
	public void mostra_numero() {
		System.out.println("numero a = " + a);
		System.out.println("numero b = " + b);
		System.out.println("numero c = " + c);
		System.out.println("numero d = " + d);
	}
}






package encapsulamento_1;

public class Verifica_Encapsulamento_1 {
	
	public static void main(String args []) {
		
		Acesso_Numeros chave = new Acesso_Numeros();
		
		chave.a = 10;
		chave.b = 20;
		//chave.c = 30;NÃO É POSSÍVEL ACESSAR VARIÁVEL PRIVATE DIRETAMENTE
		chave.setNumero("c", 30);
		chave.d = 40;
		chave.mostra_numero();
	}
}
