package informações;

public class Proficiencia extends Modificador {
	
	private int proficiencia;
	
	public void proficienciaClasseLvl() {
		if(getNivel() < 5)
			setProficiencia(2);
		else if(getNivel() < 9)
			setProficiencia(3);
		else if(getNivel() < 13)
			setProficiencia(4);
		else if(getNivel() < 17)
			setProficiencia(5);
		else 
			setProficiencia(6);	
	}

	public int getProficiencia() {
		return proficiencia;
	}

	public void setProficiencia(int proficiencia) {
		this.proficiencia = proficiencia;
	}

}
