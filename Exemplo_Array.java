package apii.exemplo_1;

import java.util.Scanner;

public class Exemplo_Array {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        
        // Vetor / Array
        int [] a = new int[5];
        
        a[0] = 65;
        a[1] = 24;
        a[2] = 97;
        a[3] = 14;
        a[4] = 82;
        
        int soma = a[1]+a[2]+a[3]+a[4]+a[0];
        System.out.println(soma);
    }
}
