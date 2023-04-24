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
//    リファクタリング
    int cases[][] = {{0,0}, {1,1}};
    for(int i =0; i< cases.length; i++) assertEquals(cases[i][1], fib(cases[i][0]));
//    assertEquals(0, fib(0));
//    assertEquals(1 , fib(1));
  }
}
