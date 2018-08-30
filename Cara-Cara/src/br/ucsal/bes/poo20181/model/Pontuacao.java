package br.ucsal.bes.poo20181.model;

public class Pontuacao {

	private Integer acertodecaracteristica;
	private Integer acertodeprimeiratentativa;
	private Integer acertodesegundatentativa;
	private Integer acertofinal;

	public Pontuacao(Integer acertodecaracteristica, Integer acertodeprimeiratentativa,
			Integer acertodesegundatentativa, Integer acertofinal) {
		this.acertodecaracteristica = acertodecaracteristica;
		this.acertodeprimeiratentativa = acertodeprimeiratentativa;
		this.acertodesegundatentativa = acertodesegundatentativa;
		this.acertofinal = acertofinal;
	}

	public Integer getAcertodecaracteristica() {
		return acertodecaracteristica;
	}

	public void setAcertodecaracteristica(Integer acertodecaracteristica) {
		this.acertodecaracteristica = acertodecaracteristica;
	}

	public Integer getAcertodeprimeiratentativa() {
		return acertodeprimeiratentativa;
	}

	public void setAcertodeprimeiratentativa(Integer acertodeprimeiratentativa) {
		this.acertodeprimeiratentativa = acertodeprimeiratentativa;
	}

	public Integer getAcertodesegundatentativa() {
		return acertodesegundatentativa;
	}

	public void setAcertodesegundatentativa(Integer acertodesegundatentativa) {
		this.acertodesegundatentativa = acertodesegundatentativa;
	}

	public Integer getAcertofinal() {
		return acertofinal;
	}

	public void setAcertofinal(Integer acertofinal) {
		this.acertofinal = acertofinal;
	}

}
