package br.ucsal.bes.poo20181.model;

import java.util.ArrayList;

public class Arrumacao {
	private Integer tempo;
	private Integer numeroDeDentativas;
	private ArrayList<Carta> cartas = new ArrayList<Carta>();

	public Arrumacao(Integer tempo, Integer numerodetentativas, ArrayList<Carta> cartas) {
		
		this.tempo = tempo;
		this.numeroDeDentativas = numerodetentativas;
		this.cartas = cartas;
		
	}

	public Integer getTempo() {
		
		return tempo;
		
	}

	public void setTempo(Integer tempo) {
		
		this.tempo = tempo;
		
	}

	public Integer getNumerodetentativas() {
		
		return numeroDeDentativas;
		
	}

	public void setNumerodetentativas(Integer numerodetentativas) {
		
		this.numeroDeDentativas = numerodetentativas;
		
	}

	public ArrayList<Carta> getCartas() {
		
		return cartas;
		
	}

	public void setCartas(ArrayList<Carta> cartas) {
		
		this.cartas = cartas;
		
	}

	public void embaralhar(ArrayList<Carta> cartas) {

	}

}
