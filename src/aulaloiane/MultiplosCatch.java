package aulaloiane;

/**
 * Esta classe divide os números do array1 pelos números do array2, tendo como limite
 * a quantidade de índices do segundo array.
 * @author Isabela Melim
 * @date 07/01/2020 
 */

public class MultiplosCatch {
    
    public static void main(String[] args){
        
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores =  {2, 0, 4, 8, 0};
        
        for(int i = 0; i<numeros.length; i++){
            try{
                int result = numeros[i] / denominadores[i];
                System.out.println(numeros[i] + " / " + denominadores[i] + " = "+ result);
            }
            /*
            catch(ArithmeticException e){
                System.out.println("Impossivel dividir por 0");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Você atingiu um índice inexistente"); //não recomendável para boas práticas
            }
            // OU desta forma:
            */
            catch(Exception e){
                System.out.println(e.getMessage()); //exibe a mensagem do Java para a exceção ocorrida
                e.printStackTrace(); //recomendável para desenvolvedores obterem informações da exception
            }   
        }     
    }
}
