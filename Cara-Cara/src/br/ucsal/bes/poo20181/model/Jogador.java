package br.ucsal.bes.poo20181.model;

public class Jogador {

	private Pontuacao pontuacao;
	private String nome;
	private Integer idade;

	public Jogador(Pontuacao pontuacao, String nome, Integer idade) {
		this.pontuacao = pontuacao;
		this.nome = nome;
		this.idade = idade;
	}

	public Pontuacao getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Pontuacao pontuacao) {
		this.pontuacao = pontuacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
