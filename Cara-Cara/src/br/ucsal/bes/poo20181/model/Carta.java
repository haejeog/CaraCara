package br.ucsal.bes.poo20181.model;

import java.awt.image.BufferedImage;

public class Carta {
	private BufferedImage rosto;
	private String nome;

	public Carta(BufferedImage rosto, String nome) {
		this.rosto = rosto;
		this.nome = nome;
	}

	public BufferedImage getRosto() {
		return rosto;
	}

	public void setRosto(BufferedImage rosto) {
		this.rosto = rosto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
