package informações;

public class Modificador {
	
	Personagem personagem = new Personagem();
	private int forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	
	public Modificador() {
		
		if(personagem.getForca() == 1) 
			this.forca = -5;
		else if(personagem.getForca() <= 3)
			this.forca = -4;
		else if(personagem.getForca() <=5)
			this.forca = -3;
		else if(personagem.getForca() <= 7)
			this.forca = -2;
		else if(personagem.getForca() <= 9)
			this.forca = -1;
		else if(personagem.getForca() <= 11)
			this.forca = 0;
		else if(personagem.getForca() <= 13)
			this.forca = 1;
		else if(personagem.getForca() <= 15)
			this.forca = 2;
		else if(personagem.getForca() <= 17)
			this.forca = 3;
		else if(personagem.getForca() <= 19)
			this.forca = 4;
		else if(personagem.getForca() >=20)
			this.forca = 5;
		
		if(personagem.getConstituicao() == 1) 
			this.constituicao = -5;
		else if(personagem.getConstituicao() <= 3)
			this.constituicao = -4;
		else if(personagem.getConstituicao() <=5)
			this.constituicao = -3;
		else if(personagem.getConstituicao() <= 7)
			this.constituicao = -2;
		else if(personagem.getConstituicao() <= 9)
			this.constituicao = -1;
		else if(personagem.getConstituicao() <= 11)
			this.constituicao = 0;
		else if(personagem.getConstituicao() <= 13)
			this.constituicao = 1;
		else if(personagem.getConstituicao() <= 15)
			this.constituicao = 2;
		else if(personagem.getConstituicao() <= 17)
			this.constituicao = 3;
		else if(personagem.getConstituicao() <= 19)
			this.constituicao = 4;
		else if(personagem.getConstituicao() >=20)
			this.constituicao = 5;
	
		if(personagem.getDestreza() == 1) 
			this.destreza = -5;
		else if(personagem.getDestreza() <= 3)
			this.destreza = -4;
		else if(personagem.getDestreza() <=5)
			this.destreza = -3;
		else if(personagem.getDestreza() <= 7)
			this.destreza = -2;
		else if(personagem.getDestreza() <= 9)
			this.destreza = -1;
		else if(personagem.getDestreza() <= 11)
			this.destreza = 0;
		else if(personagem.getDestreza() <= 13)
			this.destreza = 1;
		else if(personagem.getDestreza() <= 15)
			this.destreza = 2;
		else if(personagem.getDestreza() <= 17)
			this.destreza = 3;
		else if(personagem.getDestreza() <= 19)
			this.destreza = 4;
		else if(personagem.getDestreza() >=20)
			this.destreza = 5;
		
		if(personagem.getSabedoria() == 1) 
			this.sabedoria = -5;
		else if(personagem.getSabedoria() <= 3)
			this.sabedoria = -4;
		else if(personagem.getSabedoria() <=5)
			this.sabedoria = -3;
		else if(personagem.getSabedoria() <= 7)
			this.sabedoria = -2;
		else if(personagem.getSabedoria() <= 9)
			this.sabedoria = -1;
		else if(personagem.getSabedoria() <= 11)
			this.sabedoria = 0;
		else if(personagem.getSabedoria() <= 13)
			this.sabedoria = 1;
		else if(personagem.getSabedoria() <= 15)
			this.sabedoria = 2;
		else if(personagem.getSabedoria() <= 17)
			this.sabedoria = 3;
		else if(personagem.getSabedoria() <= 19)
			this.sabedoria = 4;
		else if(personagem.getSabedoria() >=20)
			this.sabedoria = 5;
		
		if(personagem.getInteligencia() == 1) 
			this.inteligencia = -5;
		else if(personagem.getInteligencia() <= 3)
			this.inteligencia = -4;
		else if(personagem.getInteligencia() <=5)
			this.inteligencia = -3;
		else if(personagem.getInteligencia() <= 7)
			this.inteligencia = -2;
		else if(personagem.getInteligencia() <= 9)
			this.inteligencia = -1;
		else if(personagem.getInteligencia() <= 11)
			this.inteligencia = 0;
		else if(personagem.getInteligencia() <= 13)
			this.inteligencia = 1;
		else if(personagem.getInteligencia() <= 15)
			this.inteligencia = 2;
		else if(personagem.getInteligencia() <= 17)
			this.inteligencia = 3;
		else if(personagem.getInteligencia() <= 19)
			this.inteligencia = 4;
		else if(personagem.getInteligencia() >=20)
			this.inteligencia = 5;

		if(personagem.getCarisma() == 1) 
			this.carisma = -5;
		else if(personagem.getCarisma() <= 3)
			this.carisma = -4;
		else if(personagem.getCarisma() <=5)
			this.carisma = -3;
		else if(personagem.getCarisma() <= 7)
			this.carisma = -2;
		else if(personagem.getCarisma() <= 9)
			this.carisma = -1;
		else if(personagem.getCarisma() <= 11)
			this.carisma = 0;
		else if(personagem.getCarisma() <= 13)
			this.carisma = 1;
		else if(personagem.getCarisma() <= 15)
			this.carisma = 2;
		else if(personagem.getCarisma() <= 17)
			this.carisma = 3;
		else if(personagem.getCarisma() <= 19)
			this.carisma = 4;
		else if(personagem.getCarisma() >=20)
			this.carisma = 5;
	}

	public int getForca() {
		return forca;
	}

	private void setForca(int forca) {
		this.forca = forca;
	}

	public int getDestreza() {
		return destreza;
	}

	private void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	private void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getSabedoria() {
		return sabedoria;
	}

	private void setSabedoria(int sabedoria) {
		this.sabedoria = sabedoria;
	}

	public int getConstituicao() {
		return constituicao;
	}

	private void setConstituicao(int constituicao) {
		this.constituicao = constituicao;
	}

	public int getCarisma() {
		return carisma;
	}

	private void setCarisma(int carisma) {
		this.carisma = carisma;
	}
	
	public String toString() {
		return "%nFOR: "
				+ getForca()
				+ "%nDES: "
				+ getDestreza()
				+ "%nCON: "
				+ getConstituicao()
				+ "%nINT: "
				+ getInteligencia()
				+ "%nSAB: "
				+ getSabedoria()
				+ "%nCAR: "
				+ getCarisma();
	}

}
