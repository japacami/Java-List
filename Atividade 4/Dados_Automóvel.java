package classe3;

import javax.swing.JOptionPane;

public class Dados_Automóvel {
public static void main(String args[]) {
	
	//variável de instância
	Automóvel a = new Automóvel();
	
	String md, pr;
	double pc;
	
	md = JOptionPane.showInputDialog("digitar o modelo");
	pr = JOptionPane.showInputDialog("digitar o preço");
	pc = Double.parseDouble(pr);
	
	a.set_modelo(md);
	a.set_preço(pc);
	
	System.out.println("modelo: " + a.get_modelo());
	System.out.println("preço R$ " + a.get_preço());
	
}

}
