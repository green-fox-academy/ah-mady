package fibonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

  @Test
  public void fib() {
    Fibonacci fibonacci = new Fibonacci();

    int indexReturn = Fibonacci.fib(6);

    assertEquals(8, indexReturn);

  }
}