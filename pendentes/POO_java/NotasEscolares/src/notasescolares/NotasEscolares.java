/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasescolares;
import java.util.*;
/**
 *
 * @author Seceip
 */
public class NotasEscolares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("! Programa Notas Escolares !");
        System.out.println("Digite a primeira nota do aluno: ");
        double p1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        double p2 = scanner.nextDouble();
        System.out.println("Se o aluno não fez a prova optativa, digite -1.");
        int codigo = scanner.nextInt();
        if(codigo == -1){
            double nota = (p1+p2)/2;
            if(nota >= 6 && p1 > 0 && p2 > 0){
                System.out.println("Esse aluno foi aprovado!");
            }else if(nota >= 3 && nota < 6 && p1 > 0 && p2 > 0){
                System.out.println("Esse aluno está de exame.");
            }else{
                System.out.println("O aluno está reprovado.");
            }
        }else{
            System.out.println("Digite a nota da P3: ");
            double p3 = scanner.nextDouble();
            if(p1<p2){
                p1 = p3;
                double nota = (p1+p2)/2;
                if(nota >= 6){
                System.out.println("Esse aluno foi aprovado!");
                }else if(nota >= 3 && nota < 6){
                    System.out.println("Esse aluno está de exame.");
                }else{
                    System.out.println("O aluno está reprovado.");
                }
            }else{
                p2 = p3;
                double nota = (p1+p2)/2;
                if(nota >= 6){
                System.out.println("Esse aluno foi aprovado!");
                }else if(nota >= 3 && nota < 6){
                    System.out.println("Esse aluno está de exame.");
                }else{
                    System.out.println("O aluno está reprovado.");
                }
            }
        }
    }
    
}
