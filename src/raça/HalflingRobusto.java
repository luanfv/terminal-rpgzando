package raça;

public class HalflingRobusto extends Halfling {

	private String nome = "Halfling Robusto";
	
	public String getNome(){
		return nome;
	}
	
	public void addHalflingRobusto() {
		addHalfling();
		setConstituicao(getConstituicao() + 1);
	}
	
	public String toString() {
		return getNome() + "%nCON: +" + (getConstituicao() + 1);
	}


}
