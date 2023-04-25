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
 *
 * Done
 *  $5 * 2 = $ 10
 *  Dollar の副作用
 *  equals()
 *  amount をprivateにする
 *
 */
public class MoneyTest {
  @Test
  public void testMultiplication(){
    Dollar five = new Dollar(5);
    assertEquals(new Dollar(10), five.times(2));
    assertEquals(new Dollar(15), five.times(3));
  }

  @Test
  public void testEquality(){
    assertTrue(new Dollar(5).equals(new Dollar(5)));
    assertFalse(new Dollar(5).equals(new Dollar(6)));
  }

  @Test
  public void testFrancMultiplication(){
    Franc five = new Franc(5);
    assertEquals(new Franc(10), five.times(2));
    assertEquals(new Franc(15), five.times(3));
  }
}
