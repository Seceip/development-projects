/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.*;
/**
 *
 * @author Seceip
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double media = 0.0;
        int soma = 0;
        int cont = 0;
        
        System.out.println("! Programa Mostra-Ímpar !");
        System.out.println("Digite o valor de inicio da contagem: ");
        int ini = leia.nextInt();
        System.out.println("Digite o valor final da contagem: ");
        int fim = leia.nextInt();
        while(ini <= fim){
            if(ini%2 != 0){
                System.out.println("Ímpar detectado: "+ini);
                soma = soma + ini;
                cont = cont+1;
            }
            ini++;
        }
        media = soma/cont;
        System.out.println("A média de todos os valores ímpares é de: "+media);
    }
    
}
