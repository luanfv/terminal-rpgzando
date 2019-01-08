package informações;

public class RacaPersonagem extends Atributos {

	private String racaNome;

	public void addRaca(String nome, int forca, int destreza, int constituicao, int inteligencia, int sabedoria,
			int carisma) {
		setRacaNome(nome);
		setForca(forca);
		setDestreza(destreza);
		setConstituicao(constituicao);
		setInteligencia(inteligencia);
		setSabedoria(sabedoria);
		setCarisma(carisma);
	}

	public String getRacaNome() {
		return racaNome;
	}

	public void setRacaNome(String nome) {
		this.racaNome = nome;
	}

	@Override
	public String toString() {
		return "RacaPersonagem [racaNome=" + racaNome + "]";
	}

}
