package ExercicioArray;

import java.util.Arrays;

/**
 *
 * @author Bryan
 */
public class Exercicio3 {
    public static void main(String[] args) {
     
        System.out.println("Digite valores: ");
        int [] valores = {10,20,30,40,50};
        System.out.println(Arrays.toString(valores));
        
        for(int maior : valores) {
        if(maior >= 50) {    
            System.out.println("O número maior é: " +maior);    
       }
        }     
 }
}