
public class Plano_de_Ensino {
	//atributos
	private String materia;
	private String conteudo_programatico;
	private String criterio_avaliacao;
	private String bibliografia;
	
	//contrutor padrão
	public Plano_de_Ensino() {
		//vazio
	}
	
	//construtor com valores iniciais
	public Plano_de_Ensino(String materia, String conteudo_programatico, String criterio_avaliacao, String bibliografia) {
		this.materia = materia;
		this.conteudo_programatico = conteudo_programatico;
		this.criterio_avaliacao = criterio_avaliacao;
		this.bibliografia = bibliografia;
	}
	
	//método get
	public String getMateria() {
		return materia;
	}
	
	public String getConteudo_programatico() {
		return conteudo_programatico;
	}
	
	public String getCriterio_avaliacao() {
		return criterio_avaliacao;
	}
	
	public String getBibliografia() {
		return bibliografia;
	}
	
	//métodos set
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public void setConteudo_programatico(String conteudo_programatico) {
		this.conteudo_programatico = conteudo_programatico;
	}
	
	public void setCriterio_avaliacao(String criterio_avaliacao) {
		this.criterio_avaliacao = criterio_avaliacao;
	}
	
	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}
	
	public static void main(String[] args) {
		//instância
		Plano_de_Ensino plano1 = new Plano_de_Ensino("Sistema Operacional", "Linux", "Provas e Trabalhos", "Materiais");
		
		System.out.println("Matéria: " + plano1.getConteudo_programatico());
		System.out.println("Conteúdo Programático: " + plano1.getConteudo_programatico());
		System.out.println("Critério de Avaliação: " + plano1.getCriterio_avaliacao());
		System.out.println("Bibliografia: " + plano1.getBibliografia());
	}

}
