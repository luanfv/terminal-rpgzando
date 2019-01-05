package informações;

public class ClassePersonagem {
	
	private int vida, vidaLvl;
	private String nome;
	
	public ClassePersonagem() {
		
	}
	
	public ClassePersonagem(int vida, String nome, int vidaLvl) {
		this.vida += vida;
		this.nome = nome;
		this.vidaLvl = vidaLvl;
	}

	public int getVidaLvl(){
		return vidaLvl;
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
