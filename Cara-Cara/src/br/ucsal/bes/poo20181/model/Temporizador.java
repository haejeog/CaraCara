package br.ucsal.bes.poo20181.model;

import java.util.Timer;

public class Temporizador {
		   Timer timer;     
		   public static void exibirMensagem(int tempo, String mensagem, int tipo) {  
		         Timer timer = new Timer();  
		         timer.schedule(new TarefaRepetida(mensagem, tipo), 0, tempo * 30);  
		  
		      }     
		}  

