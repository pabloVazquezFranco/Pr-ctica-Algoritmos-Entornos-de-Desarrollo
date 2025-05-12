public class Principal {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        

        // Generar números aleatorios del 2 al 10 sin repetir usando Math.random()
        for (int i = 0; i < numeros.length; i++) {
            int numero;
            boolean repetido;
            do {
                numero = (int) (Math.random() * 9) + 2;
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (numeros[j] == numero) {
                        repetido = true;
                    }
                }
            } while (repetido);
            numeros[i] = numero;
        }

        int[] resultadoFibonacci = new int[3];
        int[] resultadoFactorial = new int[3];
        boolean[] resultadoPrimos = new boolean[3];

        for (int i = 0; i < numeros.length; i++) {
            resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
            resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
            resultadoPrimos[i] = Algoritmos.primo(numeros[i]);
        }

    }
}
