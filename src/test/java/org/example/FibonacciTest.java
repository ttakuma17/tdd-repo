package org.example;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;


public class FibonacciTest {
  int fib(int n){
    if(n == 0) return 0;
    if(n == 1) return 1;
    return fib(n-1) + fib(n-2);
  }

  @ParameterizedTest
  @MethodSource("fibonacciProvider")
  public void testFibonacci(int input, int expected){
    assertEquals(expected, fib(input));
   }

  static Iterable<Integer[]> fibonacciProvider(){
    return Arrays.asList(new Integer[][]{
        {0,0},{1,1},{2,1},{3,2}
    });
  }
}
