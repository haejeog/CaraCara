package br.ucsal.bes.poo20181.controller.regras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import br.ucsal.bes.poo20181.controller.ViewInicio;
import br.ucsal.bes.poo20181.controller.ViewPrincipal;

public class Controller implements ActionListener{

        ViewInicio vi = new ViewInicio();
        ViewPrincipal vp = new ViewPrincipal();

    
    public Controller(ViewInicio vi){
        
       this.vi = vi;
       this.vi.btnStart.addActionListener(this);
       this.vi.btnSair.addActionListener(this);
       this.vp.btnSairVP.addActionListener(this);
       this.vp.btn1p1.addActionListener(this);
       this.vp.btn2p1.addActionListener(this);
       this.vp.btn3p1.addActionListener(this);
       this.vp.btn4p1.addActionListener(this);
       this.vp.btn1p2.addActionListener(this);
       this.vp.btn2p2.addActionListener(this);
       this.vp.btn3p2.addActionListener(this);
       this.vp.btn4p2.addActionListener(this);
       
       
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource() == vi.btnStart){
             vp.setVisible(true);
             vp.setLocationRelativeTo(null);
                vi.dispose();
        }
        
        if(e.getSource() == vi.btnSair){
            JOptionPane.showMessageDialog(null, "Ate a proxima jogador!!" );
            vi.dispose();
        }
        
        if(e.getSource() == vp.btnSairVP){
            vp.dispose();
            vi.setVisible(true);
        }
        
        if(e.getSource() == vp.btn1p1){
            JOptionPane.showMessageDialog(null, "Voce abaixou essa peca" );
             vp.btn1p1.setIcon(new javax.swing.ImageIcon("/view/fotos/erro.png"));
             vp.btn1p1.setEnabled(false);
        }
        
        if(e.getSource() == vp.btn2p1){
            JOptionPane.showMessageDialog(null, "Voce abaixou essa peca" );
             vp.btn2p1.setIcon(new javax.swing.ImageIcon("/view/fotos/erro.png"));
             vp.btn2p1.setEnabled(false);
        }
         if(e.getSource() == vp.btn3p1){
            JOptionPane.showMessageDialog(null, "Voce Acertou" );
             vp.btn3p1.setEnabled(false);
             vp.dispose();
             restauraJogo();
             vi.setVisible(true);
        }
          if(e.getSource() == vp.btn4p1){
            JOptionPane.showMessageDialog(null, "Voce abaixou essa peca" );
             vp.btn4p1.setIcon(new javax.swing.ImageIcon("/view/fotos/erro.png"));
             vp.btn4p1.setEnabled(false);
        }
          
             if(e.getSource() == vp.btn1p2){
            JOptionPane.showMessageDialog(null, "Voce abaixou essa peca" );
             vp.btn1p2.setIcon(new javax.swing.ImageIcon("/view/fotos/erro.png"));
             vp.btn1p2.setEnabled(false);
        }
        
        if(e.getSource() == vp.btn2p2){
           JOptionPane.showMessageDialog(null, "Voce Acertou" );
             vp.btn2p2.setEnabled(false);
             vp.dispose();
             restauraJogo();
             vi.setVisible(true);
        }
         if(e.getSource() == vp.btn3p2){
            JOptionPane.showMessageDialog(null, "Voce abaixou essa peca" );
             vp.btn3p2.setIcon(new javax.swing.ImageIcon("/view/fotos/erro.png"));
             vp.btn3p2.setEnabled(false);
        }
          if(e.getSource() == vp.btn4p2){
            JOptionPane.showMessageDialog(null, "Voce abaixou essa peca" );
             vp.btn4p2.setIcon(new javax.swing.ImageIcon("/view/fotos/erro.png"));
             vp.btn4p2.setEnabled(false);
        }  
        
    }
    
    
    public void restauraJogo(){
        vp.btn1p1.setEnabled(true);
        vp.btn2p1.setEnabled(true);
        vp.btn3p1.setEnabled(true);
        vp.btn4p1.setEnabled(true);
        vp.btn1p2.setEnabled(true);
        vp.btn2p2.setEnabled(true);
        vp.btn3p2.setEnabled(true);
        vp.btn4p2.setEnabled(true);
        
        vp.btn1p1.setIcon(new javax.swing.ImageIcon("/view/fotos/img1.png"));
        vp.btn2p1.setIcon(new javax.swing.ImageIcon("/view/fotos/img3.png"));
        vp.btn3p1.setIcon(new javax.swing.ImageIcon("/view/fotos/img2.png"));
        vp.btn4p1.setIcon(new javax.swing.ImageIcon("/view/fotos/img4.png"));
        vp.btn1p2.setIcon(new javax.swing.ImageIcon("/view/fotos/img1.png"));
        vp.btn2p2.setIcon(new javax.swing.ImageIcon("/view/fotos/img3.png"));
        vp.btn3p2.setIcon(new javax.swing.ImageIcon("/view/fotos/img2.png"));
        vp.btn4p2.setIcon(new javax.swing.ImageIcon("/view/fotos/img4.png"));
    }
    
}
