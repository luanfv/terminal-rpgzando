package informações;

public class Modificador extends TotalAtributos{

	private int Mforca, Mdestreza, Mconstituicao, Minteligencia, Msabedoria, Mcarisma;
	
	public void addModificador() {
		
		if(getForca() == 1) 
			this.Mforca = -5;
		else if(getForca() <= 3)
			this.Mforca = -4;
		else if(getForca() <=5)
			this.Mforca = -3;
		else if(getForca() <= 7)
			this.Mforca = -2;
		else if(getForca() <= 9)
			this.Mforca = -1;
		else if(getForca() <= 11)
			this.Mforca = 0;
		else if(getForca() <= 13)
			this.Mforca = 1;
		else if(getForca() <= 15)
			this.Mforca = 2;
		else if(getForca() <= 17)
			this.Mforca = 3;
		else if(getForca() <= 19)
			this.Mforca = 4;
		else if(getForca() >=20)
			this.Mforca = 5;
		
		if(getConstituicao() == 1) 
			this.Mconstituicao = -5;
		else if(getConstituicao() <= 3)
			this.Mconstituicao = -4;
		else if(getConstituicao() <=5)
			this.Mconstituicao = -3;
		else if(getConstituicao() <= 7)
			this.Mconstituicao = -2;
		else if(getConstituicao() <= 9)
			this.Mconstituicao = -1;
		else if(getConstituicao() <= 11)
			this.Mconstituicao = 0;
		else if(getConstituicao() <= 13)
			this.Mconstituicao = 1;
		else if(getConstituicao() <= 15)
			this.Mconstituicao = 2;
		else if(getConstituicao() <= 17)
			this.Mconstituicao = 3;
		else if(getConstituicao() <= 19)
			this.Mconstituicao = 4;
		else if(getConstituicao() >=20)
			this.Mconstituicao = 5;
	
		if(getDestreza() == 1) 
			this.Mdestreza = -5;
		else if(getDestreza() <= 3)
			this.Mdestreza = -4;
		else if(getDestreza() <=5)
			this.Mdestreza = -3;
		else if(getDestreza() <= 7)
			this.Mdestreza = -2;
		else if(getDestreza() <= 9)
			this.Mdestreza = -1;
		else if(getDestreza() <= 11)
			this.Mdestreza = 0;
		else if(getDestreza() <= 13)
			this.Mdestreza = 1;
		else if(getDestreza() <= 15)
			this.Mdestreza = 2;
		else if(getDestreza() <= 17)
			this.Mdestreza = 3;
		else if(getDestreza() <= 19)
			this.Mdestreza = 4;
		else if(getDestreza() >=20)
			this.Mdestreza = 5;
		
		if(getSabedoria() == 1) 
			this.Msabedoria = -5;
		else if(getSabedoria() <= 3)
			this.Msabedoria = -4;
		else if(getSabedoria() <=5)
			this.Msabedoria = -3;
		else if(getSabedoria() <= 7)
			this.Msabedoria = -2;
		else if(getSabedoria() <= 9)
			this.Msabedoria = -1;
		else if(getSabedoria() <= 11)
			this.Msabedoria = 0;
		else if(getSabedoria() <= 13)
			this.Msabedoria = 1;
		else if(getSabedoria() <= 15)
			this.Msabedoria = 2;
		else if(getSabedoria() <= 17)
			this.Msabedoria = 3;
		else if(getSabedoria() <= 19)
			this.Msabedoria = 4;
		else if(getSabedoria() >=20)
			this.Msabedoria = 5;
		
		if(getInteligencia() == 1) 
			this.Minteligencia = -5;
		else if(getInteligencia() <= 3)
			this.Minteligencia = -4;
		else if(getInteligencia() <=5)
			this.Minteligencia = -3;
		else if(getInteligencia() <= 7)
			this.Minteligencia = -2;
		else if(getInteligencia() <= 9)
			this.Minteligencia = -1;
		else if(getInteligencia() <= 11)
			this.Minteligencia = 0;
		else if(getInteligencia() <= 13)
			this.Minteligencia = 1;
		else if(getInteligencia() <= 15)
			this.Minteligencia = 2;
		else if(getInteligencia() <= 17)
			this.Minteligencia = 3;
		else if(getInteligencia() <= 19)
			this.Minteligencia = 4;
		else if(getInteligencia() >=20)
			this.Minteligencia = 5;

		if(getCarisma() == 1) 
			this.Mcarisma = -5;
		else if(getCarisma() <= 3)
			this.Mcarisma = -4;
		else if(getCarisma() <=5)
			this.Mcarisma = -3;
		else if(getCarisma() <= 7)
			this.Mcarisma = -2;
		else if(getCarisma() <= 9)
			this.Mcarisma = -1;
		else if(getCarisma() <= 11)
			this.Mcarisma = 0;
		else if(getCarisma() <= 13)
			this.Mcarisma = 1;
		else if(getCarisma() <= 15)
			this.Mcarisma = 2;
		else if(getCarisma() <= 17)
			this.Mcarisma = 3;
		else if(getCarisma() <= 19)
			this.Mcarisma = 4;
		else if(getCarisma() >=20)
			this.Mcarisma = 5;
	}

	public int getMforca() {
		return Mforca;
	}

	public void setMforca(int mforca) {
		Mforca = mforca;
	}

	public int getMdestreza() {
		return Mdestreza;
	}

	public void setMdestreza(int mdestreza) {
		Mdestreza = mdestreza;
	}

	public int getMconstituicao() {
		return Mconstituicao;
	}

	public void setMconstituicao(int mconstituicao) {
		Mconstituicao = mconstituicao;
	}

	public int getMinteligencia() {
		return Minteligencia;
	}

	public void setMinteligencia(int minteligencia) {
		Minteligencia = minteligencia;
	}

	public int getMsabedoria() {
		return Msabedoria;
	}

	public void setMsabedoria(int msabedoria) {
		Msabedoria = msabedoria;
	}

	public int getMcarisma() {
		return Mcarisma;
	}

	public void setMcarisma(int mcarisma) {
		Mcarisma = mcarisma;
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