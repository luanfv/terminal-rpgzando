package raça;

public class ElfoAlto extends Elfo {

	private String nome = "Elfo Alto";
	
	public String getNome() {
		return nome;
	}

	public void addElfoAlto() {
		addElfo();
		setInteligencia(getInteligencia() + 1);
	}
	
	public String toString() {
		return getNome() + "%nINT: +" + (getInteligencia() + 1);
	}

}
