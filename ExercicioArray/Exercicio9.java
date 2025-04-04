package ExercicioArray;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String[] palavras = new String[4];
        
        for (int i = 0; i < palavras.length; i++) {
            System.out.println("Digite a palavra "+ (i+1) + " :");    
            palavras[i] = sc.nextLine();
        }
        
        Arrays.sort(palavras);
        System.out.println("ARRAY ORDENADO : " + Arrays.toString(palavras));
    }
}
    