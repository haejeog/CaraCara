package br.ucsal.bes.poo20181.controller;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaInicial extends JFrame {

	private static final long serialVersionUID = 1L;

	private final int TEMPO = 1;

	int num;

	ImageIcon caracara = new ImageIcon("src/dowloads/cara-a-cara");

	JButton btn1;
	JButton btn2;
	JButton btn3;

	public TelaInicial() {
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.BLUE);
		setLayout(null);
		JLabel lblTitulo = new JLabel("Cara a Cara");
		lblTitulo.setFont(new Font("Comic Sans Ms", 1, 50));
		lblTitulo.setBounds(140, 1, 3000, 100);
		add(lblTitulo);
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(270, 100, 100, 30);
		btnIniciar.setBackground(Color.RED);
		btnIniciar.setForeground(Color.BLUE);

	}

	public static void main(String[] args) {
		TelaInicial tela = new TelaInicial();
	}
}
