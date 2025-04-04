package ExercicioArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class Exercicio10 {
    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in); 
    System.out.println("Quantos lançamentos quer fazer? ");
    int numLancamentos = sc.nextInt();
    int []lancamento = new int[numLancamentos];
    Random rd = new Random();
    
        for (int i = 0; i < lancamento.length; i++) {
        lancamento[i] = rd.nextInt(6)+1;
        }
        
        System.out.println("Lançamento de dados: "+Arrays.toString(lancamento));
    }   
}
