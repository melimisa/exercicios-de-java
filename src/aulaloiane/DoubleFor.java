package aulaloiane;

/**
 * Esta classe divide cada número do primeiro array (numeros[]) por cada número do segundo array (denominadores[]),
 * tendo como limite a quantidade de índices do primeiro array.
 * @author Isabela Melim
 * @date 07/01/2020 
 */

public class DoubleFor {
    public static void main(String[] args){
        
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores =  {2, 0, 4, 8, 0};
        
        for(int i = 0; i<numeros.length; i++){
            
            for(int d = 0; d < denominadores.length; d++){
                
                try{
                    int result = numeros[i] / denominadores[d];
                    System.out.println(numeros[i] + " / " + denominadores[d] + " = "+ result);
                }
                catch(ArithmeticException e){
                    System.out.println("Impossivel dividir por 0");
                }
                catch(ArrayIndexOutOfBoundsException e){
                //catch(Throwable e) { //essa é uma exceção genérica, não é recomendável para boas práticas
                    //System.out.println("Você atingiu um índice inexistente");
                    System.out.println("Aconteceu algum erro");
                }
            }
        }     
    }
}
