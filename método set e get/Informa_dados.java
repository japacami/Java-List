package atributos_privados;

public class Informa_dados {
	public static void main (String [] args) {
		Dados_Contribuinte a = new Dados_Contribuinte();
		a.setNome("Daniela Bento");
		a.setCPF("065.887.443-54");
		a.setCNPJ("776 998 /0001");
		a.setcartao("9776-J");
		
		System.out.println("nome do contribuinte " + a.getNome());
		System.out.println("CPF do contribuinte " + a.getCPF());
		System.out.println("CNPJ do contribuinte " + a.getCNPJ());
		System.out.println("cartão do contribuinte " + a.getcartao());
	}

}
