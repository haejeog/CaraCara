package br.ucsal.bes.poo20181.controller.regras;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;

public class ControleBotoesSelecionados {

	private String nmBotao;
	private Map<JButton, Boolean> referenciaBotoes;

	public ControleBotoesSelecionados() {
		this.referenciaBotoes = new HashMap<JButton, Boolean>();
	}

	public String getNmBotao() {
		return nmBotao;
	}

	public void setNmBotao(String nmBotao) {
		this.nmBotao = nmBotao;
	}

	public Map<JButton, Boolean> getReferenciaBotoes() {
		return referenciaBotoes;
	}

	public void setReferenciaBotoes(Map<JButton, Boolean> referenciaBotoes) {
		this.referenciaBotoes = referenciaBotoes;
	}

	public void adicionarBotao(JButton botao) {
		this.referenciaBotoes.put(botao, Boolean.FALSE);
	}

	public void botaoSelecionado(JButton botao) {
		Boolean b = this.referenciaBotoes.get(botao);
		b = true;

	}

}
