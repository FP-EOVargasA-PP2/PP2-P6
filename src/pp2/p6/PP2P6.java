/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p6;
import java.util.Scanner;
/**
 *
 * @author osiri
 */
public class PP2P6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion
        int s;
        int h;
        int p;
        //Solucion
        s = pedir("salario por hora");
        h = pedir("numero de horas trabajadas");
        p = paga(s,h);
        mostrar(p);
    }
    public static int pedir(String b){
        int a;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el "+b+" del empleado");
        a = teclado.nextInt();
        return a;
    }
    public static int paga (int s,int h){
        int p;
        //Dependiendo de la cantidad de horas, la formula que se utiliza
        if (h > 40){
            if (h > 48){
                p = s * 40 + s * 16 + s * 3 * (h - 48);
            }else{
                p = s * 40 + s * 2 * (h - 40);
            }
        }else{
            p = s * h;
        }
        return p;
    }
    public static void mostrar (int p){
        System.out.println("La paga semanal del empleado sera "+p);
    }
}
