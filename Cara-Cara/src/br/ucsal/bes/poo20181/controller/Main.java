package br.ucsal.bes.poo20181.controller;

import br.ucsal.bes.poo20181.controller.regras.Controller;


public class Main{ 
    
    public static void main(String[] args) {


    
    ViewInicio vi = new ViewInicio();
    Controller controller = new Controller(vi);  
    
   
    vi.setLocationRelativeTo(null);
}
}