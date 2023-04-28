package money;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * やりたいこと
 * 通貨の異なる２つの金額を足し、通過間の為替レートに基づいて換算された金額を得る
 *
 * Todo
 * $5 + 10CHF = $10 (レートが2:1の場合)
 * $5 + $5 = $10
 * $5 + $5 がMoneyを返す
 *
 * Done
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
    assertFalse(Money.franc(5).equals(Money.dollar(5)));
  }

  @Test
  public void testCurrency(){
    assertEquals("USD", Money.dollar(1).currency());
    assertEquals("CHF", Money.franc(1).currency());
  }

  @Test
  public void testSimpleAddition(){
    Money five = Money.dollar(5);
    Expression sum = five.plus(five);
    Bank bank = new Bank();
    Money reduced = bank.reduce(sum, "USD");
    assertEquals(Money.dollar(10), reduced);
  }

  @Test
  public void testPlusReturnSum(){
    Money five = Money.dollar(5);
    Expression result = five.plus(five);
    Sum sum = (Sum)result;
    assertEquals(five, sum.augend);
    assertEquals(five, sum.addend);
  }

  @Test
  public void testReduceSum(){
    Bank bank = new Bank();
    Money result = bank.reduce(Money.dollar(1), "USD");
    assertEquals(Money.dollar(1), result);
  }
}
