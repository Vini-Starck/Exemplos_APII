package apii.exemplo_1;

import java.util.Scanner;
/**
 * Escrever um algoritmo que leia dez números,
 * calcule a média aritmetica e exiba o resultado na tela.
 * @author starc
 */
public class APIIExemplo_1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("=== Média de 10 números ===\n");
        
        double num[] = new double[10];
        double media = 0;
        
        for(int c=0; c<10; c++){
            System.out.println("Digite o " +(c+1)+ "º número:");
            num[c] = leitor.nextDouble();
            
            media += num[c];
        }
        
        media /= 10;
        System.out.println("A média dos números é igual a: "+media);
    }
}