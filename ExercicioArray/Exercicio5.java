package ExercicioArray;

import java.util.Random;

/**
 *
 * @author Bryan
 */
public class Exercicio5 {
  public static void main(String[] args) {
        String[]baralho = new String [52];
        String[]naipes = {"Copas","Ouros", "Paus", "Espadas"};
        String[]valores = {"Ás", "2", "3","4","5","6","7","8","9","10", "Valete", "Dama", "Rei"};
       
        Random rd = new Random();
        String cartaAleatoria = valores[rd.nextInt(valores.length)] + " de " + naipes[rd.nextInt(naipes.length)];
        System.out.println("Carta aleatória: "+cartaAleatoria);
 }
}