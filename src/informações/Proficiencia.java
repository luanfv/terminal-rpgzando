package informações;

public class Proficiencia {
	
	private int proficiencia;
	private String classe;
	private Personagem personagem;
	
	public int getProficiencia() {
		return proficiencia;
	}

	private void setProficiencia(int proficiencia) {
		this.proficiencia = proficiencia;
	}
	
	public String getClasse() {
		return classe;
	}
	
	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public Proficiencia(Personagem personagem) {
		this.personagem = personagem;
	}
	
	public void proficienciaClasseLvl() {
		if(personagem.getNivel() < 5)
			setProficiencia(2);
		else if(personagem.getNivel() < 9)
			setProficiencia(3);
		else if(personagem.getNivel() < 13)
			setProficiencia(4);
		else if(personagem.getNivel() < 17)
			setProficiencia(5);
		else 
			setProficiencia(6);	
	}
	
	

}
