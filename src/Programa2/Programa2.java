//Espinoza Flores Yojan Gael
package Programa2;

public class Programa2 {
    public static void main(String[]ar){
        //int numero = Integer.parseInt(ar[0]);
        int numero = 3;
        int temp = numero % 2;
        
        if(temp == 0){
            System.out.println("El numero " + numero + " es par");
        }else{
            System.out.println("El numero " + numero + " es impar");
        }
    }
}
