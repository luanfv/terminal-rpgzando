package classes;


public class Ladino extends Pericias {
	
	public Ladino() {
		setVidaLvl(8);
		setNome("Ladino");
	}
	
	public void pericia(int op1 ,int op2 ,int op3,int op4) {
		addPericias(op1, op2, op3, op4);
		System.out.println(getPericia1());
		System.out.println(getPericia2());
		System.out.println(getPericia3());
		System.out.println(getPericia4());
	}

	public void addPericias(int op1, int op2, int op3, int op4) {
		if(op1 == 1)
			setPericia1(lista.get(0));
		else if(op1 == 2)
			setPericia1(lista.get(2));
		else if(op1 == 3)
			setPericia1(lista.get(3));
		else if(op1 == 4)
			setPericia1(lista.get(4));
		else if(op1 == 5)
			setPericia1(lista.get(5));
		else if(op1 == 6)
			setPericia1(lista.get(7));
		else if(op1 == 7)
			setPericia1(lista.get(8));
		else if(op1 == 8)
			setPericia1(lista.get(9));
		else if(op1 == 9)
			setPericia1(lista.get(13));
		else if(op1 == 10)
			setPericia1(lista.get(14));
		else if(op1 == 11)
			setPericia1(lista.get(15));
		
		
		
		if(op1 == 2)
			setPericia2(lista.get(0));
		else if(op1 == 2)
			setPericia2(lista.get(2));
		else if(op2 == 3)
			setPericia2(lista.get(3));
		else if(op2 == 4)
			setPericia2(lista.get(4));
		else if(op2 == 5)
			setPericia2(lista.get(5));
		else if(op2 == 6)
			setPericia2(lista.get(7));
		else if(op2 == 7)
			setPericia2(lista.get(8));
		else if(op2 == 8)
			setPericia2(lista.get(9));
		else if(op2 == 9)
			setPericia2(lista.get(13));
		else if(op2 == 10)
			setPericia2(lista.get(14));
		else if(op2 == 11)
			setPericia2(lista.get(15));
		
		
		
		if(op3 == 1)
			setPericia3(lista.get(0));
		else if(op3 == 2)
			setPericia3(lista.get(2));
		else if(op3 == 3)
			setPericia3(lista.get(3));
		else if(op3 == 4)
			setPericia3(lista.get(4));
		else if(op3 == 5)
			setPericia3(lista.get(5));
		else if(op3 == 6)
			setPericia3(lista.get(7));
		else if(op3 == 7)
			setPericia3(lista.get(8));
		else if(op3 == 8)
			setPericia3(lista.get(9));
		else if(op3 == 9)
			setPericia3(lista.get(13));
		else if(op3 == 10)
			setPericia3(lista.get(14));
		else if(op3 == 11)
			setPericia3(lista.get(15));
		
		
		
		if(op4 == 1)
			setPericia4(lista.get(0));
		else if(op4 == 2)
			setPericia4(lista.get(2));
		else if(op4 == 3)
			setPericia4(lista.get(3));
		else if(op4 == 4)
			setPericia4(lista.get(4));
		else if(op4 == 5)
			setPericia4(lista.get(5));
		else if(op4 == 6)
			setPericia4(lista.get(7));
		else if(op4 == 7)
			setPericia4(lista.get(8));
		else if(op4 == 8)
			setPericia4(lista.get(9));
		else if(op4 == 9)
			setPericia4(lista.get(13));
		else if(op4 == 10)
			setPericia4(lista.get(14));
		else if(op4 == 11)
			setPericia4(lista.get(15));
	}

	public void listaPericias() {

		System.out.println("1-" + lista.get(0));
		System.out.println("2-" + lista.get(2));
		System.out.println("3-" + lista.get(3));
		System.out.println("4-" + lista.get(4));
		System.out.println("5-" + lista.get(5));
		System.out.println("6-" + lista.get(7));
		System.out.println("7-" + lista.get(8));
		System.out.println("8-" + lista.get(9));
		System.out.println("9-" + lista.get(13));
		System.out.println("10-" + lista.get(14));
		System.out.println("11-" + lista.get(15));
			
	}
	
}
