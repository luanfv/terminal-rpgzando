package dados;

import java.util.Random;

public class D4 {
	
	private int dado;
		
	public D4() {
		Random numero = new Random();
		dado = numero.nextInt(5);
		while(dado == 0)
			dado = numero.nextInt(5);
	}
	
	public int getD4() {
		return this.dado;
	}
}
