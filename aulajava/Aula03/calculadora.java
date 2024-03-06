package Aula03;

public class calculadora {

    private int resultado;
    private char op;
    private int[] array;

    calculadora(int[] array, char op) {
        this.array = array;
        this.op = op;
        if (this.op == '+') {
            System.out.println("A operação é soma!");
            Soma();
        }
        System.out.println(this.op);
    }

    private void Soma() {
        for (int i = 0; i < this.array.length; i++) {
            this.resultado += this.array[i];
        }

    }

    public int GetResultado() {
        return this.resultado;
    }
}