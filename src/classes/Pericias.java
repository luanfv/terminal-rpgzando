package classes;

import java.util.ArrayList;
import java.util.List;

public class Pericias extends Classe {

	protected List<String> lista = new ArrayList<>();
	protected String acrobacia = "Acrobacia", arcanismo = "Arcanismo", atletismo = "Atletismo", atuacao = "Atuação",
			blefar = "Blefar", furtividade = "Furtividade", historia = "Historia", intimidacao = "Intimidação",
			intuicao = "Intuição", investigacao = "Investigação", lidarAnimais = "Lidar com animais",
			medicina = "Medicina", natureza = "Natureza", percepcao = "Percepção", persuasao = "Persuasão",
			prestidigitacao = "Prestigitação", religiao = "Religião", sobrevivencia = "Sobrevivencia";

	public void listas() {
		lista.add(getAcrobacia());
		lista.add(getArcanismo());
		lista.add(getAtletismo());
		lista.add(getAtuacao());
		lista.add(getBlefar());
		lista.add(getFurtividade());
		lista.add(getHistoria());
		lista.add(getIntimidacao());
		lista.add(getIntuicao());
		lista.add(getInvestigacao());
		lista.add(getLidarAnimais());
		lista.add(getMedicina());
		lista.add(getNatureza());
		lista.add(getPercepcao());
		lista.add(getPersuasao());
		lista.add(getPrestidigitacao());
		lista.add(getReligiao());
		lista.add(getSobrevivencia());

	}
	
	public void listaPericias() {
		for(int i = 0; i < lista.size(); i++) {
			System.out.println((i + 1) + "-" + lista.get(i));
		}
	}

	protected List<String> getLista() {
		return lista;
	}

	protected String getAcrobacia() {
		return acrobacia;
	}

	protected void setAcrobacia(String acrobacia) {
		this.acrobacia = acrobacia;
	}

	protected String getArcanismo() {
		return arcanismo;
	}

	protected void setArcanismo(String arcanismo) {
		this.arcanismo = arcanismo;
	}

	protected String getAtletismo() {
		return atletismo;
	}

	protected void setAtletismo(String atletismo) {
		this.atletismo = atletismo;
	}

	protected String getAtuacao() {
		return atuacao;
	}

	protected void setAtuacao(String atuacao) {
		this.atuacao = atuacao;
	}

	protected String getBlefar() {
		return blefar;
	}

	protected void setBlefar(String blefar) {
		this.blefar = blefar;
	}

	protected String getFurtividade() {
		return furtividade;
	}

	protected void setFurtividade(String furtividade) {
		this.furtividade = furtividade;
	}

	protected String getHistoria() {
		return historia;
	}

	protected void setHistoria(String historia) {
		this.historia = historia;
	}

	protected String getIntimidacao() {
		return intimidacao;
	}

	protected void setIntimidacao(String intimidacao) {
		this.intimidacao = intimidacao;
	}

	protected String getIntuicao() {
		return intuicao;
	}

	protected void setIntuicao(String intuicao) {
		this.intuicao = intuicao;
	}

	protected String getInvestigacao() {
		return investigacao;
	}

	protected void setInvestigacao(String investigacao) {
		this.investigacao = investigacao;
	}

	protected String getLidarAnimais() {
		return lidarAnimais;
	}

	protected void setLidarAnimais(String lidarAnimais) {
		this.lidarAnimais = lidarAnimais;
	}

	protected String getMedicina() {
		return medicina;
	}

	protected void setMedicina(String medicina) {
		this.medicina = medicina;
	}

	protected String getNatureza() {
		return natureza;
	}

	protected void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	protected String getPercepcao() {
		return percepcao;
	}

	protected void setPercepcao(String percepcao) {
		this.percepcao = percepcao;
	}

	protected String getPersuasao() {
		return persuasao;
	}

	protected void setPersuasao(String persuasao) {
		this.persuasao = persuasao;
	}

	protected String getPrestidigitacao() {
		return prestidigitacao;
	}

	protected void setPrestidigitacao(String prestidigitacao) {
		this.prestidigitacao = prestidigitacao;
	}

	protected String getReligiao() {
		return religiao;
	}

	protected void setReligiao(String religiao) {
		this.religiao = religiao;
	}

	protected String getSobrevivencia() {
		return sobrevivencia;
	}

	protected void setSobrevivencia(String sobrevivencia) {
		this.sobrevivencia = sobrevivencia;
	}

}
