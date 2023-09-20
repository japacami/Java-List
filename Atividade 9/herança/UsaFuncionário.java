package herança;

import javax.swing.JOptionPane;

// Subclasse
public class UsaFuncionário {
	
	public static void main (String args[]) {
		//objetos
		Funcionário funcionário = new Funcionário();
		Pessoa_Jurídica func = new Pessoa_Jurídica();
		
		String u,v,t,z;
		int x;
		
		z = JOptionPane.showInputDialog("digite 1 se contribuinte é pessoa física \n digite 2 se é pessoa jurídica");
		//conversão de string para flutuante:
		x = Integer.parseInt(z);
		if (z.length()==1) {
			switch (x) {
			case 1: {
				u = JOptionPane.showInputDialog("escrever o nome do contribuinte: ");
				v = JOptionPane.showInputDialog("escrever o RG do contribuinte: ");
				t = JOptionPane.showInputDialog("escrever a identificação do cartão do contribuinte: ");
				
				funcionário.setNome(u);
				funcionário.setRG(v);
				funcionário.setCartao(t);
				System.out.println("NOME: " + funcionário.getNome());
				System.out.println("CNPJ: " + func.getCNPJ());
				System.out.println("CARTÃO: " + funcionário.getCartao());
				break;
			    }
			
			case 2: {
				u = JOptionPane.showInputDialog("escrever o nome do contribuinte: ");
				v = JOptionPane.showInputDialog("escrever o CNPJ do contribuinte: ");
				t = JOptionPane.showInputDialog("escrever a identificação do cartão do contribuinte: ");
				
				funcionário.setNome(u);
				func.setCNPJ(v);
				funcionário.setCartao(t);
				System.out.println("NOME: " + funcionário.getNome());
				System.out.println("CNPJ: " + func.getCNPJ());
				System.out.println("CARTÃO: " + funcionário.getCartao());
				break; 
				}
			} //switch
		} //if
	} //void main

}
