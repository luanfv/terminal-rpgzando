package dados;

import java.util.Random;

public class D12 {
	
	private int dado;
	
	public D12() {
		Random numero = new Random();
		dado = numero.nextInt(13);
		while(dado == 0)
			dado = numero.nextInt(13);
	}
	
	public int getD12() {
		return this.dado;
	}
}
