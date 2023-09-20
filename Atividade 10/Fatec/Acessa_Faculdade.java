package Fatec;

public class Acessa_Faculdade {
	
	public static void main(String args[]) {
		Faculdade_CEETEPs ceetps = new Faculdade_CEETEPs();
		/* a variável de instância tem acesso às classes de relação de herança de hierarquia superior*/
		Disciplinas_CEETEPs disciplinas = new Disciplinas_CEETEPs();
	
		ceetps.setFatec("Fatec Baixada Santista");
		System.out.println("Fatec \t" + ceetps.getFatec());
		
		ceetps.setFaculdade("Administração e Desenvolvimento de Sistemas");
		System.out.println("Fatec \t" + ceetps.getFatec());
	
		disciplinas.setDisciplina("Programação Orientada a Objetos");
		System.out.println("disciplina \t" + disciplinas.getDisciplina());
	}
}