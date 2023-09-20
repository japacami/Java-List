package herança;

//Subclasse
public class Pessoa_Jurídica extends Contribuinte {
	
	private String cnpj;
	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCNPJ() {
		return(cnpj);
	}

}
