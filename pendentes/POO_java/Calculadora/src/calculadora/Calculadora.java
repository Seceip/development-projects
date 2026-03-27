/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.*;
/**
 *
 * @author Seceip
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("! Programa Calculadora !");
        System.out.println("Digite a operação que deseja realizar!");
        System.out.println("1. Adição /N 2.Subtração /N 3.Divisão /N 4.Multiplicação");
        int op = scanner.nextInt();
        if (op == 1){
            System.out.println("Digite o primeiro número a ser somado: ");
            int v1 = scanner.nextInt();
            System.out.println("Digite o segundo número a ser somado: ");
            int v2 = scanner.nextInt();
            System.out.println("O resultado de "+v1+"+"+v2+" = "+(v1+v2));
        }else if(op == 2){
            System.out.println("Digite o primeiro número a ser subtraido: ");
            int v1 = scanner.nextInt();
            System.out.println("Digite o segundo número a ser subtraido: ");
            int v2 = scanner.nextInt();
            System.out.println("O resultado de "+v1+"-"+v2+" = "+(v1-v2));
        }else if(op == 3){
            System.out.println("Digite o primeiro número a ser dividido: ");
            double v1 = scanner.nextDouble();
            System.out.println("Digite o segundo número a ser dividido: ");
            double v2 = scanner.nextDouble();
            System.out.println("O resultado de "+v1+"/"+v2+" = "+(v1/v2));
        }else if(op == 4){
            System.out.println("Digite o primeiro número a ser multiplicado: ");
            int v1 = scanner.nextInt();
            System.out.println("Digite o segundo número a ser multiplicado: ");
            int v2 = scanner.nextInt();
            System.out.println("O resultado de "+v1+"x"+v2+" = "+(v1*v2));
        }
    }
    
}
