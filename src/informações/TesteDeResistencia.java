package informações;

public class TesteDeResistencia extends Proficiencia {
	
	private int resistenciaForca, resistenciaDestreza, resistenciaConstituicao, resistenciaInteligencia, resistenciaSabedoria, resistenciaCarisma;
	
	public void addTesteResistencia() {
		
		setResistenciaForca(getMforca());
		setResistenciaDestreza(getMdestreza());
		setResistenciaConstituicao(getMconstituicao());
		setResistenciaInteligencia(getMinteligencia());
		setResistenciaSabedoria(getMsabedoria());
		setResistenciaCarisma(getMcarisma());
		
		if(getClasseNome() == "Barbaro") {
			setResistenciaForca(getProficiencia());
			setResistenciaConstituicao(getProficiencia());
		}
		else if(getClasseNome() == "Bardo") {
			setResistenciaDestreza(getProficiencia());
			setResistenciaCarisma(getProficiencia());
		}
		else if(getClasseNome() == "Bruxo") {
			setResistenciaSabedoria(getProficiencia());
			setResistenciaCarisma(getProficiencia());
		}
		else if(getClasseNome() == "Clerigo") {
			setResistenciaSabedoria(getProficiencia());
			setResistenciaCarisma(getProficiencia());
		}
		else if(getClasseNome() == "Druida") {
			setResistenciaInteligencia(getProficiencia());
			setResistenciaSabedoria(getProficiencia());
		}
		else if(getClasseNome() == "Feiticeiro") {
			setResistenciaConstituicao(getProficiencia());
			setResistenciaCarisma(getProficiencia());
		}
		else if(getClasseNome() == "Guerreiro") {
			setResistenciaForca(getProficiencia());
			setResistenciaConstituicao(getProficiencia());
		}
		else if(getClasseNome() == "Ladino") {
			setResistenciaDestreza(getProficiencia());
			setResistenciaInteligencia(getProficiencia());
		}
		else if(getClasseNome() == "Mago") {
			setResistenciaInteligencia(getProficiencia());
			setResistenciaSabedoria(getProficiencia());
		}
		else if(getClasseNome() == "Monge") {
			setResistenciaForca(getProficiencia());
			setResistenciaDestreza(getProficiencia());
		}
		else if(getClasseNome() == "Paladino") {
			setResistenciaSabedoria(getProficiencia());
			setResistenciaCarisma(getProficiencia());
		}
		else if(getClasseNome() == "Patrulheiro") {
			setResistenciaForca(getProficiencia());
			setResistenciaDestreza(getProficiencia());
		}
		
	}

	public int getResistenciaForca() {
		return resistenciaForca;
	}

	public void setResistenciaForca(int resistenciaForca) {
		this.resistenciaForca += resistenciaForca;
	}

	public int getResistenciaDestreza() {
		return resistenciaDestreza;
	}

	public void setResistenciaDestreza(int resistenciaDestreza) {
		this.resistenciaDestreza += resistenciaDestreza;
	}

	public int getResistenciaConstituicao() {
		return resistenciaConstituicao;
	}

	public void setResistenciaConstituicao(int resistenciaConstituicao) {
		this.resistenciaConstituicao += resistenciaConstituicao;
	}

	public int getResistenciaInteligencia() {
		return resistenciaInteligencia;
	}

	public void setResistenciaInteligencia(int resistenciaInteligencia) {
		this.resistenciaInteligencia += resistenciaInteligencia;
	}

	public int getResistenciaSabedoria() {
		return resistenciaSabedoria;
	}

	public void setResistenciaSabedoria(int resistenciaSabedoria) {
		this.resistenciaSabedoria += resistenciaSabedoria;
	}

	public int getResistenciaCarisma() {
		return resistenciaCarisma;
	}

	public void setResistenciaCarisma(int resistenciaCarisma) {
		this.resistenciaCarisma += resistenciaCarisma;
	}

	public String toStringResistencia() {
		return "TESTE DE RESISTENCIA"
				+ "%n%nForça: "
				+ getResistenciaForca()
				+ "%nDestreza: "
				+ getResistenciaDestreza()
				+ "%nConstituição: "
				+ getResistenciaConstituicao()
				+ "%nInteligenca: "
				+ getResistenciaInteligencia()
				+ "%nSabedoria: "
				+ getResistenciaSabedoria()
				+ "%nCarisma: "
				+ getResistenciaCarisma();
		
	}
	
}
