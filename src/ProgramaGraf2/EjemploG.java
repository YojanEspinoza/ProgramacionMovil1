
package ProgramaGraf2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * Espinoza Flores Yojan Gael 
 */
public class EjemploG extends JFrame {
    JButton btnAceptar, btnLimpiar;
    JPanel p;
    JTextField textoUno, textoDos;
    
    public EjemploG(){
        setTitle("EjemploG");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        //setLayout(new GridLayout(2,2));
        
        btnAceptar = new JButton("Aceptar");
        btnLimpiar = new JButton("Limpiar");
        p = new JPanel();
        
        p.add(btnAceptar);
        p.add(btnLimpiar);
        add(p);
        
        
    }
}
