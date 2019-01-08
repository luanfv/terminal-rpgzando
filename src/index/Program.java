package index;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import classes.Barbaro;
import classes.Bardo;
import classes.Bruxo;
import classes.Clerigo;
import classes.Druida;
import classes.Feiticeiro;
import classes.Guerreiro;
import classes.Ladino;
import classes.Mago;
import classes.Monge;
import classes.Paladino;
import classes.Patrulheiro;
import informações.Personagem;
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

		// IMPORTAÇÕES
		Personagem personagem = new Personagem();
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
		Barbaro barbaro = new Barbaro();
		Bardo bardo = new Bardo();
		Bruxo bruxo = new Bruxo();
		Clerigo clerigo = new Clerigo();
		Druida druida = new Druida();
		Feiticeiro feiticeiro = new Feiticeiro();
		Guerreiro guerreiro = new Guerreiro();
		Ladino ladino = new Ladino();
		Mago mago = new Mago();
		Monge monge = new Monge();
		Paladino paladino = new Paladino();
		Patrulheiro patrulheiro = new Patrulheiro();

		byte escolha;

		System.out.print("Informe o nivel do seu personagem: ");
		int nivel = sc.nextByte();

		personagem.setNivel(nivel);

		// ESCOLHA DE RAÇA
		do {
			System.out.println("ESCOLHA UMA RAÇA");
			EscolhaRacas();
			escolha = sc.nextByte();
			while (escolha > 6)
				escolha = sc.nextByte();

			Tracos();

			if (escolha == 1) {
				System.out.printf(anao.toString());

				Tracos();

				System.out.printf(anaoColina.toString());

				Tracos();

				System.out.printf(anaoMontanha.toString());

				Tracos();

				EscolhasAnoes();
				Volta();

				escolha = sc.nextByte();
				if (escolha == 1) {
					anaoColina.addAnaoColina();
					personagem.addRaca(anaoColina.getNome(), anaoColina.getForca(), anaoColina.getDestreza(),
							anaoColina.getInteligencia(), anaoColina.getSabedoria(), anaoColina.getConstituicao(),
							anaoColina.getCarisma());
				} else if (escolha == 2) {
					anaoMontanha.addAnaoMontanha();
					personagem.addRaca(anaoMontanha.getNome(), anaoMontanha.getForca(), anaoMontanha.getDestreza(),
							anaoMontanha.getConstituicao(), anaoMontanha.getInteligencia(), anaoMontanha.getSabedoria(),
							anaoMontanha.getCarisma());
				}
			} else if (escolha == 2) {
				System.out.printf(draconato.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					draconato.addDraconato();
					personagem.addRaca(draconato.getNome(), draconato.getForca(), draconato.getDestreza(),
							draconato.getConstituicao(), draconato.getInteligencia(), draconato.getSabedoria(),
							draconato.getCarisma());
				}
			} else if (escolha == 3) {
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

				if (escolha == 1) {
					elfoAlto.addElfoAlto();
					personagem.addRaca(elfoAlto.getNome(), elfoAlto.getForca(), elfoAlto.getDestreza(),
							elfoAlto.getConstituicao(), elfoAlto.getInteligencia(), elfoAlto.getSabedoria(),
							elfoAlto.getCarisma());
				} else if (escolha == 2) {
					elfoFloresta.addElfoFloresta();
					personagem.addRaca(elfoFloresta.getNome(), elfoFloresta.getForca(), elfoFloresta.getDestreza(),
							elfoFloresta.getConstituicao(), elfoFloresta.getInteligencia(), elfoFloresta.getSabedoria(),
							elfoFloresta.getCarisma());
				} else if (escolha == 3) {
					elfoNegro.addElfoNegro();
					personagem.addRaca(elfoNegro.getNome(), elfoNegro.getForca(), elfoNegro.getDestreza(),
							elfoNegro.getConstituicao(), elfoNegro.getInteligencia(), elfoNegro.getSabedoria(),
							elfoNegro.getCarisma());
				}
			} else if (escolha == 4) {
				System.out.printf(gnomo.toString());

				Tracos();

				System.out.printf(gnomoFloresta.toString());

				Tracos();

				System.out.printf(gnomoPedra.toString());

				Tracos();

				EscolhasGnomos();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					gnomoFloresta.addGnomoFloresta();
					personagem.addRaca(gnomoFloresta.getNome(), gnomoFloresta.getForca(), gnomoFloresta.getDestreza(),
							gnomoFloresta.getConstituicao(), gnomoFloresta.getInteligencia(),
							gnomoFloresta.getSabedoria(), gnomoFloresta.getCarisma());
				} else if (escolha == 2) {
					gnomoPedra.addGnomoPedra();
					personagem.addRaca(gnomoPedra.getNome(), gnomoPedra.getForca(), gnomoPedra.getDestreza(),
							gnomoPedra.getConstituicao(), gnomoPedra.getInteligencia(), gnomoPedra.getSabedoria(),
							gnomoPedra.getCarisma());
				}
			} else if (escolha == 5) {
				System.out.printf(halfling.toString());

				Tracos();

				System.out.printf(halflingLeve.toString());

				Tracos();

				System.out.printf(halflingRobusto.toString());

				Tracos();

				EscolhasHalflings();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					halflingLeve.addHalflingLeve();
					personagem.addRaca(halflingLeve.getNome(), halflingLeve.getForca(), halflingLeve.getDestreza(),
							halflingLeve.getConstituicao(), halflingLeve.getInteligencia(), halflingLeve.getSabedoria(),
							halflingLeve.getCarisma());
				} else if (escolha == 2) {
					halflingRobusto.addHalflingRobusto();
					personagem.addRaca(halflingRobusto.getNome(), halflingRobusto.getForca(),
							halflingRobusto.getDestreza(), halflingRobusto.getConstituicao(),
							halflingRobusto.getInteligencia(), halflingRobusto.getSabedoria(),
							halflingRobusto.getCarisma());
				}
			} else if (escolha == 6) {
				System.out.printf(humano.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					humano.addHumano();
					personagem.addRaca(humano.getNome(), humano.getForca(), humano.getDestreza(),
							humano.getConstituicao(), humano.getInteligencia(), humano.getSabedoria(),
							humano.getCarisma());
				}
			}
		} while (escolha == 0);

		// CLASSES
		do {
			Tracos();

			EscolhasClasses();

			Tracos();

			escolha = sc.nextByte();

			if (escolha == 1) {
				System.out.printf(barbaro.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					personagem.addClasse(barbaro.getNome(), barbaro.getVidaLvl());
				}
			} else if (escolha == 2) {
				System.out.printf(bardo.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					personagem.addClasse(bardo.getNome(), bardo.getVidaLvl());
				}
			} else if (escolha == 3) {
				System.out.printf(bruxo.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					personagem.addClasse(bruxo.getNome(), bruxo.getVidaLvl());
				}
			} else if (escolha == 4) {
				System.out.printf(clerigo.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					personagem.addClasse(clerigo.getNome(), clerigo.getVidaLvl());
				}
			} else if (escolha == 5) {
				System.out.printf(druida.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					personagem.addClasse(druida.getNome(), druida.getVidaLvl());
				}
			} else if (escolha == 6) {
				System.out.printf(feiticeiro.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					personagem.addClasse(feiticeiro.getNome(), feiticeiro.getVidaLvl());
				}
			} else if (escolha == 7) {
				System.out.printf(guerreiro.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					personagem.addClasse(guerreiro.getNome(), guerreiro.getVidaLvl());
				}
			} else if (escolha == 8) {
				System.out.printf(ladino.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					personagem.addClasse(ladino.getNome(), ladino.getVidaLvl());
				}
			} else if (escolha == 9) {
				System.out.printf(mago.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					personagem.addClasse(mago.getNome(), mago.getVidaLvl());
				}
			} else if (escolha == 10) {
				System.out.printf(monge.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					personagem.addClasse(monge.getNome(), monge.getVidaLvl());
				}
			} else if (escolha == 11) {
				System.out.printf(paladino.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					personagem.addClasse(paladino.getNome(), paladino.getVidaLvl());
				}
			} else if (escolha == 12) {
				System.out.printf(patrulheiro.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					personagem.addClasse(patrulheiro.getNome(), patrulheiro.getVidaLvl());
				}
			}

		} while (escolha == 0);
		
		Tracos();

		// ESCOLHA DOS ATRIBUTOS

		System.out.print("Informe a força: ");
		int forca = sc.nextInt();
		System.out.print("Informe a destreza: ");
		int destreza = sc.nextInt();
		System.out.print("Informe a constituição: ");
		int constituicao = sc.nextInt();
		System.out.print("Informe a inteligencia: ");
		int inteligencia = sc.nextInt();
		System.out.print("Informe a sabedoria: ");
		int sabedoria = sc.nextInt();
		System.out.print("Informe o carisma: ");
		int carisma = sc.nextInt();

		personagem.addAtributos(forca, destreza, constituicao, inteligencia, sabedoria, carisma);
		personagem.addModificador();
		
		Tracos();
		
		// DEFININDO HP
		
		VidaDados();
		escolha = sc.nextByte();
		if (escolha == 1) {
			for (int i = 0; i < personagem.getNivel(); i++) {
				int hp = sc.nextInt();
				while (hp > personagem.getVidaLvl()) {
					System.out.println("ERRO! Informe um hp dentro das condições: 1D" + personagem.getVidaLvl());
					hp = sc.nextInt();
				}

				personagem.setHp(hp + personagem.getMconstituicao());
				System.out.printf("%nTOTAL: " + personagem.getHp() + "%nDADO: " + hp + "%nMODIFICADOR: "
						+ personagem.getMconstituicao());
			}
		} else {
			for (int i = 0; i < personagem.getNivel(); i++) {
				Random x = new Random();
				int aleatorio = (x.nextInt(personagem.getVidaLvl()) + 1);
				personagem.setHp(aleatorio + personagem.getMconstituicao());
				System.out.printf("%nTOTAL: " + personagem.getHp() + "%nDADO: " + aleatorio + "%nMODIFICADOR: "
						+ personagem.getMconstituicao());
			}
		}

		Tracos();

		// NOME DO PERSONAGEM

		System.out.print("Informe o nome do personagem: ");
		sc.nextLine();
		String nome = sc.nextLine();
		personagem.setNome(nome);

		Tracos();

		// PERSONAGEM

		personagem.proficienciaClasseLvl();
		personagem.addTesteResistencia();
		personagem.addModificador();
		System.out.printf(personagem.toString());
		Tracos();
		System.out.printf(personagem.toStringResistencia());

		sc.close();
	}

	
	
	public static void Tracos() {
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

	public static void EscolhaUnica() {
		System.out.println("1-Confirmar");
	}

	public static void EscolhasClasses() {
		System.out.printf(
				"1-Barbaro%n2-Bardo%n3-Bruxo%n4-Clerigo%n5-Druida%n6-Feiticeiro%n7-Guerreiro%n8-Ladino%n9-Mago%n10-Monge%n11-Paladino%n12-Patrulheiro%n");
	}

	public static void VidaDados() {
		System.out.printf(
				"ESCOLHA UMA OPCÇÃO%n1-HP manual (girado com dados fisico)%n2-HP aleatorio (girado com dados virtuais)%n");
	}
}