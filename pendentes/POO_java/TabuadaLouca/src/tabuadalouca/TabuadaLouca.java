/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuadalouca;
import java.util.*;
/**
 *
 * @author Lab02b
 */
public class TabuadaLouca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 10;
        int j = 10;
        
        System.out.println("! Tabuada Invertida Maluca !");
        System.out.println("Digite um número para começarmos o experimento da tabuada maluca: ");
        int cod = scanner.nextInt();
        int codJ = cod+1;
        
        
        while(i>=0){
            System.out.println(cod+"x"+i+"="+(cod*i));
            i--;
        }
        
        System.out.println("===============================================");
        System.out.println("Agora vamos fazer da próxima tabuada, apenas os ímpares!");
        
        while(j>=0){
            if(j%2 != 0){
                System.out.println(codJ+"x"+j+"="+(codJ*j));
            }
            j--;
        }
    }
}
