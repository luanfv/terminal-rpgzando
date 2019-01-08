package informações;


public final class Personagem extends TesteDeResistencia{
	
	private String nome;
	
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
				+ getMcarisma();
	}
	
	

	

}