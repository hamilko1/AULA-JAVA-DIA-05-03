package Aula03;

public class Main {
    public static void main(String[] args) {
        System.out.println("Teste - calculadora");
        int[] array = { 1, 2, 3, 4 };
        calculadora c = new calculadora(array, '+');
        System.out.println(c.GetResultado());
    }

}