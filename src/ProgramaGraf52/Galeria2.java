package ProgramaGraf52;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

//Espinoza Flores Yojan Gael
public class Galeria2 extends JFrame{
    JButton btnAdelante, btnAtras;
    JPanel panelbtn;
    ArrayList<ImageIcon> images;
    int ImgActual;
    JLabel etimage;
   
    public Galeria2(){
        setTitle("Mi Galeria");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());    
       
        images = new ArrayList<>();
        images.add(new ImageIcon("images/image1.jpg"));        
        images.add(new ImageIcon("images/image2.jpg"));
        images.add(new ImageIcon("images/image3.jpg"));
       
        etimage = new JLabel();
        //etimage.setIcon(images.get(2));
        showImage(ImgActual);
               
        btnAdelante = new JButton("Adelante");        
        btnAtras = new JButton("Atras");
        panelbtn = new JPanel();
       
        //btnAtras.addActionListener(e->showImage(ImgActual-1));
        btnAtras.addActionListener(e-> {
            ImgActual = ImgActual - 1;
            if(ImgActual < 0){
                ImgActual = images.size() - 1;
            }
            showImage(ImgActual);
        });
        
        btnAdelante.addActionListener(e->{
            ImgActual = ImgActual + 1;
            if(ImgActual >= images.size()){
                ImgActual = 0;
            }
            showImage(ImgActual);
        });
       /*
        btnAdelante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showImage(ImgActual+1);
            }
        });*/
       
        panelbtn.add(btnAtras); panelbtn.add(btnAdelante);
        add(etimage);
        add(panelbtn);
        setVisible(true);
    }
   
    public static void main(String[] args) {
        //SwingUtilities.invokeLater(()->new Galeria2());
        new Galeria2();
    }
   
    public void showImage(int ImgActual){
        System.out.println(ImgActual);
        if(ImgActual>=0 && ImgActual < images.size()){
            this.ImgActual = ImgActual;            
            etimage.setIcon(images.get(ImgActual));
        }
    }
}
