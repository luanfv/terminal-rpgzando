package dados;

import java.util.Random;

public class D20 {

	private int dado;
	
	public D20() {
		Random numero = new Random();
		dado = numero.nextInt(21);
		while(dado == 0)
			dado = numero.nextInt(21);
	}
	
	public int getD20() {
		return this.dado;
	}
}
