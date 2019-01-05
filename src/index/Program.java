package index;

import java.util.Locale;
import java.util.Scanner;

import classes.Barbaro;
import classes.Bardo;
import classes.Bruxo;
import classes.ClassePersonagem;
import classes.Clerigo;
import classes.Druida;
import classes.Feiticeiro;
import classes.Guerreiro;
import classes.Ladino;
import classes.Mago;
import classes.Monge;
import classes.Paladino;
import classes.Patrulheiro;
import informações.Modificador;
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
import raça.RacaPersonagem;

// NÃO ESTA FUNCIONANDO PERFEITAMENTO, SUSPEITO QUE SEJA O MODIFICADOR

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

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
		ClassePersonagem classePersonagem = new ClassePersonagem();
		RacaPersonagem racaPersonagem = new RacaPersonagem();

		byte escolha;

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
					racaPersonagem = new RacaPersonagem(anaoColina.getNome(),anaoColina.getForca(), anaoColina.getDestreza(),
							anaoColina.getInteligencia(), anaoColina.getSabedoria(), anaoColina.getConstituicao(),
							anaoColina.getCarisma());
				} else if (escolha == 2) {
					racaPersonagem = new RacaPersonagem(anaoMontanha.getNome(),anaoMontanha.getForca(), anaoMontanha.getDestreza(),
							anaoMontanha.getInteligencia(), anaoMontanha.getSabedoria(), anaoMontanha.getConstituicao(),
							anaoMontanha.getCarisma());
				}
			} else if (escolha == 2) {
				System.out.printf(draconato.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					racaPersonagem = new RacaPersonagem(draconato.getNome(),draconato.getForca(), draconato.getDestreza(),
							draconato.getInteligencia(), draconato.getSabedoria(), draconato.getConstituicao(),
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
					racaPersonagem = new RacaPersonagem(elfoAlto.getNome(), elfoAlto.getForca(), elfoAlto.getDestreza(),
							elfoAlto.getInteligencia(), elfoAlto.getSabedoria(), elfoAlto.getConstituicao(),
							elfoAlto.getCarisma());
				} else if (escolha == 2) {
					racaPersonagem = new RacaPersonagem(elfoFloresta.getNome(), elfoFloresta.getForca(), elfoFloresta.getDestreza(),
							elfoFloresta.getInteligencia(), elfoFloresta.getSabedoria(), elfoFloresta.getConstituicao(),
							elfoFloresta.getCarisma());
				} else if (escolha == 3) {
					racaPersonagem = new RacaPersonagem(elfoNegro.getNome(), elfoNegro.getForca(), elfoNegro.getDestreza(),
							elfoNegro.getInteligencia(), elfoNegro.getSabedoria(), elfoNegro.getConstituicao(),
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
					racaPersonagem = new RacaPersonagem(gnomoFloresta.getNome(), gnomoFloresta.getForca(), gnomoFloresta.getDestreza(),
							gnomoFloresta.getInteligencia(), gnomoFloresta.getSabedoria(),
							gnomoFloresta.getConstituicao(), gnomoFloresta.getCarisma());
				} else if (escolha == 2) {
					racaPersonagem = new RacaPersonagem(gnomoPedra.getNome(), gnomoPedra.getForca(), gnomoPedra.getDestreza(),
							gnomoPedra.getInteligencia(), gnomoPedra.getSabedoria(), gnomoPedra.getConstituicao(),
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
					racaPersonagem = new RacaPersonagem(halflingLeve.getNome(), halflingLeve.getForca(), halflingLeve.getDestreza(),
							halflingLeve.getInteligencia(), halflingLeve.getSabedoria(), halflingLeve.getConstituicao(),
							halflingLeve.getCarisma());
				} else if (escolha == 2) {
					racaPersonagem = new RacaPersonagem(halflingRobusto.getNome(), halflingRobusto.getForca(), halflingRobusto.getDestreza(),
							halflingRobusto.getInteligencia(), halflingRobusto.getSabedoria(),
							halflingRobusto.getConstituicao(), halflingRobusto.getCarisma());
				}
			} else if (escolha == 6) {
				System.out.printf(humano.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					racaPersonagem = new RacaPersonagem(humano.getNome(), humano.getForca(), humano.getDestreza(),
							humano.getInteligencia(), humano.getSabedoria(), humano.getConstituicao(),
							humano.getCarisma());
				}
			}
		} while (escolha == 0);
		
		Tracos();

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
					classePersonagem = new ClassePersonagem(barbaro.getVida(), barbaro.getNome());
				}
			} else if (escolha == 2) {
				System.out.printf(bardo.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					classePersonagem = new ClassePersonagem(bardo.getVida(), bardo.getNome());
				}
			} else if (escolha == 3) {
				System.out.printf(bruxo.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					classePersonagem = new ClassePersonagem(bruxo.getVida(), bruxo.getNome());
				}
			} else if (escolha == 4) {
				System.out.printf(clerigo.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					classePersonagem = new ClassePersonagem(clerigo.getVida(), clerigo.getNome());
				}
			} else if (escolha == 5) {
				System.out.printf(druida.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					classePersonagem = new ClassePersonagem(druida.getVida(), druida.getNome());
				}
			} else if (escolha == 6) {
				System.out.printf(feiticeiro.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					classePersonagem = new ClassePersonagem(feiticeiro.getVida(), feiticeiro.getNome());
				}
			} else if (escolha == 7) {
				System.out.printf(guerreiro.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					classePersonagem = new ClassePersonagem(guerreiro.getVida(), guerreiro.getNome());
				}
			} else if (escolha == 8) {
				System.out.printf(ladino.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					classePersonagem = new ClassePersonagem(ladino.getVida(), ladino.getNome());
				}
			} else if (escolha == 9) {
				System.out.printf(mago.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					classePersonagem = new ClassePersonagem(mago.getVida(), mago.getNome());
				}
			} else if (escolha == 10) {
				System.out.printf(monge.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					classePersonagem = new ClassePersonagem(monge.getVida(), monge.getNome());
				}
			} else if (escolha == 11) {
				System.out.printf(paladino.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					classePersonagem = new ClassePersonagem(paladino.getVida(), paladino.getNome());
				}
			} else if (escolha == 12) {
				System.out.printf(patrulheiro.toString());

				Tracos();

				EscolhaUnica();
				Volta();
				escolha = sc.nextByte();
				if (escolha == 1) {
					classePersonagem = new ClassePersonagem(patrulheiro.getVida(), patrulheiro.getNome());
				}
			}

		} while (escolha == 0);

		Tracos();

		personagem = new Personagem(racaPersonagem.getNome(), forca + racaPersonagem.getForca(), destreza + racaPersonagem.getDestreza(),
				inteligencia + racaPersonagem.getInteligencia(), sabedoria + racaPersonagem.getSabedoria(),
				constituicao + racaPersonagem.getConstituicao(), carisma + racaPersonagem.getCarisma());
		Modificador modificador = new Modificador(personagem);
		personagem.modificador(modificador);
		
		System.out.printf(
				"ESCOLHA UMA OPCÇÃO%n1-HP manual (girado com dados fisico)%n2-HP aleatorio (girado com dados virtuais)%n");
		escolha = sc.nextByte();
		if (escolha == 1) {
			int hp = sc.nextInt();
			personagem.hpManual(hp);
		} else if (escolha == 2) {
			personagem.hpAleatorio(classePersonagem.getVida(), modificador.getConstituicao());
		}
		
		Tracos();

		System.out.print("Informe o nome do personagem: ");
		sc.nextLine();
		String nome = sc.nextLine();
		personagem.setNome(nome);
		personagem.setClasse(classePersonagem.getNome());

		Tracos();

		System.out.printf(personagem.toString());

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
}
