package dados;

import java.util.Random;

public class D100 {
	
	private int dado;
	
	public D100() {
		Random numero = new Random();
		dado = numero.nextInt(11);
		while(dado == 0)
			dado = numero.nextInt(11);
		
		dado *= 10;
	}
	
	public int getD100() {
		return this.dado;
	}
}
