//Espinoza Flores Yojan Gael
package Programa1;

public class HolaMundo {
    String nombre = "John Doe";
    
    public HolaMundo(){
        //saludar(); 
    }
    public void saludar(String nombre){
        this.nombre = nombre;
        System.out.println("Hola mundo " + nombre);
    }
    
    public static void despedirse(){
        System.out.println("Adios");
        //EXIT_CLOSE();
    }
}
