package ProgramaGraf3;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Ventana extends JFrame implements ActionListener{
    JButton b1, b2;
    JTextField txt1, txt2;
    JPanel panel1, panelr;
    JLabel lbl1, lbl2,r;
    
    public Ventana(){
        setTitle("Suma de números");
        setSize(250,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cierra la ventana
        setLayout(new GridLayout(2,1));//Ordena los elementos que se agreguen
        
        b1 = new JButton("Sumar");
        b2 = new JButton("Limpiar");
        txt1 = new JTextField(20);
        txt2 = new JTextField(20);
        lbl1 = new JLabel("Número 1: ");
        lbl2 = new JLabel("Número 2: ");
        r = new JLabel("");
        panel1 = new JPanel(); 
        panelr = new JPanel();
        
        b1.addActionListener(this);
        b2.addActionListener(this);

        panel1.add(lbl1);
        panel1.add(txt1);
        panel1.add(lbl2);
        panel1.add(txt2);
        panel1.add(b1);
        panel1.add(b2);
        
        panelr.add(r);
        
        add(panel1);
        add(panelr);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(b1)){//Presionando el boton 1
            int op1 = Integer.parseInt(txt1.getText());//Convierte en entero la cadena de texto 1
            int op2 = Integer.parseInt(txt2.getText());//Convierte en entero la cadena de texto 2
            int res = op1 + op2;
            
            System.out.println("El resultado es: " + res);
            JOptionPane.showMessageDialog(null, res);
            r.setText(String.valueOf(res));//Convirtiendo el resultado a una cadena
        }
        if(e.getSource().equals(b2)){//Presionando el boto 2
            txt1 .setText("");//Limpiando los campos 
            txt2.setText("");
        }
    }
}
