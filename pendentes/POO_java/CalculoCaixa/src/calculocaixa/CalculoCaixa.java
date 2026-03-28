/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculocaixa;
import java.util.*;

/**
 *
 * @author Seceip
 */
public class CalculoCaixa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("! Programa Cálculo de Volume de Caixa !");
        System.out.println("Digite o comprimento da caixa: ");
        double comp = leia.nextDouble();
        System.out.println("Digite a largura da caixa: ");
        double lar = leia.nextDouble();
        System.out.println("Digite a altura da caixa: ");
        double alt = leia.nextDouble();
        
        double vol = comp*lar*alt;
        System.out.println("O Volume da caixa é: "+vol);
    }
    
}
