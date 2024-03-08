package Aula03;

public class Main {
    public static void main(String[] args) {
        System.out.println("Teste - calculadora");
        int[] array = { 0, 0 };
        calculadora c = new calculadora(array, '/');
        System.out.println("Resultado: " + c.GetResultado());
    }

}