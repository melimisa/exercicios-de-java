package aulaloiane;

/**
 * Esta classe aciona uma exception criada por mim para tratar a divisão
 * que resulta em um número decimal.
 * @author Isabela Melim
 * @date 07/01/2020 
 */

public class MinhaException {
    public static void main(String[] args){
        
        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denominadores =  {2, 0, 4, 8, 0, 2, 3};
        
        for(int i = 0; i<numeros.length; i++){   //percorre todos os indices do array
            try{ 
                if(numeros[i] % 2 != 0){                    
                    throw new DivisaoNaoExataException(numeros[i], denominadores[i]); //aciona exception criada por mim  
                }
                else{
                    System.out.println(numeros[i] + " / " + denominadores[i] + " = " +numeros[i] / denominadores[i]);
                }  
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExataException  e){ 
                System.out.println(e.getMessage()); //exibe a mensagem do Java para a exceção ocorrida
                e.printStackTrace(); //recomendável para desenvolvedores obterem informações da exception
            }
        }     
    }
}
