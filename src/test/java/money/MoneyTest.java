package money;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * やりたいこと
 * 通貨の異なる２つの金額を足し、通過間の為替レートに基づいて換算された金額を得る
 *
 * Todo
 * Unassigned
 *  $5 + 10 CHF = $10 (レートが2:1の場合)
 *  Money の丸め処理
 *  hashCode()
 *  nullとの等価性比較
 *  他のオブジェクトとの等価性比較
 *  DollarとFrancの重複
 *  testFrancMultiplicationの削除
 *
 * Done
 *  $5 * 2 = $ 10
 *  Money.dollar の副作用
 *  equals()
 *  amount をprivateにする
 *  5CHF * 2 = 10CHF
 *  equals の一般化
 *  DollarとFrancの比較
 *  通貨の概念
 *  times の一般化
 */

public class MoneyTest {
  @Test
  public void testMultiplication(){
    Money five = Money.dollar(5);
    assertEquals(Money.dollar(10), five.times(2));
    assertEquals(Money.dollar(15), five.times(3));
  }

  @Test
  public void testEquality(){
    assertTrue(Money.dollar(5).equals(Money.dollar(5)));
    assertFalse(Money.dollar(5).equals(Money.dollar(6)));
    assertTrue(Money.franc(5).equals(Money.franc(5)));
    assertFalse(Money.franc(5).equals(Money.franc(6)));
    assertFalse(Money.franc(5).equals(Money.dollar(5)));
  }

  @Test
  public void testFrancMultiplication(){
    Money five = Money.franc(5);
    assertEquals(Money.franc(10), five.times(2));
    assertEquals(Money.franc(15), five.times(3));
  }

  @Test
  public void testCurrency(){
    assertEquals("USD", Money.dollar(1).currency());
    assertEquals("CHF", Money.franc(1).currency());
  }

  @Test
  public void testDifferentCurrencyEquality(){
    assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
    assertTrue(new Money(10, "USD").equals(new Dollar(10, "USD")));
  }
}
