package apii.exemplo_1;

import java.util.Scanner;

public class Exemplo_ContagemVogais {
    public static void main(String args[]){
        // Contagem de vogais de uma string.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome para descobrir a quantidade de vogais:");
        String nome = leitor.nextLine();
        ContaVogal(nome);
    }
    
    public static void ContaVogal(String nome){
        String vogais = "aeiouAEIOU";
        int cont = 0;
        for(int i=0;i<nome.length();i++){
            for(int j=0;j<vogais.length();j++){
                if(nome.charAt(i)==vogais.charAt(j)){
                    cont++;
                }
            }
        }
        System.out.println("Quantidade de vogais: "+cont);
    }
}