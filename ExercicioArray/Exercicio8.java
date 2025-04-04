package ExercicioArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Bryan
 */
public class Exercicio8 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[7];
     
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1) + " : ");
        numeros[i] = sc.nextInt();
        }
    
    Set<Integer> conjunto = new HashSet<>();
    for (int numero: numeros) {
    conjunto.add(numero);    
    }
   
    int[] numerosUnicos = conjunto.stream().mapToInt(Integer::intValue).toArray();
    
        System.out.println("Array sem duplicatas: "+ Arrays.toString(numerosUnicos));
 }  
}