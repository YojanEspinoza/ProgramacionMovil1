
package ProgramaGraf4;
//Espinoza Flores Yojan Gael

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dibujar extends JFrame{
    JPanel panelDibujo;
    public Dibujar(){
        setTitle("Dibujar");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PanelDibujo pd = new PanelDibujo();
    }
}
