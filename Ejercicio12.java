/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1;

public class Ejercicio12 {

    public static void main(String[] args) {
        double horas,pagoHora,porcentaje,salarioBruto,retencion,salarioNeto;
        horas=48;
        pagoHora=5000;
        porcentaje=12.5/100.0;
        salarioBruto=horas*pagoHora;
        retencion=salarioBruto*porcentaje;
        salarioNeto=salarioBruto-retencion;
        System.out.println("Horas trabajadas: "+horas);
        System.out.println("Valor-hora: "+pagoHora);
        System.out.println("Salario bruto: "+salarioBruto);
        System.out.println("Retención: "+retencion);
        System.out.println("Salario neto: "+salarioNeto);
    }    
}
