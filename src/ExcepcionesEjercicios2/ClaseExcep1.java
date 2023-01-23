/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExcepcionesEjercicios2;

/**
 *
 * @author luibol
 */
public class ClaseExcep1 {

    public static void dividirEntreArray(int[] a, int num) {
        int resul = 0;
        for (int i = 0; i < a.length; i++) {
            resul = a[i] / num;
            System.out.println(+a[i] + "/" + num + "=" + resul);
        }

    }

    public static void main(String[] args) {
        int vector[] = new int[5];
        vector[0] = -2;
        vector[1] = -1;
        vector[2] = 0;
        vector[3] = 1;
        vector[4] = 2;
        int num = 2;

        dividirEntreArray(vector, num);
    }
}
