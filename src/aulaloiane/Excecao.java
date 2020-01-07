package aulaloiane;

/**
 * Primeiro exercício testando try catch
 * @author Isabela Melim
 */

public class Excecao {

    public static void main(String[] args) {
        
        int[] vetor = new int[4]; 
        System.out.println("Antes da exception");
        
        try{
           vetor[4] = 1; 
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exceção ao acessar o índice do vetor que não existe");
        }   
    }
    
}
