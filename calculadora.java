package Aula03;

public class calculadora {

    private double resultadoDiv;
    private int resultado;
    private char op;
    private int[] array;

    calculadora(int[] array, char op) {
        this.array = array;
        this.op = op;
        switch (op) {
            case '+':
                System.out.println("A operação é soma!");
                Soma();
                break;

            case '-':
                System.out.println("A operação é subtração!");
                Subtracao();
                break;

            case '*':
                System.out.println("A operação é multiplicação!");
                Multiplicacao();
                break;

            case '/':
                if (array.length > 1) {
                    resultado = array[0];
                    for (int i = 1; i < array.length; i++) {
                        if (array[i] != 0) {
                            resultado /= array[i];
                        } else {
                            System.out.println("Erro: Divisão por zero.");
                            return;
                        }
                    }
                }
            default:
                break;
        }

        System.out.println(this.op);
    }

    private void Soma() {
        for (int i = 0; i < this.array.length; i++) {
            this.resultado += this.array[1];
        }

    }

    private void Subtracao() {
        this.resultado = this.array[0];
        for (int i = 0; i < this.array.length; i++) {
            this.resultado -= this.array[i];
        }

    }

    private void Multiplicacao() {
        this.resultado = this.array[0];
        for (int i = 0; i < this.array.length; i++) {
            this.resultado *= this.array[i];
        }

    }

    private void Divisao() {
        this.resultado = this.array[0];
        if (array.length > 1) {
            resultado = array[0];
            for (int i = 0; i < this.array.length; i++) {
                if (array[i] != 0) {
                    resultado /= array[i];
                } else {
                    System.out.println("Erro: Divisão por zero.");

                    this.resultado %= this.array[i];
                    return;
                }
            }
        }
    }

    public int GetResultado() {
        return this.resultado;
    }
}