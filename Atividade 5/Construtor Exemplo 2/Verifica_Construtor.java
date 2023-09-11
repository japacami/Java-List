package Construtor;

public class Verifica_Construtor {
	public static void main(String args[]) {
		Hotel a = new Hotel();
		Hotel b = new Hotel("Nova Cidade", 220.88);
		
		System.out.println("NOME DO HOTEL: " + a.get_nome());
		System.out.println("PREÇO DA DIÁRIA R$ " + a.get_preço());
		System.out.println("NOME DO HOTEL: " + b.get_nome());
		System.out.println("PREÇO DA DIÁRIA R$ " + b.get_preço());
	}

}
