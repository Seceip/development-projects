/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaimpares;
import java.util.*;
/**
 *
 * @author Seceip
 */
public class MediaImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        double media = 0;
        int cont = 0;
        
        System.out.println("Programa da média dos ímpares!");
        System.out.println("O primeiro valor sempre deve ser menor que o primeiro.");
        System.out.println("Digite o primeiro número: ");
        int i = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int j = scanner.nextInt();
        if(i>=j){
            System.out.println("Seu número deve ser maior ou diferente do digitado.");
        }else{
            while(i != j){
                if(i%2 != 0){
                    System.out.println("Ímpar: "+i);
                    soma = soma+i;
                    cont = cont+1;
                }
                i++;
            }
            media = soma/cont;
            System.out.println("A média de toods os ímpares é de: "+media);
        }
    }
}
