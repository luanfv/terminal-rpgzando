package classes;

public class ClassePersonagem {
	
	private int vida;
	private String nome;
	
	public ClassePersonagem() {
		
	}
	
	public ClassePersonagem(int vida, String nome) {
		this.vida += vida;
		this.nome = nome;
	}


	public int getVida() {
		return vida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "Classe: "
				+ getNome()
				+ "%nHP: "
				+ getVida();
	}
	
}
