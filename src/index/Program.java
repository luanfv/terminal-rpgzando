package index;

import java.util.Locale;
import java.util.Scanner;

import raça.Anao;
import raça.AnaoColina;
import raça.AnaoMontanha;
import raça.Draconato;
import raça.Elfo;
import raça.ElfoAlto;
import raça.ElfoFloresta;
import raça.ElfoNegro;
import raça.Gnomo;
import raça.GnomoFloresta;
import raça.GnomoPedra;
import raça.Halfling;
import raça.HalflingLeve;
import raça.HalflingRobusto;
import raça.Humano;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Anao anao = new Anao();
		AnaoColina anaoColina = new AnaoColina();
		AnaoMontanha anaoMontanha = new AnaoMontanha();
		Elfo elfo = new Elfo();
		ElfoAlto elfoAlto = new ElfoAlto();
		ElfoFloresta elfoFloresta = new ElfoFloresta();
		ElfoNegro elfoNegro = new ElfoNegro();
		Draconato draconato = new Draconato();
		Gnomo gnomo = new Gnomo();
		GnomoFloresta gnomoFloresta = new GnomoFloresta();
		GnomoPedra gnomoPedra = new GnomoPedra();
		Halfling halfling = new Halfling();
		HalflingLeve halflingLeve = new HalflingLeve();
		HalflingRobusto halflingRobusto = new HalflingRobusto();
		Humano humano = new Humano();
		
		
		byte escolha;
		
		do {
			System.out.println("ESCOLHA UMA RAÇA");
			EscolhaRacas();
			escolha = sc.nextByte();
			while(escolha > 6)
				escolha = sc.nextByte();
			
			Tracos();
			
			if(escolha == 1) {
				System.out.printf(anao.toString());
				
				Tracos();
				
				System.out.printf(anaoColina.toString());
				
				Tracos();
				
				System.out.printf(anaoMontanha.toString());
				
				Tracos();
				
				EscolhasAnoes();
				Volta();
				
				escolha = sc.nextByte();
			}
			else if(escolha == 2) {
				System.out.printf(draconato.toString());
				
				Tracos();
				
				RacaUnica();
				Volta();
				escolha = sc.nextByte();
			}
			else if(escolha == 3) {
				System.out.printf(elfo.toString());
				
				Tracos();
				
				System.out.printf(elfoAlto.toString());
				
				Tracos();
				
				System.out.printf(elfoFloresta.toString());
				
				Tracos();
				
				System.out.printf(elfoNegro.toString());
				
				Tracos();
				
				EscolhasElfos();
				Volta();
				escolha = sc.nextByte();
			}
			else if(escolha == 4) {
				System.out.printf(gnomo.toString());
				
				Tracos();
				
				System.out.printf(gnomoFloresta.toString());
				
				Tracos();
				
				System.out.printf(gnomoPedra.toString());
				
				Tracos();
				
				EscolhasGnomos();
				Volta();
				escolha = sc.nextByte();
			}
			else if(escolha == 5) {
				System.out.printf(halfling.toString());
				
				Tracos();
				
				System.out.printf(halflingLeve.toString());
				
				Tracos();
				
				System.out.printf(halflingRobusto.toString());
				
				Tracos();
				
				EscolhasHalflings();
				Volta();
				escolha = sc.nextByte();
			}
			else if(escolha == 6) {
				System.out.printf(humano.toString());
				
				Tracos();
				
				RacaUnica();
				Volta();
				escolha = sc.nextByte();
			}
		} while(escolha==0);
		
		
		
		
		
		
		
		sc.close();
	}
	
	public static void Tracos(){
		System.out.printf("%n-----------------------------------------%n%n");
	}
	
	public static void EscolhaRacas() {
		System.out.printf("1-Anão%n2-Draconato%n3-Elfo%n4-Gnomo%n5-Halfling%n6-Humano%n");
	}
	
	public static void EscolhasAnoes() {
		System.out.printf("1-Anões da Coluna%n2-Anões da Montanha%n");
	}
	
	public static void EscolhasElfos() {
		System.out.printf("1-Elfos Altos%n2-Elfos da Floresta%n3-Elfos Negros%n");
	}
	
	public static void EscolhasGnomos() {
		System.out.printf("1-Gnomos da Floresta%n2-Gnomos da Pedra%n");
	}
	
	public static void EscolhasHalflings() {
		System.out.printf("1-Halflings Pés Leves%n2-Halflings Robusto%n");
	}
	
	public static void Volta() {
		System.out.println("0-Volta");
	}
	
	public static void RacaUnica() {
		System.out.println("1-Confirmar");
	}
}
