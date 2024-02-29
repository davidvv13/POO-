/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1;

public class Ejercicio5 {

    public static void main(String[] args) {
        double suma,x,y;
        suma=0;
        x=20;
        suma+=x;
        y=40;
        x+=Math.pow(y,2);
        suma+=(x/y);
        System.out.println("El valor de la suma es: "+suma);
    }
    
}
