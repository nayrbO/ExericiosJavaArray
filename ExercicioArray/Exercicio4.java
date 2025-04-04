package ExercicioArray;

import java.util.Arrays;

/**
 *
 * @author Bryan
 */
public class Exercicio4 {
    public static void main(String[] args) {
    
    int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8 , 9 ,10};
        System.out.println(Arrays.toString(numeros));
    
    for (int par : numeros) {
    if(par % 2 == 0){
        System.out.println("Os números pares são: " +par);    
    }
        
    }
 }
}