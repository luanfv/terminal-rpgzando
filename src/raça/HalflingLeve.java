package raça;

public class HalflingLeve extends Halfling {

	private String nome = "Halfling Pés Leves";

	public String getNome(){
		return nome;
	}
	
	public void addHalflingLeve() {
		addHalfling();
		setCarisma(getCarisma() + 1);
	}

	public String toString() {
		return getNome() + "%nCAR: +" + (getCarisma() + 1);
	}
}
