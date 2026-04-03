/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioseila;
import java.util.*;

/**
 *
 * @author Seceip
 */
public class ExercicioSeila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leiaTemp = new Scanner(System.in);
        
        System.out.println("Programa Converte-Temperatura");
        System.out.print("Digite a temperatura em Celsius para a conversão: ");
        double tempC = leiaTemp.nextDouble();
        System.out.print("Digite outra temperatura mas em Fahrenheint para a conversão: ");
        double tempF = leiaTemp.nextDouble();
        System.out.println("Conversão: ");
        double tempCc = (tempF-32)/1.8;
        System.out.println("Celsius: C°: "+tempCc);
        double tempFf = tempC*1.8+32;
        System.out.println("Fahrenheit: F°: "+tempFf);
    }
    
}
