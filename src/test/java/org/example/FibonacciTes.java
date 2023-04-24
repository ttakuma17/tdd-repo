package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FibonacciTes {
  int fib(int n){
    if(n == 0) return 0;
    return 1;
  }

  @Test
  public void testFibonacci(){
    assertEquals(0, fib(0));
    assertEquals(1 , fib(1));
  }
}
