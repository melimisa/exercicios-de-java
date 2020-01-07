package aulaloiane;

/**
 * Exceção acionada quando o número a ser dividido for ímpar
 * @author Isabela Melim
 */

public class DivisaoNaoExataException extends Exception {
    private int num;
    private int denominador;

    public DivisaoNaoExataException(int num, int denominador) {
        super();
        this.num = num;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "O resultado de " + num + "/" + denominador + " não é um número inteiro";
    }    
}
