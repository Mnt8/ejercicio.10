/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and
 */
package ejercicio.pkg10;
import java.util.Scanner;
/**
 *
 * @author LABMOVIL
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero;
        Scanner teclado = new Scanner (System.in);
        do  { 
            System.out.println("ingresa un numero mayor o igual a 0");
            numero = teclado.nextDouble();
        }while (numero < 0);
        System.out.println("El numero ingresado es "+numero);
    }
}