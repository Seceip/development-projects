/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinho;
import java.util.*;
/**
 *
 * @author Lab02b
 */
public class Mercadinho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cod = 10;
        double l = 0.0;
        double a = 0.0;
        double h = 0.0;
        double soma = 0.0;
        
        System.out.println("! Programa Mercadinho !");
        while(cod != 0){
            System.out.println("Digite o código de operação a seguir: ");
            System.out.println("1- Limpeza | 2- Alimentação | 3- Higiene | 0- Finaliza");
            cod = scanner.nextInt();
            if(cod == 1){
                System.out.println("Você selecionou os itens de limpeza, informe quanto a limpeza vendeu hoje: ");
                l = scanner.nextDouble();
                if(l != 0.0){
                    l = l+l;
                }
            }
            else if(cod == 2){
                System.out.println("Você selecionou os itens de alimentação, informe o quanto a alimentação vendeu hoje: ");
                a = scanner.nextDouble();
                if(a != 0.0){
                    a = a+a;
                }
            }
            else if(cod == 3){
                System.out.println("Você selecionou os itens de higiene, informe quando a higiene vendeu hoje: ");
                h = scanner.nextDouble();
                if(h != 0.0){
                    h = h+h;
                }
            }
            else if(cod == 0){
                soma = a+l+h;
                System.out.println("Você selecionou Finalizar, abaixo segue o relatório.");
                System.out.println("=========== Relatório ===========");
                System.out.println("Vendas da Limpeza hoje:      R$"+l);
                System.out.println("Vendas da Alimentação hoje:  R$"+a);
                System.out.println("Vendas da Higiene hoje:      R$"+h);
                System.out.println("=========== TOTAL ===========");
                System.out.println("Vendas Totais: R$"+soma);
                cod = 0;
            }
            else{
                System.out.println("Você informou um código errado.");
            }
        }
    }
    
}
