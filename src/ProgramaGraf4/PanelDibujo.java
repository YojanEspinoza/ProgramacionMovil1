
package ProgramaGraf4;
//Espinoza Flores Yojan Gael

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class PanelDibujo extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Hola", 10, 10);
        
        g.setColor(Color.red); //Cambio de color
        g.drawLine(10, 20, 380, 200);
        
        g.setColor(Color.green);
        g.drawOval(200, 200, 20, 20);
        g.fillOval(200, 200, 20, 20);
    }
    
}
