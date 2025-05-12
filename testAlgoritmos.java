
	import static org.junit.jupiter.api.Assertions.*;
	import org.junit.jupiter.api.Test;

	class testAlgoritmos {

	    @Test
	    void testFibonacci() {
	        assertEquals(0, Algoritmos.fibonacci(0));
	        assertEquals(1, Algoritmos.fibonacci(1));
	        assertEquals(1, Algoritmos.fibonacci(2));
	        assertEquals(2, Algoritmos.fibonacci(3));
	        assertEquals(5, Algoritmos.fibonacci(5));
	        assertEquals(13, Algoritmos.fibonacci(7));
	    }

	    @Test
	    void testFibonacciExcepcion() {
	        assertThrows(IllegalArgumentException.class, () -> Algoritmos.fibonacci(-1));
	    }

	    @Test
	    void testFactorial() {
	        assertEquals(1, Algoritmos.factorial(0));
	        assertEquals(1, Algoritmos.factorial(1));
	        assertEquals(2, Algoritmos.factorial(2));
	        assertEquals(6, Algoritmos.factorial(3));
	        assertEquals(24, Algoritmos.factorial(4));
	        assertEquals(120, Algoritmos.factorial(5));
	    }

	    @Test
	    void testFactorialExcepcion() {
	        assertThrows(IllegalArgumentException.class, () -> Algoritmos.factorial(-1));
	    }

	    @Test
	    void testPrimo() {
	        assertTrue(Algoritmos.primo(2));
	        assertTrue(Algoritmos.primo(3));
	        assertFalse(Algoritmos.primo(4));
	        assertTrue(Algoritmos.primo(5));
	        assertFalse(Algoritmos.primo(9));
	        assertTrue(Algoritmos.primo(11));
	    }

	    @Test
	    void testPrimoExcepcion() {
	        assertThrows(IllegalArgumentException.class, () -> Algoritmos.primo(1));
	        assertThrows(IllegalArgumentException.class, () -> Algoritmos.primo(0));
	        assertThrows(IllegalArgumentException.class, () -> Algoritmos.primo(-5));
	    }
	}

