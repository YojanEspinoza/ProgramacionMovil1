//Espinoza Flores Yojan Gael
package Programa3;

import java.util.Scanner;

public class Programa3 {
    public static void main (String [] args){
        NumerosParImpar npi = new NumerosParImpar();
        //npi.valida(19);
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        int num = sc.nextInt();
        npi.validar(num);
    }
}
