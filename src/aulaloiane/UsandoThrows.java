package aulaloiane;

import java.util.Scanner;

public class UsandoThrows {
    
    public static void main(String[] args){
        
        System.out.println("Entre como um número decimal");
        
        try{
           double num = leNumero(); //chama o scanner
           System.out.println("Você digitou: " + num);
        }
        catch (Exception e){
            System.out.println("Entrada inválida");
            e.printStackTrace(); //não deve ser usado para exibir para o usuário, somente para desenvolvedores
        }     
    }
    
    public static double leNumero() throws Exception {
        
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
                
        return num;
        
    }
    
}
