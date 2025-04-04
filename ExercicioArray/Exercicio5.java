package ExercicioArray;

public class Exercicio5 {
    public static void main(String[] args) {
    String[]naipes = {"Copas", "Ouros", "Paus", "Espada"};
    String[]valores = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
    String[]baralho = new String[52];
    int indice = 0;
    
    for(String naipe : naipes) {
        for(String valor: valores) {
        baralho[indice++] = "\n"+valor + " de " + naipe;    
        
        }
    }
        for(String carta: baralho) { 
            
        System.out.println(carta);
        }
    }
     
}
