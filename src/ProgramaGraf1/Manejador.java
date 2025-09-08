//Espinoza Flores Yojan Gael
package ProgramaGraf1;

import java.awt.BorderLayout;
import java.awt.Button;
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

public class Manejador extends JFrame implements ActionListener{ //Implementar implements ActionListener e implementar los metodos abstractos
    Button b1,b2; //botones feos
    JButton b3,b4;//botones chidos
    JPanel pc;
    JPanel pd;
    JLabel texto;
    JTextField casillaNombre;
    JButton btnEnviar;
    
    public Manejador(){
        setTitle("Manejador");
        setSize(500, 400);
        
        setLayout(new GridLayout(3,2));
        b1 = new Button("Rojo");
        b2 = new Button("Azul");
        b3 = new JButton("Amarillo");
        b4 = new JButton("Negro");
        
        pc = new JPanel();
        pc.setBackground(Color.orange);
        
        pd = new JPanel();
        texto = new JLabel("Nombre: ");
        casillaNombre = new JTextField(20);
        btnEnviar = new JButton("Enviar Datos");
        btnEnviar.addActionListener(this);
        
        
        pd.add(texto);
        pd.add(casillaNombre);
        pd.add(btnEnviar);
        
        
        /*
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.WEST);
        add(b4, BorderLayout.EAST);
        add(pc, BorderLayout.CENTER);
        */
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(pc);
        add(pd);
        
        //Activar las acciones de los botones 
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(b1.equals(e.getSource())){
        System.out.println("Presionado rojo" );
        pc.setBackground(Color.RED);
        }
        if(b2.equals(e.getSource())){
        System.out.println("Presionado azul" );
        pc.setBackground(Color.BLUE);
        }
        if(b3.equals(e.getSource())){
        System.out.println("Presionado Amarillo" );
        pc.setBackground(Color.YELLOW);
        }
        if(b4.equals(e.getSource())){
        System.out.println("Presionado Negro" );
        pc.setBackground(Color.BLACK);
        }
        if(e.getSource().equals(btnEnviar)){
            System.out.println("Enviando datos...");
            JOptionPane.showMessageDialog(null, "Hola "+ casillaNombre.getText());
        }
    }
}
//Implementar ActionListener
//Implementar los metodos abstractos
//Escribiir addActionListener para los botones 