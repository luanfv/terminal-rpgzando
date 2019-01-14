package classes;


public class Feiticeiro extends Pericias {

	public Feiticeiro() {
		setVidaLvl(6);
		setNome("Feiticeiro");
	}
	
	public void pericia(int op1 ,int op2) {
		addPericias(op1, op2);
		System.out.println(getPericia1());
		System.out.println(getPericia2());
	}
	
	public void addPericias(int op1, int op2) {
		if(op1 == 1)
			setPericia1(lista.get(1));
		else if(op1 == 2)
			setPericia1(lista.get(4));
		else if(op1 == 3)
			setPericia1(lista.get(8));
		else if(op1 == 4)
			setPericia1(lista.get(7));
		else if(op1 == 5)
			setPericia1(lista.get(14));
		else if(op1 == 6)
			setPericia1(lista.get(16));
		
		
		
		if(op2 == 1)
			setPericia2(lista.get(1));
		else if(op2 == 2)
			setPericia2(lista.get(4));
		else if(op2 == 3)
			setPericia2(lista.get(8));
		else if(op2 == 4)
			setPericia2(lista.get(7));
		else if(op2 == 5)
			setPericia2(lista.get(14));
		else if(op2 == 6)
			setPericia2(lista.get(16));
	}

	public void listaPericias() {

		System.out.println("1-" + lista.get(1));
		System.out.println("2-" + lista.get(4));
		System.out.println("3-" + lista.get(8));
		System.out.println("4-" + lista.get(7));
		System.out.println("5-" + lista.get(14));
		System.out.println("6-" + lista.get(16));
			
	}
}
