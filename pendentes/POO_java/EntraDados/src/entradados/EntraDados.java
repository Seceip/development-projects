/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradados;
import java.util.*;
/**
 *
 * @author Seceip
 */
public class EntraDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia =  new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = leia.next();
        
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = leia.next();
        
        System.out.print("Digite seu CPF "+nome+" "+sobrenome+":");
        int id = leia.nextInt();
        
        System.out.print("Digite sua idade: ");
        int idade = leia.nextInt();
        
        System.out.println("Seu nome e sobrenome: "+nome+" "+sobrenome);
        System.out.println("Sua idade: "+idade);
        System.out.println("Seu CPF: "+id);
    }
    
}
