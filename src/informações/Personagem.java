package informações;


public final class Personagem extends PericiasPersonagem {
	
	private String nome;
	
	public void att() {
		addPericias();
		proficienciaClasseLvl();
		addTesteResistencia();
		addModificador();
		addPericias();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString(){
		return "Nome: "
				+ getNome()
				+ "%nNivel: "
				+ getNivel()
				+ "%nRaça: "
				+ getRacaNome()
				+ "%nClasse: "
				+ getClasseNome()
				+ "%nHP: "
				+ getHp()
				+ "%nForça: "
				+ getForca()
				+ " +"
				+ getMforca()
				+ "%nDestreza: "
				+ getDestreza()
				+ " +"
				+ getMdestreza()
				+ "%nConstituição: "
				+ getConstituicao()
				+ " +"
				+ getMconstituicao()
				+ "%nInteligencia: "
				+ getInteligencia()
				+ " +"
				+ getMinteligencia()
				+ "%nSabedoria: "
				+ getSabedoria()
				+ " +"
				+ getMsabedoria()
				+ "%nCarisma: "
				+ getCarisma()
				+ " +"
				+ getMcarisma()
				+ "%n";
	}

}