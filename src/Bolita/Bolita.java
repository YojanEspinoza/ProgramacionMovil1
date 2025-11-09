//Espinoza Flores Yojan Gael
package Bolita;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bolita extends JFrame implements ActionListener{
    JPanel pt, pd, pbG, pb2;
    int posX = 185, posY = 55;
    JButton btnAdelante, btnAtras, btnArriba, btnAbajo;
    public Bolita(){
        setTitle("Bolita01");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));
        
        pt = new PanelTexto();
        pd = new PanelDibujo();
        pbG = new JPanel();
        pbG.setLayout(new GridLayout(3, 1));
        pb2 = new JPanel();
        pb2.setLayout(new GridLayout(1, 2));
        
        btnAdelante = new JButton("→");
        btnAtras = new JButton("←");
        btnArriba = new JButton("↑");
        btnAbajo = new JButton("↓");
        
        btnAdelante.addActionListener(this);
        btnAtras.addActionListener(this);
        btnArriba.addActionListener(this);
        btnAbajo.addActionListener(this);
        
        pb2.add(btnAtras);
        pb2.add(btnAdelante);
        
        pbG.add(btnArriba);
        pbG.add(pb2);
        pbG.add(btnAbajo);
        
        add(pt);
        add(pd);
        add(pbG);
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnAdelante)){
            if(posX>400){
                posX=0;
            }else{
            posX=posX+10;
            }
        }
          if(e.getSource().equals(btnAtras)){
             if(posX<-140){
                posX=400;
            }else{
            posX=posX-10;
            }
        }
          if(e.getSource().equals(btnArriba)){
            if(posY<0){
                posY=120;
            }else{
            posY=posY-10;
            }
        }
          if(e.getSource().equals(btnAbajo)){
             if(posY>120){
                posY=0;
            }else{
            posY=posY+10;
            }
        }
        pd.repaint();
    }
    
    private class PanelTexto extends JPanel{
        
            @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.red);
            Font font = new Font("Roboto", 20, 20);
            g.setFont(font);
            g.drawString("Juego bolita", 10, 20);
        }
    }
    
    private class PanelDibujo extends JPanel{
        
            @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.orange);
            g.fillOval(posX, posY, 20, 20);

        }
    }
    public static void main (String[]a){
            Bolita b = new Bolita();
            b.setVisible(true);
        }
}

