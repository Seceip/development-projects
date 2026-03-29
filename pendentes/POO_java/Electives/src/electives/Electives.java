/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electives;
import java.util.*;
/**
 *
 * @author Lab02b
 */
public class Electives {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 10;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        
        System.out.println("! Programa Eleição Presidencial ! ");
        while(i != 0){
            System.out.println("Digite o candidato que deseja votar, entre 1 a 6, onde 5 é voto nulo e 6 é voto em branco.");
            System.out.println("Caso todos os votos já foram contabilizados, digite 0.");
            i = scanner.nextInt();
            if(i == 1){
                System.out.println("Candidato Rogerinho escolhido!!");
                v1 = v1+1;
            }else if(i == 2){
                System.out.println("Candidato Vernininho escolhido!");
                v2 = v2+1;
            }else if(i == 3){
                System.out.println("Candidato Carlos Kakazinho escolhido!");
                v3 = v3+1;
            }else if(i == 4){
                System.out.println("Candidato Rallzito escolhido!");
                v4 = v4+1;
            }else if(i == 5){
                System.out.println("Voto nulo selecionado!");
                v5 = v5+1;
            }else if(i == 6){
                System.out.println("Voto branco selecionado!");
                v6 = v6+1;
            }else if(i == 0){
                System.out.println("============== RESULTADOS ==============");
                System.out.println("TOTAL DE VOTOS REGISTRADOS:          "+(v1+v2+v3+v4+v5+v6));
                if(v1 > v2 && v1 > v3 && v1 > v4 && v1 > v5 && v1 > v6 ){
                    System.out.println("Candidato Rogerinho venceu com "+v1+" votos.");
                }else if(v2 > v1 && v2 > v3 && v2 > v4 && v2 > v5 && v2 > v6){
                    System.out.println("Candidato Verninho venceu com "+v2+" votos.");
                }else if(v3 > v1 && v3 > v2 && v3 > v4 && v3 > v5 && v3 > v6){
                    System.out.println("Candidato Carlos Kakazinho venceu com "+v3+" votos.");
                }else if(v4 > v1 && v4 > v2 && v4 > v3 && v4 > v5 && v4 > v6){
                    System.out.println("Candidato Rallzito venceu com "+v4+" votos.");
                }else if(v5 > v1 && v5 > v2 && v5 > v3 && v5 > v4 && v5 > v6){
                    System.out.println("Votos nulos venceram com "+v5+" votos.");
                }else if(v6 > v1 && v6 > v2 && v6 > v3 && v6 > v4 && v6 > v5){
                    System.out.println("Votos em branco venceram com "+v2+" votos.");
                    System.out.println("Redistribuindo votos........");
                    if(v1 < v2 && v1 < v3 && v1 < v4 && v1 < v5 && v1 < v6 ){
                    System.out.println("Candidato Rogerinho venceu com "+v1+" votos.");
                    }else if(v2 < v1 && v2 < v3 && v2 < v4 && v2 < v5 && v2 < v6){
                        System.out.println("Candidato Verninho venceu com "+v2+" votos.");
                    }else if(v3 < v1 && v3 < v2 && v3 < v4 && v3 < v5 && v3 < v6){
                        System.out.println("Candidato Carlos Kakazinho venceu com "+v3+" votos.");
                    }else if(v4 < v1 && v4 < v2 && v4 < v3 && v4 < v5 && v4 < v6){
                        System.out.println("Candidato Rallzito venceu com "+v4+" votos.");
                    }
                }
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠴⡒⠋⢳⡀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⡸⠁⢉⡝⠒⠦⢤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡴⠞⠋⠁⠀⠀⢣⠀⠀⢧⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⢠⠇⠀⡜⣀⡀⠀⠀⠈⠉⠓⠦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠴⠋⠁⠀⠀⢀⡠⠔⠒⠈⡇⠀⠸⡄⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⡾⠀⢠⠃⠀⠈⠉⠑⠢⢄⡀⠀⠈⠙⢦⣄⠀⢀⣠⣴⡖⠚⠛⠛⠒⠦⢽⡈⠳⣄⠀⠀⠀⠀⠀⠀⣠⠞⠁⠀⠀⠀⡠⠚⠁⠀⠀⠀⠀⢱⠀⠀⡇⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⢀⡇⠀⢸⠀⠀⠀⠀⠀⠀⠀⠙⢦⡀⠀⠀⠈⢷⡈⣠⠴⢿⣿⣶⣄⣀⠀⠀⠱⡀⠀⠙⠲⣤⣀⠀⡾⠁⠀⠀⠀⣠⠎⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⣧⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⢸⠇⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⡄⠀⠀⢀⡵⠶⠿⠽⠛⠛⠻⠭⢿⣲⡄⠈⠀⠀⠀⠀⠉⠛⠦⣄⠀⠀⢰⠃⠀⠀⠀⠀⠀⠀⠀⠀⡾⠀⠀⡇⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⢸⡆⠀⢸⡆⠀⠀⠀⢀⠤⠛⠛⠛⠛⠓⣠⠔⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠓⠦⡀⠀⠀⠀⠀⠀⠈⠑⠦⣉⠙⠉⠙⠓⠦⡄⠀⠀⢠⠇⠀⢠⡇⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠸⡇⠀⠈⣷⠀⠀⠀⠀⣀⠤⠒⣪⡵⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠈⠙⢭⡒⠦⣄⠀⠀⢀⡟⠀⠀⣼⠁⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⣷⠀⠀⠘⣧⠀⠀⠚⠁⢀⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣆⡀⠑⣠⡞⠀⠀⣰⠇⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠸⣇⠀⠀⠘⢧⡀⠀⣰⡟⠀⠀⠀⠀⣀⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠴⠛⠛⠻⣦⠀⠀⠀⠈⢷⡴⠋⠀⠀⣰⠏⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣆⠀⠀⠈⠻⣶⡏⠀⠀⠀⠀⠼⠋⠀⠈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣈⣀⠀⠀⠀⠈⢷⡀⢀⣴⠋⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢧⡀⠀⢀⡿⠀⠀⠀⠀⣠⣤⠶⢶⣶⣦⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣾⣿⣿⣶⣯⣍⠻⢶⣄⠀⠈⢷⡞⠁⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠦⣼⠇⠀⠀⣴⠟⢋⣴⣾⣿⣿⣿⡿⠿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⠟⠋⠉⠙⣷⣄⠹⣧⠀⠈⢳⡀⠀⠀⠀⣀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡟⠀⠀⣼⠏⣰⣿⣿⣿⣿⡟⠁⠀⠀⢸⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⡇⠀⠀⠀⣰⣿⣿⡆⢹⣧⠀⠀⠙⠓⠚⢉⡟⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣤⣤⡴⠟⠀⠀⢰⡟⠀⣿⣿⣿⣿⣿⡅⠀⠀⣠⣾⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣷⣤⣤⣾⣿⣿⣿⡇⠀⣿⠀⠦⣄⣀⣴⣯⣤⢶⠇\n" +
"⠀⠀⠀⠀⠀⠀⠀⢠⡀⠈⠳⣤⣀⣀⣀⠄⠸⡇⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⣀⣀⡠⢄⣀⡀⠘⣿⣿⣿⣿⣿⣿⣿⣿⠟⠛⣿⠃⢸⡏⠀⠀⠀⠀⠀⢀⣴⢏⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠘⢿⣝⠛⠛⠛⠉⠀⠀⠀⢿⡀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣅⢠⠇⠀⢀⣀⣤⠤⠤⣤⣈⡀⠹⣿⣿⣿⣿⣿⣿⣿⣷⠶⠁⣠⡟⠀⠀⠒⠤⠴⠶⠛⢻⠟⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⢦⣽⣳⣦⣄⣀⠤⠀⠀⠈⠻⣄⠈⠛⠿⣿⣿⣿⣿⣿⣿⠋⠴⠊⠉⣏⠀⠀⠀⢀⡵⠈⠙⠊⠻⣟⡛⠛⠛⠋⢁⣠⠶⠋⠀⠀⠀⠀⠀⠀⢀⣴⠏⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⢦⡀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠶⠤⠄⠤⠤⠖⠋⠀⠀⠀⠀⠀⠀⠉⢉⡍⠉⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⢀⣤⠟⠁⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⠤⠤⠚⠓⠤⠤⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠟⠁⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠶⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⣄⣀⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⠾⠋⠁⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠓⠦⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣄⡀⠀⠀⠀⢀⡄⠀⠀⠀⠀⠀⠀⢀⣀⣤⠶⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠓⠲⠦⠤⣄⣀⣀⡀⠀⠀⠀⠉⠓⠒⠋⣁⣀⣀⣠⠤⠴⠖⠛⢿⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠇⠀⠀⠈⠉⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠈⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⣠⡤⠶⠒⠒⠶⠤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡆⠀⠀⠀⠸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⣰⠟⠁⠀⠀⠀⠀⠀⠀⠀⠙⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⢰⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡇⠀⠀⠀⠀⠀⠀⢠⠂⣀⠀⠀⠀⠀⠀⠀⡼⠀⠀⠀⠀⠀⢸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠸⡇⠀⢰⣟⣏⠓⣆⠀⠀⠀⠀⠀⠀⠸⡆⠀⠀⠀⠀⠀⠀⠀⢠⠞⢹⡇⠀⠀⠀⠀⠀⠀⢸⡀⢹⠀⠀⠀⠀⢀⡼⠁⠀⠀⠀⠀⠀⢸⡗⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠹⣦⣈⣉⡼⠂⠈⣇⠀⠀⠀⠀⠀⠀⢻⡀⠀⠀⠀⠀⠀⢠⠏⠀⠘⡇⠀⠀⠀⠀⠀⠀⠸⡳⣼⣦⠀⢀⡴⡻⠀⠀⠀⠀⠀⠀⠀⢸⡇⠈⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠈⠀⠀⠀⠀⢸⡀⠀⠀⠀⠀⠀⠀⢳⣄⠀⠀⠀⠀⡟⠀⠀⠀⢿⠀⠀⠀⠀⠀⠀⠀⢧⠀⠈⠛⠉⠀⡇⠀⠀⠀⠀⠀⠀⠀⣸⡁⠀⠸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⢷⡀⠀⠀⠀⠀⠀⠀⠙⢷⣄⡀⢸⡇⠀⠀⠀⠸⡆⠀⠀⠀⠀⠀⠀⠈⣇⠀⠀⠀⢰⠁⠀⠀⠀⠀⠀⠀⠀⡟⠀⠀⠀⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢧⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⢹⡇⠀⠀⠀⠀⢻⡀⠀⠀⠀⠀⠀⠀⢹⡀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⣸⠃⠀⠀⠀⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⢧⠀⠀⠀⠀⠈⢧⠀⠀⠀⠀⠀⠀⠀⣧⠀⠀⡿⠀⠀⠀⠀⠀⠀⢀⡟⠀⠀⠀⢰⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⢄⡀⠀⠀⠀⠀⠀⠀⠘⢧⠀⠀⠀⠀⠘⣆⠀⠀⠀⠀⠀⠀⠸⡄⠀⡇⠀⠀⠀⠀⠀⠀⣸⠁⠀⠀⣠⣟⣠⠤⣄⣀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⣲⠴⢚⠉⠉⠉⠙⠳⡀⠀⠀⠀⠘⡄⠀⠀⠀⠀⠀⠀⢷⢀⡇⠀⠀⠀⠀⠀⢀⡏⠀⢀⡴⠋⠀⠀⣄⠀⠮⡙⢦⡀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡜⢁⡔⠁⣠⠊⠀⠀⠀⠈⠢⠄⠀⠀⠹⡀⠀⠀⠀⠀⠀⠸⣾⠃⠀⠀⠀⠀⠀⢸⠁⠀⠉⠀⠀⠀⣠⠌⢳⡀⠘⡆⠹⡄⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⡜⠀⢰⠁⠈⠑⡄⠀⠀⠀⠀⠀⠀⢠⠗⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠻⡀⠀⠀⠀⠀⡼⠁⠀⠀⡇⠀⢸⢀⡇⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢆⣣⠀⢸⠀⠀⠀⢸⠀⠀⠀⠀⠀⣰⠃⢀⡆⠀⠀⢤⠀⠀⣿⠀⠀⡄⠀⠀⢳⠀⢹⣄⣀⣀⡀⢧⡀⠀⢀⣇⣀⡿⠞⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠓⠚⠂⠀⠐⠓⠒⠒⠂⠉⠉⠈⠣⣌⣇⠀⢀⣜⣠⠜⠉⠧⣄⣧⡀⢀⣼⣠⠞⠀⠀⠀⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀");
            }
        }
    }
    
}
