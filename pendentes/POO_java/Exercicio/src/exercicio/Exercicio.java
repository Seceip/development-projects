/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;
import java.util.*;
/**
 *
 * @author Seceip
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa Verifica Originalidade");
        System.out.println("Digite o código do produto: ");
        int id = scanner.nextInt();
        if(id == 1){
            System.out.println("Seu código de produto aponta para a região Sul.");
        }else if(id == 2){
            System.out.println("Seu código de produto aponta para a região Norte.");
        }else if(id == 3){
            System.out.println("Seu código de produto aponta para a região Leste.");
        }else if(id == 4){
            System.out.println("Seu código de produto aponta para a região Oeste.");
        }else if(id == 5 || id == 6){
            System.out.println("Seu código de produto aponta para a região Nordeste.");
        }else if(id == 7 || id == 8 || id == 9){
            System.out.println("Seu código de produto aponta para a região Sudeste.");
        }else if(id == 10){
            System.out.println("Seu código de produto aponta para a região Centro-Oeste.");
        }else if(id == 11){
            System.out.println("Seu código de produto aponta para a região Noroeste.");
        }else{
            System.out.println("Seu produto é importado.");
        }
    }
    
}
