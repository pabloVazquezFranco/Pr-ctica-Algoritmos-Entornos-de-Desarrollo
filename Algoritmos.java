

public abstract class Algoritmos {

    /**
     * Calcula el número de Fibonacci correspondiente al número dado.
     * @param numero Número para calcular Fibonacci.
     * @return Número de Fibonacci correspondiente.
     * @throws IllegalArgumentException Si el número es menor que cero.
     */
    public static int fibonacci(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número debe ser mayor o igual a cero.");
        }
        if (numero == 0 || numero == 1) {
            return numero;
        }
        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }
    
    /**
     * Calcula el factorial de un número dado sin el operador ternario.
     * @param numero Número para calcular el factorial.
     * @return Factorial del número dado.
     * @throws IllegalArgumentException Si el número es menor que cero.
     */
    public static int factorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número debe ser mayor o igual a cero.");
        }
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
    
    /**
     * Determina si un número es primo.
     * @param numero Número para verificar si es primo.
     * @return true si el número es primo, false en caso contrario.
     * @throws IllegalArgumentException Si el número es menor que 2.
     */
    public static boolean primo(int numero) {
        if (numero < 2) {
            throw new IllegalArgumentException("El número debe ser mayor o igual a 2.");
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}