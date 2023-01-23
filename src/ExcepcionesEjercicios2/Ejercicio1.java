/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExcepcionesEjercicios2;
import java.util.Scanner;

/**
 *
 * @author luibol
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num;
        int num2 = 0;
        int resultado;

        System.out.println("Introduce un numero:");
        num = tcl.nextInt();

        try {
            resultado = num / num2;
            System.out.println("Resultado:" + num + "/" + num2 + "=" + resultado);
        } catch (ArithmeticException ex) {
            System.out.println("Error:" + ex.getMessage());
        }
        System.out.println("Se produce un error porque el denominador es 0 ");
    }

}
